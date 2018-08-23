
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
@JsonPropertyOrder({ "userSubAuthKey", "userId", "msisdn", "subscriptionId", "startDate", "endDate", "nextBillingDate",
		"lastChargeDate", "chargedPrice", "country", "partnerId", "subscriptionStatus", "subscriptionValidityDays",
		"productId", "itemId", "itemTypeId", "subscriptionBillingCode", "chargedBillingCode", "customerTransactionId",
		"renewalAllowed", "activationDate", "deactivationDate", "payload", "summary", "mode", "paid", "userSource" })

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserStatus {

	@JsonProperty("userSubAuthKey")
	private Object userSubAuthKey;
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
	private Integer chargedPrice;
	@JsonProperty("country")
	private String country;
	@JsonProperty("partnerId")
	private Integer partnerId;
	@JsonProperty("subscriptionStatus")
	private String subscriptionStatus;
	@JsonProperty("subscriptionValidityDays")
	private Integer subscriptionValidityDays;
	@JsonProperty("productId")
	private Integer productId;
	@JsonProperty("itemId")
	private Integer itemId;
	@JsonProperty("itemTypeId")
	private Integer itemTypeId;
	@JsonProperty("subscriptionBillingCode")
	private String subscriptionBillingCode;
	@JsonProperty("chargedBillingCode")
	private String chargedBillingCode;
	@JsonProperty("customerTransactionId")
	private Object customerTransactionId;
	@JsonProperty("renewalAllowed")
	private Boolean renewalAllowed;
	@JsonProperty("activationDate")
	private Long activationDate;
	@JsonProperty("deactivationDate")
	private Object deactivationDate;
	@JsonProperty("payload")
	private Object payload;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("mode")
	private String mode;
	@JsonProperty("paid")
	private Boolean paid;
	@JsonProperty("userSource")
	private String userSource;

}
