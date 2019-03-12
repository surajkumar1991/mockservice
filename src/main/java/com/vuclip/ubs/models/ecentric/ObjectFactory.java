
package com.vuclip.ubs.models.ecentric;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vuclip.ubs.models.ecentric package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MessageID_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "MessageID");
    private final static QName _BankCard_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "BankCard");
    private final static QName _PaymentServiceType_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "PaymentServiceType");
    private final static QName _BankCardType_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "BankCardType");
    private final static QName _TransactionStatusType_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "TransactionStatusType");
    private final static QName _BankAccountType_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "BankAccountType");
    private final static QName _Address_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Address");
    private final static QName _Account_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Account");
    private final static QName _MessageDateTime_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "MessageDateTime");
    private final static QName _ResponseDetail_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "ResponseDetail");
    private final static QName _AccountDetailAccountholderName_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AccountholderName");
    private final static QName _AccountDetailAccountNumber_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AccountNumber");
    private final static QName _AccountDetailBranchCode_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "BranchCode");
    private final static QName _AccountDetailAccountType_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AccountType");
    private final static QName _AccountDetailBank_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Bank");
    private final static QName _MessageHeaderChannel_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Channel");
    private final static QName _CreateMasterPassTransactionRequestMobilePhone_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "MobilePhone");
    private final static QName _CreateMasterPassTransactionRequestOrderNumber_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "OrderNumber");
    private final static QName _CreateMasterPassTransactionRequestTransactionDateTime_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "TransactionDateTime");
   
    private final static QName _CreateMasterPassTransactionRequestCurrencyCode_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "CurrencyCode");
    private final static QName _RefundResponseSaleReconID_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "SaleReconID");
    private final static QName _RefundResponseAuthCode_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AuthCode");
    private final static QName _BankCardExpiryYear_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "ExpiryYear");
    private final static QName _BankCardSecurityCode_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "SecurityCode");
    private final static QName _BankCardToken_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Token");
    private final static QName _BankCardCardAssociation_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "CardAssociation");
    private final static QName _BankCardCardType_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "CardType");
    private final static QName _BankCardExpiryMonth_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "ExpiryMonth");
    private final static QName _BankCardCardholderName_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "CardholderName");
    private final static QName _BankCardCardNumber_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "CardNumber");
    private final static QName _PaymentRequestCard_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Card");
    private final static QName _PaymentRequestBankAccount_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "BankAccount");
    private final static QName _PaymentRequestPAResPayload_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "PAResPayload");
    private final static QName _PaymentRequestCardAcceptorName_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "CardAcceptorName");
    private final static QName _PaymentRequestFirstName_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "FirstName");
    private final static QName _PaymentRequestWorkPhone_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "WorkPhone");
    private final static QName _PaymentRequestEmail_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Email");
    private final static QName _PaymentRequestBudgetPeriod_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "BudgetPeriod");
    private final static QName _PaymentRequestLastName_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "LastName");
    private final static QName _PaymentRequestTerminalID_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "TerminalID");
    private final static QName _PaymentRequestShippingAddress_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "ShippingAddress");
    private final static QName _PaymentRequestReconID_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "ReconID");
    private final static QName _PaymentRequestHomePhone_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "HomePhone");
    private final static QName _PaymentRequestBillingAddress_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "BillingAddress");
    private final static QName _UserCardMaskedCardNumber_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "MaskedCardNumber");
    private final static QName _AuthorizeResponseAuthAmount_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AuthAmount");
    private final static QName _Secure3DLookupResponseAcsUrl_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AcsUrl");
    private final static QName _Secure3DLookupResponsePAReqPayload_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "PAReqPayload");
    private final static QName _AddressPostCode_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "PostCode");
    private final static QName _AddressCountryCode_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "CountryCode");
    private final static QName _AddressCity_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "City");
    private final static QName _AddressRegion_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Region");
    private final static QName _AddressNeighbourhood_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "Neighbourhood");
    private final static QName _AddressAddressLine1_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AddressLine1");
    private final static QName _AddressAddressLine2_QNAME = new QName("http://www.ecentricswitch.co.za/paymentgateway/v1", "AddressLine2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vuclip.ubs.models.ecentric
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountDetail }
     * 
     */
    public AccountDetail createAccountDetail() {
        return new AccountDetail();
    }

    /**
     * Create an instance of {@link AddCardResponse }
     * 
     */
    public AddCardResponse createAddCardResponse() {
        return new AddCardResponse();
    }


    /**
     * Create an instance of {@link BankCard }
     * 
     */
    public BankCard createBankCard() {
        return new BankCard();
    }

 

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }




    /**
     * Create an instance of {@link UserCard }
     * 
     */
    public UserCard createUserCard() {
        return new UserCard();
    }

    /**
     * Create an instance of {@link AuthorizeResponse }
     * 
     */
    public AuthorizeResponse createAuthorizeResponse() {
        return new AuthorizeResponse();
    }



    /**
     * Create an instance of {@link VoidRequest }
     * 
     */
    public VoidRequest createVoidRequest() {
        return new VoidRequest();
    }

    /**
     * Create an instance of {@link AddCardRequest }
     * 
     */
    public AddCardRequest createAddCardRequest() {
        return new AddCardRequest();
    }

    /**
     * Create an instance of {@link VoidResponse }
     * 
     */
    public VoidResponse createVoidResponse() {
        return new VoidResponse();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }



    /**
     * Create an instance of {@link Secure3DLookupResponse }
     * 
     */
    public Secure3DLookupResponse createSecure3DLookupResponse() {
        return new Secure3DLookupResponse();
    }





    /**
     * Create an instance of {@link AuthorizeRequest }
     * 
     */
    public AuthorizeRequest createAuthorizeRequest() {
        return new AuthorizeRequest();
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }





    /**
     * Create an instance of {@link ResponseDetail }
     * 
     */
    public ResponseDetail createResponseDetail() {
        return new ResponseDetail();
    }

    /**
     * Create an instance of {@link Secure3DLookupRequest }
     * 
     */
    public Secure3DLookupRequest createSecure3DLookupRequest() {
        return new Secure3DLookupRequest();
    }



    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "MessageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BankCard")
    public JAXBElement<BankCard> createBankCard(BankCard value) {
        return new JAXBElement<BankCard>(_BankCard_QNAME, BankCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "PaymentServiceType")
    public JAXBElement<PaymentServiceType> createPaymentServiceType(PaymentServiceType value) {
        return new JAXBElement<PaymentServiceType>(_PaymentServiceType_QNAME, PaymentServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BankCardType")
    public JAXBElement<BankCardType> createBankCardType(BankCardType value) {
        return new JAXBElement<BankCardType>(_BankCardType_QNAME, BankCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "TransactionStatusType")
    public JAXBElement<TransactionStatusType> createTransactionStatusType(TransactionStatusType value) {
        return new JAXBElement<TransactionStatusType>(_TransactionStatusType_QNAME, TransactionStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BankAccountType")
    public JAXBElement<BankAccountType> createBankAccountType(BankAccountType value) {
        return new JAXBElement<BankAccountType>(_BankAccountType_QNAME, BankAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Account")
    public JAXBElement<AccountDetail> createAccount(AccountDetail value) {
        return new JAXBElement<AccountDetail>(_Account_QNAME, AccountDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "MessageDateTime")
    public JAXBElement<XMLGregorianCalendar> createMessageDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessageDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ResponseDetail")
    public JAXBElement<ResponseDetail> createResponseDetail(ResponseDetail value) {
        return new JAXBElement<ResponseDetail>(_ResponseDetail_QNAME, ResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AccountholderName", scope = AccountDetail.class)
    public JAXBElement<String> createAccountDetailAccountholderName(String value) {
        return new JAXBElement<String>(_AccountDetailAccountholderName_QNAME, String.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AccountNumber", scope = AccountDetail.class)
    public JAXBElement<String> createAccountDetailAccountNumber(String value) {
        return new JAXBElement<String>(_AccountDetailAccountNumber_QNAME, String.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BranchCode", scope = AccountDetail.class)
    public JAXBElement<String> createAccountDetailBranchCode(String value) {
        return new JAXBElement<String>(_AccountDetailBranchCode_QNAME, String.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AccountType", scope = AccountDetail.class)
    public JAXBElement<String> createAccountDetailAccountType(String value) {
        return new JAXBElement<String>(_AccountDetailAccountType_QNAME, String.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Bank", scope = AccountDetail.class)
    public JAXBElement<String> createAccountDetailBank(String value) {
        return new JAXBElement<String>(_AccountDetailBank_QNAME, String.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "MessageID", scope = MessageHeader.class)
    public JAXBElement<String> createMessageHeaderMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, MessageHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Channel", scope = MessageHeader.class)
    public JAXBElement<String> createMessageHeaderChannel(String value) {
        return new JAXBElement<String>(_MessageHeaderChannel_QNAME, String.class, MessageHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "MessageDateTime", scope = MessageHeader.class)
    public JAXBElement<XMLGregorianCalendar> createMessageHeaderMessageDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessageDateTime_QNAME, XMLGregorianCalendar.class, MessageHeader.class, value);
    }

   




    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ExpiryYear", scope = BankCard.class)
    public JAXBElement<Integer> createBankCardExpiryYear(Integer value) {
        return new JAXBElement<Integer>(_BankCardExpiryYear_QNAME, Integer.class, BankCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SecurityCode", scope = BankCard.class)
    public JAXBElement<String> createBankCardSecurityCode(String value) {
        return new JAXBElement<String>(_BankCardSecurityCode_QNAME, String.class, BankCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Token", scope = BankCard.class)
    public JAXBElement<String> createBankCardToken(String value) {
        return new JAXBElement<String>(_BankCardToken_QNAME, String.class, BankCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CardAssociation", scope = BankCard.class)
    public JAXBElement<String> createBankCardCardAssociation(String value) {
        return new JAXBElement<String>(_BankCardCardAssociation_QNAME, String.class, BankCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CardType", scope = BankCard.class)
    public JAXBElement<BankCardType> createBankCardCardType(BankCardType value) {
        return new JAXBElement<BankCardType>(_BankCardCardType_QNAME, BankCardType.class, BankCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ExpiryMonth", scope = BankCard.class)
    public JAXBElement<Integer> createBankCardExpiryMonth(Integer value) {
        return new JAXBElement<Integer>(_BankCardExpiryMonth_QNAME, Integer.class, BankCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CardholderName", scope = BankCard.class)
    public JAXBElement<String> createBankCardCardholderName(String value) {
        return new JAXBElement<String>(_BankCardCardholderName_QNAME, String.class, BankCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CardNumber", scope = BankCard.class)
    public JAXBElement<String> createBankCardCardNumber(String value) {
        return new JAXBElement<String>(_BankCardCardNumber_QNAME, String.class, BankCard.class, value);
    }

   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Card", scope = PaymentRequest.class)
    public JAXBElement<BankCard> createPaymentRequestCard(BankCard value) {
        return new JAXBElement<BankCard>(_PaymentRequestCard_QNAME, BankCard.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "MobilePhone", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestMobilePhone(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestMobilePhone_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "OrderNumber", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestOrderNumber(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestOrderNumber_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BankAccount", scope = PaymentRequest.class)
    public JAXBElement<BankAccountType> createPaymentRequestBankAccount(BankAccountType value) {
        return new JAXBElement<BankAccountType>(_PaymentRequestBankAccount_QNAME, BankAccountType.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "TransactionDateTime", scope = PaymentRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentRequestTransactionDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateMasterPassTransactionRequestTransactionDateTime_QNAME, XMLGregorianCalendar.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "PAResPayload", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestPAResPayload(String value) {
        return new JAXBElement<String>(_PaymentRequestPAResPayload_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CardAcceptorName", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestCardAcceptorName(String value) {
        return new JAXBElement<String>(_PaymentRequestCardAcceptorName_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "FirstName", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestFirstName(String value) {
        return new JAXBElement<String>(_PaymentRequestFirstName_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AuthCode", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestAuthCode(String value) {
        return new JAXBElement<String>(_RefundResponseAuthCode_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "WorkPhone", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestWorkPhone(String value) {
        return new JAXBElement<String>(_PaymentRequestWorkPhone_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Email", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestEmail(String value) {
        return new JAXBElement<String>(_PaymentRequestEmail_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BudgetPeriod", scope = PaymentRequest.class)
    public JAXBElement<Integer> createPaymentRequestBudgetPeriod(Integer value) {
        return new JAXBElement<Integer>(_PaymentRequestBudgetPeriod_QNAME, Integer.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "LastName", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestLastName(String value) {
        return new JAXBElement<String>(_PaymentRequestLastName_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "TerminalID", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestTerminalID(String value) {
        return new JAXBElement<String>(_PaymentRequestTerminalID_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ShippingAddress", scope = PaymentRequest.class)
    public JAXBElement<Address> createPaymentRequestShippingAddress(Address value) {
        return new JAXBElement<Address>(_PaymentRequestShippingAddress_QNAME, Address.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ReconID", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestReconID(String value) {
        return new JAXBElement<String>(_PaymentRequestReconID_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "HomePhone", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestHomePhone(String value) {
        return new JAXBElement<String>(_PaymentRequestHomePhone_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CurrencyCode", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestCurrencyCode(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestCurrencyCode_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BillingAddress", scope = PaymentRequest.class)
    public JAXBElement<Address> createPaymentRequestBillingAddress(Address value) {
        return new JAXBElement<Address>(_PaymentRequestBillingAddress_QNAME, Address.class, PaymentRequest.class, value);
    }



  
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "MaskedCardNumber", scope = UserCard.class)
    public JAXBElement<String> createUserCardMaskedCardNumber(String value) {
        return new JAXBElement<String>(_UserCardMaskedCardNumber_QNAME, String.class, UserCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = AuthorizeResponse.class)
    public JAXBElement<String> createAuthorizeResponseSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, AuthorizeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AuthAmount", scope = AuthorizeResponse.class)
    public JAXBElement<Long> createAuthorizeResponseAuthAmount(Long value) {
        return new JAXBElement<Long>(_AuthorizeResponseAuthAmount_QNAME, Long.class, AuthorizeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AuthCode", scope = AuthorizeResponse.class)
    public JAXBElement<String> createAuthorizeResponseAuthCode(String value) {
        return new JAXBElement<String>(_RefundResponseAuthCode_QNAME, String.class, AuthorizeResponse.class, value);
    }

   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = VoidRequest.class)
    public JAXBElement<String> createVoidRequestSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, VoidRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "OrderNumber", scope = VoidRequest.class)
    public JAXBElement<String> createVoidRequestOrderNumber(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestOrderNumber_QNAME, String.class, VoidRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "TransactionDateTime", scope = VoidRequest.class)
    public JAXBElement<XMLGregorianCalendar> createVoidRequestTransactionDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateMasterPassTransactionRequestTransactionDateTime_QNAME, XMLGregorianCalendar.class, VoidRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ReconID", scope = VoidRequest.class)
    public JAXBElement<String> createVoidRequestReconID(String value) {
        return new JAXBElement<String>(_PaymentRequestReconID_QNAME, String.class, VoidRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = VoidResponse.class)
    public JAXBElement<String> createVoidResponseSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, VoidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponseSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AuthAmount", scope = PaymentResponse.class)
    public JAXBElement<Long> createPaymentResponseAuthAmount(Long value) {
        return new JAXBElement<Long>(_AuthorizeResponseAuthAmount_QNAME, Long.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AuthCode", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponseAuthCode(String value) {
        return new JAXBElement<String>(_RefundResponseAuthCode_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Card", scope = Secure3DLookupRequest.class)
    public JAXBElement<BankCard> createSecure3DLookupRequestCard(BankCard value) {
        return new JAXBElement<BankCard>(_PaymentRequestCard_QNAME, BankCard.class, Secure3DLookupRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = Secure3DLookupRequest.class)
    public JAXBElement<String> createSecure3DLookupRequestSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, Secure3DLookupRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "OrderNumber", scope = Secure3DLookupRequest.class)
    public JAXBElement<String> createSecure3DLookupRequestOrderNumber(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestOrderNumber_QNAME, String.class, Secure3DLookupRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "TransactionDateTime", scope = Secure3DLookupRequest.class)
    public JAXBElement<XMLGregorianCalendar> createSecure3DLookupRequestTransactionDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateMasterPassTransactionRequestTransactionDateTime_QNAME, XMLGregorianCalendar.class, Secure3DLookupRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ReconID", scope = Secure3DLookupRequest.class)
    public JAXBElement<String> createSecure3DLookupRequestReconID(String value) {
        return new JAXBElement<String>(_PaymentRequestReconID_QNAME, String.class, Secure3DLookupRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CurrencyCode", scope = Secure3DLookupRequest.class)
    public JAXBElement<String> createSecure3DLookupRequestCurrencyCode(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestCurrencyCode_QNAME, String.class, Secure3DLookupRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = Secure3DLookupResponse.class)
    public JAXBElement<String> createSecure3DLookupResponseSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, Secure3DLookupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AcsUrl", scope = Secure3DLookupResponse.class)
    public JAXBElement<String> createSecure3DLookupResponseAcsUrl(String value) {
        return new JAXBElement<String>(_Secure3DLookupResponseAcsUrl_QNAME, String.class, Secure3DLookupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "PAReqPayload", scope = Secure3DLookupResponse.class)
    public JAXBElement<String> createSecure3DLookupResponsePAReqPayload(String value) {
        return new JAXBElement<String>(_Secure3DLookupResponsePAReqPayload_QNAME, String.class, Secure3DLookupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "PostCode", scope = Address.class)
    public JAXBElement<String> createAddressPostCode(String value) {
        return new JAXBElement<String>(_AddressPostCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CountryCode", scope = Address.class)
    public JAXBElement<String> createAddressCountryCode(String value) {
        return new JAXBElement<String>(_AddressCountryCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_AddressCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Region", scope = Address.class)
    public JAXBElement<String> createAddressRegion(String value) {
        return new JAXBElement<String>(_AddressRegion_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Neighbourhood", scope = Address.class)
    public JAXBElement<String> createAddressNeighbourhood(String value) {
        return new JAXBElement<String>(_AddressNeighbourhood_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AddressLine1", scope = Address.class)
    public JAXBElement<String> createAddressAddressLine1(String value) {
        return new JAXBElement<String>(_AddressAddressLine1_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AddressLine2", scope = Address.class)
    public JAXBElement<String> createAddressAddressLine2(String value) {
        return new JAXBElement<String>(_AddressAddressLine2_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Card", scope = AuthorizeRequest.class)
    public JAXBElement<BankCard> createAuthorizeRequestCard(BankCard value) {
        return new JAXBElement<BankCard>(_PaymentRequestCard_QNAME, BankCard.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "MobilePhone", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestMobilePhone(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestMobilePhone_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "SaleReconID", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestSaleReconID(String value) {
        return new JAXBElement<String>(_RefundResponseSaleReconID_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "OrderNumber", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestOrderNumber(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestOrderNumber_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BankAccount", scope = AuthorizeRequest.class)
    public JAXBElement<BankAccountType> createAuthorizeRequestBankAccount(BankAccountType value) {
        return new JAXBElement<BankAccountType>(_PaymentRequestBankAccount_QNAME, BankAccountType.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "TransactionDateTime", scope = AuthorizeRequest.class)
    public JAXBElement<XMLGregorianCalendar> createAuthorizeRequestTransactionDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateMasterPassTransactionRequestTransactionDateTime_QNAME, XMLGregorianCalendar.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "PAResPayload", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestPAResPayload(String value) {
        return new JAXBElement<String>(_PaymentRequestPAResPayload_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CardAcceptorName", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestCardAcceptorName(String value) {
        return new JAXBElement<String>(_PaymentRequestCardAcceptorName_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "FirstName", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestFirstName(String value) {
        return new JAXBElement<String>(_PaymentRequestFirstName_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "AuthCode", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestAuthCode(String value) {
        return new JAXBElement<String>(_RefundResponseAuthCode_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "WorkPhone", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestWorkPhone(String value) {
        return new JAXBElement<String>(_PaymentRequestWorkPhone_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "Email", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestEmail(String value) {
        return new JAXBElement<String>(_PaymentRequestEmail_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BudgetPeriod", scope = AuthorizeRequest.class)
    public JAXBElement<Integer> createAuthorizeRequestBudgetPeriod(Integer value) {
        return new JAXBElement<Integer>(_PaymentRequestBudgetPeriod_QNAME, Integer.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "LastName", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestLastName(String value) {
        return new JAXBElement<String>(_PaymentRequestLastName_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "TerminalID", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestTerminalID(String value) {
        return new JAXBElement<String>(_PaymentRequestTerminalID_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ShippingAddress", scope = AuthorizeRequest.class)
    public JAXBElement<Address> createAuthorizeRequestShippingAddress(Address value) {
        return new JAXBElement<Address>(_PaymentRequestShippingAddress_QNAME, Address.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "ReconID", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestReconID(String value) {
        return new JAXBElement<String>(_PaymentRequestReconID_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "HomePhone", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestHomePhone(String value) {
        return new JAXBElement<String>(_PaymentRequestHomePhone_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "CurrencyCode", scope = AuthorizeRequest.class)
    public JAXBElement<String> createAuthorizeRequestCurrencyCode(String value) {
        return new JAXBElement<String>(_CreateMasterPassTransactionRequestCurrencyCode_QNAME, String.class, AuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ecentricswitch.co.za/paymentgateway/v1", name = "BillingAddress", scope = AuthorizeRequest.class)
    public JAXBElement<Address> createAuthorizeRequestBillingAddress(Address value) {
        return new JAXBElement<Address>(_PaymentRequestBillingAddress_QNAME, Address.class, AuthorizeRequest.class, value);
    }

}
