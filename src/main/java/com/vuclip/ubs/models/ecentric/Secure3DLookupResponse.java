
package com.vuclip.ubs.models.ecentric;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="TransactionID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SaleReconID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReconID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransactionStatus" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}TransactionStatusType"/>
 *         &lt;element name="ResponseDetail" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}ResponseDetail"/>
 *         &lt;element name="Enrolled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAReqPayload" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "transactionID",
    "transactionDateTime",
    "saleReconID",
    "reconID",
    "transactionStatus",
    "responseDetail",
    "enrolled",
    "acsUrl",
    "paReqPayload"
})
@XmlRootElement(name = "Secure3DLookupResponse")
public class Secure3DLookupResponse {

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "TransactionDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDateTime;
    @XmlElementRef(name = "SaleReconID", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> saleReconID;
    @XmlElement(name = "ReconID", required = true, nillable = true)
    protected String reconID;
    @XmlElement(name = "TransactionStatus", required = true)
    protected TransactionStatusType transactionStatus;
    @XmlElement(name = "ResponseDetail", required = true)
    protected ResponseDetail responseDetail;
    @XmlElement(name = "Enrolled")
    protected Boolean enrolled;
    @XmlElementRef(name = "AcsUrl", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> acsUrl;
    @XmlElementRef(name = "PAReqPayload", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> paReqPayload;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDateTime(XMLGregorianCalendar value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the saleReconID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleReconID() {
        return saleReconID;
    }

    /**
     * Sets the value of the saleReconID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleReconID(JAXBElement<String> value) {
        this.saleReconID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reconID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconID() {
        return reconID;
    }

    /**
     * Sets the value of the reconID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconID(String value) {
        this.reconID = value;
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

    /**
     * Gets the value of the enrolled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnrolled() {
        return enrolled;
    }

    /**
     * Sets the value of the enrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnrolled(Boolean value) {
        this.enrolled = value;
    }

    /**
     * Gets the value of the acsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcsUrl() {
        return acsUrl;
    }

    /**
     * Sets the value of the acsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcsUrl(JAXBElement<String> value) {
        this.acsUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paReqPayload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAReqPayload() {
        return paReqPayload;
    }

    /**
     * Sets the value of the paReqPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAReqPayload(JAXBElement<String> value) {
        this.paReqPayload = ((JAXBElement<String> ) value);
    }

}
