package com.vuclip.ubs.controller;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.schedular.SchedularRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchedularControllers {
    Logger logger = LogManager.getLogger(SchedularControllers.class);

    @Value("#{'${error.product.ids}'.split(',')}")
    List<String> productIds;
    @Value("#{'${error.partner.ids}'.split(',')}")
    List<String> partnerIds;

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity<String> sendAdNotification() {
        return new ResponseEntity<String>("{\"status\":\"UP\"}", HttpStatus.OK);
    }

    @RequestMapping(value = "/schedular", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> schedular(@RequestBody String json) {

        logger.info("REQUEST FOR SCHEDULAR : " + json);
        SchedularRequest request = ObjectMapperUtils.readValueFromString(json, SchedularRequest.class);

        if (request.getProductId() != null)
            logger.info("product id " + request.getProductId());

        if (request.getPartnerId() != null)
            logger.info(" partner id " + request.getPartnerId());

        for (String productId : productIds) {

            if (Integer.parseInt(productId) == request.getProductId()) {
                logger.info("RETURN NOTFOUND ");
                return new ResponseEntity<String>(json, HttpStatus.NOT_FOUND);
            }
        }

        for (String partnerId : partnerIds) {

            if (Integer.parseInt(partnerId) == request.getPartnerId()) {
                logger.info("RETURN NOTFOUND ");
                return new ResponseEntity<String>(json, HttpStatus.NOT_FOUND);
            }
        }
        logger.info("RETURN SUCCESS ");

        return new ResponseEntity<String>(json, HttpStatus.OK);

    }

}
