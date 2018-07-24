package com.vuclip.ubs.vuconnect;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PartnerDeactivationConsentResponseVO {

	private String deactivationConsentUrl;

	private String billingTransactionId;

	private String partnerTransactionId;

	private ResultVO resultVO;

}
