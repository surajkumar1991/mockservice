package com.vuclip.ubs.models.codapay.init;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "initRequest")
public class CodapayInitRequest implements Serializable {

    private static final long serialVersionUID = -771656260387974564L;

    @NotBlank(message = "apiKey cannot be blank")
    private String apiKey;

    @NotBlank(message = "orderId cannot be blank")
    private String orderId;

    @NotNull(message = "Country cannot be null")
    private Integer country;

    @NotNull(message = "Currency cannot be null")
    private Integer currency;

    @NotNull(message = "payType cannot be null")
    private Integer payType;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ItemInfo> items = new ArrayList<>();

    private Profile profile;
}
