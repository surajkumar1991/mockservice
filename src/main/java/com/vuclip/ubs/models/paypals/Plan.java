package com.vuclip.ubs.models.paypals;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"payment_definitions",
"merchant_preferences",
"currency_code"
})
public class Plan {

@JsonProperty("payment_definitions")
private List<PaymentDefinition> paymentDefinitions = null;
@JsonProperty("merchant_preferences")
private MerchantPreferences merchantPreferences;
@JsonProperty("currency_code")
private String currencyCode;

@JsonProperty("payment_definitions")
public List<PaymentDefinition> getPaymentDefinitions() {
return paymentDefinitions;
}

@JsonProperty("payment_definitions")
public void setPaymentDefinitions(List<PaymentDefinition> paymentDefinitions) {
this.paymentDefinitions = paymentDefinitions;
}

@JsonProperty("merchant_preferences")
public MerchantPreferences getMerchantPreferences() {
return merchantPreferences;
}

@JsonProperty("merchant_preferences")
public void setMerchantPreferences(MerchantPreferences merchantPreferences) {
this.merchantPreferences = merchantPreferences;
}

@JsonProperty("currency_code")
public String getCurrencyCode() {
return currencyCode;
}

@JsonProperty("currency_code")
public void setCurrencyCode(String currencyCode) {
this.currencyCode = currencyCode;
}

}

