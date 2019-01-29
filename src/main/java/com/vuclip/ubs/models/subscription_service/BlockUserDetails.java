package com.vuclip.ubs.models.subscription_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlockUserDetails {
    private String userId;

    private String msisdn;
}
