package com.vuclip.ubs.controller;

import com.vuclip.ubs.models.codapay.init.CodapayInitRequest;
import com.vuclip.ubs.models.codapay.init.CodapayInitResult;
import com.vuclip.ubs.models.codapay.status.CodapayCheckStatusRequest;
import com.vuclip.ubs.models.codapay.status.CodapayCheckStatusResponse;
import com.vuclip.ubs.models.codapay.status.CodapayInquiryPaymentRequest;
import com.vuclip.ubs.models.codapay.status.CodapayInquiryPaymentResult;
import com.vuclip.ubs.service.CodapayService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The CodapayController class: Accepts requests for init txn, checkStatus, paymentStatus
 *
 * @author kirangohokar
 */
@Log4j2
@RestController
@RequestMapping(value = "/codapay")
public class CodapayController {

    @Autowired
    private CodapayService service;

    @PostMapping(value = "/init.xml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<CodapayInitResult> processInitRequest(@RequestBody @Valid CodapayInitRequest request, BindingResult result) {

        log.info("Got the request for CodaPay init txn : {}", request);
        CodapayInitResult initResult = null;

        if (result.hasErrors()) {
            String errors = stringifyErrors(result.getFieldErrors());
            log.error("Errors in {} : {}", result.getObjectName(), errors);
            initResult = CodapayInitResult.builder().resultDesc(errors).build();
            return ResponseEntity.badRequest().body(initResult);
        } else {
            initResult = service.processInitTxn(request);
            log.info("CodaPay init txn result : {}", initResult);
            return ResponseEntity.ok(initResult);
        }
    }

    @PostMapping(value = "/checkSubsStatus.json", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CodapayCheckStatusResponse> processCheckStatus(@RequestBody @Valid CodapayCheckStatusRequest request, BindingResult result) {
        log.info("Got the request for Codapay check status : {}", request);
        CodapayCheckStatusResponse response = null;

        if (result.hasErrors()) {
            String errors = stringifyErrors(result.getFieldErrors());
            log.error("Errors in {} : {}", result.getObjectName(), errors);
            response = CodapayCheckStatusResponse.builder().subscriptionResult(CodapayCheckStatusResponse.SubscriptionResult.builder().resultCode(355).resultDesc(errors).build()).build();
            return ResponseEntity.badRequest().body(response);
        } else {
            response = service.getStatus(request);
            log.info("Check status response : {}", response);
            return ResponseEntity.ok(response);
        }
    }

    @PostMapping(value = "/inquiryPaymentResult.xml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<CodapayInquiryPaymentResult> processInquiryPayment(@RequestBody @Valid CodapayInquiryPaymentRequest request, BindingResult result) {
        log.info("Got the request for Codapay inquiry payment : {}", request);
        CodapayInquiryPaymentResult response = null;
        if (result.hasErrors()) {
            String errors = stringifyErrors(result.getFieldErrors());
            log.error("Errors in {} : {}", result.getObjectName(), errors);
            response = CodapayInquiryPaymentResult.builder().resultDesc(errors).build();
            return ResponseEntity.badRequest().body(response);
        } else {
            response = service.getInquiryPaymentResult(request);
            return ResponseEntity.ok(response);
        }
    }

    private String stringifyErrors(List<FieldError> fieldErrors) {
        return fieldErrors.stream().map(e -> e.getField() + " : " + e.getDefaultMessage()).collect(Collectors.joining(", "));
    }
}
