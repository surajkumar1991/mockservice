package com.vuclip.ubs.models.subscription_service;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Akash Kadam
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnblockRequestVO {

    private String userId;

    private String msisdn;

    @NotNull(message = "partnerId can not be empty")
    @Min(value = 1, message = "productId must be positive Integer")
    private int partnerId;

    @NotNull(message = "productId can not be empty")
    @Min(value = 1, message = "productId must be positive Integer")
    private int productId;

    @NotNull(message = "country can not be null")
    private String country;

    private String blockType;

}