
package com.vuclip.ubs.models.paypal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "type",
    "amount",
    "cycles",
    "frequency",
    "frequency_interval"
})
public class PaymentDefinition {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("cycles")
    private String cycles;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("frequency_interval")
    private String frequencyInterval;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
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
