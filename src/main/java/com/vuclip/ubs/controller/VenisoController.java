package com.vuclip.ubs.controller;

import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.models.veniso.VenisoDirectAPIRequestVO;
import com.vuclip.ubs.service.VenisoService;
import com.vuclip.ubs.utils.LogUtils;
import com.vuclip.ubs.utils.VenisoHashUtils;

import org.apache.http.client.utils.URIBuilder;

/**
 * The VenisoController class: Accepts requests for Activation, Deactivation, OTP Gen, OTP verify
 *
 * @author sandeep khanorkar
 */

@RestController
public class VenisoController {

	private Logger logger = LogManager.getLogger(VenisoController.class);
	
	@Autowired(required = true)
	private JdbcTemplate jdbcTemplate;

	String venisoSecretKey = "vuclip12vuclip12";



	@RequestMapping(value = "/api/v3", method = {RequestMethod.POST}, produces = {
	"application/json"}, consumes = { "application/json" } )
	public @ResponseBody
	ResponseEntity<Object> response(@RequestBody VenisoDirectAPIRequestVO requestBody) {

		Object jsonval = null;
		List<Map<String, Object>> dBresponse = null;
		String msisdn = null;
		String action = null;
		try {

			logger.info("Request Parameter : " + requestBody.toString());

			msisdn = (null==requestBody.getMsisdn()) ? requestBody.getTxnid() : requestBody.getMsisdn();

			action = requestBody.getAction();

			String query = "SELECT * FROM veniso_direct_api where action ='" + action + "' and msisdn = '" + msisdn + "'";
			logger.info("QUERY FOR FETCHING DATA " + query);
			dBresponse = jdbcTemplate.queryForList(query);
			logger.info("Resposne" + dBresponse);
			if (dBresponse.size() >= 1) {
				jsonval = dBresponse.get(0).get("response");
				logger.info("Object " + jsonval);
				logger.info("found record");
			}
		} catch (Exception e) {
			logger.info("No Record found Excpetion:" + e);
		}
		String responseJson = (String) jsonval;

		logger.info("RESPONSE : " + responseJson);

		return ResponseEntity.ok(jsonval);

	}

	@RequestMapping(value = "/api/v3", method = {RequestMethod.GET} )
	public @ResponseBody
	void getResponse(@RequestParam("hash") String requestBody,HttpServletResponse httpServletResponse) {
		String rurl = null;
		List<Map<String, Object>> dBresponse = null;
		Map<String, String> paramMap = new LinkedHashMap<String, String>();
		StringBuilder hashMessageString=new StringBuilder();
		String htxnid = null;
		String action = null;
		String hashValue="";
		try {
			requestBody = URLEncoder.encode(requestBody, StandardCharsets.UTF_8.name());
			logger.info("Request Hash Parameter : " + requestBody);

			String hash = VenisoHashUtils.decrypt(venisoSecretKey, requestBody);
			String [] resultData=hash.split("\\|");
			action =resultData[0];
			htxnid=resultData[1];

			String query = "SELECT * FROM veniso_redirect_api where action ='" + action + "' and htxnid = '" + htxnid + "'";
			logger.info("QUERY FOR FETCHING DATA " + query);
			dBresponse = jdbcTemplate.queryForList(query);
			logger.info("Resposne" + dBresponse);
			if (dBresponse.size() >= 1) {

				paramMap.put("msisdn", dBresponse.get(0).get("msisdn").toString());
				paramMap.put("atxnid", dBresponse.get(0).get("atxnid").toString());
				paramMap.put("status", dBresponse.get(0).get("status").toString());
				paramMap.put("chargedamount", dBresponse.get(0).get("chargedamount").toString());

				paramMap.forEach((consentKey,consentValue)->hashMessageString.append(consentValue).append("|"));

				logger.info("Map Value : " + hashMessageString.toString());

				hashValue=VenisoHashUtils.encrypt(venisoSecretKey,hashMessageString.toString());

				logger.info("Hash Value : " + hashValue);

				rurl = resultData[5];

				URIBuilder builder = new URIBuilder();
				builder.setPath(rurl);
				builder.addParameter("hash",hashValue);

				URL url = builder.build().toURL();

				logger.info("Redirection URL :" + url);

				httpServletResponse.sendRedirect(url.toString()); 
//				httpServletResponse.setHeader("Location", url.toString());
//				httpServletResponse.setStatus(302);
			}
		} catch (Exception e) {
			logger.info("No Record found Excpetion:" + e);
		}

	}
}
