package com.vuclip.ubs.service.impl;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.codapay.init.CodapayInitRequest;
import com.vuclip.ubs.models.codapay.init.CodapayInitResult;
import com.vuclip.ubs.service.CodapayService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * The CodaPay service implementation class: Handles the business logic for CodaPay.
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
            String query = "SELECT * FROM `codapay_init_txn` where `key`='codapay_txn_id'";
            log.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> response = jdbcTemplate.queryForList(query);
            if (CollectionUtils.isEmpty(response)) {
                jsonval = response.get(0).get("json");
                log.info("Object : {}", jsonval);
                log.info("found record");
            }
        } catch (Exception e) {
            log.error("No Record found. Exception Occurred: {}" , e);
            return CodapayInitResult.builder().resultDesc(e.getMessage()).build();
        }
        result = ObjectMapperUtils.readValueFromString((String) jsonval, CodapayInitResult.class);
        long txnId = getRandomTxnId();
        if (result != null && txnId>0) {
            result.setTxnId(txnId);
        }
        return result;
    }

    private Long getRandomTxnId() {
        Date currentTime = new Date();
        long millis = currentTime.getTime();
        Random rand = new Random();
        int randomNumber = rand.nextInt(9000) + 1000;
        return Long.parseLong(millis + "" + randomNumber);
    }
}
