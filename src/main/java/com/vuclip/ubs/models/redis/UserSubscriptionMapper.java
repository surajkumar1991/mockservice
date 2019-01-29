package com.vuclip.ubs.models.redis;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserSubscriptionMapper implements RowMapper<UserSubscriptionTable> {
    @Override
    public UserSubscriptionTable mapRow(ResultSet rs, int rownumber) throws SQLException {

        UserSubscriptionTable userSubRecord = new UserSubscriptionTable();
        userSubRecord.setSubscriptionId(rs.getLong("subscription_id")); // bigint(20)
        userSubRecord.setCreatedOn(rs.getDate("created_on")); // varchar(45)
        userSubRecord.setLastUpdatedOn(rs.getDate("last_updated_on")); // varchar(45)
        userSubRecord.setActivationDate(rs.getLong("activation_date")); // datetime
        userSubRecord.setChargedBillingCode(rs.getString("charged_billing_code")); // varchar(45)
        userSubRecord.setChargedPrice(rs.getDouble("charged_price")); // double
        userSubRecord.setCircleCode(rs.getString("circle_code")); // varchar(255)
        userSubRecord.setCountry(rs.getString("country")); // varchar(255)
        userSubRecord.setCustomerTransactionId(rs.getString("customer_transaction_id")); // varchar(45)
        userSubRecord.setDeactivationDate(rs.getLong("deactivation_date")); // datetime
        userSubRecord.setEndDate(rs.getLong("end_date")); // datetime
        userSubRecord.setItemId(rs.getInt("item_id")); // int(11)
        userSubRecord.setItemTypeId(rs.getInt("item_type_id")); // int(11)
        userSubRecord.setLastChargedDate(rs.getLong("last_charge_date"));
        userSubRecord.setMode(rs.getString("mode")); // varchar(45)
        userSubRecord.setMsisdn(rs.getString("msisdn")); // varchar(45)
        userSubRecord.setNextBillingDate(rs.getLong("next_billing_date")); // datetime
        userSubRecord.setPaid(rs.getBoolean("paid")); // bit(1)
        userSubRecord.setPartnerId(rs.getInt("partner_id")); // int(11)
        userSubRecord.setProductId(rs.getInt("product_id")); // int(11)
        userSubRecord.setRenewalAllowed(rs.getBoolean("renewal_allowed")); // varchar(45)
        userSubRecord.setStartDate(rs.getLong("start_date")); // datetime
        userSubRecord.setSubscriptionBillingCode(rs.getString("subscription_billing_code")); // varchar(45)
        userSubRecord.setSubscriptionStatus(rs.getString("subscription_status")); // varchar(255)
        userSubRecord.setSubscriptionValidityDays(rs.getInt("validity_days")); // int(11)
        userSubRecord.setUserId(rs.getString("user_id")); // varchar(255)
        userSubRecord.setUserPreferredLanguage(rs.getString("user_preffered_language")); // varchar(255)
        userSubRecord.setUserSource(rs.getString("user_source")); // varchar(45)
        userSubRecord.setCurrency(rs.getString("currency"));

        return userSubRecord;
    }
}