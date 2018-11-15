
package com.vuclip.ubs.models.paypal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "payment_method" })
public class Payer {

	@JsonProperty("payment_method")
	private String paymentMethod;

	@JsonProperty("payment_method")
	public String getPaymentMethod() {
		return paymentMethod;
	}

	@JsonProperty("payment_method")
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
