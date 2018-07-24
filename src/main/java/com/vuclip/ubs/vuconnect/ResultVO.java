package com.vuclip.ubs.vuconnect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "responseCode", "message", "status" })
public class ResultVO {

	@JsonProperty("responseCode")
	private String responseCode;
	@JsonProperty("message")
	private String message;
	@JsonProperty("status")
	private String status;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ResultVO() {
	}

	/**
	 * 
	 * @param message
	 * @param responseCode
	 * @param status
	 */
	public ResultVO(String responseCode, String message, String status) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.status = status;
	}

	@JsonProperty("responseCode")
	public String getResponseCode() {
		return responseCode;
	}

	@JsonProperty("responseCode")
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

}