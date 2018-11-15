package com.vuclip.ubs.models.paypal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "description", "start_date", "payer", "plan" })
@ToString
public class PaypalCreateAgreementRequest {

	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("start_date")
	private String startDate;
	@JsonProperty("payer")
	private Payer payer;
	@JsonProperty("plan")
	private Plan plan;

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

	@JsonProperty("start_date")
	public String getStartDate() {
		return startDate;
	}

	@JsonProperty("start_date")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("payer")
	public Payer getPayer() {
		return payer;
	}

	@JsonProperty("payer")
	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	@JsonProperty("plan")
	public Plan getPlan() {
		return plan;
	}

	@JsonProperty("plan")
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

}
