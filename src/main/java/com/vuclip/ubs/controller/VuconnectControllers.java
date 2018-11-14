package com.vuclip.ubs.controller;

import com.vuclip.ubs.models.vuconnect.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import javax.validation.Valid;

@RestController("/vuconnect")
public class VuconnectControllers {
    private Logger logger = LogManager.getLogger(VuconnectControllers.class);

    @Autowired(required = true)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/consent/activationConsent", method = {RequestMethod.POST}, produces = {
            MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    PartnerActivationConsentResponseVO processActivationConsent(
            @RequestBody @Valid PartnerActivationConsentRequestVO partnerActivationConsentRequestVO) {

        logger.info("REQUEST : " + partnerActivationConsentRequestVO.toString());
        String userid = partnerActivationConsentRequestVO.getUserId();
        PartnerActivationConsentResponseVO response = null;
        if (userid != null) {
            try {
                String query = "SELECT * FROM consent_data where user_id='" + userid + "' ";

                response = jdbcTemplate.queryForObject(query, new PartnerActivationConsentResponseVOMapper());
                logger.info("RESPONSE : " + response.toString());

                return response;
            } catch (EmptyResultDataAccessException e) {
                logger.info("No REcord found" + e);
            }
        }
        String msisdn = partnerActivationConsentRequestVO.getMsisdn();
        if (msisdn != null) {
            try {
                String query = "SELECT * FROM consent_data where msisdn='" + msisdn + "' ";

                response = jdbcTemplate.queryForObject(query, new PartnerActivationConsentResponseVOMapper());
                logger.info("RESPONSE : " + response.toString());

                return response;

            } catch (EmptyResultDataAccessException e) {
                logger.info("No REcord found" + e);
            }
        }

        return null;

    }

    @RequestMapping(value = "/consent/activationConsentParser", method = {RequestMethod.POST}, produces = {
            MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    DeferredResult<PartnerActivationConsentParserResponseVO> processActivationConsentParser(
            @RequestBody @Valid PartnerActivationConsentParserRequestVO partnerActivationConsentParserRequestVO) {
        logger.info(partnerActivationConsentParserRequestVO.toString());

        DeferredResult<PartnerActivationConsentParserResponseVO> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

    @RequestMapping(value = "/consent/deactivationConsent", method = {RequestMethod.POST}, produces = {
            MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    DeferredResult<PartnerDeactivationConsentResponseVO> processDeactivationConsent(
            @RequestBody @Valid PartnerDeactivationConsentRequestVO partnerDeactivationConsentRequestVO) {
        logger.info(partnerDeactivationConsentRequestVO.toString());

        DeferredResult<PartnerDeactivationConsentResponseVO> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

    @RequestMapping(value = "/consent/deactivationConsentParser", method = {RequestMethod.POST}, produces = {
            MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    DeferredResult<PartnerDeactivationConsentParserResponseVO> processDeactivationConsentParser(
            @RequestBody @Valid PartnerDeactivationConsentParserRequestVO partnerDeactivationConsentParserRequestVO) {
        logger.info(partnerDeactivationConsentParserRequestVO.toString());

        DeferredResult<PartnerDeactivationConsentParserResponseVO> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

}
