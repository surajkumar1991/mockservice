package com.vuclip.ubs.models.telr;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@Setter
@ToString
@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ref",
        "cartid",
        "test",
        "amount",
        "currency",
        "description",
        "status",
        "transaction",
        "agreement",
        "paymethod",
        "card",
        "customer"
})
public class Order {
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("cartid")
    private String cartid;
    @JsonProperty("test")
    private String test;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("description")
    private String description;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("transaction")
    private Transaction transaction;
    @JsonProperty("agreement")
    private Agreement agreement;
    @JsonProperty("paymethod")
    private String paymethod;
    @JsonProperty("card")
    private Card card;
    @JsonProperty("customer")
    private Customer customer;

}
