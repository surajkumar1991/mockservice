package com.vuclip.ubs.models.core_activity_service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"itemId",
"itemTypeId"
})
public class ItemInfo {

@JsonProperty("itemId")
private String itemId;
@JsonProperty("itemTypeId")
private String itemTypeId;

}