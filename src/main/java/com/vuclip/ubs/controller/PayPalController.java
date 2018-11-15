package com.vuclip.ubs.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.paypal.PayPalAuthResponse;
import com.vuclip.ubs.models.paypal.PaypalCreateAgreementRequest;
import com.vuclip.ubs.models.paypal.PaypalCreateAgreementResponse;
import com.vuclip.ubs.utils.LogUtils;

@RestController
public class PayPalController {

	private static String replaceTokenStringTest = "REPLACETOKENSTRINGTEST";
	private Logger logger = LogManager.getLogger(PayPalController.class);
	private LogUtils logs = new LogUtils();
	@Autowired(required = true)
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "paypal/v1/oauth2/token", method = { RequestMethod.GET, RequestMethod.POST }, produces = {
			"application/json" })
	public @ResponseBody PayPalAuthResponse paypalAuth(HttpServletRequest request) throws IOException {

		logger.info("PayPal oauth2 Request");
		logs.logHeader(request);
		logs.logParamsAndBody(request);

		Object jsonval = null;
		try {
			String query = "SELECT * FROM `paypal_auth` where `key`='paypal_access_token'";
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				jsonval = respon.get(0).get("json");
				logger.info("Object " + jsonval);
				logger.info("found record");
			}
		} catch (Exception e) {
			logger.info("No Record found Excpetion:" + e);
		}
		PayPalAuthResponse response = ObjectMapperUtils.readValueFromString((String) jsonval, PayPalAuthResponse.class);

		return response;
	}

	@RequestMapping(value = "paypal/v1/payments/billing-agreements", method = { RequestMethod.POST }, produces = {
			"application/json" })

	public @ResponseBody ResponseEntity<PaypalCreateAgreementResponse> paypalBillingAggreements(
			@RequestBody PaypalCreateAgreementRequest requestBody) {
		logger.info("Payment Token : " + requestBody);

		logger.info("REQUEST : " + requestBody.toString());
		String id = requestBody.getPlan().getId();
		PaypalCreateAgreementResponse response=null;
		if (id != null) {
			Object jsonval = null;
			List<Map<String, Object>> dBresponse=null;
			try {
				String query = "SELECT * FROM paypal_create_agreement where id='" + requestBody.getPlan().getId() + "' ";
				logger.info("QUERY FOR FETCHING DATA " + query);
				 dBresponse = jdbcTemplate.queryForList(query);
				if (dBresponse.size() >= 1) {
					jsonval = dBresponse.get(0).get("json");
					logger.info("Object " + jsonval);
					logger.info("found record");
				}
			} catch (Exception e) {
				logger.info("No Record found Excpetion:" + e);
			}
			String responseJson=(String) jsonval;
			
			responseJson=responseJson.replaceAll(replaceTokenStringTest, "EC-"+dBresponse.get(0).get("billing_type")+"-"+System.currentTimeMillis());
			 response = ObjectMapperUtils.readValueFromString((String) responseJson, PaypalCreateAgreementResponse.class);
				return new ResponseEntity<PaypalCreateAgreementResponse>(response, HttpStatus.CREATED);

		}
		return new ResponseEntity<PaypalCreateAgreementResponse>(response, HttpStatus.BAD_REQUEST);

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
