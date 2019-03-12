package com.vuclip.ubs.utils;

import com.vuclip.ubs.models.ecentric.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

@Component
@Log4j2
public class EcentricResponse {


    @Value("${ecentricMerchantId}")
    private String merchantId;
    @Value("${ecentricCardnumber}")
    private String cardNumber;
    @Value("${ecentricToken}")
    private String token;

    @Value("${ecentricTransactionId}")
    private String transactionId;

    @Value("${ecentricRecondId}")
    private String reconId;


    private final static String AUTHCODE="894048";

    /**
     * @return
     */
    public ResponseDetail setErrorResponseInvalidCard(AddCardRequest addCardRequestParams, String cardNumber) {
        ResponseDetail responseDetail = new ResponseDetail();
        responseDetail.setSource("ECS");
        responseDetail.setCode("VF");
        if (!addCardRequestParams.getCard().getCardNumber().getValue().equalsIgnoreCase(cardNumber))
            responseDetail.setDescription("Validation fault. The Card Number is invalid");
        else
            responseDetail.setDescription("Validation fault. Merchant authentication failed");
        return responseDetail;
    }

    /**
     * @param responseDetail
     * @return
     */
    public ResponseDetail setSecure3DSuccessResponse(ResponseDetail responseDetail) {
        responseDetail.setSource("3DSecure");
        responseDetail.setCode("0");
        responseDetail.setDescription("Success");
        responseDetail.setClientMessage("Success");
        return responseDetail;
    }

    /**
     * @param secure3DLookupRequest
     * @param token
     * @param merchantId
     * @return
     */
    public ResponseDetail setErrorResponseInvalidSecure3dLookup(Secure3DLookupRequest secure3DLookupRequest, String token, String merchantId) {
        ResponseDetail responseDetail = new ResponseDetail();
        responseDetail.setSource("ECS");
        responseDetail.setCode("VF");

        if (!secure3DLookupRequest.getTransactionID().equalsIgnoreCase(transactionId)) {
            responseDetail.setDescription("Validation fault. Duplicate TransactionID");
            responseDetail.setClientMessage("The transaction failed.");
        } else if (!secure3DLookupRequest.getMerchantID().equalsIgnoreCase(merchantId)) {
            responseDetail.setDescription("Validation fault. Merchant authentication failed");

        }

        return responseDetail;
    }

    /**
     * 
     * @param secure3DLookupReqParams
     * @param responeStatus
     * @return
     */
    public Secure3DLookupResponse populateSecure3DLookUpResponse( Secure3DLookupRequest secure3DLookupReqParams, String responeStatus) {
        Secure3DLookupResponse secure3DLookupResponse = new Secure3DLookupResponse();
        ResponseDetail responseDetail = new ResponseDetail();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> saleReconID = factory.createSecure3DLookupResponseSaleReconID("true");
        if (responeStatus.equalsIgnoreCase("SUCCESS")) {
            JAXBElement<String> createAcsurl = factory.createSecure3DLookupResponseAcsUrl("https://sandbox.ecentric.co.za/MockACSUrl/ACSUrl.aspx");
            JAXBElement<String> createPayLoad = factory.createSecure3DLookupResponsePAReqPayload("**** TEST PAYLOAD ***");
            secure3DLookupResponse.setTransactionID(transactionId);
            secure3DLookupResponse.setTransactionDateTime(generateXmlGeorDate());
            secure3DLookupResponse.setSaleReconID(saleReconID);
            secure3DLookupResponse.setReconID(reconId);
            secure3DLookupResponse.setTransactionStatus(TransactionStatusType.SUCCESS);
            secure3DLookupResponse.setResponseDetail(setSecure3DSuccessResponse(responseDetail));
            secure3DLookupResponse.setEnrolled(true);
            secure3DLookupResponse.setAcsUrl(createAcsurl);
            secure3DLookupResponse.setPAReqPayload(createPayLoad);
            return secure3DLookupResponse;
        } else {
            JAXBElement<String> errorCreateAcsurl = factory.createSecure3DLookupResponseAcsUrl("true");
            JAXBElement<String> errorCreatePayLoad = factory.createSecure3DLookupResponsePAReqPayload("true");
            secure3DLookupResponse.setTransactionID(transactionId);
            secure3DLookupResponse.setTransactionDateTime(generateXmlGeorDate());
            secure3DLookupResponse.setSaleReconID(saleReconID);
            secure3DLookupResponse.setReconID(reconId);
            secure3DLookupResponse.setTransactionStatus(TransactionStatusType.FAILURE);
            secure3DLookupResponse.setResponseDetail(setErrorResponseInvalidSecure3dLookup(secure3DLookupReqParams, token, merchantId));
            secure3DLookupResponse.setEnrolled(false);
            secure3DLookupResponse.setAcsUrl(errorCreateAcsurl);
            secure3DLookupResponse.setPAReqPayload(errorCreatePayLoad);
            return secure3DLookupResponse;

        }
    }


    /**
     *
     * @param responseDetail
     * @return
     */
    public ResponseDetail setAuthoriseResponseDetails(ResponseDetail responseDetail) {
        responseDetail.setSource("Acquirer");
        responseDetail.setCode("00");
        responseDetail.setDescription("Approved or completed successfully");
        responseDetail.setClientMessage("Approved");
        return responseDetail;
    }


    /**
     *
     * @param request
     * @return
     */
    public ResponseDetail setInvalidAuthoriseRespDetails(AuthorizeRequest request){

        ResponseDetail responseDetail = new ResponseDetail();
        responseDetail.setSource("ECS");

        if (!request.getTransactionID().equalsIgnoreCase(transactionId)) {
            responseDetail.setCode("VF");
            responseDetail.setDescription("Validation fault. Duplicate TransactionID");
            responseDetail.setClientMessage("The transaction failed.");
        } else if (!request.getMerchantID().equalsIgnoreCase(merchantId)) {
            responseDetail.setCode("VF");
            responseDetail.setDescription("Validation fault. Merchant authentication failed");

        } else if (!request.getCard().getValue().getToken().getValue().equalsIgnoreCase(token)) {
            responseDetail.setCode("SE");
            responseDetail.setDescription("An error occurred during a payment service provider transaction");
            responseDetail.setClientMessage("The transaction failed. Please try again later");
        }
        return responseDetail;

    }

    /**
     *
     * @param paymentRequestParams
     * @param responseStatus
     * @return
     */
    public AuthorizeResponse populateAuthorizeResponse(AuthorizeRequest paymentRequestParams,String responseStatus){
        AuthorizeResponse authorizeResponse = new AuthorizeResponse();
        ResponseDetail responseDetail = new ResponseDetail();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> saleReconID = factory.createSecure3DLookupResponseSaleReconID("true");
        JAXBElement<String> authCode = factory.createPaymentResponseAuthCode(AUTHCODE);
        if(responseStatus.equalsIgnoreCase("SUCCESS")){
            JAXBElement<Long> authAmount = factory.createPaymentResponseAuthAmount(2095L);
            authorizeResponse.setTransactionID(transactionId);
            authorizeResponse.setTransactionDateTime(generateXmlGeorDate());
            authorizeResponse.setSaleReconID(saleReconID);
            authorizeResponse.setReconID(reconId);
            authorizeResponse.setAuthCode(authCode);
            authorizeResponse.setTransactionStatus(TransactionStatusType.SUCCESS);
            authorizeResponse.setResponseDetail(setAuthoriseResponseDetails(responseDetail));
            authorizeResponse.setAuthAmount(authAmount);
        }
        else{
            JAXBElement<Long> authAmount = factory.createPaymentResponseAuthAmount(0L);
            authAmount.setNil(true);
            authorizeResponse.setTransactionID(transactionId);
            authorizeResponse.setTransactionDateTime(generateXmlGeorDate());
            authorizeResponse.setSaleReconID(saleReconID);
            authorizeResponse.setReconID(reconId);
            authorizeResponse.setAuthAmount(authAmount);
            authorizeResponse.setTransactionStatus(TransactionStatusType.FAILURE);
            authorizeResponse.setResponseDetail(setInvalidAuthoriseRespDetails(paymentRequestParams));
        }
        return  authorizeResponse;
    }


    /**
     *
     * @param request
     * @return
     */
    public ResponseDetail setInvalidPaymentRespDetails(PaymentRequest request){
        ResponseDetail responseDetail = new ResponseDetail();
        responseDetail.setSource("ECS");
        if (!request.getTransactionID().equalsIgnoreCase(transactionId)) {
            responseDetail.setCode("VF");
            responseDetail.setDescription("Validation fault. Duplicate TransactionID");
            responseDetail.setClientMessage("The transaction failed.");
        } else if (!request.getMerchantID().equalsIgnoreCase(merchantId)) {
            responseDetail.setCode("VF");
            responseDetail.setDescription("Validation fault. Merchant authentication failed");

        } else if (!request.getCard().getValue().getToken().getValue().equalsIgnoreCase(token)) {
            responseDetail.setCode("IE");
            responseDetail.setDescription("Internal error");
            responseDetail.setClientMessage("The transaction failed. Please try again later.");
        }
        return responseDetail;
    }

    /**
     *
     * @param paymentRequestParams
     * @param responseStatus
     * @return
     */
    public PaymentResponse populatePaymentResponse(PaymentRequest paymentRequestParams,String responseStatus){
        PaymentResponse paymentResponse = new PaymentResponse();
        ResponseDetail responseDetail = new ResponseDetail();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> saleReconID = factory.createSecure3DLookupResponseSaleReconID("true");
        JAXBElement<String> authCode = factory.createPaymentResponseAuthCode(AUTHCODE);
        if(responseStatus.equalsIgnoreCase("SUCCESS")){
            JAXBElement<Long> authAmount = factory.createPaymentResponseAuthAmount(2095L);
            paymentResponse.setTransactionID(transactionId);
            paymentResponse.setTransactionDateTime(generateXmlGeorDate());
            paymentResponse.setSaleReconID(saleReconID);
            paymentResponse.setReconID(reconId);
            paymentResponse.setAuthCode(authCode);
            paymentResponse.setTransactionStatus(TransactionStatusType.SUCCESS);
            paymentResponse.setResponseDetail(setAuthoriseResponseDetails(responseDetail));
            paymentResponse.setAuthAmount(authAmount);
        }
        else{
            JAXBElement<Long> authAmount = factory.createPaymentResponseAuthAmount(0L);
            authAmount.setNil(true);
            paymentResponse.setTransactionID(transactionId);
            paymentResponse.setTransactionDateTime(generateXmlGeorDate());
            paymentResponse.setSaleReconID(saleReconID);
            paymentResponse.setReconID(reconId);
            paymentResponse.setAuthAmount(authAmount);
            paymentResponse.setTransactionStatus(TransactionStatusType.FAILURE);
            paymentResponse.setResponseDetail(setInvalidPaymentRespDetails(paymentRequestParams));
        }
        return  paymentResponse;
    }


    /**
     *
     * @param request
     * @return
     */
    public ResponseDetail setInvalidVoidRespDetails(VoidRequest request){
        ResponseDetail responseDetail = new ResponseDetail();
        responseDetail.setSource("ECS");
        responseDetail.setCode("VF");
        if (!request.getTransactionID().equalsIgnoreCase(transactionId)) {
            responseDetail.setDescription("Validation fault. Duplicate TransactionID");
            responseDetail.setClientMessage("The transaction failed.");
        } else if (!request.getMerchantID().equalsIgnoreCase(merchantId)) {
            responseDetail.setDescription("Validation fault. Merchant authentication failed");
        }
        return responseDetail;
    }


    public VoidResponse populateVoidResponse(VoidRequest voidRequestParams,String responseStatus){
        VoidResponse voidResponse = new VoidResponse();
        ResponseDetail responseDetail = new ResponseDetail();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> saleReconID = factory.createVoidRequestSaleReconID("true");
        if(responseStatus.equalsIgnoreCase("SUCCESS")){
            voidResponse.setTransactionID(transactionId);
            voidResponse.setTransactionDateTime(generateXmlGeorDate());
            voidResponse.setSaleReconID(saleReconID);
            voidResponse.setReconID(reconId);
            voidResponse.setTransactionStatus(TransactionStatusType.SUCCESS);
            voidResponse.setResponseDetail(setAuthoriseResponseDetails(responseDetail));
        }
        else{
            voidResponse.setTransactionID(transactionId);
            voidResponse.setTransactionDateTime(generateXmlGeorDate());
            voidResponse.setSaleReconID(saleReconID);
            voidResponse.setReconID(reconId);
            voidResponse.setTransactionStatus(TransactionStatusType.FAILURE);
            voidResponse.setResponseDetail(setInvalidVoidRespDetails(voidRequestParams));
        }
        return voidResponse;
    }
       
    private XMLGregorianCalendar generateXmlGeorDate() {
        ObjectFactory factory = new ObjectFactory();
        GregorianCalendar gcal = new GregorianCalendar();
        XMLGregorianCalendar xgcal = null;
        try {
            xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
            return xgcal;
        } catch (DatatypeConfigurationException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return xgcal;
    }
}
