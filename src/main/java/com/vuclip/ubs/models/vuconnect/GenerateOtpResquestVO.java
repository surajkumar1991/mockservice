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
        "billingTransactionId",
        "partnerTransactionId",
        "languageId",
        "productId",
        "partnerId",
        "country",
        "userId",
        "msisdn",
        "otp",
        "chargingMode",
        "customerTransactionId",
        "freeTrialActivation",
        "requestedBillingCode",
        "attemptedBillingCode",
        "chargedBillingCode",
        "Parameters",
        "otpTransactionId",
        "activityType",
        "productCode"
})
public class GenerateOtpResquestVO {

    @JsonProperty("billingTransactionId")
    private String billingTransactionId;
    @JsonProperty("partnerTransactionId")
    private Object partnerTransactionId;
    @JsonProperty("languageId")
    private String languageId;
    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("partnerId")
    private Integer partnerId;
    @JsonProperty("country")
    private String country;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("otp")
    private Object otp;
    @JsonProperty("chargingMode")
    private String chargingMode;
    @JsonProperty("customerTransactionId")
    private Object customerTransactionId;
    @JsonProperty("freeTrialActivation")
    private Boolean freeTrialActivation;
    @JsonProperty("requestedBillingCode")
    private String requestedBillingCode;
    @JsonProperty("attemptedBillingCode")
    private String attemptedBillingCode;
    @JsonProperty("chargedBillingCode")
    private String chargedBillingCode;
    @JsonProperty("Parameters")
    private Object parameters;
    @JsonProperty("otpTransactionId")
    private String otpTransactionId;
    @JsonProperty("activityType")
    private Object activityType;
    @JsonProperty("productCode")
    private Object productCode;

}