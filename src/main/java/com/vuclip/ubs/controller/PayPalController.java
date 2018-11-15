package com.vuclip.ubs.controller;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.paypal.PayPalAuthResponse;
import com.vuclip.ubs.models.paypal.PaypalCreateAgreementRequest;
import com.vuclip.ubs.models.paypal.PaypalCreateAgreementResponse;
import com.vuclip.ubs.models.paytm.PaytmStatusCheckResponseVO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@RestController
public class PayPalController {

	private static String authResponse = "{ \"scope\": \"client_credentials\","
			+ "  \"nonce\": \"client_credentials\"," + "  \"access_token\": \"A21AAGL2a1cmTnMRJmiIUouY7ZNKdlotCX1RhWeb3Rok_tV-hmoyfp0XWeG625kHNCAJTLUmdYDseBBNsIRgorFGcUVrajaxQ\","
			+ "  \"token_type\": \"Bearer\"," + "  \"app_id\": \"APP-VIU\"," + "  \"expires_in\": 32999" + "}";
	private Logger logger = LogManager.getLogger(PayPalController.class);

	  @Autowired(required = true)
	    private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "paypal/v1/oauth2/token", method = { RequestMethod.GET, RequestMethod.POST }, produces = {
			"application/json" })
	public @ResponseBody PayPalAuthResponse paypalAuth(HttpServletRequest request) throws IOException {

		logger.info("PayPal oauth2 Request");
		Enumeration<String> headerNames = request.getHeaderNames();

		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			logger.info("header name " + headerName);
			Enumeration<String> headers = request.getHeaders(headerName);
			while (headers.hasMoreElements()) {
				String headerValue = headers.nextElement();
				logger.info(headerValue);
			}

		}

		Map<String, String[]> parameters = request.getParameterMap();
		for (String key : parameters.keySet()) {
			logger.info("Key " + key);
			for (String value : parameters.get(key)) {
				logger.info("Value " + value);
			}
		}

		StringBuilder sb = new StringBuilder();
		BufferedReader reader = request.getReader();
		try {
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line).append('\n');
			}
		} finally {
			reader.close();
		}
		logger.info(sb.toString());

		PayPalAuthResponse response = ObjectMapperUtils.readValueFromString(authResponse,
				PayPalAuthResponse.class);

		return response;
	}

	
	@RequestMapping(value = "paypal/v1/payments/billing-agreements", method = {
			RequestMethod.POST }, produces = { "application/json" })
	
	public @ResponseBody PaypalCreateAgreementResponse paypalBillingAggreements(@RequestBody PaypalCreateAgreementRequest requestBody) {
		logger.info("Payment Token : " + requestBody);
		
		logger.info("REQUEST : " + requestBody.toString());
        String id = requestBody.getPlan().getId();
        if (id != null) {
            String query = "SELECT * FROM paypal_billing where id='" + requestBody.getPlan().getId() + "' ";
            PaypalCreateAgreementResponse record = getRecords(query);
            logger.info("TXNSTATUS Response: " + record.toString());

            return record;
        }
		
		return null;
	}
	 private PaypalCreateAgreementResponse getRecords(String query) {

	        try {
	            String record = getRecord(query);
	            if (record != null) {
	                return ObjectMapperUtils.readValueFromString(record, PaypalCreateAgreementResponse.class);
	            }
	        } catch (Exception e) {
	            logger.info("Excpetion:" + e.getMessage());
	            logger.info(e);
	        }
	        return null;
	    }
	 private String getRecord(String query) {
	        try {
	            logger.info("QUERY FOR FETCHING DATA " + query);
	            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
	            if (respon.size() >= 1) {
	                Object jsonval = respon.get(0).get("json");
	                logger.info("Object " + jsonval);
	                logger.info("found record");
	                return (String) jsonval;
	            }
	        } catch (Exception e) {
	            logger.info("No Record found Excpetion:" + e.getMessage());
	            logger.info(e);
	        }
	        return null;
	    }

	@RequestMapping(value = "paypal/v1/payments/billing-agreements/{paymentToken}/agreement-execute", method = {
			RequestMethod.POST }, produces = { "application/json" })
	public @ResponseBody String paypalAgreementExecute(@PathVariable String paymentToken) {
		logger.info("Payment Token : " + paymentToken);
		return null;
	}

	@RequestMapping(value = "paypal/v1/payments/billing-agreements/<agreementId>/cancel", method = {
			RequestMethod.POST }, produces = { "application/json" })
	public @ResponseBody String paypalAgreementCancle(@PathVariable String agreementId) {
		logger.info("agreementId  : " + agreementId);
		return null;
	}

}
