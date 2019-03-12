
package com.vuclip.ubs.models.ecentric;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MessageID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Channel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageDateTime",
    "messageID",
    "channel"
})
@Component
@XmlRootElement(name = "MessageHeader")
public class EcentricMessageHeader {

	@XmlElementRef(name = "MessageDateTime", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = String.class)
	protected String messageDateTime;
	@XmlElementRef(name = "MessageID", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = String.class)
	protected String messageID;
	@XmlElementRef(name = "Channel", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = String.class)
	protected String channel;

	public String getMessageDateTime() {

		return messageDateTime;
	}

	public void setMessageDateTime(String messageDateTime) {
		this.messageDateTime = messageDateTime;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}

