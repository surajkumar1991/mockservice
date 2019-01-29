package com.vuclip.ubs.models.vuconnect;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PartnerActivationConsentRequestVO {

    private String userId;

    private String msisdn;

    private String transactionId;

    private String circleCode;

    private String languageId;

    private String microSiteId;

    private String customerTransactionId;

    private String consentImageUrl;

    private String chargeDescription;

    private String requestedBillingCode;

    private String attemptedBillingCode;

    private String callbackUrl;

    private String itemId;

    private String itemTypeId;

    private ModeEnum mode;

    private String userSource;

    private String deviceType;

    private Map<String, String> additionalParameters;

}
