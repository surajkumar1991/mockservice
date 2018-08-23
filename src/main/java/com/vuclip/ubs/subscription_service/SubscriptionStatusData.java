package com.vuclip.ubs.subscription_service;

import java.math.Long;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class SubscriptionStatusData {

	private String userSubAuthKey;
	private String userId;
	private String msisdn;
	private Long subscriptionId;
	private Long startDate;
	private Long endDate;
	private Long nextBillingDate;
	private Long lastChargeDate;
	private Double chargedPrice;
	private String country;
	private String partner;
	private String planCycle;
	private int partnerId;
	private boolean subscribable;
	private String subscriptionStatus;
	private int subscriptionValidityDays;
	private int productId;
	private int itemId;
	private int itemTypeId;
	private String subscriptionBillingCode;
	private String chargedBillingCode;
	private String customerTransactionId;
	private Boolean renewalAllowed;
	private Long activationDate;
	private Map<String, String> payload = new HashMap<String, String>();
	private String mode;
	private StatusSummary summary;
}
