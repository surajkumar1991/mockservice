package com.vuclip.ubs.subscription_service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BlockStatusRequestVO {

	private String userId;

	private String msisdn;

	@NotNull(message = "productId can not be empty")
	@Min(value = 1, message = "productId must be positive Integer")
	private int productId;

	@NotNull(message = "userId can not be partnerId")
	@Min(value = 1, message = "partnerId must be positive Integer")
	private int partnerId;

	@NotNull(message = "country can not be null")
	@NotBlank(message = "country can not be empty")
	private String country;

}