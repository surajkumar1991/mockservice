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
        "method",
        "trace",
        "order",

})
public class ResponseVO {
    @JsonProperty("method")
    private String method;
    @JsonProperty("trace")
    private String trace;
    @JsonProperty("order")
    private Order order;
}
