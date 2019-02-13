package com.vuclip.ubs.models.codapay.status;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class CodapayCheckStatusRequest implements Serializable {
    private static final long serialVersionUID = 171418571622302045L;

    private SubscriptionRequest subscriptionRequest;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SubscriptionRequest {
        @NotNull
        @JsonProperty("APIKey")
        private String apiKey;

        @NotNull
        private String checkStatusKey;

        @NotNull
        private String checkStatusValue;
    }

}
