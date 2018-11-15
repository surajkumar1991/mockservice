package com.vuclip.ubs.models.paypal;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "description", "plan", "start_date", "links" })
public class PaypalCreateAgreementResponse {

	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("plan")
	private Plan plan;
	@JsonProperty("start_date")
	private String startDate;
	@JsonProperty("links")
	private List<Link> links = null;

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

	@JsonProperty("plan")
	public Plan getPlan() {
		return plan;
	}

	@JsonProperty("plan")
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@JsonProperty("start_date")
	public String getStartDate() {
		return startDate;
	}

	@JsonProperty("start_date")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("links")
	public List<Link> getLinks() {
		return links;
	}

	@JsonProperty("links")
	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
