package com.vuclip.ubs.subscription_service;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreeTrialEligibilityRequestVO {

    private String userId;

    private String msisdn;

    @NotNull
    @Min(value = 1, message = "productId must be positive Integer")
    private Integer productId;

    @NotNull
    @Min(value = 1, message = "partnerId must be positive Integer")
    private Integer partnerId;

    @NotNull(message = "country can not be null")
    private String country;

    public static FreeTrialEligibilityRequestVO convertIntoFreeTrialEligibilityRequestVO(String userId, String msisdn,
                                                                                         Integer productId, Integer partnerId, String country) {

        return FreeTrialEligibilityRequestVO.builder()
                .userId(userId)
                .productId(productId)
                .partnerId(partnerId)
                .country(country)
                .msisdn(msisdn)
                .build();
    }


}