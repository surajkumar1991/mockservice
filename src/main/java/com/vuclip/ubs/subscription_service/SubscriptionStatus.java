package com.vuclip.ubs.subscription_service;
/**
 * Subscription status
 * 
 * @author pranav.tiwary@vuclip.com
 *
 */
public enum SubscriptionStatus {

	SUSPEND, PARKING, ACT_INIT, ACTIVATED, DCT_INIT, DEACTIVATED, ERROR;

	private String name;

	public String getName() {
		return name;
	}
}
