package com.vuclip.ubs.subscription_service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {

	protected boolean successful;
	protected String message;
	protected String responseCode;
}