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
@JsonPropertyOrder({ "message", "successful", "responseCode" })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Response {

	@JsonProperty("message")
	private String message;
	@JsonProperty("successful")
	private Boolean successful;
	@JsonProperty("responseCode")
	private String responseCode;

}
