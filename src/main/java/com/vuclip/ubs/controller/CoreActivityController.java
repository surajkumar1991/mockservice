package com.vuclip.ubs.controller;

import com.vuclip.ubs.models.core_activity_service.ConsentApiResquestVO;
import com.vuclip.ubs.models.core_activity_service.InitializeOtpResquestVO;
import com.vuclip.ubs.utils.LogUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;


@RestController
public class CoreActivityController {


    private Logger logger = LogManager.getLogger(CoreActivityController.class);
    private LogUtils logs = new LogUtils();
    @Autowired(required = true)
    private JdbcTemplate jdbcTemplate;


    @RequestMapping(value = "/rest/billing/otpInitialize", method = {RequestMethod.POST}, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    String response(
            @RequestBody InitializeOtpResquestVO request) {

        logger.debug(request);

        String response = null;

        Object jsonval = null;
        try {
            String query = "SELECT * FROM `otp_cas_initialize` where `userId`='"+request.getUserChargingInfo().getUserId()+"'";
            logger.info("QUERY FOR FETCHING DATA " + query);

            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                jsonval = respon.get(0).get("response");
                logger.info("Object " + jsonval);
                logger.info("found record");
            }
        } catch (Exception e) {
            logger.info("No Record found Excpetion:" + e);
        }

        response= (String)jsonval;
        response=response.replaceAll("BILLINGCODE",""+request.getBillingCode()+"");

        return response;
    }

    @RequestMapping(value = "rest/billing/activation/consentApi", method = {RequestMethod.POST}, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    String response(
            @RequestBody ConsentApiResquestVO request) {

        logger.debug(request);

        String response = null;

        Object jsonval = null;
        try {
            String query = "SELECT * FROM `cas_consentApi` where `billingTransactionId`='"+request.getUserInfo().getBillingTransactionId()+"'";
            logger.info("QUERY FOR FETCHING DATA " + query);

            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                jsonval = respon.get(0).get("response");
                logger.info("Object " + jsonval);
                logger.info("found record");
            }
        } catch (Exception e) {
            logger.info("No Record found Excpetion:" + e);
        }

        response= (String)jsonval;


        return response;
    }


}
