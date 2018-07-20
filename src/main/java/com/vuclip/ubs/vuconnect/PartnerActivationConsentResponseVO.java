package com.vuclip.ubs.vuconnect;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class PartnerActivationConsentResponseVO {

	private String activationConsentUrl;

	private String billingTransactionId;
	
	private String partnerTransactionId;
	
	private ResultVO resultVO;

}
