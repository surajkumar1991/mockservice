
package com.vuclip.ubs.models.ecentric;

import lombok.Builder;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Token" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}guid"/>
 *         &lt;element name="TransactionStatus" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}TransactionStatusType"/>
 *         &lt;element name="ResponseDetail" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}ResponseDetail"/>
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
    "token",
    "transactionStatus",
    "responseDetail"
})
@XmlRootElement(name = "AddCardResponse")
@ToString
public class AddCardResponse {

    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlElement(name = "TransactionStatus", required = true)
    protected TransactionStatusType transactionStatus;
    @XmlElement(name = "ResponseDetail", required = true)
    protected ResponseDetail responseDetail;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setTransactionStatus(TransactionStatusType value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the responseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseDetail }
     *     
     */
    public ResponseDetail getResponseDetail() {
        return responseDetail;
    }

    /**
     * Sets the value of the responseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDetail }
     *     
     */
    public void setResponseDetail(ResponseDetail value) {
        this.responseDetail = value;
    }

}
