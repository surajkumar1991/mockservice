package com.vuclip.ubs.vuconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PartnerActivationConsentResponseVOMapper implements RowMapper<PartnerActivationConsentResponseVO> {

	@Override
	public PartnerActivationConsentResponseVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		PartnerActivationConsentResponseVO response = new PartnerActivationConsentResponseVO();
		response.setActivationConsentUrl(rs.getString("activationConsentUrl"));
		response.setBillingTransactionId(rs.getString("billingTransactionId"));
		response.setPartnerTransactionId(rs.getString("partnerTransactionId"));
		response.setResultVO(
				new ResultVO(rs.getString("responseCode"), rs.getString("message"), rs.getString("status")));

		return response;
	}

}
