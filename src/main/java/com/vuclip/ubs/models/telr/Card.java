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
        "type",
        "last4",
        "country",
        "first6",
        "expiry"
})
public class Card {
    @JsonProperty("type")
    private String type;
    @JsonProperty("last4")
    private String last4;
    @JsonProperty("country")
    private String country;
    @JsonProperty("first6")
    private String first6;
    @JsonProperty("expiry")
    private Expiry expiry;
}
