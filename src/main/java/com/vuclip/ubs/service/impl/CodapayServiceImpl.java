package com.vuclip.ubs.service.impl;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.codapay.init.CodapayInitRequest;
import com.vuclip.ubs.models.codapay.init.CodapayInitResult;
import com.vuclip.ubs.models.codapay.status.CodapayCheckStatusRequest;
import com.vuclip.ubs.models.codapay.status.CodapayCheckStatusResponse;
import com.vuclip.ubs.models.codapay.status.CodapayInquiryPaymentRequest;
import com.vuclip.ubs.models.codapay.status.CodapayInquiryPaymentResult;
import com.vuclip.ubs.service.CodapayService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * The CodaPay service implementation class: Handles the business logic for CodaPay.
 *
 * @author kirangohokar
 */
@Log4j2
@Service
public class CodapayServiceImpl implements CodapayService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public CodapayInitResult processInitTxn(CodapayInitRequest request) {
        CodapayInitResult result = null;
        Object jsonval = null;
        try {
            String query = "SELECT * FROM `codapay_txn` where `txn_type`='codapay_init_txn' and `api_key`='" + request.getApiKey() + "'";
            log.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> response = jdbcTemplate.queryForList(query);
            if (!CollectionUtils.isEmpty(response)) {
                jsonval = response.get(0).get("json");
                log.info("Object : {}", jsonval);
                log.info("found record");
                result = ObjectMapperUtils.getXmlObjectMapper().readValue((String) jsonval, CodapayInitResult.class);
            }
        } catch (Exception e) {
            log.error("No Record found. Exception Occurred: {}", e);
            return CodapayInitResult.builder().resultDesc("No Record found. " + e.getMessage()).build();
        }
        return result;
    }

    @Override
    public CodapayCheckStatusResponse getStatus(CodapayCheckStatusRequest request) {
        log.info("Processing check status request : {}", request);
        CodapayCheckStatusResponse response = null;
        Object jsonval = null;
        try {
            String query = "SELECT * FROM `codapay_txn` where `txn_type`='codapay_check_status' and `api_key`='" + request.getSubscriptionRequest().getApiKey() + "'";
            log.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> result = jdbcTemplate.queryForList(query);
            if (!CollectionUtils.isEmpty(result)) {
                jsonval = result.get(0).get("json");
                log.info("Object : {}", jsonval);
                log.info("found record");
            }
        } catch (Exception e) {
            log.error("No Record found exception: {}", e.getMessage());
            response = CodapayCheckStatusResponse.builder().subscriptionResult(CodapayCheckStatusResponse.SubscriptionResult.builder().resultCode(355).resultDesc(e.getMessage()).build()).build();
            return response;
        }

        response = ObjectMapperUtils.readValueFromString((String) jsonval, CodapayCheckStatusResponse.class);
        CodapayCheckStatusResponse response1 = Optional.ofNullable(response).orElse(CodapayCheckStatusResponse.builder().subscriptionResult(CodapayCheckStatusResponse.SubscriptionResult.builder().resultCode(355).resultDesc("Error").build()).build());
        CodapayCheckStatusResponse.SubscriptionInfo subscriptionInfo = response1.getSubscriptionResult().getSubscriptionInfo();
        subscriptionInfo.setSubscriptionId(Integer.valueOf(request.getSubscriptionRequest().getCheckStatusValue()));
        response1.getSubscriptionResult().setSubscriptionInfo(subscriptionInfo);

        return response1;
    }

    @Override
    public CodapayInquiryPaymentResult getInquiryPaymentResult(CodapayInquiryPaymentRequest request) {
        log.info("Processing inquiry payment request : {}", request);
        CodapayInquiryPaymentResult response = null;
        Object jsonval = null;
        try {
            String query = "SELECT * FROM `codapay_txn` where `txn_type`='codapay_inquiry_payment_result' and `api_key`='" + request.getApiKey() + "'";
            log.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> result = jdbcTemplate.queryForList(query);
            if (!CollectionUtils.isEmpty(result)) {
                jsonval = result.get(0).get("json");
                log.info("Object : {}", jsonval);
                log.info("found record");
            }
            response = ObjectMapperUtils.getXmlObjectMapper().readValue((String) jsonval, CodapayInquiryPaymentResult.class);
            if (response != null)
                response.setTxnId(request.getTxnId());
        } catch (Exception e) {
            log.error("No Record found exception: {}", e.getMessage());
            response = CodapayInquiryPaymentResult.builder().resultCode(355).resultDesc(e.getMessage()).build();
            return response;
        }
        return response;
    }

    private Long getRandomTxnId() {
        Date currentTime = new Date();
        long millis = currentTime.getTime();
        Random rand = new Random();
        int randomNumber = rand.nextInt(9000) + 1000;
        return Long.parseLong(millis + "" + randomNumber);
    }
}
