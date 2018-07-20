package com.vuclip.ubs.vuconnect;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class PartnerDeactivationConsentResponseVO {
	
	private String deactivationConsentUrl;

	private String billingTransactionId;
	
	private String partnerTransactionId;

	private ResultVO resultVO;

}
