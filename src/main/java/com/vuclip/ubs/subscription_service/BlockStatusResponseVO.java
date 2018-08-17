package com.vuclip.ubs.subscription_service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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