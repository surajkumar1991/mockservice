package com.vuclip.ubs.subscription_service;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreeTrialEligibilityResponseVO {

    private boolean freeTrialEligibility;

    private Response response;

}