package com.vuclip.ubs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.vuclip.ubs.vuconnect.PartnerActivationConsentParserRequestVO;
import com.vuclip.ubs.vuconnect.PartnerActivationConsentParserResponseVO;
import com.vuclip.ubs.vuconnect.PartnerActivationConsentRequestVO;
import com.vuclip.ubs.vuconnect.PartnerActivationConsentResponseVO;
import com.vuclip.ubs.vuconnect.PartnerDeactivationConsentParserRequestVO;
import com.vuclip.ubs.vuconnect.PartnerDeactivationConsentParserResponseVO;
import com.vuclip.ubs.vuconnect.PartnerDeactivationConsentRequestVO;
import com.vuclip.ubs.vuconnect.PartnerDeactivationConsentResponseVO;

@RestController("/vuconnect")
public class Vuconnect {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/activationConsent", method = { RequestMethod.POST }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody DeferredResult<PartnerActivationConsentResponseVO> processActivationConsent(
			@RequestBody @Valid PartnerActivationConsentRequestVO partnerActivationConsentRequestVO) {
		DeferredResult<PartnerActivationConsentResponseVO> deferredResult = new DeferredResult<>();

		System.out.println(partnerActivationConsentRequestVO.toString());
		// String productCode =
		// VuConnectUtil.getPartnerLayerProductCode(partnerActivationConsentRequestVO.getRequestedBillingCode());
		// LOGGER.error("ActivationConsent Request No Product code Configured for
		// Request Billing Code {}",
		// partnerActivationConsentRequestVO.getRequestedBillingCode());
		//
		// // Get product-specific thread-pool
		// CustomThreadPool customThreadPool =
		// ThreadPoolUtil.getVuconnectProductSpecificThreadPool(productCode);
		// customThreadPool.submit(new
		// NioActivationConsentController(partnerActivationConsentRequestVO,
		// deferredResult, productCode));

		// Return deferredResult
		return deferredResult;
	}

	@RequestMapping(value = "/activationConsentParser", method = { RequestMethod.POST }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody DeferredResult<PartnerActivationConsentParserResponseVO> processActivationConsentParser(
			@RequestBody @Valid PartnerActivationConsentParserRequestVO partnerActivationConsentParserRequestVO) {
		DeferredResult<PartnerActivationConsentParserResponseVO> deferredResult = new DeferredResult<>();
		// ConsentParserRequestVO consentParseRequestVo = new ConsentParserRequestVO();
		//
		// String productCode =
		// VuConnectUtil.getPartnerLayerProductCode(partnerActivationConsentParserRequestVO.getRequestedBillingCode());
		// LOGGER.error("ActivationConsentParser Request No Product code Configured for
		// Request Billing Code {}",
		// partnerActivationConsentParserRequestVO.getRequestedBillingCode());
		// consentParseRequestVo.setProductCode(productCode);
		//
		// // Get product-specific thread-pool
		// CustomThreadPool customThreadPool =
		// ThreadPoolUtil.getVuconnectProductSpecificThreadPool(productCode);
		// customThreadPool.submit(new
		// NioActivationConsentParserController(partnerActivationConsentParserRequestVO,
		// consentParseRequestVo, deferredResult));

		// Return deferredResult
		return deferredResult;
	}

	@RequestMapping(value = "/deactivationConsent", method = { RequestMethod.POST }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody DeferredResult<PartnerDeactivationConsentResponseVO> processDeactivationConsent(
			@RequestBody @Valid PartnerDeactivationConsentRequestVO partnerDeactivationConsentRequestVO) {
		DeferredResult<PartnerDeactivationConsentResponseVO> deferredResult = new DeferredResult<>();

		// String productCode =
		// VuConnectUtil.getPartnerLayerProductCode(partnerDeactivationConsentRequestVO.getRequestedBillingCode());
		// LOGGER.error("DeactivationConsent Request No Product code Configured for
		// Request Billing Code {}",
		// partnerDeactivationConsentRequestVO.getRequestedBillingCode());
		//
		// // Get product-specific thread-pool
		// CustomThreadPool customThreadPool =
		// ThreadPoolUtil.getVuconnectProductSpecificThreadPool(productCode);
		// customThreadPool.submit(new
		// NioDeactivationConsentController(partnerDeactivationConsentRequestVO,
		// deferredResult, productCode));

		// Return deferredResult
		return deferredResult;
	}

	@RequestMapping(value = "/deactivationConsentParser", method = { RequestMethod.POST }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody DeferredResult<PartnerDeactivationConsentParserResponseVO> processDeactivationConsentParser(
			@RequestBody @Valid PartnerDeactivationConsentParserRequestVO partnerDeactivationConsentParserRequestVO) {
		DeferredResult<PartnerDeactivationConsentParserResponseVO> deferredResult = new DeferredResult<>();
		// ConsentParserRequestVO consentParseRequestVo = new ConsentParserRequestVO();
		//
		// String productCode =
		// VuConnectUtil.getPartnerLayerProductCode(partnerDeactivationConsentParserRequestVO.getRequestedBillingCode());
		// LOGGER.error("DeactivationConsentParser Request No Product code Configured
		// for Request Billing Code {}",
		// partnerDeactivationConsentParserRequestVO.getRequestedBillingCode());
		// consentParseRequestVo.setProductCode(productCode);
		//
		// // Get product-specific thread-pool
		// CustomThreadPool customThreadPool =
		// ThreadPoolUtil.getVuconnectProductSpecificThreadPool(productCode);
		// customThreadPool.submit(new
		// NioDeactivationConsentParserController(partnerDeactivationConsentParserRequestVO,
		// consentParseRequestVo, deferredResult));

		// Return deferredResult
		return deferredResult;
	}

}
