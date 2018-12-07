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
        "type",
        "class",
        "status",
        "code",
        "message"
})
public class Transaction {
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("type")
    private String type;
    @JsonProperty("class")
    private String _class;
    @JsonProperty("status")
    private String status;
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;

}
