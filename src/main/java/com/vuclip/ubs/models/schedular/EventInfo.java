package com.vuclip.ubs.models.schedular;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"logTime", "eventId", "eventType"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EventInfo {

    @JsonProperty("logTime")
    private BigInteger logTime;
    @JsonProperty("eventId")
    private String eventId;
    @JsonProperty("eventType")
    private String eventType;

}
