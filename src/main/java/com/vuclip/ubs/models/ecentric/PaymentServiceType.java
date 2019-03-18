
package com.vuclip.ubs.models.ecentric;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CardNotPresent"/>
 *     &lt;enumeration value="CardNotPresentRecurring"/>
 *     &lt;enumeration value="CardNotPresentMoto"/>
 *     &lt;enumeration value="CardNotPresentMotoRecurring"/>
 *     &lt;enumeration value="CardNotPresentBatch"/>
 *     &lt;enumeration value="PayD"/>
 *     &lt;enumeration value="MasterPass"/>
 *     &lt;enumeration value="WiCode"/>
 *     &lt;enumeration value="Sid"/>
 *     &lt;enumeration value="SnapScan"/>
 *     &lt;enumeration value="EftSecure"/>
 *     &lt;enumeration value="Zapper"/>
 *     &lt;enumeration value="MPGS"/>
 *     &lt;enumeration value="MPGSRecurring"/>
 *     &lt;enumeration value="MPGSMoto"/>
 *     &lt;enumeration value="MPGSMotoRecurring"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentServiceType")
@XmlEnum
public enum PaymentServiceType {


    /**
     * A real-time card not present transaction.
     * 
     */
    @XmlEnumValue("CardNotPresent")
    CARD_NOT_PRESENT("CardNotPresent"),

    /**
     * A real-time card not present transaction.
     * 
     */
    @XmlEnumValue("CardNotPresentRecurring")
    CARD_NOT_PRESENT_RECURRING("CardNotPresentRecurring"),

    /**
     * A mail order / telephone order transaction.
     * 
     */
    @XmlEnumValue("CardNotPresentMoto")
    CARD_NOT_PRESENT_MOTO("CardNotPresentMoto"),

    /**
     * A recurring mail order / telephone order transaction.
     * 
     */
    @XmlEnumValue("CardNotPresentMotoRecurring")
    CARD_NOT_PRESENT_MOTO_RECURRING("CardNotPresentMotoRecurring"),

    /**
     * A batch card not present transaction.
     * 
     */
    @XmlEnumValue("CardNotPresentBatch")
    CARD_NOT_PRESENT_BATCH("CardNotPresentBatch"),

    /**
     * A payD mobile payment transaction.
     * 
     */
    @XmlEnumValue("PayD")
    PAY_D("PayD"),

    /**
     * A MasterPass payment transaction.
     * 
     */
    @XmlEnumValue("MasterPass")
    MASTER_PASS("MasterPass"),

    /**
     * A WiCode payment transaction.
     * 
     */
    @XmlEnumValue("WiCode")
    WI_CODE("WiCode"),

    /**
     * A Sid payment transaction.
     * 
     */
    @XmlEnumValue("Sid")
    SID("Sid"),

    /**
     * A SnapScan payment transaction.
     * 
     */
    @XmlEnumValue("SnapScan")
    SNAP_SCAN("SnapScan"),

    /**
     * A EftSecure payment transaction.
     * 
     */
    @XmlEnumValue("EftSecure")
    EFT_SECURE("EftSecure"),

    /**
     * A Zapper payment transaction.
     * 
     */
    @XmlEnumValue("Zapper")
    ZAPPER("Zapper"),

    /**
     * An MPGS real time payment transaction.
     * 
     */
    MPGS("MPGS"),

    /**
     * An MPGS payment transaction.
     * 
     */
    @XmlEnumValue("MPGSRecurring")
    MPGS_RECURRING("MPGSRecurring"),

    /**
     * An MPGS payment transaction with no 3DS.
     * 
     */
    @XmlEnumValue("MPGSMoto")
    MPGS_MOTO("MPGSMoto"),

    /**
     * An recurring MPGS payment transaction with no 3DS.
     * 
     */
    @XmlEnumValue("MPGSMotoRecurring")
    MPGS_MOTO_RECURRING("MPGSMotoRecurring");
    private final String value;

    PaymentServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentServiceType fromValue(String v) {
        for (PaymentServiceType c: PaymentServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
