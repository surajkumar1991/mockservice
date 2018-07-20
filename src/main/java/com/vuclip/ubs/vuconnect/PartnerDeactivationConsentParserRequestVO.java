package com.vuclip.ubs.vuconnect;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class PartnerDeactivationConsentParserRequestVO {

	private Map<String, String> headers;
	
	private Map<String, String> parameters;
	
	private String billingTransactionId;
	
	private int partnerId;
	
	private int productId;
	
	private String msisdn;
	
	private String requestedBillingCode;
	
	private String attemptedBillingCode;
	
	private String chargedBillingCode;
	
}
