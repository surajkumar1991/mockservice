package com.vuclip.ubs.models.paypals;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"frequency",
"amount",
"cycles",
"charge_models",
"frequency_interval"
})
public class PaymentDefinition {

@JsonProperty("type")
private String type;
@JsonProperty("frequency")
private String frequency;
@JsonProperty("amount")
private Amount amount;
@JsonProperty("cycles")
private String cycles;
@JsonProperty("charge_models")
private List<ChargeModel> chargeModels = null;
@JsonProperty("frequency_interval")
private String frequencyInterval;

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("frequency")
public String getFrequency() {
return frequency;
}

@JsonProperty("frequency")
public void setFrequency(String frequency) {
this.frequency = frequency;
}

@JsonProperty("amount")
public Amount getAmount() {
return amount;
}

@JsonProperty("amount")
public void setAmount(Amount amount) {
this.amount = amount;
}

@JsonProperty("cycles")
public String getCycles() {
return cycles;
}

@JsonProperty("cycles")
public void setCycles(String cycles) {
this.cycles = cycles;
}

@JsonProperty("charge_models")
public List<ChargeModel> getChargeModels() {
return chargeModels;
}

@JsonProperty("charge_models")
public void setChargeModels(List<ChargeModel> chargeModels) {
this.chargeModels = chargeModels;
}

@JsonProperty("frequency_interval")
public String getFrequencyInterval() {
return frequencyInterval;
}

@JsonProperty("frequency_interval")
public void setFrequencyInterval(String frequencyInterval) {
this.frequencyInterval = frequencyInterval;
}

}

