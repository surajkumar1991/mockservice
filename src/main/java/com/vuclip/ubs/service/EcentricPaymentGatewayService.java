
package com.vuclip.ubs.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.vuclip.ubs.models.ecentric.AddCardRequest;
import com.vuclip.ubs.models.ecentric.AddCardResponse;
import com.vuclip.ubs.models.ecentric.AuthorizeRequest;
import com.vuclip.ubs.models.ecentric.AuthorizeResponse;
import com.vuclip.ubs.models.ecentric.ObjectFactory;
import com.vuclip.ubs.models.ecentric.PaymentRequest;
import com.vuclip.ubs.models.ecentric.PaymentResponse;
import com.vuclip.ubs.models.ecentric.Secure3DLookupRequest;
import com.vuclip.ubs.models.ecentric.Secure3DLookupResponse;
import com.vuclip.ubs.models.ecentric.VoidRequest;
import com.vuclip.ubs.models.ecentric.VoidResponse;

/**
 * The ecentricswitch service contract.
 * 
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.7-b01- Generated
 * source version: 2.1
 * 
 */
@WebService(name = "EcentricPaymentGatewayService", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface EcentricPaymentGatewayService {

	/**
	 * 
	 * The Payment method attempts to process a payment transaction with a single
	 * call. The method essentially combines the Authorize and Capture in a single
	 * transaction.
	 * 
	 * 
	 * @param parameters
	 * @return returns
	 *         com.vuclip.ubs.models.com.vuclip.ubs.models.ecentric.PaymentResponse
	 */
	@WebMethod(operationName = "Payment", action = "Payment")
	@WebResult(name = "PaymentResponse", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters")
	public PaymentResponse payment(
			@WebParam(name = "PaymentRequest", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters") PaymentRequest parameters);

	/**
	 * The AddCard method stores the card details against a merchant user id and
	 * provides a token that can be used to transact using the Secure3DLookup,
	 * Authorize, Capture, Void and Payment methods
	 * 
	 * @param parameters
	 * @return returns
	 *         com.vuclip.ubs.models.com.vuclip.ubs.models.ecentric.AddCardResponse
	 */
	@WebMethod(operationName = "AddCard", action = "AddCard")
	@WebResult(name = "AddCardResponse", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters")
	public AddCardResponse addCard(
			@WebParam(name = "AddCardRequest", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters") AddCardRequest parameters);

	/**
	 * The Authorize method attempts a funds reservation against the provided card
	 * details.
	 * 
	 * @param parameters
	 * @return returns
	 *         com.vuclip.ubs.models.com.vuclip.ubs.models.ecentric.AuthorizeResponse
	 */
	@WebMethod(operationName = "Authorize", action = "Authorize")
	@WebResult(name = "AuthorizeResponse", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters")
	public AuthorizeResponse authorize(
			@WebParam(name = "AuthorizeRequest", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters") AuthorizeRequest parameters);

	/**
	 * The Secure3DLookup method allows merchants to authenticate cards through 3D
	 * Secure.
	 * 
	 * @param parameters
	 * @return returns
	 *         com.vuclip.ubs.models.com.vuclip.ubs.models.ecentric.Secure3DLookupResponse
	 */
	@WebMethod(operationName = "Secure3DLookup", action = "Secure3DLookup")
	@WebResult(name = "Secure3DLookupResponse", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters")
	public Secure3DLookupResponse secure3DLookup(
			@WebParam(name = "Secure3DLookupRequest", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters") Secure3DLookupRequest parameters);

	/**
	 *
	 * @param parameters
	 * @return
	 */
	@WebMethod(operationName = "void", action = "void")
	@WebResult(name = "VoidResponse", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters")
	public VoidResponse initVoidRequest(
			@WebParam(name = "VoidRequest", targetNamespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", partName = "parameters") VoidRequest parameters);

}