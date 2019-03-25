package com.vuclip.ubs.models.codapay.init;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "profile")
public class Profile implements Serializable {

    private static final long serialVersionUID = 3030517323688969789L;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Entry> entry = new ArrayList<>();
}
