package com.vuclip.ubs.service;

import com.vuclip.ubs.models.codapay.init.CodapayInitRequest;
import com.vuclip.ubs.models.codapay.init.CodapayInitResult;
import com.vuclip.ubs.models.codapay.status.CodapayCheckStatusRequest;
import com.vuclip.ubs.models.codapay.status.CodapayCheckStatusResponse;
import com.vuclip.ubs.models.codapay.status.CodapayInquiryPaymentRequest;
import com.vuclip.ubs.models.codapay.status.CodapayInquiryPaymentResult;

/**
 * @author kirangohokar
 */
public interface CodapayService {
    /**
     * Process the CodaPay init txn request by generating unique txnId.
     *
     * @param request
     * @return
     */
    CodapayInitResult processInitTxn(CodapayInitRequest request);

    CodapayCheckStatusResponse getStatus(CodapayCheckStatusRequest request);

    CodapayInquiryPaymentResult getInquiryPaymentResult(CodapayInquiryPaymentRequest request);
}
