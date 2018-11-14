package com.vuclip.ubs.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
public class PayPalController {

    private Logger logger = LogManager.getLogger(PayPalController.class);

    @RequestMapping(value = "paypal/v1/oauth2/token", method = {RequestMethod.GET,RequestMethod.POST}, produces = {"application/json"})
    public @ResponseBody
    String paypalAuth(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            logger.info("header name " + headerName);
            Enumeration<String> headers = request.getHeaders(headerName);
            while (headers.hasMoreElements()) {
                String headerValue = headers.nextElement();
                logger.info(headerValue);
            }

        }

        return null;
    }

    @RequestMapping(value = "paypal/v1/payments/billing-agreements/{paymentToken}/agreement-execute", method = {RequestMethod.GET}, produces = {"application/json"})
    public @ResponseBody
    String paypalAgreementExecute(@PathVariable String paymentToken) {
        logger.info("Payment Token : " + paymentToken);
        return null;
    }

    @RequestMapping(value = "paypal/v1/payments/billing-agreements/<agreementId>/cancel", method = {RequestMethod.GET}, produces = {"application/json"})
    public @ResponseBody
    String paypalAgreementCancle(@PathVariable String agreementId) {
        logger.info("agreementId  : " + agreementId);
        return null;
    }


}
