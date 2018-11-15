
package com.vuclip.ubs.models.paypal;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "type",
    "state",
    "description",
    "payment_definitions",
    "merchant_preferences"
})
public class Plan {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("state")
    private String state;
    @JsonProperty("description")
    private String description;
    @JsonProperty("payment_definitions")
    private List<PaymentDefinition> paymentDefinitions = null;
    @JsonProperty("merchant_preferences")
    private MerchantPreferences merchantPreferences;

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

}
