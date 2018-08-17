package com.vuclip.ubs.subscription_service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Akash Kadam
 *
 */
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlockUserResponseVO{

	Response response;
	
	BlockedUserData blockedUserData;
}