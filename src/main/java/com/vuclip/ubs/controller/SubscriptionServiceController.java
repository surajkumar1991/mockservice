package com.vuclip.ubs.controller;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
import com.vuclip.ubs.subscription_service.UserSubscriptionMapper;

@RestController
public class SubscriptionServiceController {

	Logger logger = LogManager.getLogger(SubscriptionServiceController.class);

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/getUserStatus/{productId}", method = RequestMethod.GET, produces = "application/json")
	public SubscriptionStatusReponse sgetSubscriptionStatus(@PathVariable Integer productId,
			@RequestParam(required = false) String userid, @RequestParam(required = false) String msisdn,
			@RequestParam(required = false) Long subscriptionId) {
		System.out.println("GETUSERSTATUS REQUEST PARAM : " + userid + msisdn + subscriptionId + productId);
		String whereClause = "";
		boolean u = false, m = false, s = false;
		if (userid != null) {
			whereClause += " user_id='" + userid + "' and";
			u = true;
		}
		if (msisdn != null) {
			whereClause += " msisdn='" + msisdn + "'  and";
			m = true;
		}
		if (subscriptionId != null) {
			whereClause += " subscription_id='" + subscriptionId + "'  and";
			s = true;
		}

		if (whereClause.contains("and"))
			whereClause = whereClause.substring(0, whereClause.length() - 3);
		SubscriptionStatusReponse strresponse = null;
		if (u || m || s) {
			String query = "SELECT * FROM ubs_mock.user_subscription where " + whereClause;
			try {
				strresponse = jdbcTemplate.queryForObject(query, new UserSubscriptionMapper());
			} catch (EmptyResultDataAccessException e) {
				System.out.println("No REcord found");
			}
		}

		if (strresponse == null) {
			return new SubscriptionStatusReponse(false, "Error", "200", null);

		}
		strresponse.setResponseCode("200");
		strresponse.setSuccessful(true);
		strresponse.setMessage("success");
		System.out.println("GETUSERSTATUSRESPONSE : " + strresponse.toString());
		return strresponse;
	}

	@RequestMapping(value = "/check/freeTrialEligibility", method = RequestMethod.GET, produces = "application/json")
	public FreeTrialEligibilityResponseVO checkFreeTrialEligibility(
			FreeTrialEligibilityRequestVO freeTrialEligibilityRequestVO) {
		String userid = freeTrialEligibilityRequestVO.getUserId();
		String msisdn = freeTrialEligibilityRequestVO.getMsisdn();
		String country = freeTrialEligibilityRequestVO.getCountry();

		if (userid == null && msisdn == null) {
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
					.response(new Response(false, "UserId or Msisdn is required", "200")).build();
		}

		if (country == null) {
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
					.response(new Response(false, "UserId or Msisdn is required", "200")).build();
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
				.response(new Response(false, "No message available", "500")).build();

	}

	private FreeTrialEligibilityResponseVO getFreeTrialRecords(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				System.out.println(jsonval);
				FreeTrialEligibilityResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
						FreeTrialEligibilityResponseVO.class);
				return response;
			}
		} catch (Exception e) {
			System.out.println("New User");
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(true)
					.response(new Response(true, "SUCCESS", "200")).build();

		}
		return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
				.response(new Response(false, "SUCCESS", "200")).build();
	}
}
