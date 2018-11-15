package com.vuclip.ubs.models.paypals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "outstanding_balance",
        "cycles_remaining",
        "cycles_completed",
        "next_billing_date",
        "final_payment_date",
        "failed_payment_count"
})
public class AgreementDetails {

    @JsonProperty("outstanding_balance")
    private OutstandingBalance outstandingBalance;
    @JsonProperty("cycles_remaining")
    private String cyclesRemaining;
    @JsonProperty("cycles_completed")
    private String cyclesCompleted;
    @JsonProperty("next_billing_date")
    private String nextBillingDate;
    @JsonProperty("final_payment_date")
    private String finalPaymentDate;
    @JsonProperty("failed_payment_count")
    private String failedPaymentCount;

    @JsonProperty("outstanding_balance")
    public OutstandingBalance getOutstandingBalance() {
        return outstandingBalance;
    }

    @JsonProperty("outstanding_balance")
    public void setOutstandingBalance(OutstandingBalance outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    @JsonProperty("cycles_remaining")
    public String getCyclesRemaining() {
        return cyclesRemaining;
    }

    @JsonProperty("cycles_remaining")
    public void setCyclesRemaining(String cyclesRemaining) {
        this.cyclesRemaining = cyclesRemaining;
    }

    @JsonProperty("cycles_completed")
    public String getCyclesCompleted() {
        return cyclesCompleted;
    }

    @JsonProperty("cycles_completed")
    public void setCyclesCompleted(String cyclesCompleted) {
        this.cyclesCompleted = cyclesCompleted;
    }

    @JsonProperty("next_billing_date")
    public String getNextBillingDate() {
        return nextBillingDate;
    }

    @JsonProperty("next_billing_date")
    public void setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    @JsonProperty("final_payment_date")
    public String getFinalPaymentDate() {
        return finalPaymentDate;
    }

    @JsonProperty("final_payment_date")
    public void setFinalPaymentDate(String finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
    }

    @JsonProperty("failed_payment_count")
    public String getFailedPaymentCount() {
        return failedPaymentCount;
    }

    @JsonProperty("failed_payment_count")
    public void setFailedPaymentCount(String failedPaymentCount) {
        this.failedPaymentCount = failedPaymentCount;
    }

}

