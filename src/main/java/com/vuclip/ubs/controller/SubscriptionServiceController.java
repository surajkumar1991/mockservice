package com.vuclip.ubs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.subscription_service.FreeTrialEligibilityRequestVO;
import com.vuclip.ubs.subscription_service.FreeTrialEligibilityResponseVO;
import com.vuclip.ubs.subscription_service.Response;
import com.vuclip.ubs.subscription_service.SubscriptionStatusReponse;
import com.vuclip.ubs.subscription_service.UserSubscriptionMapper;

@RestController
public class SubscriptionServiceController {

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

		Response response = null;

		if (freeTrialEligibilityRequestVO.getUserId() == null && freeTrialEligibilityRequestVO.getMsisdn() == null) {
			response = new Response(false, "UserId or Msisdn is required", "200");
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false).response(response).build();
		}

		if (freeTrialEligibilityRequestVO.getCountry() == null) {
			response = new Response(false, "Country is required", "200");
			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false).response(response).build();
		}

	
		if (whereClause.contains("and"))
			whereClause = whereClause.substring(0, whereClause.length() - 2);
		Boolean freeTrialEligibility = null;
		if (u || m) {
			String query = "SELECT free_trial FROM ubs_mock.free_trial_history where " + whereClause;
			try {
				strresponse = jdbcTemplate.queryForObject(query, new UserSubscriptionMapper());
			} catch (EmptyResultDataAccessException e) {
				System.out.println("No Record found");
			}
		}

		if (strresponse == null) {
			response = new Response(true, "success", "200");

			return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(true).response(response).build();
		}

		response = new Response(true, "success", "200");

		return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(true).response(response).build();

	}
}
