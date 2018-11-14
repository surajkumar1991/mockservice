package com.vuclip.ubs.models.paytm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"MID", "TXNID", "STATUS", "ORDERID", "RESPMSG", "SUBS_ID", "TXNDATE", "TXNTYPE", "BANKNAME",
        "RESPCODE", "BANKTXNID", "TXNAMOUNT", "REFUNDAMT ", "GATEWAYNAME", "PAYMENTMODE"})
public class PaytmStatusCheckResponseVO {

    @JsonProperty("MID")
    private String mID;
    @JsonProperty("TXNID")
    private String tXNID;
    @JsonProperty("STATUS")
    private String sTATUS;
    @JsonProperty("ORDERID")
    private String oRDERID;
    @JsonProperty("RESPMSG")
    private String rESPMSG;
    @JsonProperty("SUBS_ID")
    private String sUBSID;
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

    @JsonProperty("MID")
    public String getMID() {
        return mID;
    }

    @JsonProperty("MID")
    public void setMID(String mID) {
        this.mID = mID;
    }

    @JsonProperty("TXNID")
    public String getTXNID() {
        return tXNID;
    }

    @JsonProperty("TXNID")
    public void setTXNID(String tXNID) {
        this.tXNID = tXNID;
    }

    @JsonProperty("STATUS")
    public String getSTATUS() {
        return sTATUS;
    }

    @JsonProperty("STATUS")
    public void setSTATUS(String sTATUS) {
        this.sTATUS = sTATUS;
    }

    @JsonProperty("ORDERID")
    public String getORDERID() {
        return oRDERID;
    }

    @JsonProperty("ORDERID")
    public void setORDERID(String oRDERID) {
        this.oRDERID = oRDERID;
    }

    @JsonProperty("RESPMSG")
    public String getRESPMSG() {
        return rESPMSG;
    }

    @JsonProperty("RESPMSG")
    public void setRESPMSG(String rESPMSG) {
        this.rESPMSG = rESPMSG;
    }

    @JsonProperty("SUBS_ID")
    public String getSUBSID() {
        return sUBSID;
    }

    @JsonProperty("SUBS_ID")
    public void setSUBSID(String sUBSID) {
        this.sUBSID = sUBSID;
    }

    @JsonProperty("TXNDATE")
    public String getTXNDATE() {
        return tXNDATE;
    }

    @JsonProperty("TXNDATE")
    public void setTXNDATE(String tXNDATE) {
        this.tXNDATE = tXNDATE;
    }

    @JsonProperty("TXNTYPE")
    public String getTXNTYPE() {
        return tXNTYPE;
    }

    @JsonProperty("TXNTYPE")
    public void setTXNTYPE(String tXNTYPE) {
        this.tXNTYPE = tXNTYPE;
    }

    @JsonProperty("BANKNAME")
    public String getBANKNAME() {
        return bANKNAME;
    }

    @JsonProperty("BANKNAME")
    public void setBANKNAME(String bANKNAME) {
        this.bANKNAME = bANKNAME;
    }

    @JsonProperty("RESPCODE")
    public String getRESPCODE() {
        return rESPCODE;
    }

    @JsonProperty("RESPCODE")
    public void setRESPCODE(String rESPCODE) {
        this.rESPCODE = rESPCODE;
    }

    @JsonProperty("BANKTXNID")
    public String getBANKTXNID() {
        return bANKTXNID;
    }

    @JsonProperty("BANKTXNID")
    public void setBANKTXNID(String bANKTXNID) {
        this.bANKTXNID = bANKTXNID;
    }

    @JsonProperty("TXNAMOUNT")
    public String getTXNAMOUNT() {
        return tXNAMOUNT;
    }

    @JsonProperty("TXNAMOUNT")
    public void setTXNAMOUNT(String tXNAMOUNT) {
        this.tXNAMOUNT = tXNAMOUNT;
    }

    @JsonProperty("REFUNDAMT ")
    public String getREFUNDAMT() {
        return rEFUNDAMT;
    }

    @JsonProperty("REFUNDAMT ")
    public void setREFUNDAMT(String rEFUNDAMT) {
        this.rEFUNDAMT = rEFUNDAMT;
    }

    @JsonProperty("GATEWAYNAME")
    public String getGATEWAYNAME() {
        return gATEWAYNAME;
    }

    @JsonProperty("GATEWAYNAME")
    public void setGATEWAYNAME(String gATEWAYNAME) {
        this.gATEWAYNAME = gATEWAYNAME;
    }

    @JsonProperty("PAYMENTMODE")
    public String getPAYMENTMODE() {
        return pAYMENTMODE;
    }

    @JsonProperty("PAYMENTMODE")
    public void setPAYMENTMODE(String pAYMENTMODE) {
        this.pAYMENTMODE = pAYMENTMODE;
    }

}