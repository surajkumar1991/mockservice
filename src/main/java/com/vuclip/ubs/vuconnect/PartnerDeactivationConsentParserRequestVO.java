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
