package com.vuclip.ubs.vuconnect;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PartnerActivationConsentResponseVO {

    private String activationConsentUrl;

    private String billingTransactionId;

    private String partnerTransactionId;

    private ResultVO resultVO;
    private String formData;

    private Map<String, String> partnerSpecificValues;

}
