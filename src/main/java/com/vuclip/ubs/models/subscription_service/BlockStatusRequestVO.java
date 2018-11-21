package com.vuclip.ubs.models.subscription_service;

import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@SuppressWarnings("deprecation")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BlockStatusRequestVO {

    private String userId;

    private String msisdn;

    @NotNull(message = "productId can not be empty")
    @Min(value = 1, message = "productId must be positive Integer")
    private int productId;

    @NotNull(message = "userId can not be partnerId")
    @Min(value = 1, message = "partnerId must be positive Integer")
    private int partnerId;

    @NotNull(message = "country can not be null")
    @NotBlank(message = "country can not be empty")
    private String country;

}