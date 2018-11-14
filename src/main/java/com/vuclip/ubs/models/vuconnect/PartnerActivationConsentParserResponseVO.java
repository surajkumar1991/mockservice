package com.vuclip.ubs.models.vuconnect;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PartnerActivationConsentParserResponseVO {

    private boolean isBackButtonClicked;

    private String billingTransactionId;

    private String partnerTransactionId;

    private ResultVO resultVO;

    private String languageId;

    private Integer productId;

    private Integer partnerId;

    private String userId;

    private String msisdn;

    private ActivityResultType activityResultType;

    private String customerTransactionId;

    private BigInteger nextBillingDate;

    private BigInteger endDate;

    private String accessToken;

    private String billingCode;

    private String chargedBillingCode;

    private boolean isFreeTrialActivation;

}
