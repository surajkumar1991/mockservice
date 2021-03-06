package com.vuclip.ubs.models.subscription_service;

public enum SubscriptionStatus {

    SUSPEND, PARKING, ACT_INIT, ACTIVATED, DCT_INIT, DEACTIVATED, ERROR;

    private String name;

    public String getName() {
        return name;
    }
}
