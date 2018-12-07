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
        "period",
        "interval",
        "day",
        "count",
        "amount"
})
public class Recurring {
    @JsonProperty("period")
    private String period;
    @JsonProperty("interval")
    private String interval;
    @JsonProperty("day")
    private String day;
    @JsonProperty("count")
    private String count;
    @JsonProperty("amount")
    private String amount;
}
