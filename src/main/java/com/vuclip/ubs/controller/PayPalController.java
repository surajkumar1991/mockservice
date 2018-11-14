package com.vuclip.ubs.controller;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.paypal.PayPalAuthResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@RestController
public class PayPalController {

	private static String authResponse = "{ \"scope\": \"client_credentials\","
			+ "  \"nonce\": \"client_credentials\"," + "  \"access_token\": \"A21AAGL2a1cmTnMRJmiIUouY7ZNKdlotCX1RhWeb3Rok_tV-hmoyfp0XWeG625kHNCAJTLUmdYDseBBNsIRgorFGcUVrajaxQ\","
			+ "  \"token_type\": \"Bearer\"," + "  \"app_id\": \"APP-VIU\"," + "  \"expires_in\": 32999" + "}";
	private Logger logger = LogManager.getLogger(PayPalController.class);

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

	@RequestMapping(value = "paypal/v1/payments/billing-agreements/{paymentToken}/agreement-execute", method = {
			RequestMethod.GET }, produces = { "application/json" })
	public @ResponseBody String paypalAgreementExecute(@PathVariable String paymentToken) {
		logger.info("Payment Token : " + paymentToken);
		return null;
	}

	@RequestMapping(value = "paypal/v1/payments/billing-agreements/<agreementId>/cancel", method = {
			RequestMethod.GET }, produces = { "application/json" })
	public @ResponseBody String paypalAgreementCancle(@PathVariable String agreementId) {
		logger.info("agreementId  : " + agreementId);
		return null;
	}

}
