package com.vuclip.ubs.subscription_service;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author pranav.tiwary@vuclip.com
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionStatusData {

	private String userSubAuthKey;
	private String userId;
	private String msisdn;
	private Long subscriptionId;
	private BigInteger startDate;
	private BigInteger endDate;
	private BigInteger nextBillingDate;
	private BigInteger lastChargeDate;
	private Double chargedPrice;
	private Country country;
	private String partner;
	private SubscriptionPlanCycle planCycle;
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
	private Date activationDate;
	private Map<String, String> payload = new HashMap<String, String>();
	private StatusSummary mode;
	private StatusSummary summary;
}
