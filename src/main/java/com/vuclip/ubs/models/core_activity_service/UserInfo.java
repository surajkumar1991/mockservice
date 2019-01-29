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
"userId",
"msisdn",
"billingTransactionId",
"circleCode",
"languageId",
"customerTransactionId",
"partnerTransactionId"
})
public class UserInfo {

	@JsonProperty("userId")
	private String userId;
	@JsonProperty("msisdn")
	private String msisdn;
	@JsonProperty("billingTransactionId")
	private String billingTransactionId;
	@JsonProperty("circleCode")
	private String circleCode;
	@JsonProperty("languageId")
	private String languageId;
	@JsonProperty("customerTransactionId")
	private String customerTransactionId;
	@JsonProperty("partnerTransactionId")
	private String partnerTransactionId;
}