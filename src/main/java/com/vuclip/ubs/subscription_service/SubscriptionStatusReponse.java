package com.vuclip.ubs.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"successful", "message", "responseCode", "status"})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SubscriptionStatusReponse {

    @JsonProperty("successful")
    private Boolean successful;
    @JsonProperty("message")
    private String message;
    @JsonProperty("responseCode")
    private String responseCode;
    @JsonProperty("status")
    private Status_ status;

}