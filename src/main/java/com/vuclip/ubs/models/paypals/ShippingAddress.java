package com.vuclip.ubs.models.paypals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "recipient_name",
        "line1",
        "city",
        "state",
        "postal_code",
        "country_code"
})
public class ShippingAddress {

    @JsonProperty("recipient_name")
    private String recipientName;
    @JsonProperty("line1")
    private String line1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("recipient_name")
    public String getRecipientName() {
        return recipientName;
    }

    @JsonProperty("recipient_name")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}

