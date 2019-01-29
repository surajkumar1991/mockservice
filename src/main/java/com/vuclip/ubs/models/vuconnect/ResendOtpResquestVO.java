package com.vuclip.ubs.models.vuconnect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"productId",
"partnerId",
"country",
"otpTransactionId"
})
public class ResendOtpResquestVO {

	@JsonProperty("productId")
	private String productId;
	@JsonProperty("partnerId")
	private String partnerId;
	@JsonProperty("country")
	private String country;
	@JsonProperty("otpTransactionId")
	private String otpTransactionId;
}