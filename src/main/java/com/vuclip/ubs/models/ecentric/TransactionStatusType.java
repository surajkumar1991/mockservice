
package com.vuclip.ubs.models.ecentric;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionStatusType")
@XmlEnum
public enum TransactionStatusType {


    /**
     * The transaction was success.
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * The transaction failed. Please see the ResponseDetail element for more detail.
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure");
    private final String value;

    TransactionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatusType fromValue(String v) {
        for (TransactionStatusType c: TransactionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
