package com.vuclip.ubs.models.paytm;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"MID", "TXNID", "STATUS", "ORDERID", "RESPMSG", "SUBS_ID", "RESPCODE", "TXNAMOUNT",
        "CHECKSUMHASH"})
@ToString
public class PaytmRenewalResponse {

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
    @JsonProperty("RESPCODE")
    private String rESPCODE;
    @JsonProperty("TXNAMOUNT")
    private String tXNAMOUNT;
    @JsonProperty("CHECKSUMHASH")
    private String cHECKSUMHASH;

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

    @JsonProperty("RESPCODE")
    public String getRESPCODE() {
        return rESPCODE;
    }

    @JsonProperty("RESPCODE")
    public void setRESPCODE(String rESPCODE) {
        this.rESPCODE = rESPCODE;
    }

    @JsonProperty("TXNAMOUNT")
    public String getTXNAMOUNT() {
        return tXNAMOUNT;
    }

    @JsonProperty("TXNAMOUNT")
    public void setTXNAMOUNT(String tXNAMOUNT) {
        this.tXNAMOUNT = tXNAMOUNT;
    }

    @JsonProperty("CHECKSUMHASH")
    public String getCHECKSUMHASH() {
        return cHECKSUMHASH;
    }

    @JsonProperty("CHECKSUMHASH")
    public void setCHECKSUMHASH(String cHECKSUMHASH) {
        this.cHECKSUMHASH = cHECKSUMHASH;
    }

}