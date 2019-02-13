package com.vuclip.ubs.controller;

import com.vuclip.ubs.utils.LogUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.Map;


@RestController
public class TelRController {


    private Logger logger = LogManager.getLogger(TelRController.class);
    private LogUtils logs = new LogUtils();
    @Autowired(required = true)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "telr/gateway/order.json", method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    String response(WebRequest requestBody) {
        try {
            logger.info("Request Parameter" + requestBody.getParameter("ivp_method"));

        } catch (Exception e) {
            logger.info("No Record found Excpetion:" + e);
        }

        Object jsonval = null;
        List<Map<String, Object>> dBresponse = null;
        try {
            String query = "SELECT * FROM telr_create_order where ivp_method ='" + requestBody.getParameter("ivp_method") + "'";
            logger.info("QUERY FOR FETCHING DATA " + query);
            dBresponse = jdbcTemplate.queryForList(query);
            logger.info("Resposne" + dBresponse);
            if (dBresponse.size() >= 1) {
                jsonval = dBresponse.get(0).get("json");
                logger.info("Object " + jsonval);
                logger.info("found record");
            }
        } catch (Exception e) {
            logger.info("No Record found Excpetion:" + e);
        }
        String responseJson = (String) jsonval;

        logger.info("RESPONSE : " + responseJson);

        return responseJson;

    }


    @RequestMapping(value = "telr/tools/api/xml/agreement/{agreement_id}", method = {RequestMethod.DELETE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public @ResponseBody
    String response(@PathVariable("agreement_id") String agreement_id) {
        Object jsonval = null;
        List<Map<String, Object>> dBresponse = null;
        try {
            String query = "SELECT * FROM telr_delete_order where agrementId ='" + agreement_id + "'";
            logger.info("QUERY FOR FETCHING DATA " + query);
            dBresponse = jdbcTemplate.queryForList(query);
            logger.info("Resposne" + dBresponse);
            if (dBresponse.size() >= 1) {
                jsonval = dBresponse.get(0).get("response");
                logger.info("Object " + jsonval);
                logger.info("found record");
            }
        } catch (Exception e) {
            logger.info("No Record found Excpetion:" + e);
        }
        String response = (String) jsonval;
        logger.info("RESPONSE : " + response);
        return response;
    }

    @RequestMapping(value = "telr/tools/api/xml/agreement/{agreement_id}/history", method = {RequestMethod.GET}, produces = {MediaType.APPLICATION_XML_VALUE})
    public @ResponseBody
    String responseHistory(@PathVariable("agreement_id") String agreement_id) {
        Object jsonval = null;
        List<Map<String, Object>> dBresponse = null;
        try {
            String query = "SELECT * FROM telr_check_status where agrementId ='" + agreement_id + "'";
            logger.info("QUERY FOR FETCHING DATA " + query);
            dBresponse = jdbcTemplate.queryForList(query);
            logger.info("Resposne" + dBresponse);
            if (dBresponse.size() >= 1) {
                jsonval = dBresponse.get(0).get("response");
                logger.info("Object " + jsonval);
                logger.info("found record");
            }
        } catch (Exception e) {
            logger.info("No Record found Excpetion:" + e);
        }
        String response = (String) jsonval;
        logger.info("RESPONSE : " + response);
        return response;
    }

    @RequestMapping(value = "telr/gateway/remote.html", method = {RequestMethod.POST}, produces = {MediaType.TEXT_HTML_VALUE})
    public @ResponseBody
    String responseRefund(WebRequest request) {


        logger.debug("Transaction Reference ---->" + request.getParameter("tran_ref"));
        Object jsonval = null;
        List<Map<String, Object>> dBresponse = null;
        try {
            String query = "SELECT * FROM telr_refund where transactionref ='" + request.getParameter("tran_ref") + "'";
            logger.info("QUERY FOR FETCHING DATA " + query);
            dBresponse = jdbcTemplate.queryForList(query);
            logger.info("Resposne" + dBresponse);
            if (dBresponse.size() >= 1) {
                jsonval = dBresponse.get(0).get("response");
                logger.info("Object " + jsonval);
                logger.info("found record");
            }
        } catch (Exception e) {
            logger.info("No Record found Excpetion:" + e);
        }
        String response = (String) jsonval;
        logger.info("RESPONSE : " + response);
        return response;
    }
}
