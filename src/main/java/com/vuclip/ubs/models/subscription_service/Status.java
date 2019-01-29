package com.vuclip.ubs.models.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"userSubAuthKey", "userId", "msisdn", "subscriptionId", "startDate", "endDate", "nextBillingDate",
        "chargedPrice", "country", "partner", "planCycle", "partnerId", "subscribable", "blacklisted", "cooldowned",
        "subscriptionStatus", "subscriptionValidityDays", "productId", "itemId", "itemTypeId",
        "subscriptionBillingCode", "chargedBillingCode", "customerTransactionId", "subType", "advertisement",
        "renewalAllowed", "activationDate", "payload", "summary"})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Status {

    @JsonProperty("userSubAuthKey")
    private String userSubAuthKey;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("subscriptionId")
    private Integer subscriptionId;
    @JsonProperty("startDate")
    private Integer startDate;
    @JsonProperty("endDate")
    private Integer endDate;
    @JsonProperty("nextBillingDate")
    private Object nextBillingDate;
    @JsonProperty("chargedPrice")
    private Integer chargedPrice;
    @JsonProperty("country")
    private Object country;
    @JsonProperty("partner")
    private Object partner;
    @JsonProperty("planCycle")
    private Object planCycle;
    @JsonProperty("partnerId")
    private Integer partnerId;
    @JsonProperty("subscribable")
    private Boolean subscribable;
    @JsonProperty("blacklisted")
    private Boolean blacklisted;
    @JsonProperty("cooldowned")
    private Boolean cooldowned;
    @JsonProperty("subscriptionStatus")
    private String subscriptionStatus;
    @JsonProperty("subscriptionValidityDays")
    private Integer subscriptionValidityDays;
    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("itemTypeId")
    private Integer itemTypeId;
    @JsonProperty("subscriptionBillingCode")
    private String subscriptionBillingCode;
    @JsonProperty("chargedBillingCode")
    private String chargedBillingCode;
    @JsonProperty("customerTransactionId")
    private String customerTransactionId;
    @JsonProperty("subType")
    private Object subType;
    @JsonProperty("advertisement")
    private Object advertisement;
    @JsonProperty("renewalAllowed")
    private Boolean renewalAllowed;
    @JsonProperty("activationDate")
    private Object activationDate;
    @JsonProperty("payload")
    private Object payload;
    @JsonProperty("summary")
    private String summary;

}
