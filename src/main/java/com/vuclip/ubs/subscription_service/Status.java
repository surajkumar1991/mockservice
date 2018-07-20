
package com.vuclip.ubs.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "userSubAuthKey", "userId", "msisdn", "subscriptionId", "startDate", "endDate", "nextBillingDate",
		"chargedPrice", "country", "partner", "planCycle", "partnerId", "subscribable", "blacklisted", "cooldowned",
		"subscriptionStatus", "subscriptionValidityDays", "productId", "itemId", "itemTypeId",
		"subscriptionBillingCode", "chargedBillingCode", "customerTransactionId", "subType", "advertisement",
		"renewalAllowed", "activationDate", "payload", "summary" })
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

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Status() {
	}

	/**
	 * 
	 * @param summary
	 * @param chargedPrice
	 * @param startDate
	 * @param subscribable
	 * @param partnerId
	 * @param payload
	 * @param endDate
	 * @param activationDate
	 * @param subscriptionId
	 * @param itemTypeId
	 * @param chargedBillingCode
	 * @param customerTransactionId
	 * @param userSubAuthKey
	 * @param cooldowned
	 * @param nextBillingDate
	 * @param userId
	 * @param partner
	 * @param subscriptionValidityDays
	 * @param subscriptionStatus
	 * @param renewalAllowed
	 * @param msisdn
	 * @param advertisement
	 * @param itemId
	 * @param blacklisted
	 * @param country
	 * @param productId
	 * @param planCycle
	 * @param subType
	 * @param subscriptionBillingCode
	 */
	public Status(String userSubAuthKey, String userId, String msisdn, Integer subscriptionId, Integer startDate,
			Integer endDate, Object nextBillingDate, Integer chargedPrice, Object country, Object partner,
			Object planCycle, Integer partnerId, Boolean subscribable, Boolean blacklisted, Boolean cooldowned,
			String subscriptionStatus, Integer subscriptionValidityDays, Integer productId, Integer itemId,
			Integer itemTypeId, String subscriptionBillingCode, String chargedBillingCode, String customerTransactionId,
			Object subType, Object advertisement, Boolean renewalAllowed, Object activationDate, Object payload,
			String summary) {
		super();
		this.userSubAuthKey = userSubAuthKey;
		this.userId = userId;
		this.msisdn = msisdn;
		this.subscriptionId = subscriptionId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.nextBillingDate = nextBillingDate;
		this.chargedPrice = chargedPrice;
		this.country = country;
		this.partner = partner;
		this.planCycle = planCycle;
		this.partnerId = partnerId;
		this.subscribable = subscribable;
		this.blacklisted = blacklisted;
		this.cooldowned = cooldowned;
		this.subscriptionStatus = subscriptionStatus;
		this.subscriptionValidityDays = subscriptionValidityDays;
		this.productId = productId;
		this.itemId = itemId;
		this.itemTypeId = itemTypeId;
		this.subscriptionBillingCode = subscriptionBillingCode;
		this.chargedBillingCode = chargedBillingCode;
		this.customerTransactionId = customerTransactionId;
		this.subType = subType;
		this.advertisement = advertisement;
		this.renewalAllowed = renewalAllowed;
		this.activationDate = activationDate;
		this.payload = payload;
		this.summary = summary;
	}

	@JsonProperty("userSubAuthKey")
	public String getUserSubAuthKey() {
		return userSubAuthKey;
	}

	@JsonProperty("userSubAuthKey")
	public void setUserSubAuthKey(String userSubAuthKey) {
		this.userSubAuthKey = userSubAuthKey;
	}

	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}

	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@JsonProperty("msisdn")
	public String getMsisdn() {
		return msisdn;
	}

	@JsonProperty("msisdn")
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	@JsonProperty("subscriptionId")
	public Integer getSubscriptionId() {
		return subscriptionId;
	}

	@JsonProperty("subscriptionId")
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	@JsonProperty("startDate")
	public Integer getStartDate() {
		return startDate;
	}

	@JsonProperty("startDate")
	public void setStartDate(Integer startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("endDate")
	public Integer getEndDate() {
		return endDate;
	}

	@JsonProperty("endDate")
	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("nextBillingDate")
	public Object getNextBillingDate() {
		return nextBillingDate;
	}

	@JsonProperty("nextBillingDate")
	public void setNextBillingDate(Object nextBillingDate) {
		this.nextBillingDate = nextBillingDate;
	}

	@JsonProperty("chargedPrice")
	public Integer getChargedPrice() {
		return chargedPrice;
	}

	@JsonProperty("chargedPrice")
	public void setChargedPrice(Integer chargedPrice) {
		this.chargedPrice = chargedPrice;
	}

	@JsonProperty("country")
	public Object getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(Object country) {
		this.country = country;
	}

	@JsonProperty("partner")
	public Object getPartner() {
		return partner;
	}

	@JsonProperty("partner")
	public void setPartner(Object partner) {
		this.partner = partner;
	}

	@JsonProperty("planCycle")
	public Object getPlanCycle() {
		return planCycle;
	}

	@JsonProperty("planCycle")
	public void setPlanCycle(Object planCycle) {
		this.planCycle = planCycle;
	}

	@JsonProperty("partnerId")
	public Integer getPartnerId() {
		return partnerId;
	}

	@JsonProperty("partnerId")
	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	@JsonProperty("subscribable")
	public Boolean getSubscribable() {
		return subscribable;
	}

	@JsonProperty("subscribable")
	public void setSubscribable(Boolean subscribable) {
		this.subscribable = subscribable;
	}

	@JsonProperty("blacklisted")
	public Boolean getBlacklisted() {
		return blacklisted;
	}

	@JsonProperty("blacklisted")
	public void setBlacklisted(Boolean blacklisted) {
		this.blacklisted = blacklisted;
	}

	@JsonProperty("cooldowned")
	public Boolean getCooldowned() {
		return cooldowned;
	}

	@JsonProperty("cooldowned")
	public void setCooldowned(Boolean cooldowned) {
		this.cooldowned = cooldowned;
	}

	@JsonProperty("subscriptionStatus")
	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}

	@JsonProperty("subscriptionStatus")
	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	@JsonProperty("subscriptionValidityDays")
	public Integer getSubscriptionValidityDays() {
		return subscriptionValidityDays;
	}

	@JsonProperty("subscriptionValidityDays")
	public void setSubscriptionValidityDays(Integer subscriptionValidityDays) {
		this.subscriptionValidityDays = subscriptionValidityDays;
	}

	@JsonProperty("productId")
	public Integer getProductId() {
		return productId;
	}

	@JsonProperty("productId")
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@JsonProperty("itemId")
	public Integer getItemId() {
		return itemId;
	}

	@JsonProperty("itemId")
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@JsonProperty("itemTypeId")
	public Integer getItemTypeId() {
		return itemTypeId;
	}

	@JsonProperty("itemTypeId")
	public void setItemTypeId(Integer itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	@JsonProperty("subscriptionBillingCode")
	public String getSubscriptionBillingCode() {
		return subscriptionBillingCode;
	}

	@JsonProperty("subscriptionBillingCode")
	public void setSubscriptionBillingCode(String subscriptionBillingCode) {
		this.subscriptionBillingCode = subscriptionBillingCode;
	}

	@JsonProperty("chargedBillingCode")
	public String getChargedBillingCode() {
		return chargedBillingCode;
	}

	@JsonProperty("chargedBillingCode")
	public void setChargedBillingCode(String chargedBillingCode) {
		this.chargedBillingCode = chargedBillingCode;
	}

	@JsonProperty("customerTransactionId")
	public String getCustomerTransactionId() {
		return customerTransactionId;
	}

	@JsonProperty("customerTransactionId")
	public void setCustomerTransactionId(String customerTransactionId) {
		this.customerTransactionId = customerTransactionId;
	}

	@JsonProperty("subType")
	public Object getSubType() {
		return subType;
	}

	@JsonProperty("subType")
	public void setSubType(Object subType) {
		this.subType = subType;
	}

	@JsonProperty("advertisement")
	public Object getAdvertisement() {
		return advertisement;
	}

	@JsonProperty("advertisement")
	public void setAdvertisement(Object advertisement) {
		this.advertisement = advertisement;
	}

	@JsonProperty("renewalAllowed")
	public Boolean getRenewalAllowed() {
		return renewalAllowed;
	}

	@JsonProperty("renewalAllowed")
	public void setRenewalAllowed(Boolean renewalAllowed) {
		this.renewalAllowed = renewalAllowed;
	}

	@JsonProperty("activationDate")
	public Object getActivationDate() {
		return activationDate;
	}

	@JsonProperty("activationDate")
	public void setActivationDate(Object activationDate) {
		this.activationDate = activationDate;
	}

	@JsonProperty("payload")
	public Object getPayload() {
		return payload;
	}

	@JsonProperty("payload")
	public void setPayload(Object payload) {
		this.payload = payload;
	}

	@JsonProperty("summary")
	public String getSummary() {
		return summary;
	}

	@JsonProperty("summary")
	public void setSummary(String summary) {
		this.summary = summary;
	}

}
