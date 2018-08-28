package com.vuclip.ubs.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "endDate", "blockType", "startDate" })

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
