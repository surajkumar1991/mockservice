package com.vuclip.ubs.vuconnect;

import java.util.Map;

import com.vuclip.ubs.vuconnect.ResultVO.ResultVOBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PartnerActivationConsentRequestVO {

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

	private String userSource;

	private String deviceType;

	private Map<String, String> additionalParameters;

}
