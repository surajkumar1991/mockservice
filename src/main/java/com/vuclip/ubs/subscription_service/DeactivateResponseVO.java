package com.vuclip.ubs.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.vuclip.ubs.vuconnect.ResultVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "resultVO", "deactivationConsentUrl", "billingTransactionId", "partnerTransactionId",
		"userStatus" })
public class DeactivateResponseVO {

	@JsonProperty("resultVO")
	private ResultVO resultVO;
	@JsonProperty("deactivationConsentUrl")
	private String deactivationConsentUrl;
	@JsonProperty("billingTransactionId")
	private String billingTransactionId;
	@JsonProperty("partnerTransactionId")
	private String partnerTransactionId;
	@JsonProperty("userStatus")
	private UserStatus userStatus;

}
