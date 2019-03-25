package com.vuclip.ubs.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class GoogleController {

	private Logger logger = LogManager.getLogger(GoogleController.class);


	@Autowired(required = true)
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "androidpublisher/v2/applications/{packageId}/purchases/subscriptions/{serviceId}/tokens/{partnerToken}", method = {RequestMethod.GET, RequestMethod.POST}, produces = {
	"application/json"})
	public @ResponseBody
	String googlePurchaseAPI(@PathVariable String packageId, @PathVariable String serviceId, @PathVariable String partnerToken, 
			@RequestParam String access_token) throws IOException {

		Object jsonval = null;
		try {
			String query = "SELECT * FROM ubs_mock_services.google_check_status where `partnerToken`='"+partnerToken+"' and `serviceId`='"+ serviceId+ "'";
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				jsonval = respon.get(0).get("response");
				logger.info("Object " + jsonval);
				logger.info("found record");
			}
		} catch (Exception e) {
			logger.info("No Record found Excpetion:" + e);
		}
		String responseJson = (String) jsonval;

		logger.info("RESPONSE : " + responseJson);

		return responseJson;
	}


	@RequestMapping(value = "o/oauth2/token", method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody
	String googleAccessToken(WebRequest requestBody) throws IOException {
		try {
			logger.info("Request Parameter" + requestBody.getParameter("client_id"));

		} catch (Exception e) {
			logger.info("No Record found Excpetion:" + e);
		}

		Object jsonval = null;
		List<Map<String, Object>> dBresponse = null;
		try {
			String query = "SELECT * FROM google_access_token where client_id ='" + requestBody.getParameter("client_id") + "'";
			logger.info("QUERY FOR FETCHING DATA " + query);
			dBresponse = jdbcTemplate.queryForList(query);
			logger.info("Resposne" + dBresponse);
			if (dBresponse.size() >= 1) {
				jsonval = dBresponse.get(0).get("json");
				logger.info("Object " + jsonval);
				logger.info("found record");
			}
		} catch (Exception e) {
			logger.info("No Record found Excpetion:" + e);
		}
		String responseJson = (String) jsonval;

		logger.info("RESPONSE : " + responseJson);

		return responseJson;
	}
}
