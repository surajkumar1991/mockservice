package com.vuclip.ubs.models.codapay.init;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "items")
public class ItemInfo implements Serializable {
    private static final long serialVersionUID = 4650675605059915214L;

    @XmlElement(nillable = true)
    private String code;
    private String name;
    private Double price;
    private Integer type;
}
