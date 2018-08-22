package com.vuclip.ubs.partner_mock;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ORDERID", "MID" })
public class PaytmStatusCheckRequestVO {

	@JsonProperty("ORDERID")
	private String oRDERID;
	@JsonProperty("MID")
	private String mID;
}