package com.vuclip.ubs.models.vuconnect;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PartnerActivationConsentParserRequestVO {

    private Map<String, String> headers;

    private Map<String, String> parameters;

    private String billingTransactionId;

    private int partnerId;

    private int productId;

    private String msisdn;

    private String requestedBillingCode;

    private String attemptedBillingCode;

    private String chargedBillingCode;

}
