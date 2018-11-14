package com.vuclip.ubs.models.subscription_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Akash Kadam
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlockUserRequestVO {

    private BlockUserDetails userDetails;

    @NotNull(message = "productId can not be empty")
    @Min(value = 1, message = "productId must be positive Integer")
    private Integer productId;

    @NotNull(message = "partnerId can not be empty")
    @Min(value = 1, message = "partnerId must be positive Integer")
    private Integer partnerId;

    @NotNull(message = "country can not be null")
    private String country;

    // @IsBlockTypeValid
    // private String blockType;
}