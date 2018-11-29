package com.vuclip.ubs.models.subscription_service;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConfirmRequestVO {

	
	private String userId;
	
	private String msisdn;

	@NotEmpty
	private String productId;

	@NotEmpty
	private String partnerId;
	
	private String requestedBillingCode;

	private String chargedBillingCode;

	private String attemptedBillingCode;

	private String mode;
	
	private String actionId;

	private String activityId;
	
	private String transactionId;

	private String transactionStateId;

	private String chargedPrice;

	private String partnerTransactionId;
	
	private String itemId;

	private String itemTypeId;

	private String actionResult;

	private String serviceId;

	private String subscriptionId;

	private String circleCode;

	private String errorCode;
	
	private String errorDesc;
	
	private String delayed;

	private String closed;
	
	private String clientUserId;
	
	private String customerTransactionId;
	
	private String userPreferredLanguage;
	
	private String userSource;
	
	private Long nextBillingDate;
	
	private String countryCode;
	
	private String clientTransactionId;
	
	private String currency;
}