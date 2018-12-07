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
        "line1",
        "city",
        "state",
        "country",
        "areacode"
})
public class Address {
    @JsonProperty("line1")
    private String line1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("areacode")
    private String areacode;
}
