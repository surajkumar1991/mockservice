package com.vuclip.ubs.service;

import com.vuclip.ubs.models.codapay.init.CodapayInitRequest;
import com.vuclip.ubs.models.codapay.init.CodapayInitResult;

/**
 * @author kirangohokar
 */
public interface CodapayService {
    /**
     * Process the CodaPay init txn request by generating unique txnId.
     * @param request
     * @return
     */
    CodapayInitResult processInitTxn(CodapayInitRequest request);
}
