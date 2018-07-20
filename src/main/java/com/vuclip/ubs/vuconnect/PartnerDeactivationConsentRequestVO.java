package com.vuclip.ubs.vuconnect;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PartnerDeactivationConsentRequestVO {

	private String userId;
	
	private String msisdn;
	
	private String transactionId;
	
	private String circleCode;
	
	private String languageId;
	
	private String microSiteId;
	
	private String customerTransactionId;
	
	private String consentImageUrl;
	
	private String chargeDescription;
	
	private String requestedBillingCode;
	
	private String attemptedBillingCode;
	
	private String callbackUrl;
	
	private String itemId;

	private String itemTypeId;
	
	private ModeEnum mode;
	
	private Map<String, String> additionalParameters;
	
	

}
