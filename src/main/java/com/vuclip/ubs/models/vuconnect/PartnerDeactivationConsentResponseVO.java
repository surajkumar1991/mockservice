package com.vuclip.ubs.models.vuconnect;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PartnerDeactivationConsentResponseVO {

    private String deactivationConsentUrl;

    private String billingTransactionId;

    private String partnerTransactionId;

    private ResultVO resultVO;

}
