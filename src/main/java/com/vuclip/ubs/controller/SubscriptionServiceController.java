package com.vuclip.ubs.controller;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.subscription_service.FreeTrialEligibilityRequestVO;
import com.vuclip.ubs.subscription_service.FreeTrialEligibilityResponseVO;
import com.vuclip.ubs.subscription_service.Response;
import com.vuclip.ubs.subscription_service.SubscriptionStatusReponse;

@RestController
public class SubscriptionServiceController {

	Logger logger = LogManager.getLogger(SubscriptionServiceController.class);

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/getUserStatus/{productId}", method = RequestMethod.GET, produces = "application/json")
	public SubscriptionStatusReponse sgetSubscriptionStatus(@PathVariable Integer productId,
			@RequestParam(required = false) String userid, @RequestParam(required = false) String msisdn,
			@RequestParam(required = false) Long subscriptionId) {
		logger.info("GETUSERSTATUS REQUEST PARAM : " + userid + msisdn + subscriptionId + productId);
		/*
		 * String whereClause = ""; boolean u = false, m = false, s = false; if (userid
		 * != null) { whereClause += " user_id='" + userid + "' and"; u = true; } if
		 * (msisdn != null) { whereClause += " msisdn='" + msisdn + "'  and"; m = true;
		 * } if (subscriptionId != null) { whereClause += " subscription_id='" +
		 * subscriptionId + "'  and"; s = true; }
		 * 
		 * if (whereClause.contains("and")) whereClause = whereClause.substring(0,
		 * whereClause.length() - 3); SubscriptionStatusReponse strresponse = null; if
		 * (u || m || s) { String query =
		 * "SELECT * FROM ubs_mock.user_subscription where " + whereClause; try {
		 * strresponse = jdbcTemplate.queryForObject(query, new
		 * UserSubscriptionMapper()); } catch (EmptyResultDataAccessException e) {
		 * logger.info("No REcord found"); } }
		 * 
		 * if (strresponse == null) { return new SubscriptionStatusReponse(false,
		 * "Error", "200", null);
		 * 
		 * } strresponse.setResponseCode("200"); strresponse.setSuccessful(true);
		 * strresponse.setMessage("success"); logger.info("GET USER STATUS RESPONSE : "
		 * + strresponse.toString()); return strresponse;
		 */

		if (userid != null) {
			String query = "SELECT * FROM user_subscription where user_id='" + userid + "'";
			return getUserSubscriptionRecord(query);
		}
		if (msisdn != null) {
			String query = "SELECT * FROM user_subscription where msisdn='" + msisdn + "'";
			return getUserSubscriptionRecord(query);
		}
		if (subscriptionId != null) {
			String query = "SELECT * FROM user_subscription where subscription_id=" + subscriptionId;
			return getUserSubscriptionRecord(query);
		}
		return new SubscriptionStatusReponse(false, "Data is not valid", "FA004", null);

	}

	@RequestMapping(value = "/check/freeTrialEligibility", method = RequestMethod.GET, produces = "application/json")
	public FreeTrialEligibilityResponseVO checkFreeTrialEligibility(
			FreeTrialEligibilityRequestVO freeTrialEligibilityRequestVO) {
		String userid = freeTrialEligibilityRequestVO.getUserId();
		String msisdn = freeTrialEligibilityRequestVO.getMsisdn();
		String country = freeTrialEligibilityRequestVO.getCountry();

		if (userid == null && msisdn == null) {
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
					.response(new Response("UserId or Msisdn is required", false, "200")).build();
		}

		if (country == null) {
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
					.response(new Response("Country is required", false, "200")).build();
		}

		if (userid != null) {
			String query = "SELECT * FROM ubs_mock_services.free_trial_history where user_id='" + userid + "'";
			return getFreeTrialRecords(query);
		}
		if (msisdn != null) {
			String query = "SELECT * FROM ubs_mock_services.free_trial_history where msisdn='" + msisdn + "'";
			return getFreeTrialRecords(query);
		}

		return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
				.response(new Response("No message available", false, "500")).build();

	}

	private FreeTrialEligibilityResponseVO getFreeTrialRecords(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				logger.info(jsonval);
				FreeTrialEligibilityResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
						FreeTrialEligibilityResponseVO.class);
				return response;
			}
		} catch (Exception e) {
			logger.info("Excpetion:" + e.getMessage());
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(true)
					.response(new Response("faiure", false, "200")).build();

		}
		logger.info("Free Trial New User");
		return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(true)
				.response(new Response("SUCCESS", true, "200")).build();

	}

	private SubscriptionStatusReponse getUserSubscriptionRecord(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				System.out.println(jsonval);
				SubscriptionStatusReponse response = ObjectMapperUtils.readValueFromString((String) jsonval,
						SubscriptionStatusReponse.class);
				logger.info("RESPONSE " + response.toString());

				return response;
			}
		} catch (Exception e) {
			logger.info("Excpetion:" + e.getMessage());
			return new SubscriptionStatusReponse(false, "Data is not valid", "FA004", null);

		}
		logger.info("User Status New User");
		return new SubscriptionStatusReponse(true, "success", "200", null);
	}
}
