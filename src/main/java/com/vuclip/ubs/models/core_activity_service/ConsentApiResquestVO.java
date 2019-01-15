package com.vuclip.ubs.models.core_activity_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"itemInfo",
"mode",
"userInfo",
"dirtNetworkParams",
"source",
"partnerId",
"productId",
"additionalParams",
"chargedBillingCode",
"isOtpFlow",
"activityResult"
})
public class ConsentApiResquestVO {

	@JsonProperty("itemInfo")
	private String itemInfo;
	@JsonProperty("mode")
	private String mode;
	@JsonProperty("userInfo")
	private UserInfo userInfo;
	@JsonProperty("dirtNetworkParams")
	private String dirtNetworkParams;
	@JsonProperty("source")
	private String source;
	@JsonProperty("partnerId")
	private String partnerId;
	@JsonProperty("productId")
	private String productId;
	@JsonProperty("additionalParams")
	private AdditionalParams additionalParams;
	@JsonProperty("chargedBillingCode")
	private String chargedBillingCode;
	@JsonProperty("isOtpFlow")
	private String isOtpFlow;
	@JsonProperty("activityResult")
	private String activityResult;
}
