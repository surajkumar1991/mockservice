package com.vuclip.ubs.schedular;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "logTime", "eventId", "eventType" })
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
