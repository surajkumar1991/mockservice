package com.vuclip.ubs.subscription_service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Akash Kadam
 *
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeactivateRequestVO {

	String userId;

	String msisdn;

	String productId;

	String partnerId;

	String activityId;

	String actionId;

	String transactionId;

	String transactionStateId;

	String closed;

	String itemId;

	String itemTypeId;

	String mode;

	String countryCode;

}
