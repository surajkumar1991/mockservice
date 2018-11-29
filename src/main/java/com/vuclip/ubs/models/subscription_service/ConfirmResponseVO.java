package com.vuclip.ubs.models.subscription_service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConfirmResponseVO {

	private boolean successful;
	private String message;
	private String responseCode;
	private SubscriptionStatusData userStatus;
}