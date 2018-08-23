package com.vuclip.ubs.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.subscription_service.BlockStatusRequestVO;
import com.vuclip.ubs.subscription_service.BlockStatusResponseVO;
import com.vuclip.ubs.subscription_service.BlockUserRequestVO;
import com.vuclip.ubs.subscription_service.BlockUserResponseVO;
import com.vuclip.ubs.subscription_service.DeactivateRequestVO;
import com.vuclip.ubs.subscription_service.DeactivateUserResponseVO;
import com.vuclip.ubs.subscription_service.Response;
import com.vuclip.ubs.subscription_service.StatusSummary;
import com.vuclip.ubs.subscription_service.UnblockRequestVO;
import com.vuclip.ubs.subscription_service.UnblockResponseVO;

@RestController
public class SubscriptionServiceController2 {
	Logger logger = LogManager.getLogger(SubscriptionServiceController2.class);

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/blockStatus", method = RequestMethod.GET, produces = "application/json")
	public BlockStatusResponseVO blockStatus(@Valid BlockStatusRequestVO blockStatusRequestVO) {
		logger.info("block status request : {}", blockStatusRequestVO);

		String userid = blockStatusRequestVO.getUserId();
		String msisdn = blockStatusRequestVO.getMsisdn();

		if (userid != null) {
			String query = "SELECT * FROM block_status where user_id='" + userid + "'";
			return getRecords(query);
		}
		if (msisdn != null) {
			String query = "SELECT * FROM block_status where msisdn='" + msisdn + "'";
			return getRecords(query);
		}
		return BlockStatusResponseVO.builder().blockedUserData(null).blockSummary(StatusSummary.BLACK_LISTED).build();
	}

	@RequestMapping(value = "/block", method = RequestMethod.POST, produces = "application/json")
	public BlockUserResponseVO block(@Valid @RequestBody BlockUserRequestVO blockUserRequestVO) {
		logger.info("block request : {}", blockUserRequestVO);

		String userid = blockUserRequestVO.getUserDetails().getUserId();
		String msisdn = blockUserRequestVO.getUserDetails().getMsisdn();

		if (userid != null) {
			String query = "SELECT * FROM block where user_id='" + userid + "'";
			return getBlockRecords(query);
		}
		if (msisdn != null) {
			String query = "SELECT * FROM block where msisdn='" + msisdn + "'";
			return getBlockRecords(query);
		}
		return BlockUserResponseVO.builder().blockedUserData(null).response(new Response("SUCCESS", true, "200"))
				.build();

	}

	@RequestMapping(value = "/unblock", method = RequestMethod.POST, produces = "application/json")
	public UnblockResponseVO unblock(@Valid @RequestBody UnblockRequestVO unblockRequestVO) {
		logger.info("unblock request : {}", unblockRequestVO);
		return UnblockResponseVO.builder().response(new Response("SUCCESS", true, "200")).build();
	}

	@RequestMapping(value = "/deactivate", method = RequestMethod.POST, produces = "application/json")
	public DeactivateUserResponseVO deactivate(@RequestBody DeactivateRequestVO deactivateRequestVO) {
		logger.info("Got request for deactivate: {}", deactivateRequestVO);

		String userid = deactivateRequestVO.getUserId();
		String msisdn = deactivateRequestVO.getMsisdn();

		if (userid != null) {
			String query = "SELECT * FROM deactivate where user_id='" + userid + "'";
			return getDeactivateRecords(query);
		}
		if (msisdn != null) {
			String query = "SELECT * FROM deactivate where msisdn='" + msisdn + "'";
			return getDeactivateRecords(query);
		}
		return DeactivateUserResponseVO.builder().status(null).build();

	}

	private DeactivateUserResponseVO getDeactivateRecords(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				System.out.println(jsonval);
				DeactivateUserResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
						DeactivateUserResponseVO.class);
				return response;
			}
		} catch (Exception e) {
			System.out.println("No REcord found");

		}
		return DeactivateUserResponseVO.builder().status(null).build();
	}

	private BlockUserResponseVO getBlockRecords(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				System.out.println(jsonval);
				BlockUserResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
						BlockUserResponseVO.class);
				return response;
			}
		} catch (Exception e) {
			System.out.println("No REcord found");
			return BlockUserResponseVO.builder().blockedUserData(null).response(new Response("SUCCESS", true, "200"))
					.build();

		}
		return BlockUserResponseVO.builder().blockedUserData(null).response(new Response("SUCCESS", true, "200"))
				.build();
	}

	private BlockStatusResponseVO getRecords(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				System.out.println(jsonval);
				BlockStatusResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
						BlockStatusResponseVO.class);
				return response;
			}
		} catch (Exception e) {
			System.out.println("No Record found");
			return BlockStatusResponseVO.builder().blockedUserData(null).blockSummary(StatusSummary.NOT_BLACKLISTED)
					.build();

		}
		return BlockStatusResponseVO.builder().blockedUserData(null).blockSummary(StatusSummary.NOT_BLACKLISTED)
				.build();
	}

}
