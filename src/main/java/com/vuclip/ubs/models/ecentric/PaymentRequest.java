
package com.vuclip.ubs.models.ecentric;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="MerchantID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransactionID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PreviousTransactionID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SaleReconID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReconID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Amount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CurrencyCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BudgetPeriod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AuthCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentService" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}PaymentServiceType"/>
 *         &lt;element name="Card" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}BankCard" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}BankAccountType" minOccurs="0"/>
 *         &lt;element name="FirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillingAddress" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}Address" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{http://www.ecentricswitch.co.za/paymentgateway/v1}Address" minOccurs="0"/>
 *         &lt;element name="Email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="254"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MobilePhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HomePhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WorkPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAResPayload" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerminalID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CardAcceptorName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
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
    "merchantID",
    "transactionID",
    "previousTransactionID",
    "transactionDateTime",
    "saleReconID",
    "reconID",
    "amount",
    "currencyCode",
    "budgetPeriod",
    "orderNumber",
    "authCode",
    "paymentService",
    "card",
    "bankAccount",
    "firstName",
    "lastName",
    "billingAddress",
    "shippingAddress",
    "email",
    "mobilePhone",
    "homePhone",
    "workPhone",
    "paResPayload",
    "terminalID",
    "cardAcceptorName"
})
@XmlRootElement(name = "PaymentRequest")
public class PaymentRequest {

    @XmlElement(name = "MerchantID", required = true)
    protected String merchantID;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "PreviousTransactionID", required = true)
    protected String previousTransactionID;
    @XmlElementRef(name = "TransactionDateTime", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> transactionDateTime;
    @XmlElementRef(name = "SaleReconID", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> saleReconID;
    @XmlElementRef(name = "ReconID", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> reconID;
    @XmlElement(name = "Amount")
    protected long amount;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "BudgetPeriod", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<Integer> budgetPeriod;
    @XmlElementRef(name = "OrderNumber", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "AuthCode", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> authCode;
    @XmlElement(name = "PaymentService", required = true)
    protected PaymentServiceType paymentService;
    @XmlElementRef(name = "Card", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<BankCard> card;
    @XmlElementRef(name = "BankAccount", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<BankAccountType> bankAccount;
    @XmlElementRef(name = "FirstName", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "LastName", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "BillingAddress", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<Address> billingAddress;
    @XmlElementRef(name = "ShippingAddress", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<Address> shippingAddress;
    @XmlElementRef(name = "Email", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "MobilePhone", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "HomePhone", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> homePhone;
    @XmlElementRef(name = "WorkPhone", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> workPhone;
    @XmlElementRef(name = "PAResPayload", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> paResPayload;
    @XmlElementRef(name = "TerminalID", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> terminalID;
    @XmlElementRef(name = "CardAcceptorName", namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", type = JAXBElement.class)
    protected JAXBElement<String> cardAcceptorName;

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

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
     * Gets the value of the previousTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousTransactionID() {
        return previousTransactionID;
    }

    /**
     * Sets the value of the previousTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousTransactionID(String value) {
        this.previousTransactionID = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTransactionDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.transactionDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReconID() {
        return reconID;
    }

    /**
     * Sets the value of the reconID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReconID(JAXBElement<String> value) {
        this.reconID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the budgetPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBudgetPeriod() {
        return budgetPeriod;
    }

    /**
     * Sets the value of the budgetPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBudgetPeriod(JAXBElement<Integer> value) {
        this.budgetPeriod = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthCode(JAXBElement<String> value) {
        this.authCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paymentService property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentServiceType }
     *     
     */
    public PaymentServiceType getPaymentService() {
        return paymentService;
    }

    /**
     * Sets the value of the paymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentServiceType }
     *     
     */
    public void setPaymentService(PaymentServiceType value) {
        this.paymentService = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankCard }{@code >}
     *     
     */
    public JAXBElement<BankCard> getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankCard }{@code >}
     *     
     */
    public void setCard(JAXBElement<BankCard> value) {
        this.card = ((JAXBElement<BankCard> ) value);
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankAccountType }{@code >}
     *     
     */
    public JAXBElement<BankAccountType> getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankAccountType }{@code >}
     *     
     */
    public void setBankAccount(JAXBElement<BankAccountType> value) {
        this.bankAccount = ((JAXBElement<BankAccountType> ) value);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setBillingAddress(JAXBElement<Address> value) {
        this.billingAddress = ((JAXBElement<Address> ) value);
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setShippingAddress(JAXBElement<Address> value) {
        this.shippingAddress = ((JAXBElement<Address> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone(JAXBElement<String> value) {
        this.mobilePhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhone(JAXBElement<String> value) {
        this.homePhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhone(JAXBElement<String> value) {
        this.workPhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paResPayload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAResPayload() {
        return paResPayload;
    }

    /**
     * Sets the value of the paResPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAResPayload(JAXBElement<String> value) {
        this.paResPayload = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerminalID(JAXBElement<String> value) {
        this.terminalID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cardAcceptorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardAcceptorName() {
        return cardAcceptorName;
    }

    /**
     * Sets the value of the cardAcceptorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardAcceptorName(JAXBElement<String> value) {
        this.cardAcceptorName = ((JAXBElement<String> ) value);
    }

}
