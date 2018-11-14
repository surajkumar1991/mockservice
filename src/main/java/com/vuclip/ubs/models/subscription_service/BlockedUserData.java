package com.vuclip.ubs.models.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"endDate", "blockType", "startDate"})

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlockedUserData {

    @JsonProperty("endDate")
    private Long endDate;
    @JsonProperty("blockType")
    private BlockTypeEnum blockType;
    @JsonProperty("startDate")
    private Long startDate;

}
