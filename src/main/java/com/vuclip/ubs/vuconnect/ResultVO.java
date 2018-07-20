package com.vuclip.ubs.vuconnect;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.ToString;

//@XmlRootElement(name="activationRequestResult")
//@JacksonXmlRootElement(localName = "activationRequestResult")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@ToString
public class ResultVO {

	
	private String status;
	
	
	private String code;
	
	
	private String message;

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@XmlElement(name="status")
	public String getStatus() {
		return status;
	}
	
	@XmlElement(name="code")
	public String getCode() {
		return code;
	}
	
	@XmlElement(name="message")
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", code=" + code + ", message="
				+ message + "]";
	}
	
	
}
