package com.vuclip.ubs.models.paypals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "payment_method",
        "status",
        "payer_info"
})
public class Payer {

    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("status")
    private String status;
    @JsonProperty("payer_info")
    private PayerInfo payerInfo;

    @JsonProperty("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("payer_info")
    public PayerInfo getPayerInfo() {
        return payerInfo;
    }

    @JsonProperty("payer_info")
    public void setPayerInfo(PayerInfo payerInfo) {
        this.payerInfo = payerInfo;
    }

}

