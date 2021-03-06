package com.vuclip.ubs.models.vuconnect;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PartnerActivationConsentResponseVOMapper implements RowMapper<PartnerActivationConsentResponseVO> {

    @Override
    public PartnerActivationConsentResponseVO mapRow(ResultSet rs, int rowNum) throws SQLException {

        PartnerActivationConsentResponseVO response = new PartnerActivationConsentResponseVO();
        response.setActivationConsentUrl(rs.getString("activationConsentUrl"));
        response.setBillingTransactionId(rs.getString("billingTransactionId"));
        response.setPartnerTransactionId(rs.getString("partnerTransactionId"));
        response.setResultVO(
                new ResultVO(rs.getString("responseCode"), rs.getString("message"), rs.getString("status")));
        response.setPartnerSpecificValues(null);
        response.setFormData(null);
        return response;
    }

}
