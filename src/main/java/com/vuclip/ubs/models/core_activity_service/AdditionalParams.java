package com.vuclip.ubs.models.core_activity_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nextBillingDate"
})
public class AdditionalParams {

    @JsonProperty("nextBillingDate")
    private String nextBillingDate;


}
