package com.vuclip.ubs.models.codapay.init;

import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Builder
@XmlRootElement(name = "initResult")
public class CodapayInitResult {

    @XmlAttribute(required = true)
    private Integer resultCode;

    @XmlAttribute
    private Long txnId;

    @XmlAttribute
    private String resultDesc;
}
