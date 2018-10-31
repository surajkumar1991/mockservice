package com.vuclip.ubs.partner_mock;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "MID", "TXNID", "STATUS", "SUBSID", "ORDERID", "RESPMSG", "TXNDATE", "TXNTYPE", "BANKNAME",
		"RESPCODE", "BANKTXNID", "TXNAMOUNT", "REFUNDAMT ", "GATEWAYNAME", "PAYMENTMODE" })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PaytmStatusCheckResponseVO {

	@JsonProperty("MID")
	private String mID;
	@JsonProperty("TXNID")
	private String tXNID;
	@JsonProperty("STATUS")
	private String sTATUS;
	@JsonProperty("SUBS_ID")
	private String sUBSID;
	@JsonProperty("ORDERID")
	private String oRDERID;
	@JsonProperty("RESPMSG")
	private String rESPMSG;
	@JsonProperty("TXNDATE")
	private String tXNDATE;
	@JsonProperty("TXNTYPE")
	private String tXNTYPE;
	@JsonProperty("BANKNAME")
	private String bANKNAME;
	@JsonProperty("RESPCODE")
	private String rESPCODE;
	@JsonProperty("BANKTXNID")
	private String bANKTXNID;
	@JsonProperty("TXNAMOUNT")
	private String tXNAMOUNT;
	@JsonProperty("REFUNDAMT ")
	private String rEFUNDAMT;
	@JsonProperty("GATEWAYNAME")
	private String gATEWAYNAME;
	@JsonProperty("PAYMENTMODE")
	private String pAYMENTMODE;
}