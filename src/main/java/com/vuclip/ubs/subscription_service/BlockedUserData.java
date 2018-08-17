package com.vuclip.ubs.subscription_service;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlockedUserData {

	
	private BlockTypeEnum blockType;

	private Long startDate;

	private Long endDate;

}