package com.vuclip.ubs.models.codapay.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CodapayCheckStatusResponse implements Serializable {
    private static final long serialVersionUID = -1354198930561582319L;

    private SubscriptionResult subscriptionResult;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class SubscriptionResult implements Serializable {
        private static final long serialVersionUID = 9170873272947517631L;
        private Integer resultCode;

        private String resultDesc;

        private SubscriptionInfo subscriptionInfo;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SubscriptionInfo implements Serializable {
        private static final long serialVersionUID = -4186659394156607227L;
        private Integer subscriptionId;
        private String subscriptionStatus;
    }
}
