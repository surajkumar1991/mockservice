package com.vuclip.ubs.models.codapay.status;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.vuclip.ubs.models.codapay.init.Profile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "paymentResult")
public class CodapayInquiryPaymentResult implements Serializable {

    private static final long serialVersionUID = 3196217723533144099L;

    private String orderId;

    private Profile profile;

    private Integer resultCode;

    private String resultDesc;

    private Double totalPrice;

    private Long txnId;
}
