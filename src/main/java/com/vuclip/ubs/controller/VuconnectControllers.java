package com.vuclip.ubs.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.vuconnect.PartnerActivationConsentParserRequestVO;
import com.vuclip.ubs.models.vuconnect.PartnerActivationConsentParserResponseVO;
import com.vuclip.ubs.models.vuconnect.PartnerActivationConsentRequestVO;
import com.vuclip.ubs.models.vuconnect.PartnerActivationConsentResponseVO;
import com.vuclip.ubs.models.vuconnect.PartnerActivationConsentResponseVOMapper;
import com.vuclip.ubs.models.vuconnect.PartnerDeactivationConsentParserRequestVO;
import com.vuclip.ubs.models.vuconnect.PartnerDeactivationConsentParserResponseVO;
import com.vuclip.ubs.models.vuconnect.PartnerDeactivationConsentRequestVO;
import com.vuclip.ubs.models.vuconnect.PartnerDeactivationConsentResponseVO;

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
	PartnerActivationConsentParserResponseVO processActivationConsentParser(
			@RequestBody @Valid PartnerActivationConsentParserRequestVO partnerActivationConsentParserRequestVO) {
		logger.info("ACTIVATION PARSER REQUEST : " +partnerActivationConsentParserRequestVO.toString());

		String msisdn = partnerActivationConsentParserRequestVO.getMsisdn();
		String billingTransactionId = partnerActivationConsentParserRequestVO.getBillingTransactionId();

		PartnerActivationConsentParserResponseVO response =new PartnerActivationConsentParserResponseVO();

		if (msisdn != null) {
			String query = "SELECT * FROM PartnerActivationConsentParser where user_id='" + msisdn + "'";
			response = getPartnerActivationConsentParserRecord(query);

			response.setBillingTransactionId(billingTransactionId);


			logger.info("ACTIVATION PARSER RESPONSE : " +response.toString());

			return response;
		}

		logger.info("ACTIVATION PARSER RESPONSE : " +response.toString());


		return response;
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


	private PartnerActivationConsentParserResponseVO getPartnerActivationConsentParserRecord(String query) {
		try {
			logger.info("QUERY FOR FETCHING DATA " + query);
			List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
			if (respon.size() >= 1) {
				Object jsonval = respon.get(0).get("json");
				logger.info(jsonval);
				PartnerActivationConsentParserResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
						PartnerActivationConsentParserResponseVO.class);

				return response;
			}
		} catch (Exception e) {
			logger.info("Excpetion:" + e);
			return null;

		}
		return null;
	}

}
