package com.vuclip.ubs.models.vuconnect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productId",
        "partnerId",
        "country",
        "otp",
        "otpTransactionId"
})
public class VerifyOtpResquestVO {

    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("partnerId")
    private Integer partnerId;
    @JsonProperty("country")
    private String country;
    @JsonProperty("otp")
    private String otp;
    @JsonProperty("otpTransactionId")
    private String otpTransactionId;
}