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
@JsonPropertyOrder({ "ORDERID", "STATUS", "RESPMSG", "MID", "RESPCODE", "CHECKSUMHASH", "TXNID", "TXNAMOUNT",
		"SUBS_ID" })
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PaytmRenewalResponse {

	@JsonProperty("ORDERID")
	private String oRDERID;
	@JsonProperty("STATUS")
	private String sTATUS;
	@JsonProperty("RESPMSG")
	private String rESPMSG;
	@JsonProperty("MID")
	private String mID;
	@JsonProperty("RESPCODE")
	private String rESPCODE;
	@JsonProperty("CHECKSUMHASH")
	private String cHECKSUMHASH;
	@JsonProperty("TXNID")
	private String tXNID;
	@JsonProperty("TXNAMOUNT")
	private String tXNAMOUNT;
	@JsonProperty("SUBS_ID")
	private String sUBSID;

}