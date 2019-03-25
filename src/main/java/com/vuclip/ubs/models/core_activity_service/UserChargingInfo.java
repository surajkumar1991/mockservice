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
        "userId",
        "msisdn",
        "circleCode",
        "languageId",
        "microSiteId",
        "clientRequestInfo"
})
public class UserChargingInfo {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("circleCode")
    private String circleCode;
    @JsonProperty("languageId")
    private String languageId;
    @JsonProperty("microSiteId")
    private String microSiteId;
    @JsonProperty("clientRequestInfo")
    private Object clientRequestInfo;

}
