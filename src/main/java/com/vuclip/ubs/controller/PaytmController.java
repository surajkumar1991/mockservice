package com.vuclip.ubs.controller;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.paytm.PaytmRenewalResponse;
import com.vuclip.ubs.models.paytm.PaytmStatusCheckRequestVO;
import com.vuclip.ubs.models.paytm.PaytmStatusCheckResponseVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController("/partnerMock")
public class PaytmController {
    private Logger logger = LogManager.getLogger(PaytmController.class);

    @Autowired(required = true)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/oltp/HANDLER_INTERNAL/TXNSTATUS", method = {RequestMethod.GET}, produces = {
            "application/json"})
    public @ResponseBody
    PaytmStatusCheckResponseVO processPaytmStatusResponse(@RequestParam String JsonData) {

        if (JsonData != null) {
            PaytmStatusCheckRequestVO paytmStatusCheckRequestVO = ObjectMapperUtils.readValueFromString(JsonData,
                    PaytmStatusCheckRequestVO.class);

            logger.info("REQUEST : " + paytmStatusCheckRequestVO.toString());
            String orderId = paytmStatusCheckRequestVO.getORDERID();
            if (orderId != null) {
                String query = "SELECT * FROM paytm_status where user_id='" + orderId.split("_")[0] + "' ";
                PaytmStatusCheckResponseVO record = getRecords(query);
                record.setORDERID(orderId);
                logger.info("TXNSTATUS Response: " + record.toString());

                return record;
            }

        }

        logger.info("Returning null response");
        return null;
    }

    @RequestMapping(value = "/oltp-web/processTransaction", method = {RequestMethod.POST}, produces = {
            "application/json"})
    public @ResponseBody
    PaytmRenewalResponse processPaytmRenewalResponse(HttpServletRequest request) {

        logger.info("REQUEST : " + request.getParameter("ORDER_ID"));

        Map<String, String[]> parameters = request.getParameterMap();
        for (String key : parameters.keySet()) {
            logger.info("Key " + key);
            for (String value : parameters.get(key)) {
                logger.info("Value " + value);
            }
        }

        String orderId = request.getParameter("ORDER_ID");
        if (orderId != null) {
            String query = "SELECT * FROM paytm_renewal where user_id='" + orderId.split("_")[0] + "' ";
            PaytmRenewalResponse record = getRenewalRecords(query);
            record.setORDERID(orderId);
            record.setSUBSID(request.getParameter("SUBS_ID"));

            logger.info("RENEWAL Response: " + record.toString());
            return record;
        }

        logger.info("Returning null response");
        return null;

    }

    private PaytmStatusCheckResponseVO getRecords(String query) {

        try {
            String record = getRecord(query);
            if (record != null) {
                return ObjectMapperUtils.readValueFromString(record, PaytmStatusCheckResponseVO.class);
            }
        } catch (Exception e) {
            logger.info("Excpetion:" + e.getMessage());
            logger.info(e);
        }
        return null;
    }

    private PaytmRenewalResponse getRenewalRecords(String query) {

        try {
            String record = getRecord(query);
            if (record != null) {

                return ObjectMapperUtils.readValueFromString(record, PaytmRenewalResponse.class);
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

}