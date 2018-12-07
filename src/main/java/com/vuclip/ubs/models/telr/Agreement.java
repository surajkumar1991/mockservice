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
        "id",
        "initial",
        "recurring",
        "final"
})
public class Agreement {
    @JsonProperty("id")
    private String id;
    @JsonProperty("initial")
    private String initial;
    @JsonProperty("recurring")
    private Recurring recurring;
    @JsonProperty("final")
    private String _final;
}
