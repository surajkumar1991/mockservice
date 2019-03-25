package com.vuclip.ubs.models.core_activity_service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "itemInfo",
        "consentInfo",
        "userChargingInfo",
        "billingCode",
        "mode",
        "dirtNetworkParams",
        "source",
        "chargingParamMap",
        "clientTransactionId",
        "isOtpFlow"
})
public class InitializeOtpResquestVO {

    @JsonProperty("itemInfo")
    private ItemInfo itemInfo;
    @JsonProperty("consentInfo")
    private Object consentInfo;
    @JsonProperty("userChargingInfo")
    private UserChargingInfo userChargingInfo;
    @JsonProperty("billingCode")
    private String billingCode;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("dirtNetworkParams")
    private String dirtNetworkParams;
    @JsonProperty("source")
    private String source;
    @JsonProperty("chargingParamMap")
    private Object chargingParamMap;
    @JsonProperty("clientTransactionId")
    private String clientTransactionId;
    @JsonProperty("isOtpFlow")
    private String isOtpFlow;

}