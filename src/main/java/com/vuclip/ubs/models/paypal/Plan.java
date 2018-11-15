package com.vuclip.ubs.models.paypal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "state", "name", "description", "type", "payment_definitions", "merchant_preferences" })
public class Plan {

	@JsonProperty("id")
	private String id;
	@JsonProperty("state")
	private String state;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("type")
	private String type;
	@JsonProperty("payment_definitions")
	private String paymentDefinitions;
	@JsonProperty("merchant_preferences")
	private String merchantPreferences;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("payment_definitions")
	public String getPaymentDefinitions() {
		return paymentDefinitions;
	}

	@JsonProperty("payment_definitions")
	public void setPaymentDefinitions(String paymentDefinitions) {
		this.paymentDefinitions = paymentDefinitions;
	}

	@JsonProperty("merchant_preferences")
	public String getMerchantPreferences() {
		return merchantPreferences;
	}

	@JsonProperty("merchant_preferences")
	public void setMerchantPreferences(String merchantPreferences) {
		this.merchantPreferences = merchantPreferences;
	}

}