package com.vuclip.ubs.service.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vuclip.ubs.models.ecentric.AddCardRequest;
import com.vuclip.ubs.models.ecentric.AddCardResponse;
import com.vuclip.ubs.models.ecentric.AuthorizeRequest;
import com.vuclip.ubs.models.ecentric.AuthorizeResponse;
import com.vuclip.ubs.models.ecentric.PaymentRequest;
import com.vuclip.ubs.models.ecentric.PaymentResponse;
import com.vuclip.ubs.models.ecentric.ResponseDetail;
import com.vuclip.ubs.models.ecentric.Secure3DLookupRequest;
import com.vuclip.ubs.models.ecentric.Secure3DLookupResponse;
import com.vuclip.ubs.models.ecentric.TransactionStatusType;
import com.vuclip.ubs.models.ecentric.VoidRequest;
import com.vuclip.ubs.models.ecentric.VoidResponse;
import com.vuclip.ubs.service.EcentricPaymentGatewayService;
import com.vuclip.ubs.utils.EcentricResponse;

import lombok.extern.log4j.Log4j2;

@WebService
@Component
@Log4j2
public class EcentricServiceImpl implements EcentricPaymentGatewayService {

    @Autowired
    EcentricResponse ecentricResponse;

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




    @Override
    public AddCardResponse addCard(AddCardRequest parameters) {
        AddCardResponse addCardResponse = new AddCardResponse();
        ResponseDetail responseDetail = new ResponseDetail();
        String merId = parameters.getMerchantID();
        if (merId.equalsIgnoreCase(merchantId) && parameters.getCard().getCardNumber().getValue().equalsIgnoreCase(cardNumber)) {
            addCardResponse.setToken(token);
            addCardResponse.setTransactionStatus(TransactionStatusType.SUCCESS);
            addCardResponse.setResponseDetail(responseDetail);
            log.info("Add Card Response: {}", addCardResponse);
            return addCardResponse;
        } else {
            log.info("Invalid ecentric Card Number or Merchant Id");
            addCardResponse.setTransactionStatus(TransactionStatusType.FAILURE);
            addCardResponse.setResponseDetail(ecentricResponse.setErrorResponseInvalidCard(parameters, cardNumber));
            return addCardResponse;
        }
    }


    @Override
    public Secure3DLookupResponse secure3DLookup(Secure3DLookupRequest parameters) {
        if (parameters.getMerchantID().equalsIgnoreCase(merchantId) && parameters.getTransactionID().equalsIgnoreCase(transactionId)) {
          return  ecentricResponse.populateSecure3DLookUpResponse(parameters,"SUCCESS");
        } else {
            log.info("Invalid ecentric Merchant Id or Token number");
            return ecentricResponse.populateSecure3DLookUpResponse(parameters,"FAILURE");
        }
    }


    @Override
    public AuthorizeResponse authorize(AuthorizeRequest parameters) {
        if (parameters.getMerchantID().equalsIgnoreCase(merchantId) && parameters.getTransactionID().equalsIgnoreCase(transactionId)
                && parameters.getCard().getValue().getToken().getValue().equalsIgnoreCase(token)) {
            return  ecentricResponse.populateAuthorizeResponse(parameters,"SUCCESS");
        } else {
            log.info("Invalid ecentric Merchant Id or Token number");
            return ecentricResponse.populateAuthorizeResponse(parameters,"FAILURE");
        }
    }

    @Override
    public PaymentResponse payment(PaymentRequest parameters) {
        if (parameters.getMerchantID().equalsIgnoreCase(merchantId) && parameters.getTransactionID().equalsIgnoreCase(transactionId)
                && parameters.getCard().getValue().getToken().getValue().equalsIgnoreCase(token)) {
            return  ecentricResponse.populatePaymentResponse(parameters,"SUCCESS");
        } else {
            log.info("Invalid ecentric Merchant Id or Token number");
            return ecentricResponse.populatePaymentResponse(parameters,"FAILURE");
        }
    }


    @Override
    public VoidResponse initVoidRequest(VoidRequest parameters) {
        if (parameters.getMerchantID().equalsIgnoreCase(merchantId) && parameters.getTransactionID().equalsIgnoreCase(transactionId)) {
            return  ecentricResponse.populateVoidResponse(parameters,"SUCCESS");
        } else {
            log.info("Invalid ecentric Merchant Id or Token number");
            return ecentricResponse.populateVoidResponse(parameters,"FAILURE");
        }
    }
















 






}
