package com.vuclip.ubs.schedular;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "startime", "endTime" })
public class TimeWindow {

	@JsonProperty("startime")
	private String startime;
	@JsonProperty("endTime")
	private String endTime;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public TimeWindow() {
	}

	/**
	 * 
	 * @param startime
	 * @param endTime
	 */
	public TimeWindow(String startime, String endTime) {
		super();
		this.startime = startime;
		this.endTime = endTime;
	}

	@JsonProperty("startime")
	public String getStartime() {
		return startime;
	}

	@JsonProperty("startime")
	public void setStartime(String startime) {
		this.startime = startime;
	}

	@JsonProperty("endTime")
	public String getEndTime() {
		return endTime;
	}

	@JsonProperty("endTime")
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}