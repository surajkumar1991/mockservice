package com.vuclip.ubs.subscription_service;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeactivateUserResponseVO {

    private boolean successful;
    private String message;
    private String responseCode;
    private SubscriptionStatusData status;

}
