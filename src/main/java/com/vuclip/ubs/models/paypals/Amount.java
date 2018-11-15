package com.vuclip.ubs.models.paypals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"value"
})
public class Amount {

@JsonProperty("value")
private String value;

@JsonProperty("value")
public String getValue() {
return value;
}

@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}

}

