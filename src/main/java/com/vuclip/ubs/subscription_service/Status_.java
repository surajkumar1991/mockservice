package com.vuclip.ubs.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "userSubAuthKey", "userId", "msisdn", "subscriptionId", "startDate", "endDate", "nextBillingDate",
		"lastChargeDate", "chargedPrice", "country", "partnerId", "subscriptionStatus", "subscriptionValidityDays",
		"productId", "itemId", "itemTypeId", "subscriptionBillingCode", "chargedBillingCode", "customerTransactionId",
		"renewalAllowed", "activationDate", "deactivationDate", "payload", "summary", "mode", "paid","userSource" })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Status_ {

	@JsonProperty("userSubAuthKey")
	private String userSubAuthKey;
	@JsonProperty("userId")
	private String userId;
	@JsonProperty("msisdn")
	private String msisdn;
	@JsonProperty("subscriptionId")
	private Long subscriptionId;
	@JsonProperty("startDate")
	private Long startDate;
	@JsonProperty("endDate")
	private Long endDate;
	@JsonProperty("nextBillingDate")
	private Long nextBillingDate;
	@JsonProperty("lastChargeDate")
	private Object lastChargeDate;
	@JsonProperty("chargedPrice")
	private Double chargedPrice;
	@JsonProperty("country")
	private String country;
	@JsonProperty("partnerId")
	private int partnerId;
	@JsonProperty("subscriptionStatus")
	private String subscriptionStatus;
	@JsonProperty("subscriptionValidityDays")
	private int subscriptionValidityDays;
	@JsonProperty("productId")
	private int productId;
	@JsonProperty("itemId")
	private int itemId;
	@JsonProperty("itemTypeId")
	private int itemTypeId;
	@JsonProperty("subscriptionBillingCode")
	private String subscriptionBillingCode;
	@JsonProperty("chargedBillingCode")
	private String chargedBillingCode;
	@JsonProperty("customerTransactionId")
	private String customerTransactionId;
	@JsonProperty("renewalAllowed")
	private Boolean renewalAllowed;
	@JsonProperty("activationDate")
	private Long activationDate;
	@JsonProperty("deactivationDate")
	private Long deactivationDate;
	@JsonProperty("payload")
	private String payload;
	
	@JsonProperty("userSource")
	private String userSource;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("mode")
	private Object mode;
	@JsonProperty("paid")
	private Boolean paid;

}