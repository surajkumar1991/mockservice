package com.vuclip.ubs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.vuclip.ubs.models.ecentric.AddCardRequest;
import com.vuclip.ubs.models.ecentric.AddCardResponse;
import com.vuclip.ubs.models.ecentric.AuthorizeRequest;
import com.vuclip.ubs.models.ecentric.AuthorizeResponse;
import com.vuclip.ubs.models.ecentric.PaymentRequest;
import com.vuclip.ubs.models.ecentric.PaymentResponse;
import com.vuclip.ubs.models.ecentric.Secure3DLookupRequest;
import com.vuclip.ubs.models.ecentric.Secure3DLookupResponse;
import com.vuclip.ubs.models.ecentric.VoidRequest;
import com.vuclip.ubs.models.ecentric.VoidResponse;
import com.vuclip.ubs.service.EcentricPaymentGatewayService;

import lombok.extern.log4j.Log4j2;

@Endpoint
@Log4j2
public class EcentricController {

	private static final String NAMESPACE = "http://www.ecentricswitch.co.za/paymentgateway/v1";

	@Autowired
	EcentricPaymentGatewayService ecentricService;

	/**
	 *
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE, localPart = "AddCardRequest")
	@ResponsePayload
	public AddCardResponse initAddCard(@RequestPayload AddCardRequest request) {
		AddCardResponse addCardResponse = null;
		if (request != null) {
			log.info("Received Ecentric Add Card Request");
			return ecentricService.addCard(request);
		} else {
			HttpStatus.BAD_REQUEST.value();
			return addCardResponse;
		}

	}

	/**
	 *
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE, localPart = "Secure3DLookupRequest")
	@ResponsePayload
	public Secure3DLookupResponse initSecure3dLookUp(@RequestPayload Secure3DLookupRequest request) {
		Secure3DLookupResponse secure3DLookupResponse = null;
		if (request != null) {
			log.info("Received Ecentric Secure-3D-Lookup Request");
			return ecentricService.secure3DLookup(request);
		} else {
			HttpStatus.BAD_REQUEST.value();
			return secure3DLookupResponse;
		}
	}

	/**
	 *
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE, localPart = "AuthorizeRequest")
	@ResponsePayload
	public AuthorizeResponse initAuthorize(@RequestPayload AuthorizeRequest request) {
		AuthorizeResponse authorizeResponse = null;
		if (request != null) {
			log.info("Received Ecentric Authorize Request");
			return ecentricService.authorize(request);
		} else {
			HttpStatus.BAD_REQUEST.value();
			return authorizeResponse;
		}
	}

	/**
	 *
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE, localPart = "PaymentRequest")
	@ResponsePayload
	public PaymentResponse initPayment(@RequestPayload PaymentRequest request) {
		PaymentResponse paymentResponse = null;
		if (request != null) {
			log.info("Received Ecentric Payment Request");
			return ecentricService.payment(request);
		} else {
			HttpStatus.BAD_REQUEST.value();
			return paymentResponse;
		}
	}

	@PayloadRoot(namespace = NAMESPACE, localPart = "VoidRequest")
	@ResponsePayload
	public VoidResponse initVoid(@RequestPayload VoidRequest request) {
		VoidResponse voidResponse = null;
		if (request != null) {
			log.info("Received Ecentric Void Request");
			return ecentricService.initVoidRequest(request);
		} else {
			HttpStatus.BAD_REQUEST.value();
			return voidResponse;
		}
	}

}