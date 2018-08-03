package com.vuclip.ubs.vuconnect;

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
public class PartnerDeactivationConsentResponseVO {

	private String deactivationConsentUrl;

	private String billingTransactionId;

	private String partnerTransactionId;

	private ResultVO resultVO;

}
