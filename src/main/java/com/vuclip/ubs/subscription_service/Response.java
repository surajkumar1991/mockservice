package com.vuclip.ubs.subscription_service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

	protected boolean successful;
	protected String message;
	protected String responseCode;
}