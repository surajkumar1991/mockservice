package com.vuclip.ubs.models.codapay.init;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( name = "", propOrder = {"resultCode","txnId","resultDesc"})
@JacksonXmlRootElement(localName = "initResult")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CodapayInitResult {

    @XmlAttribute(required = true)
    private Integer resultCode;

    @XmlAttribute
    private Long txnId;

    @XmlAttribute
    private String resultDesc;
}
