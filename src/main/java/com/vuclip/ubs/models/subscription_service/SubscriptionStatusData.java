package com.vuclip.ubs.models.subscription_service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class SubscriptionStatusData {

    private String userSubAuthKey;
    private String userId;
    private String msisdn;
    private Long subscriptionId;
    private Long startDate;
    private Long endDate;
    private Long nextBillingDate;
    private Long lastChargeDate;
    private Double chargedPrice;
    private String country;
    private String partner;
    private String planCycle;
    private int partnerId;
    private boolean subscribable;
    private String subscriptionStatus;
    private int subscriptionValidityDays;
    private int productId;
    private int itemId;
    private int itemTypeId;
    private String subscriptionBillingCode;
    private String chargedBillingCode;
    private String customerTransactionId;
    private Boolean renewalAllowed;
    private Long activationDate;
    private Map<String, String> payload = new HashMap<String, String>();
    private String mode;
    private StatusSummary summary;
}
