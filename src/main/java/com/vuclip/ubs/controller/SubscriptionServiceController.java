package com.vuclip.ubs.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.subscription_service.SubscriptionStatusReponse;

@RestController
public class SubscriptionServiceController {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;


	@RequestMapping(value = "/getUserStatus/{productId}", method = RequestMethod.GET, produces = "application/json")
	public SubscriptionStatusReponse sgetSubscriptionStatus(@PathVariable Integer productId,
			@RequestParam(required = true) String userid, @RequestParam(required = false) String msisdn,
			@RequestParam(required = false) Long subscriptionId) {
		String query = "select * from ubs_mock.get_user_status where jsondata like '%" + userid + "%';";
		List<String> strresponse = jdbcTemplate.query(query, new RowMapper<String>() {
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
		});
		if (strresponse.size() > 1) {
			SubscriptionStatusReponse errorResponse = new SubscriptionStatusReponse();
			errorResponse.setMessage("Value in DB are returning more then one record check " + query);
			errorResponse.setResponseCode("500");
			errorResponse.setStatus(null);
			errorResponse.setSuccessful(false);
			return errorResponse;

		}
		return ObjectMapperUtils.readValueFromString(strresponse.get(0), SubscriptionStatusReponse.class);
	}

}
