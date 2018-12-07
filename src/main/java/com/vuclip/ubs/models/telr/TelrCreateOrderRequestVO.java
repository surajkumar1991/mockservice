package com.vuclip.ubs.models.telr;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@Setter
@ToString
@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ivp_method",
        "ivp_store",
        "ivp_authkey",
        "order_ref"

})
public class TelrCreateOrderRequestVO {

    @JsonProperty("ivp_method")
    private String ivp_method;
    @JsonProperty("ivp_store")
    private String ivp_store;
    @JsonProperty("ivp_authkey")
    private String ivp_authkey;
    @JsonProperty("order_ref")
    private String order_ref;
}
