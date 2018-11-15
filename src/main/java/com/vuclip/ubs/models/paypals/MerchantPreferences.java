package com.vuclip.ubs.models.paypals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"setup_fee",
"max_fail_attempts",
"auto_bill_amount"
})
public class MerchantPreferences {

@JsonProperty("setup_fee")
private SetupFee setupFee;
@JsonProperty("max_fail_attempts")
private String maxFailAttempts;
@JsonProperty("auto_bill_amount")
private String autoBillAmount;

@JsonProperty("setup_fee")
public SetupFee getSetupFee() {
return setupFee;
}

@JsonProperty("setup_fee")
public void setSetupFee(SetupFee setupFee) {
this.setupFee = setupFee;
}

@JsonProperty("max_fail_attempts")
public String getMaxFailAttempts() {
return maxFailAttempts;
}

@JsonProperty("max_fail_attempts")
public void setMaxFailAttempts(String maxFailAttempts) {
this.maxFailAttempts = maxFailAttempts;
}

@JsonProperty("auto_bill_amount")
public String getAutoBillAmount() {
return autoBillAmount;
}

@JsonProperty("auto_bill_amount")
public void setAutoBillAmount(String autoBillAmount) {
this.autoBillAmount = autoBillAmount;
}

}

