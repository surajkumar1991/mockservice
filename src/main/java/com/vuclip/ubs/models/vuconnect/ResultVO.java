package com.vuclip.ubs.models.vuconnect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"responseCode", "message", "status"})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ResultVO {

    @JsonProperty("responseCode")
    private String responseCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private String status;
}