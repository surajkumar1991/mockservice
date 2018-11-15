package com.vuclip.ubs.models.paypals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "amount" })
public class ChargeModel {

	@JsonProperty("type")
	private String type;
	@JsonProperty("amount")
	private Amount_ amount;

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("amount")
	public Amount_ getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(Amount_ amount) {
		this.amount = amount;
	}

}
