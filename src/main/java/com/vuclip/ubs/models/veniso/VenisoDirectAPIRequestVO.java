package com.vuclip.ubs.models.veniso;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class VenisoDirectAPIRequestVO {

	public String action;
	public String msisdn;
	public String lang;
	public String productcode;
	public String planid;
	public String txnid;
	public String pin;
	public String wtxnid;
	public String rurl;

}