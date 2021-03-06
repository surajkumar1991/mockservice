package com.vuclip.ubs.models.codapay.init;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "entry")
public class Entry implements Serializable {
    private static final long serialVersionUID = 534743229433244721L;

    private String key;
    private String value;
}
