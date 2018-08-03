package com.vuclip.ubs.subscription_service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserSubscriptionMapper implements RowMapper<SubscriptionStatusReponse> {
	@Override
	public SubscriptionStatusReponse mapRow(ResultSet rs, int rownumber) throws SQLException {
		SubscriptionStatusReponse s1 = new SubscriptionStatusReponse();
		Status_ s = new Status_();

		s.setActivationDate(rs.getLong("activation_date"));
		s.setChargedBillingCode(rs.getString("charged_billing_code"));
		s.setChargedPrice(rs.getDouble("charged_price"));
		s.setCountry(rs.getString("country"));
		s.setCustomerTransactionId(rs.getString("customer_transaction_id"));
		s.setDeactivationDate(rs.getLong("deactivation_date"));
		s.setEndDate(rs.getLong("end_date"));
		s.setItemId(rs.getInt("item_id")); // int(11)
		s.setItemTypeId(rs.getInt("item_type_id")); // int(11)
		s.setLastChargeDate(rs.getLong("last_charge_date"));
		s.setMode(rs.getString("mode")); // varchar(45)
		s.setMsisdn(rs.getString("msisdn")); // varchar(45)
		s.setNextBillingDate(rs.getLong("next_billing_date"));

		s.setPaid(rs.getBoolean("paid"));
		s.setPartnerId(rs.getInt("partner_id")); // int(11)
		s.setPayload(rs.getString("payload"));
		s.setProductId(rs.getInt("product_id"));
		s.setRenewalAllowed(rs.getBoolean("renewal_allowed"));
		s.setStartDate(rs.getLong("start_date"));
		s.setSubscriptionBillingCode(rs.getString("subscription_billing_code")); // varchar(45)
		s.setSubscriptionStatus(rs.getString("subscription_status")); // varchar(255)
		s.setSubscriptionId(rs.getLong("subscription_id")); // bigint(20)
		s.setSubscriptionValidityDays(rs.getInt("validity_days")); // int(11)
		s.setSummary(rs.getString("summary"));
		s.setUserId(rs.getString("user_id")); // varchar(255)
		s.setUserSubAuthKey(rs.getString("user_sub_auth_key")); // varchar(255)
		s1.setStatus(s);
		return s1;
	}
}