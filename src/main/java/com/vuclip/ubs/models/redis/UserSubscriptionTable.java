package com.vuclip.ubs.models.redis;

import lombok.*;

import java.util.Date;

/**
 * @author rahul sahu
 * <p>
 * user_subscription table
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class UserSubscriptionTable {

    private Long subscriptionId;

    private String msisdn;

    private String userId;

    private int productId;

    private int partnerId;

    private int itemId;

    private int itemTypeId;

    private long lastChargedDate;

    private String subscriptionBillingCode;

    private String chargedBillingCode;

    private String subscriptionStatus;

    private boolean paid;

    private String userSource;

    private String customerTransactionId;

    private String mode;

    private String circleCode;

    private String userPreferredLanguage;

    private long startDate;

    private long endDate;

    private long activationDate;

    private long deactivationDate;

    private long nextBillingDate;

    private String country;

    private boolean renewalAllowed;

    private Double chargedPrice;

    private int subscriptionValidityDays;

    private Date createdOn;

    private Date lastUpdatedOn;

    private String currency;


}
