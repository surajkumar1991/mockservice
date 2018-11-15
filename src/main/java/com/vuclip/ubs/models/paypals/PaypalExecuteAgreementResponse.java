package com.vuclip.ubs.models.paypals;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.vuclip.ubs.models.paypal.Link;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"state",
"description",
"start_date",
"payer",
"shipping_address",
"plan",
"links",
"agreement_details"
})
public class PaypalExecuteAgreementResponse {

@JsonProperty("id")
private String id;
@JsonProperty("state")
private String state;
@JsonProperty("description")
private String description;
@JsonProperty("start_date")
private String startDate;
@JsonProperty("payer")
private Payer payer;
@JsonProperty("shipping_address")
private ShippingAddress_ shippingAddress;
@JsonProperty("plan")
private Plan plan;
@JsonProperty("links")
private List<Link> links = null;
@JsonProperty("agreement_details")
private AgreementDetails agreementDetails;

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

@JsonProperty("shipping_address")
public ShippingAddress_ getShippingAddress() {
return shippingAddress;
}

@JsonProperty("shipping_address")
public void setShippingAddress(ShippingAddress_ shippingAddress) {
this.shippingAddress = shippingAddress;
}

@JsonProperty("plan")
public Plan getPlan() {
return plan;
}

@JsonProperty("plan")
public void setPlan(Plan plan) {
this.plan = plan;
}

@JsonProperty("links")
public List<Link> getLinks() {
return links;
}

@JsonProperty("links")
public void setLinks(List<Link> links) {
this.links = links;
}

@JsonProperty("agreement_details")
public AgreementDetails getAgreementDetails() {
return agreementDetails;
}

@JsonProperty("agreement_details")
public void setAgreementDetails(AgreementDetails agreementDetails) {
this.agreementDetails = agreementDetails;
}

}

