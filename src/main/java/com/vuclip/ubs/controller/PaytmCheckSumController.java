package com.vuclip.ubs.controller;

import com.vuclip.ubs.utils.PaytmChecksumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.TreeMap;

@RestController
public class PaytmCheckSumController {
    private Logger logger = LogManager.getLogger(PaytmCheckSumController.class);

    @RequestMapping(value = "/paytm/checkSum", method = {RequestMethod.POST})
    public ResponseEntity<TreeMap<String, String>> conversionPost(HttpServletRequest httpServletRequest) {
        TreeMap<String, String> parametersMap = new TreeMap<>();
        logger.info("Fetching params from Request and creating Map for processing");
        if (httpServletRequest.getParameterMap().keySet().isEmpty()) {
            logger.info("ERROR : Pass Via Params");
            return new ResponseEntity<TreeMap<String, String>>(parametersMap, HttpStatus.BAD_REQUEST);

        }
        for (String key : httpServletRequest.getParameterMap().keySet()) {
            for (String value : httpServletRequest.getParameterMap().get(key)) {
                logger.info("Key= " + key + ", Value=" + value);
                parametersMap.put(key, value);
            }
        }

        logger.info("Initial parameters Map from Request " + parametersMap);
        TreeMap<String, String> newp = PaytmChecksumUtils.getChecksumParametersMap(parametersMap);
        logger.info(" Temp parameter map form Request " + newp.toString());
        String checksum = PaytmChecksumUtils.getChecksum(newp);
        logger.info("CheckSum " + newp.toString());
        parametersMap.put("CHECKSUMHASH", checksum);
        logger.info("Response parameters Map " + parametersMap);

        return new ResponseEntity<TreeMap<String, String>>(parametersMap, HttpStatus.OK);
    }

}
