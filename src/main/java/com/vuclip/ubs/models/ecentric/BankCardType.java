
package com.vuclip.ubs.models.ecentric;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankCardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="Debit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankCardType")
@XmlEnum
public enum BankCardType {


    /**
     * Credit card
     * 
     */
    @XmlEnumValue("Credit")
    CREDIT("Credit"),

    /**
     * Debit card
     * 
     */
    @XmlEnumValue("Debit")
    DEBIT("Debit");
    private final String value;

    BankCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankCardType fromValue(String v) {
        for (BankCardType c: BankCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
