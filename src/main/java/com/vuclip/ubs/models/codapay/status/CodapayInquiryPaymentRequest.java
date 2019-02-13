package com.vuclip.ubs.models.codapay.status;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "inquiryPaymentRequest")
public class CodapayInquiryPaymentRequest implements Serializable {

    private static final long serialVersionUID = 2838154877245634860L;

    @NotNull
    private String apiKey;

    @NotNull
    private Long txnId;
}