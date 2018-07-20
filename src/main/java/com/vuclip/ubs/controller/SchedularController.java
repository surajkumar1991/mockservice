package com.vuclip.ubs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.schedular.SchedularRequest;

@RestController
public class SchedularController {

	@Value("#{'${error.product.ids}'.split(',')}")
	List<String> productIds;
	@Value("#{'${error.partner.ids}'.split(',')}")
	List<String> partnerIds;

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public ResponseEntity<String> sendAdNotification() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

	@RequestMapping(value = "/schedular", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> schedular(@RequestBody String json) {

		System.out.println(json);
		SchedularRequest request = ObjectMapperUtils.readValueFromString(json, SchedularRequest.class);
		for (String productId : productIds) {
			if (Integer.parseInt(productId) == request.getProductId())
				return new ResponseEntity<String>(json, HttpStatus.NOT_FOUND);
		}

		for (String partnerId : partnerIds) {
			if (Integer.parseInt(partnerId) == request.getPartnerId())
				return new ResponseEntity<String>(json, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<String>(json, HttpStatus.OK);

	}

}
