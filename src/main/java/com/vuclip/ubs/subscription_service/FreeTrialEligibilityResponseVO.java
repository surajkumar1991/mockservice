package com.vuclip.ubs.subscription_service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreeTrialEligibilityResponseVO {

	private boolean freeTrialEligibility;

	private Response response;

}