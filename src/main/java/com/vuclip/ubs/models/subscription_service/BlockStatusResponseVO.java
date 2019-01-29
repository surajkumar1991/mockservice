package com.vuclip.ubs.models.subscription_service;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
@NoArgsConstructor
public class BlockStatusResponseVO {

    private BlockedUserData blockedUserData;
    private StatusSummary blockSummary;

}