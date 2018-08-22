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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.partner_mock.PaytmStatusCheckRequestVO;
import com.vuclip.ubs.partner_mock.PaytmStatusCheckResponseVO;


@RestController("/partnerMock")
public class PartnerMock {
	Logger logger = LogManager.getLogger(PartnerMock.class);

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/oltp/HANDLER_INTERNAL/TXNSTATUS", method = { RequestMethod.GET }, produces = {"application/json" })
	public @ResponseBody PaytmStatusCheckResponseVO processPaytmStatusResponse(@RequestParam String jsonData) {
			 
		PaytmStatusCheckRequestVO paytmStatusCheckRequestVO=ObjectMapperUtils.readValueFromString(jsonData, PaytmStatusCheckRequestVO.class);

		System.out.println("REQUEST : " + paytmStatusCheckRequestVO.toString());
		String orderId = paytmStatusCheckRequestVO.getORDERID();
		if (orderId != null) {
				String query = "SELECT * FROM paytm_status where order_id='" + orderId + "' ";
				return getRecords(query);

			}
		return null; 
		
		}
	
	
	private PaytmStatusCheckResponseVO getRecords(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				System.out.println(jsonval);
				PaytmStatusCheckResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
						PaytmStatusCheckResponseVO.class);
				return response;
			}
		} catch (Exception e) {
			System.out.println("No Record found");
			return PaytmStatusCheckResponseVO.builder().build();

		}
		return PaytmStatusCheckResponseVO.builder().build();
	}
}
