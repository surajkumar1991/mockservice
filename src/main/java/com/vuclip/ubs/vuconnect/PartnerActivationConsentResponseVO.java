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
@ToStrings
public class PartnerActivationConsentResponseVO {

	private String activationConsentUrl;

	private String billingTransactionId;

	private String partnerTransactionId;

	private ResultVO resultVO;

}
