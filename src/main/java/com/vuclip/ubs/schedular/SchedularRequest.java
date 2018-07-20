package com.vuclip.ubs.schedular;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "jobId", "partnerId", "productId", "country", "executingDays", "activityType", "timeWindow",
		"eventInfo" })
public class SchedularRequest {

	@JsonProperty("jobId")
	private Integer jobId;
	@JsonProperty("partnerId")
	private Integer partnerId;
	@JsonProperty("productId")
	private Integer productId;
	@JsonProperty("country")
	private String country;
	@JsonProperty("executingDays")
	private String executingDays;
	@JsonProperty("activityType")
	private String activityType;
	@JsonProperty("timeWindow")
	private List<TimeWindow> timeWindow = null;
	@JsonProperty("eventInfo")
	private EventInfo eventInfo;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public SchedularRequest() {
	}

	/**
	 * 
	 * @param timeWindow
	 * @param jobId
	 * @param partnerId
	 * @param eventInfo
	 * @param executingDays
	 * @param activityType
	 * @param country
	 * @param productId
	 */
	public SchedularRequest(Integer jobId, Integer partnerId, Integer productId, String country, String executingDays,
			String activityType, List<TimeWindow> timeWindow, EventInfo eventInfo) {
		super();
		this.jobId = jobId;
		this.partnerId = partnerId;
		this.productId = productId;
		this.country = country;
		this.executingDays = executingDays;
		this.activityType = activityType;
		this.timeWindow = timeWindow;
		this.eventInfo = eventInfo;
	}

	@JsonProperty("jobId")
	public Integer getJobId() {
		return jobId;
	}

	@JsonProperty("jobId")
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	@JsonProperty("partnerId")
	public Integer getPartnerId() {
		return partnerId;
	}

	@JsonProperty("partnerId")
	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	@JsonProperty("productId")
	public Integer getProductId() {
		return productId;
	}

	@JsonProperty("productId")
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("executingDays")
	public String getExecutingDays() {
		return executingDays;
	}

	@JsonProperty("executingDays")
	public void setExecutingDays(String executingDays) {
		this.executingDays = executingDays;
	}

	@JsonProperty("activityType")
	public String getActivityType() {
		return activityType;
	}

	@JsonProperty("activityType")
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	@JsonProperty("timeWindow")
	public List<TimeWindow> getTimeWindow() {
		return timeWindow;
	}

	@JsonProperty("timeWindow")
	public void setTimeWindow(List<TimeWindow> timeWindow) {
		this.timeWindow = timeWindow;
	}

	@JsonProperty("eventInfo")
	public EventInfo getEventInfo() {
		return eventInfo;
	}

	@JsonProperty("eventInfo")
	public void setEventInfo(EventInfo eventInfo) {
		this.eventInfo = eventInfo;
	}

}
