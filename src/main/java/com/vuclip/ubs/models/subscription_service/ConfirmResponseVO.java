package com.vuclip.ubs.models.subscription_service;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConfirmResponseVO {

    private boolean successful;
    private String message;
    private String responseCode;
    private SubscriptionStatusData userStatus;
}