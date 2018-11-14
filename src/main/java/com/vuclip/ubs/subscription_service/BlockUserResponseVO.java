package com.vuclip.ubs.subscription_service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"response", "blockedUserData"})

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlockUserResponseVO {

    @JsonProperty("response")
    private Response response;
    @JsonProperty("blockedUserData")
    private BlockedUserData blockedUserData;

}
