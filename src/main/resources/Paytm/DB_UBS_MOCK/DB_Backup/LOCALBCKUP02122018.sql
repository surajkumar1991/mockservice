-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.24 - MySQL Community Server (GPL)
-- Server OS:                    Linux
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for ubs_mock_services
CREATE DATABASE IF NOT EXISTS `ubs_mock_services` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ubs_mock_services`;

-- Dumping structure for table ubs_mock_services.block
CREATE TABLE IF NOT EXISTS `block` (
  `user_id` varchar(45) NOT NULL,
  `msisdn` varchar(45) NOT NULL,
  `json` json NOT NULL,
  PRIMARY KEY (`user_id`,`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.block: ~10 rows (approximately)
/*!40000 ALTER TABLE `block` DISABLE KEYS */;
INSERT INTO `block` (`user_id`, `msisdn`, `json`) VALUES
	('111111', '111111', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567890', '1234567890', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567891', '1234567891', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567893', '1234567893', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567902', '1234567902', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567903', '1234567903', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567904', '1234567904', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567905', '1234567905', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('1234567906', '1234567906', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}'),
	('222222', '222222', '{"response": {"message": "success", "successful": true, "responseCode": "200"}, "blockedUserData": {"endDate": 1536990135000, "blockType": "BLACKLIST", "startDate": 1534398135000}}');
/*!40000 ALTER TABLE `block` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.block_status
CREATE TABLE IF NOT EXISTS `block_status` (
  `user_id` varchar(45) NOT NULL,
  `msisdn` varchar(45) NOT NULL,
  `json` json NOT NULL,
  PRIMARY KEY (`user_id`,`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.block_status: ~15 rows (approximately)
/*!40000 ALTER TABLE `block_status` DISABLE KEYS */;
INSERT INTO `block_status` (`user_id`, `msisdn`, `json`) VALUES
	('110', '110', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('111111', '111111', '{"blockSummary": "BLACK_LISTED", "blockedUserData": {"endDate": 1537089227000, "blockType": "BLACKLIST", "startDate": 1534497227000}}'),
	('1234567890', '1234567890', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567892', '1234567892', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567893', '1234567893', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567894', '1234567894', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567895', '1234567895', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567896', '1234567896', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567897', '1234567897', '{"blockSummary": "BLACK_LISTED", "blockedUserData": {"endDate": 1537089227000, "blockType": "BLACKLIST", "startDate": 1534497227000}}'),
	('1234567898', '1234567898', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567899', '1234567899', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567900', '1234567900', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567901', '1234567901', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('1234567902', '1234567902', '{"blockSummary": "NOT_BLACKLISTED", "blockedUserData": null}'),
	('222222', '222222', '{"blockSummary": "BLACK_LISTED", "blockedUserData": {"endDate": 1537089227000, "blockType": "BLACKLIST", "startDate": 1534497227000}}');
/*!40000 ALTER TABLE `block_status` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.consent_data
CREATE TABLE IF NOT EXISTS `consent_data` (
  `user_id` varchar(45) NOT NULL,
  `msisdn` varchar(45) NOT NULL,
  `activationConsentUrl` varchar(455) DEFAULT NULL,
  `billingTransactionId` varchar(455) DEFAULT NULL,
  `partnerTransactionId` varchar(455) DEFAULT NULL,
  `responseCode` varchar(455) DEFAULT NULL,
  `message` varchar(455) DEFAULT NULL,
  `status` varchar(455) DEFAULT NULL,
  PRIMARY KEY (`user_id`,`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.consent_data: ~10 rows (approximately)
/*!40000 ALTER TABLE `consent_data` DISABLE KEYS */;
INSERT INTO `consent_data` (`user_id`, `msisdn`, `activationConsentUrl`, `billingTransactionId`, `partnerTransactionId`, `responseCode`, `message`, `status`) VALUES
	('', '', NULL, NULL, NULL, NULL, NULL, NULL),
	('110', '110', 'sfasf', 'asdfaf', 'asdfasdf', 'PL001', 'SUCCESS', 'true'),
	('1234567890', '1234567890', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', 'act init user', 'act init user', 'PL001', 'SUCCESS', 'true'),
	('1234567891', '1234567891', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', 'new user', 'new user', 'PL001', 'SUCCESS', 'true'),
	('1234567892', '1234567892', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', 'activated user', 'activated user', 'PL001', 'SUCCESS', 'true'),
	('1234567893', '1234567893', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', 'deactivated', 'deactivated', 'PL001', 'SUCCESS', 'true'),
	('1234567898', '1234567898', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', 'act user without validity', 'act user witout validity', 'PL001', 'SUCCESS', 'true'),
	('1234567899', '1234567899', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', 'activation in progress', 'activation in progress', 'PL001', 'Activation in progress.', 'true'),
	('1234567900', '1234567900', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', 'deactivated without validity', 'deactivated without validity', 'PL001', 'SUCCESS', 'true'),
	('1234567901', '1234567901', 'http://35.192.236.11:8080/ubsdemo/consent.jsp?billingCode=b1&cgImageUrl=http%3A%2F%2Fwww.google.com%2F&msisdn=997505060&url=http%3A%2F%2F64.71.156.241%2Fbaas%2FCGController%2FconsentParser%2F58%3Ftransid%3DTX20171218102625772553&transactionId=TRANSACTION_KEY201806191536027', ' deactivated with validity', 'deactivated with validity', 'PL001', 'SUCCESS', 'true');
/*!40000 ALTER TABLE `consent_data` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.deactivate
CREATE TABLE IF NOT EXISTS `deactivate` (
  `user_id` varchar(45) NOT NULL,
  `msisdn` varchar(45) NOT NULL,
  `json` json NOT NULL,
  PRIMARY KEY (`user_id`,`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.deactivate: ~9 rows (approximately)
/*!40000 ALTER TABLE `deactivate` DISABLE KEYS */;
INSERT INTO `deactivate` (`user_id`, `msisdn`, `json`) VALUES
	('111111', '111111', '{"blockSummary": "BLACK_LISTED", "blockedUserData": {"endDate": 1537089227000, "blockType": "BLACKLIST", "startDate": 1534497227000}}'),
	('1234567890', '1234567890', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567890", "userId": "1234567890", "country": "IN", "endDate": 1535018434000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1534934374000, "itemTypeId": 12, "userSource": "D_KIM_58478584", "chargedPrice": 0, "activationDate": 1534934374000, "lastChargeDate": null, "renewalAllowed": false, "subscriptionId": 1234567890, "userSubAuthKey": null, "nextBillingDate": 1549449574828, "deactivationDate": null, "chargedBillingCode": "4-2-IN-230-1533210333043", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "4-2-IN-230-1533210333043", "subscriptionValidityDays": 168}, "message": "Success", "successful": true, "responseCode": "SUCCESS"}'),
	('1234567893', '1234567893', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567893", "userId": "1234567893", "country": "IN", "endDate": 1535018434000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1534934374000, "itemTypeId": 12, "userSource": "D_KIM_58478584", "chargedPrice": 0, "activationDate": 1534934374000, "lastChargeDate": null, "renewalAllowed": false, "subscriptionId": 1234567893, "userSubAuthKey": null, "nextBillingDate": 1549449574828, "deactivationDate": null, "chargedBillingCode": "4-2-IN-230-1533210333043", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "4-2-IN-230-1533210333043", "subscriptionValidityDays": 168}, "message": "Already blacklisted", "successful": false, "responseCode": "AB008"}'),
	('1234567902', '1234567902', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567902", "userId": "1234567902", "country": "IN", "endDate": 1535018434000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1534934374000, "itemTypeId": 12, "userSource": "D_KIM_58478584", "chargedPrice": 0, "activationDate": 1534934374000, "lastChargeDate": null, "renewalAllowed": false, "subscriptionId": 1234567902, "userSubAuthKey": null, "nextBillingDate": 1549449574828, "deactivationDate": null, "chargedBillingCode": "4-2-IN-230-1533210333043", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "4-2-IN-230-1533210333043", "subscriptionValidityDays": 168}, "message": "Success", "successful": true, "responseCode": "SUCCESS"}'),
	('1234567903', '1234567903', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567903", "userId": "1234567903", "country": "IN", "endDate": 1535018434000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1534934374000, "itemTypeId": 12, "userSource": "D_KIM_58478584", "chargedPrice": 0, "activationDate": 1534934374000, "lastChargeDate": null, "renewalAllowed": false, "subscriptionId": 1234567903, "userSubAuthKey": null, "nextBillingDate": 1549449574828, "deactivationDate": null, "chargedBillingCode": "4-2-IN-230-1533210333043", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "4-2-IN-230-1533210333043", "subscriptionValidityDays": 168}, "message": "Success", "successful": true, "responseCode": "SUCCESS"}'),
	('1234567904', '1234567904', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567904", "userId": "1234567904", "country": "IN", "endDate": 1535018434000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1534934374000, "itemTypeId": 12, "userSource": "D_KIM_58478584", "chargedPrice": 0, "activationDate": 1534934374000, "lastChargeDate": null, "renewalAllowed": false, "subscriptionId": 1234567904, "userSubAuthKey": null, "nextBillingDate": 1549449574828, "deactivationDate": null, "chargedBillingCode": "4-2-IN-230-1533210333043", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "4-2-IN-230-1533210333043", "subscriptionValidityDays": 168}, "message": "Success", "successful": true, "responseCode": "SUCCESS"}'),
	('1234567905', '1234567905', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567905", "userId": "1234567905", "country": "IN", "endDate": 1535018434000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1534934374000, "itemTypeId": 12, "userSource": "D_KIM_58478584", "chargedPrice": 0, "activationDate": 1534934374000, "lastChargeDate": null, "renewalAllowed": false, "subscriptionId": 1234567905, "userSubAuthKey": null, "nextBillingDate": 1549449574828, "deactivationDate": null, "chargedBillingCode": "4-2-IN-230-1533210333043", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "4-2-IN-230-1533210333043", "subscriptionValidityDays": 168}, "message": "Success", "successful": true, "responseCode": "SUCCESS"}'),
	('1234567906', '1234567906', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567906", "userId": "1234567906", "country": "IN", "endDate": 1535018434000, "payload": null, "summary": "INACTIVE", "partnerId": 1, "productId": 1, "startDate": 1534934374000, "itemTypeId": 12, "userSource": "D_KIM_58478584", "chargedPrice": 0, "activationDate": 1534934374000, "lastChargeDate": null, "renewalAllowed": false, "subscriptionId": 1234567906, "userSubAuthKey": null, "nextBillingDate": 1549449574828, "deactivationDate": null, "chargedBillingCode": "4-2-IN-230-1533210333043", "subscriptionStatus": "DEACTIVATED", "customerTransactionId": null, "subscriptionBillingCode": "4-2-IN-230-1533210333043", "subscriptionValidityDays": 168}, "message": "Success", "successful": true, "responseCode": "SUCCESS"}'),
	('222222', '222222', '{"blockSummary": "BLACK_LISTED", "blockedUserData": {"endDate": 1537089227000, "blockType": "BLACKLIST", "startDate": 1534497227000}}');
/*!40000 ALTER TABLE `deactivate` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.free_trial_history
CREATE TABLE IF NOT EXISTS `free_trial_history` (
  `user_id` varchar(45) NOT NULL,
  `subscription_id` bigint(20) DEFAULT NULL,
  `msisdn` varchar(45) NOT NULL,
  `json` json DEFAULT NULL,
  PRIMARY KEY (`user_id`,`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.free_trial_history: ~1 rows (approximately)
/*!40000 ALTER TABLE `free_trial_history` DISABLE KEYS */;
INSERT INTO `free_trial_history` (`user_id`, `subscription_id`, `msisdn`, `json`) VALUES
	('', NULL, '', NULL);
/*!40000 ALTER TABLE `free_trial_history` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.paypal_auth
CREATE TABLE IF NOT EXISTS `paypal_auth` (
  `key` varchar(100) NOT NULL DEFAULT '',
  `json` json DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.paypal_auth: ~1 rows (approximately)
/*!40000 ALTER TABLE `paypal_auth` DISABLE KEYS */;
INSERT INTO `paypal_auth` (`key`, `json`) VALUES
	('paypal_access_token', '{"nonce": "2018-11-14T12:21:30ZF9GziGRhTxxl4bTeOdjzuO3f3ien17ltnFXAAjxQBgo", "scope": "https://api.paypal.com/v1/payments/.* https://uri.paypal.com/services/payments/refund https://uri.paypal.com/services/applications/webhooks https://uri.paypal.com/services/payments/payment/authcapture https://uri.paypal.com/payments/payouts https://api.paypal.com/v1/vault/credit-card/.* https://uri.paypal.com/services/disputes/read-seller https://uri.paypal.com/services/subscriptions https://uri.paypal.com/services/disputes/read-buyer https://api.paypal.com/v1/vault/credit-card openid https://uri.paypal.com/services/disputes/update-seller https://uri.paypal.com/services/payments/realtimepayment", "app_id": "APP-59D52778JR410243H", "expires_in": 90000, "token_type": "Bearer", "access_token": "A21AAGL2a1cmTnMRJmiIUouY7ZNKdlotCX1RhWeb3Rok_tV-hmoyfp0XWeG625kHNCAJTLUmdYDseBBNsIRgorFGcUVrajaxQ"}');
/*!40000 ALTER TABLE `paypal_auth` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.paypal_create_agreement
CREATE TABLE IF NOT EXISTS `paypal_create_agreement` (
  `billing_id` varchar(100) NOT NULL DEFAULT '',
  `billing_type` varchar(100) NOT NULL DEFAULT '',
  `id` varchar(100) NOT NULL DEFAULT '',
  `json` json DEFAULT NULL,
  PRIMARY KEY (`billing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.paypal_create_agreement: ~3 rows (approximately)
/*!40000 ALTER TABLE `paypal_create_agreement` DISABLE KEYS */;
INSERT INTO `paypal_create_agreement` (`billing_id`, `billing_type`, `id`, `json`) VALUES
	('1-3-AE-0-1542191810506', 'COMMON8', 'P-23X81250HC494073VZ5CB4OI', '{"name": "Create Agreement", "plan": {"id": "P-23X81250HC494073VZ5CB4OI", "name": "Plan with Regular and Trial Payment Definitions", "type": "INFINITE", "state": "ACTIVE", "description": "Plan with regular and trial payment definitions.", "payment_definitions": [{"id": "P-23X81250HC494073VZ5CB4OI", "name": "Regular payment definition", "type": "REGULAR", "amount": {"value": "1", "currency": "USD"}, "cycles": "0", "frequency": "Day", "frequency_interval": "1"}, {"id": "P-23X81250HC494073VZ5CB4OI", "name": "Trial payment definition", "type": "TRIAL", "amount": {"value": "0", "currency": "USD"}, "cycles": "1", "frequency": "Day", "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0", "currency": "USD"}, "cancel_url": "https://ubs-stg.vuclip.com/ubs/paypal/cancel/paypalCallBack", "return_url": "https://ubs-stg.vuclip.com/ubs/paypal/paypalCallBack", "auto_bill_amount": "NO", "max_fail_attempts": "1", "initial_fail_amount_action": "CANCEL"}}, "links": [{"rel": "approval_url", "href": "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=REPLACETOKENSTRINGTEST", "method": "REDIRECT"}, {"rel": "execute", "href": "https://api.sandbox.paypal.com/v1/payments/billing-agreements/REPLACETOKENSTRINGTEST/agreement-execute", "method": "POST"}], "start_date": "2018-11-15T12:19:06Z", "description": "PayPal Free"}'),
	('1-3-AE-799-1542191810533', 'DP8', 'P-4EM31884CF380842MZ5C6XJI', '{"name": "Create Agreement", "plan": {"id": "P-4EM31884CF380842MZ5C6XJI", "name": "Plan with Regular and Trial Payment Definitions", "type": "INFINITE", "state": "ACTIVE", "description": "Plan with regular and trial payment definitions.", "payment_definitions": [{"id": "P-4EM31884CF380842MZ5C6XJI", "name": "Regular payment definition", "type": "REGULAR", "amount": {"value": "1", "currency": "USD"}, "cycles": "0", "frequency": "Day", "frequency_interval": "1"}, {"id": "P-4EM31884CF380842MZ5C6XJI", "name": "Trial payment definition", "type": "TRIAL", "amount": {"value": "0", "currency": "USD"}, "cycles": "1", "frequency": "Day", "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0", "currency": "USD"}, "cancel_url": "https://ubs-stg.vuclip.com/ubs/paypal/cancel/paypalCallBack", "return_url": "https://ubs-stg.vuclip.com/ubs/paypal/paypalCallBack", "auto_bill_amount": "NO", "max_fail_attempts": "1", "initial_fail_amount_action": "CANCEL"}}, "links": [{"rel": "approval_url", "href": "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=REPLACETOKENSTRINGTEST", "method": "REDIRECT"}, {"rel": "execute", "href": "https://api.sandbox.paypal.com/v1/payments/billing-agreements/REPLACETOKENSTRINGTEST/agreement-execute", "method": "POST"}], "start_date": "2018-11-15T12:19:06Z", "description": "PayPal Free"}'),
	('1-3-SA-799-1542265367821', 'COMMONS8', 'P-00K81743LM532961BJ4FUWWQ', '{"name": "Create Agreement", "plan": {"id": "P-00K81743LM532961BJ4FUWWQ", "name": "Plan with Regular and Trial Payment Definitions", "type": "INFINITE", "state": "ACTIVE", "description": "Plan with regular and trial payment definitions.", "payment_definitions": [{"id": "P-00K81743LM532961BJ4FUWWQ", "name": "Regular payment definition", "type": "REGULAR", "amount": {"value": "1", "currency": "USD"}, "cycles": "0", "frequency": "Day", "frequency_interval": "1"}, {"id": "P-00K81743LM532961BJ4FUWWQ", "name": "Trial payment definition", "type": "TRIAL", "amount": {"value": "0", "currency": "USD"}, "cycles": "1", "frequency": "Day", "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0", "currency": "USD"}, "cancel_url": "https://ubs-stg.vuclip.com/ubs/paypal/cancel/paypalCallBack", "return_url": "https://ubs-stg.vuclip.com/ubs/paypal/paypalCallBack", "auto_bill_amount": "NO", "max_fail_attempts": "1", "initial_fail_amount_action": "CANCEL"}}, "links": [{"rel": "approval_url", "href": "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=REPLACETOKENSTRINGTEST", "method": "REDIRECT"}, {"rel": "execute", "href": "https://api.sandbox.paypal.com/v1/payments/billing-agreements/REPLACETOKENSTRINGTEST/agreement-execute", "method": "POST"}], "start_date": "2018-11-15T12:19:06Z", "description": "PayPal Free"}');
/*!40000 ALTER TABLE `paypal_create_agreement` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.paypal_execute_agreement
CREATE TABLE IF NOT EXISTS `paypal_execute_agreement` (
  `billing_Type` varchar(100) NOT NULL DEFAULT '',
  `json` json DEFAULT NULL,
  PRIMARY KEY (`billing_Type`),
  UNIQUE KEY `user_id_UNIQUE` (`billing_Type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.paypal_execute_agreement: ~3 rows (approximately)
/*!40000 ALTER TABLE `paypal_execute_agreement` DISABLE KEYS */;
INSERT INTO `paypal_execute_agreement` (`billing_Type`, `json`) VALUES
	('COMMON8', '{"id": "REPLACETOKENSTRINGTEST", "plan": {"currency_code": "USD", "payment_definitions": [{"type": "TRIAL", "amount": {"value": "0.00"}, "cycles": "1", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}, {"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/payments/billing-agreements/REPLACETOKENSTRINGTEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "Active", "start_date": "2018-11-14T20:00:00Z", "description": "PayPal Free", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"cycles_completed": "0", "cycles_remaining": "1", "next_billing_date": "2018-11-15T10:00:00Z", "final_payment_date": "1970-01-01T00:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0"}}'),
	('COMMONS8', '{"id": "REPLACETOKENSTRINGTEST", "plan": {"currency_code": "USD", "payment_definitions": [{"type": "TRIAL", "amount": {"value": "0.00"}, "cycles": "1", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}, {"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/payments/billing-agreements/REPLACETOKENSTRINGTEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "Active", "start_date": "2018-11-14T20:00:00Z", "description": "PayPal Free", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"cycles_completed": "0", "cycles_remaining": "1", "next_billing_date": "2018-11-15T10:00:00Z", "final_payment_date": "1970-01-01T00:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0"}}'),
	('DP8', '{"id": "REPLACETOKENSTRINGTEST", "plan": {"currency_code": "USD", "payment_definitions": [{"type": "TRIAL", "amount": {"value": "0.00"}, "cycles": "1", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}, {"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/payments/billing-agreements/REPLACETOKENSTRINGTEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "Active", "start_date": "2018-11-14T20:00:00Z", "description": "PayPal Free", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"cycles_completed": "0", "cycles_remaining": "1", "next_billing_date": "2018-11-15T10:00:00Z", "final_payment_date": "1970-01-01T00:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0"}}');
/*!40000 ALTER TABLE `paypal_execute_agreement` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.paytm_renewal
CREATE TABLE IF NOT EXISTS `paytm_renewal` (
  `user_id` varchar(100) NOT NULL,
  `order_id` varchar(100) NOT NULL,
  `json` json DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `order_id_UNIQUE` (`order_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.paytm_renewal: ~1 rows (approximately)
/*!40000 ALTER TABLE `paytm_renewal` DISABLE KEYS */;
INSERT INTO `paytm_renewal` (`user_id`, `order_id`, `json`) VALUES
	('9900000011', 'testOrder9900000011', '{"MID": "Vuclip71864611141257", "TXNID": "20181027111212800110168091842868716", "STATUS": "TXN_ACCEPTED", "ORDERID": "willsetincontroller", "RESPMSG": "Subscription Txn accepted.", "SUBS_ID": "100003113045", "RESPCODE": "900", "TXNAMOUNT": "99.00", "CHECKSUMHASH": "U6Dbh30AFezF1rbNjyUwxkGzOahj/mZcXm2amal7kjjjygUODptWYvEh/l1DoiJ0PC8kDm5ULYov+/WVgoddDNrSeJWfRkHaXawTq0huDBM="}');
/*!40000 ALTER TABLE `paytm_renewal` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.paytm_status
CREATE TABLE IF NOT EXISTS `paytm_status` (
  `user_id` varchar(100) NOT NULL,
  `order_id` varchar(100) NOT NULL,
  `json` json DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `order_id_UNIQUE` (`order_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.paytm_status: ~4 rows (approximately)
/*!40000 ALTER TABLE `paytm_status` DISABLE KEYS */;
INSERT INTO `paytm_status` (`user_id`, `order_id`, `json`) VALUES
	('9900000001', 'testOrder9900000001', '{"MID": "Vuclip71864611141257", "TXNID": "19900000001", "STATUS": "TXN_SUCCESS", "ORDERID": "getttingsetincontroller", "RESPMSG": "Txn Success", "SUBS_ID": "19900000001", "TXNDATE": "2012-11-09 02:10:29.742447", "TXNTYPE": "SALE", "BANKNAME": "WALLET", "RESPCODE": "01", "BANKTXNID": "19900000001", "TXNAMOUNT": "99.00", "REFUNDAMT ": "1", "GATEWAYNAME": "WALLET", "PAYMENTMODE": "CC"}'),
	('9900000002', 'testOrder9900000002', '{"MID": "Vuclip71864611141257", "TXNID": "29900000002", "STATUS": "TXN_FAILURE", "ORDERID": "testOrder9900000002", "RESPMSG": "Txn Failed.", "SUBS_ID": "29900000002", "TXNDATE": "2012-11-09 02:10:29.742447", "TXNTYPE": "SALE", "BANKNAME": "WALLET", "RESPCODE": "227", "BANKTXNID": "29900000002", "TXNAMOUNT": "1", "REFUNDAMT ": "1", "GATEWAYNAME": "WALLET", "PAYMENTMODE": "CC"}'),
	('9900000003', 'testOrder9900000003', '{"MID": "Vuclip71864611141257", "TXNID": "39900000003", "STATUS": "TXN_PENDING", "ORDERID": "testOrder9900000003", "RESPMSG": "Txn Pending.", "SUBS_ID": "39900000003", "TXNDATE": "2012-11-09 02:10:29.742447", "TXNTYPE": "SALE", "BANKNAME": "WALLET", "RESPCODE": "06", "BANKTXNID": "39900000003", "TXNAMOUNT": "1", "REFUNDAMT ": "1", "GATEWAYNAME": "WALLET", "PAYMENTMODE": "CC"}'),
	('9900000011', 'testOrder9900000011', '{"MID": "Vuclip71864611141257", "TXNID": "119900000011", "STATUS": "TXN_SUCCESS", "ORDERID": "testOrder9900000011", "RESPMSG": "Txn Success..", "SUBS_ID": "119900000011", "TXNDATE": "2012-11-09 02:10:29.742447", "TXNTYPE": "SALE", "BANKNAME": "WALLET", "RESPCODE": "01", "BANKTXNID": "119900000011", "TXNAMOUNT": "1", "REFUNDAMT ": "1", "GATEWAYNAME": "WALLET", "PAYMENTMODE": "CC"}');
/*!40000 ALTER TABLE `paytm_status` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.unblock
CREATE TABLE IF NOT EXISTS `unblock` (
  `user_id` varchar(45) NOT NULL,
  `msisdn` varchar(45) NOT NULL,
  `json` json NOT NULL,
  PRIMARY KEY (`user_id`,`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.unblock: ~2 rows (approximately)
/*!40000 ALTER TABLE `unblock` DISABLE KEYS */;
INSERT INTO `unblock` (`user_id`, `msisdn`, `json`) VALUES
	('21234567890', '21234567890', '{"response": {"message": "success", "successful": true, "responseCode": "200"}}'),
	('21234567891', '21234567891', '{"response": {"message": "success", "successful": true, "responseCode": "200"}}');
/*!40000 ALTER TABLE `unblock` ENABLE KEYS */;

-- Dumping structure for table ubs_mock_services.user_subscription
CREATE TABLE IF NOT EXISTS `user_subscription` (
  `user_id` varchar(45) NOT NULL,
  `subscription_id` bigint(20) DEFAULT NULL,
  `msisdn` varchar(45) NOT NULL,
  `json` json DEFAULT NULL,
  PRIMARY KEY (`user_id`,`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_mock_services.user_subscription: ~10 rows (approximately)
/*!40000 ALTER TABLE `user_subscription` DISABLE KEYS */;
INSERT INTO `user_subscription` (`user_id`, `subscription_id`, `msisdn`, `json`) VALUES
	('1234567890', 1234567890, '1234567890', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567890", "userId": "1234567890", "country": "IN", "endDate": 1525087547000, "payload": null, "summary": "ACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567890, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "ACT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567892', 1234567892, '1234567892', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567892", "userId": "1234567892", "country": "IN", "endDate": 1545087547000, "payload": null, "summary": "ACTIVE", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567892, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "ACTIVATED", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567893', 1234567893, '1234567893', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567893", "userId": "1234567893", "country": "IN", "endDate": 1525087547000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567893, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567899', 1234567899, '1234567899', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "110", "userId": "110", "country": "IN", "endDate": 9925087547000, "payload": null, "summary": "ACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1709028, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "ACT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567902', 1234567902, '1234567902', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567902", "userId": "1234567902", "country": "IN", "endDate": 9925087547000, "payload": null, "summary": "ACTIVE", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567902, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "ACTIVATED", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567903', 1234567903, '1234567903', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567903", "userId": "1234567903", "country": "IN", "endDate": 9925087547000, "payload": null, "summary": "ACTIVE", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567903, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "PARKING", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567904', 1234567904, '1234567904', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567904", "userId": "1234567904", "country": "IN", "endDate": 9925087547000, "payload": null, "summary": "ACTIVE", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567904, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "SUSPEND", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567905', 1234567905, '1234567905', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567905", "userId": "1234567905", "country": "IN", "endDate": 9925087547000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567905, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('1234567906', 1234567906, '1234567906', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "1234567906", "userId": "1234567906", "country": "IN", "endDate": 9925087547000, "payload": null, "summary": "INACTIVE", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567906, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "DEACTIVATED", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}'),
	('220', 220, '220', '{"status": {"mode": "WAP", "paid": false, "itemId": 1, "msisdn": "220", "userId": "220", "country": "IN", "endDate": 9925087547000, "payload": null, "summary": "DEACTIVATION_IN_PROGRESS", "partnerId": 1, "productId": 1, "startDate": 1524087547000, "itemTypeId": 1, "userSource": "D_ABC_KIM", "chargedPrice": 0, "activationDate": 1534758227000, "lastChargeDate": null, "renewalAllowed": true, "subscriptionId": 1234567905, "userSubAuthKey": null, "nextBillingDate": 1530253086000, "deactivationDate": null, "chargedBillingCode": "b1", "subscriptionStatus": "DCT_INIT", "customerTransactionId": null, "subscriptionBillingCode": "b1", "subscriptionValidityDays": 30}, "message": "success", "successful": true, "responseCode": "200"}');
/*!40000 ALTER TABLE `user_subscription` ENABLE KEYS */;


-- Dumping database structure for ubs_test_data_service
CREATE DATABASE IF NOT EXISTS `ubs_test_data_service` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ubs_test_data_service`;

-- Dumping structure for table ubs_test_data_service.paypal_step_immediate_notification
CREATE TABLE IF NOT EXISTS `paypal_step_immediate_notification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) NOT NULL,
  `eventType` varchar(150) NOT NULL,
  `state` varchar(50) NOT NULL DEFAULT '',
  `jsonData` mediumtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.paypal_step_immediate_notification: ~7 rows (approximately)
/*!40000 ALTER TABLE `paypal_step_immediate_notification` DISABLE KEYS */;
INSERT INTO `paypal_step_immediate_notification` (`id`, `userId`, `eventType`, `state`, `jsonData`) VALUES
	(1, '8900000004', 'BILLING.SUBSCRIPTION.CANCELLED', 'Cancelled', '{"id": "WH-1BH49103JU832412H-1NW79975237681809", "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/ ", "method": "GET"}, {"rel": "resend", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-1BH49103JU832412H-1NW79975237681809/resend", "method": "POST"}], "summary": "A billing subscription was created", "resource": {"id": "ID_TO_REPLACE_IN_TEST", "plan": {"links": [], "curr_code": "USD", "payment_definitions": [{"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "api.sandbox.paypal.com/v1/payments/billing-agreements/ID_TO_REPLACE_IN_TEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "STATE_TO_REPLACE_IN_TEST", "start_date": "2018-10-25T20:00:00Z", "description": "Create PayPal payment agreement.", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"next_billing_date": "2018-10-26T10:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0", "num_cycles_completed": "0", "num_cycles_remaining": "0", "final_payment_due_date": "1970-01-01T00:00:00Z"}}, "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST", "create_time": "2018-10-25T05:19:09.892Z", "event_version": "1.0", "resource_type": "Agreement"}'),
	(2, '8900000003', 'BILLING.SUBSCRIPTION.CREATED', 'Active', '{"id": "WH-1BH49103JU832412H-1NW79975237681809", "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/ ", "method": "GET"}, {"rel": "resend", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-1BH49103JU832412H-1NW79975237681809/resend", "method": "POST"}], "summary": "A billing subscription was created", "resource": {"id": "ID_TO_REPLACE_IN_TEST", "plan": {"links": [], "curr_code": "USD", "payment_definitions": [{"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "api.sandbox.paypal.com/v1/payments/billing-agreements/ID_TO_REPLACE_IN_TEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "STATE_TO_REPLACE_IN_TEST", "start_date": "2018-10-25T20:00:00Z", "description": "Create PayPal payment agreement.", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"next_billing_date": "2018-10-26T10:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0", "num_cycles_completed": "0", "num_cycles_remaining": "0", "final_payment_due_date": "1970-01-01T00:00:00Z"}}, "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST", "create_time": "2018-10-25T05:19:09.892Z", "event_version": "1.0", "resource_type": "Agreement"}'),
	(8, '8900000001', 'BILLING.SUBSCRIPTION.CREATED', 'Active', '{"id": "WH-1BH49103JU832412H-1NW79975237681809", "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/ ", "method": "GET"}, {"rel": "resend", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-1BH49103JU832412H-1NW79975237681809/resend", "method": "POST"}], "summary": "A billing subscription was created", "resource": {"id": "ID_TO_REPLACE_IN_TEST", "plan": {"links": [], "curr_code": "USD", "payment_definitions": [{"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "api.sandbox.paypal.com/v1/payments/billing-agreements/ID_TO_REPLACE_IN_TEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "STATE_TO_REPLACE_IN_TEST", "start_date": "2018-10-25T20:00:00Z", "description": "Create PayPal payment agreement.", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"next_billing_date": "2018-10-26T10:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0", "num_cycles_completed": "0", "num_cycles_remaining": "0", "final_payment_due_date": "1970-01-01T00:00:00Z"}}, "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST", "create_time": "2018-10-25T05:19:09.892Z", "event_version": "1.0", "resource_type": "Agreement"}'),
	(9, '8900000005', 'BILLING.SUBSCRIPTION.CANCELLED', 'Cancelled', '{"id": "WH-1BH49103JU832412H-1NW79975237681809", "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/ ", "method": "GET"}, {"rel": "resend", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-1BH49103JU832412H-1NW79975237681809/resend", "method": "POST"}], "summary": "A billing subscription was created", "resource": {"id": "ID_TO_REPLACE_IN_TEST", "plan": {"links": [], "curr_code": "USD", "payment_definitions": [{"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "api.sandbox.paypal.com/v1/payments/billing-agreements/ID_TO_REPLACE_IN_TEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "STATE_TO_REPLACE_IN_TEST", "start_date": "2018-10-25T20:00:00Z", "description": "Create PayPal payment agreement.", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"next_billing_date": "2018-10-26T10:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0", "num_cycles_completed": "0", "num_cycles_remaining": "0", "final_payment_due_date": "1970-01-01T00:00:00Z"}}, "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST", "create_time": "2018-10-25T05:19:09.892Z", "event_version": "1.0", "resource_type": "Agreement"}'),
	(10, '8700000003', 'BILLING.SUBSCRIPTION.CREATED', 'Active', '{"id": "WH-1BH49103JU832412H-1NW79975237681809", "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/ ", "method": "GET"}, {"rel": "resend", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-1BH49103JU832412H-1NW79975237681809/resend", "method": "POST"}], "summary": "A billing subscription was created", "resource": {"id": "ID_TO_REPLACE_IN_TEST", "plan": {"links": [], "curr_code": "USD", "payment_definitions": [{"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "api.sandbox.paypal.com/v1/payments/billing-agreements/ID_TO_REPLACE_IN_TEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "STATE_TO_REPLACE_IN_TEST", "start_date": "2018-10-25T20:00:00Z", "description": "Create PayPal payment agreement.", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"next_billing_date": "2018-10-26T10:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0", "num_cycles_completed": "0", "num_cycles_remaining": "0", "final_payment_due_date": "1970-01-01T00:00:00Z"}}, "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST", "create_time": "2018-10-25T05:19:09.892Z", "event_version": "1.0", "resource_type": "Agreement"}'),
	(11, '8700000004', 'BILLING.SUBSCRIPTION.CANCELLED', 'Cancelled', '{"id": "WH-1BH49103JU832412H-1NW79975237681809", "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/ ", "method": "GET"}, {"rel": "resend", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-1BH49103JU832412H-1NW79975237681809/resend", "method": "POST"}], "summary": "A billing subscription was created", "resource": {"id": "ID_TO_REPLACE_IN_TEST", "plan": {"links": [], "curr_code": "USD", "payment_definitions": [{"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "api.sandbox.paypal.com/v1/payments/billing-agreements/ID_TO_REPLACE_IN_TEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "STATE_TO_REPLACE_IN_TEST", "start_date": "2018-10-25T20:00:00Z", "description": "Create PayPal payment agreement.", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"next_billing_date": "2018-10-26T10:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0", "num_cycles_completed": "0", "num_cycles_remaining": "0", "final_payment_due_date": "1970-01-01T00:00:00Z"}}, "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST", "create_time": "2018-10-25T05:19:09.892Z", "event_version": "1.0", "resource_type": "Agreement"}'),
	(12, '8700000005', 'BILLING.SUBSCRIPTION.CANCELLED', 'Cancelled', '{"id": "WH-1BH49103JU832412H-1NW79975237681809", "links": [{"rel": "self", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/ ", "method": "GET"}, {"rel": "resend", "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-1BH49103JU832412H-1NW79975237681809/resend", "method": "POST"}], "summary": "A billing subscription was created", "resource": {"id": "ID_TO_REPLACE_IN_TEST", "plan": {"links": [], "curr_code": "USD", "payment_definitions": [{"type": "REGULAR", "amount": {"value": "1.00"}, "cycles": "0", "frequency": "Day", "charge_models": [{"type": "TAX", "amount": {"value": "0.00"}}, {"type": "SHIPPING", "amount": {"value": "0.00"}}], "frequency_interval": "1"}], "merchant_preferences": {"setup_fee": {"value": "0.00"}, "auto_bill_amount": "NO", "max_fail_attempts": "1"}}, "links": [{"rel": "self", "href": "api.sandbox.paypal.com/v1/payments/billing-agreements/ID_TO_REPLACE_IN_TEST", "method": "GET"}], "payer": {"status": "verified", "payer_info": {"email": "husein@vuclip.com", "payer_id": "AXTED9FJK4H8L", "last_name": "Sehorewala", "first_name": "Husein", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}}, "payment_method": "paypal"}, "state": "STATE_TO_REPLACE_IN_TEST", "start_date": "2018-10-25T20:00:00Z", "description": "Create PayPal payment agreement.", "shipping_address": {"city": "San Jose", "line1": "1 Main St", "state": "CA", "postal_code": "95131", "country_code": "US", "recipient_name": "Husein Sehorewala"}, "agreement_details": {"next_billing_date": "2018-10-26T10:00:00Z", "outstanding_balance": {"value": "0.00"}, "failed_payment_count": "0", "num_cycles_completed": "0", "num_cycles_remaining": "0", "final_payment_due_date": "1970-01-01T00:00:00Z"}}, "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST", "create_time": "2018-10-25T05:19:09.892Z", "event_version": "1.0", "resource_type": "Agreement"}');
/*!40000 ALTER TABLE `paypal_step_immediate_notification` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.paypal_step_notification
CREATE TABLE IF NOT EXISTS `paypal_step_notification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) NOT NULL,
  `eventType` varchar(150) NOT NULL,
  `state` varchar(50) NOT NULL DEFAULT '',
  `jsonData` mediumtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.paypal_step_notification: ~5 rows (approximately)
/*!40000 ALTER TABLE `paypal_step_notification` DISABLE KEYS */;
INSERT INTO `paypal_step_notification` (`id`, `userId`, `eventType`, `state`, `jsonData`) VALUES
	(5, '8900000006', 'PAYMENT.SALE.COMPLETED', 'completed', '{\n  "id": "WH-6U334972EY960674U-3HB23832P8520331Y",\n  "event_version": "1.0",\n  "create_time": "2018-10-27T11:22:33.561Z",\n  "resource_type": "sale",\n  "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST",\n  "summary": "Payment completed for $ 1.0 USD",\n  "resource": {\n    "id": "9D310485PP218683P",\n    "state": "STATE_TO_REPLACE_IN_TEST",\n    "amount": {\n      "total": "1.00",\n      "currency": "USD",\n      "details": {\n      }\n    },\n    "payment_mode": "INSTANT_TRANSFER",\n    "protection_eligibility": "ELIGIBLE",\n    "protection_eligibility_type": "ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE",\n    "transaction_fee": {\n      "value": "0.34",\n      "currency": "USD"\n    },\n    "billing_agreement_id": "BID_TO_REPLACE_IN_TEST",\n    "create_time": "2018-10-27T11:22:14Z",\n    "update_time": "2018-10-27T11:22:14Z",\n    "links": [\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P",\n        "rel": "self",\n        "method": "GET"\n      },\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P/refund",\n        "rel": "refund",\n        "method": "POST"\n      }\n    ],\n    "soft_descriptor": "PAYPAL *TESTFACILIT"\n  },\n  "links": [\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y",\n      "rel": "self",\n      "method": "GET"\n    },\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y/resend",\n      "rel": "resend",\n      "method": "POST"\n    }\n  ]\n}'),
	(6, '8900000001', 'PAYMENT.SALE.COMPLETED', 'completed', '{\n  "id": "WH-6U334972EY960674U-3HB23832P8520331Y",\n  "event_version": "1.0",\n  "create_time": "2018-10-27T11:22:33.561Z",\n  "resource_type": "sale",\n  "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST",\n  "summary": "Payment completed for $ 1.0 USD",\n  "resource": {\n    "id": "9D310485PP218683P",\n    "state": "STATE_TO_REPLACE_IN_TEST",\n    "amount": {\n      "total": "1.00",\n      "currency": "USD",\n      "details": {\n      }\n    },\n    "payment_mode": "INSTANT_TRANSFER",\n    "protection_eligibility": "ELIGIBLE",\n    "protection_eligibility_type": "ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE",\n    "transaction_fee": {\n      "value": "0.34",\n      "currency": "USD"\n    },\n    "billing_agreement_id": "BID_TO_REPLACE_IN_TEST",\n    "create_time": "2018-10-27T11:22:14Z",\n    "update_time": "2018-10-27T11:22:14Z",\n    "links": [\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P",\n        "rel": "self",\n        "method": "GET"\n      },\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P/refund",\n        "rel": "refund",\n        "method": "POST"\n      }\n    ],\n    "soft_descriptor": "PAYPAL *TESTFACILIT"\n  },\n  "links": [\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y",\n      "rel": "self",\n      "method": "GET"\n    },\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y/resend",\n      "rel": "resend",\n      "method": "POST"\n    }\n  ]\n}'),
	(7, '8900000007', 'PAYMENT.SALE.COMPLETED', 'completed', '{\n  "id": "WH-6U334972EY960674U-3HB23832P8520331Y",\n  "event_version": "1.0",\n  "create_time": "2018-10-27T11:22:33.561Z",\n  "resource_type": "sale",\n  "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST",\n  "summary": "Payment completed for $ 1.0 USD",\n  "resource": {\n    "id": "9D310485PP218683P",\n    "state": "STATE_TO_REPLACE_IN_TEST",\n    "amount": {\n      "total": "1.00",\n      "currency": "USD",\n      "details": {\n      }\n    },\n    "payment_mode": "INSTANT_TRANSFER",\n    "protection_eligibility": "ELIGIBLE",\n    "protection_eligibility_type": "ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE",\n    "transaction_fee": {\n      "value": "0.34",\n      "currency": "USD"\n    },\n    "billing_agreement_id": "BID_TO_REPLACE_IN_TEST",\n    "create_time": "2018-10-27T11:22:14Z",\n    "update_time": "2018-10-27T11:22:14Z",\n    "links": [\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P",\n        "rel": "self",\n        "method": "GET"\n      },\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P/refund",\n        "rel": "refund",\n        "method": "POST"\n      }\n    ],\n    "soft_descriptor": "PAYPAL *TESTFACILIT"\n  },\n  "links": [\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y",\n      "rel": "self",\n      "method": "GET"\n    },\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y/resend",\n      "rel": "resend",\n      "method": "POST"\n    }\n  ]\n}'),
	(8, '8700000003', 'PAYMENT.SALE.COMPLETED', 'completed', '{\n   "id": "WH-6U334972EY960674U-3HB23832P8520331Y",\n   "event_version": "1.0",\n   "create_time": "2018-10-27T11:22:33.561Z",\n   "resource_type": "sale",\n   "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST",\n   "summary": "Payment completed for $ 1.0 USD",\n   "resource": {\n     "id": "9D310485PP218683P",\n     "state": "STATE_TO_REPLACE_IN_TEST",\n     "amount": {\n       "total": "1.00",\n       "currency": "USD",\n       "details": {\n       }\n     },\n     "payment_mode": "INSTANT_TRANSFER",\n     "protection_eligibility": "ELIGIBLE",\n     "protection_eligibility_type": "ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE",\n     "transaction_fee": {\n       "value": "0.34",\n       "currency": "USD"\n     },\n     "billing_agreement_id": "BID_TO_REPLACE_IN_TEST",\n     "create_time": "2018-10-27T11:22:14Z",\n     "update_time": "2018-10-27T11:22:14Z",\n     "links": [\n       {\n         "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P",\n         "rel": "self",\n         "method": "GET"\n       },\n       {\n         "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P/refund",\n         "rel": "refund",\n         "method": "POST"\n       }\n     ],\n     "soft_descriptor": "PAYPAL *TESTFACILIT"\n   },\n   "links": [\n     {\n       "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y",\n       "rel": "self",\n       "method": "GET"\n     },\n     {\n       "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y/resend",\n       "rel": "resend",\n       "method": "POST"\n     }\n   ]\n }'),
	(9, '8700000006', 'PAYMENT.SALE.COMPLETED', 'completed', '{\n  "id": "WH-6U334972EY960674U-3HB23832P8520331Y",\n  "event_version": "1.0",\n  "create_time": "2018-10-27T11:22:33.561Z",\n  "resource_type": "sale",\n  "event_type": "EVENT_TYPE_TO_REPLACE_IN_TEST",\n  "summary": "Payment completed for $ 1.0 USD",\n  "resource": {\n    "id": "9D310485PP218683P",\n    "state": "STATE_TO_REPLACE_IN_TEST",\n    "amount": {\n      "total": "1.00",\n      "currency": "USD",\n      "details": {\n      }\n    },\n    "payment_mode": "INSTANT_TRANSFER",\n    "protection_eligibility": "ELIGIBLE",\n    "protection_eligibility_type": "ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE",\n    "transaction_fee": {\n      "value": "0.34",\n      "currency": "USD"\n    },\n    "billing_agreement_id": "BID_TO_REPLACE_IN_TEST",\n    "create_time": "2018-10-27T11:22:14Z",\n    "update_time": "2018-10-27T11:22:14Z",\n    "links": [\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P",\n        "rel": "self",\n        "method": "GET"\n      },\n      {\n        "href": "https://api.sandbox.paypal.com/v1/payments/sale/9D310485PP218683P/refund",\n        "rel": "refund",\n        "method": "POST"\n      }\n    ],\n    "soft_descriptor": "PAYPAL *TESTFACILIT"\n  },\n  "links": [\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y",\n      "rel": "self",\n      "method": "GET"\n    },\n    {\n      "href": "https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-6U334972EY960674U-3HB23832P8520331Y/resend",\n      "rel": "resend",\n      "method": "POST"\n    }\n  ]\n}');
/*!40000 ALTER TABLE `paypal_step_notification` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.paypal_step_sync_validation
CREATE TABLE IF NOT EXISTS `paypal_step_sync_validation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(45) DEFAULT NULL,
  `msisdn` varchar(50) DEFAULT NULL,
  `chargedPrice` varchar(50) DEFAULT NULL,
  `chargedBillingCode` varchar(50) DEFAULT NULL,
  `partnerId` varchar(50) DEFAULT NULL,
  `productId` varchar(50) DEFAULT NULL,
  `subscriptionBillingCode` varchar(50) DEFAULT NULL,
  `subscriptionStatus` varchar(50) DEFAULT NULL,
  `validityDays` varchar(50) DEFAULT NULL,
  `summary` varchar(45) DEFAULT NULL,
  `validityNBD` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.paypal_step_sync_validation: ~1 rows (approximately)
/*!40000 ALTER TABLE `paypal_step_sync_validation` DISABLE KEYS */;
INSERT INTO `paypal_step_sync_validation` (`id`, `userId`, `msisdn`, `chargedPrice`, `chargedBillingCode`, `partnerId`, `productId`, `subscriptionBillingCode`, `subscriptionStatus`, `validityDays`, `summary`, `validityNBD`) VALUES
	(8, '8900000001', NULL, '7.99', '1-3-AE-799-1542191810533', '3', '1', '1-3-AE-799-1542191810533', 'ACT_INIT', '30', 'null', '30');
/*!40000 ALTER TABLE `paypal_step_sync_validation` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.paytm_step_callback
CREATE TABLE IF NOT EXISTS `paytm_step_callback` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ORDERID` varchar(55) NOT NULL,
  `productName` varchar(55) NOT NULL,
  `productSource` varchar(55) NOT NULL,
  `BANKNAME` varchar(55) DEFAULT NULL,
  `BANKTXNID` varchar(55) DEFAULT NULL,
  `CHECKSUMHASH` varchar(55) DEFAULT NULL,
  `CURRENCY` varchar(55) DEFAULT NULL,
  `GATEWAYNAME` varchar(55) DEFAULT NULL,
  `MID` varchar(55) DEFAULT NULL,
  `PAYMENTMODE` varchar(55) DEFAULT NULL,
  `RESPCODE` varchar(55) DEFAULT NULL,
  `RESPMSG` varchar(55) DEFAULT NULL,
  `STATUS` varchar(55) DEFAULT NULL,
  `SUBS_ID` varchar(55) DEFAULT NULL,
  `TXNAMOUNT` varchar(55) DEFAULT NULL,
  `TXNDATE` varchar(55) DEFAULT NULL,
  `TXNID` varchar(55) DEFAULT NULL,
  `appid` varchar(55) DEFAULT NULL,
  `appver` varchar(55) DEFAULT NULL,
  `carrierid` varchar(55) DEFAULT NULL,
  `ccode` varchar(55) DEFAULT NULL,
  `devicecountry` varchar(55) DEFAULT NULL,
  `devicetimezone` varchar(55) DEFAULT NULL,
  `geo` varchar(55) DEFAULT NULL,
  `iid` varchar(55) DEFAULT NULL,
  `languageid` varchar(55) DEFAULT NULL,
  `paysource` varchar(55) DEFAULT NULL,
  `platform` varchar(55) DEFAULT NULL,
  `platformid` varchar(55) DEFAULT NULL,
  `platformname` varchar(55) DEFAULT NULL,
  `platformtype` varchar(55) DEFAULT NULL,
  `regionid` varchar(55) DEFAULT NULL,
  `userid` varchar(55) DEFAULT NULL,
  `ver` varchar(55) DEFAULT NULL,
  `vuserid` varchar(55) DEFAULT NULL,
  `billingTransactionId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `productSource_UNIQUE` (`productSource`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.paytm_step_callback: ~3 rows (approximately)
/*!40000 ALTER TABLE `paytm_step_callback` DISABLE KEYS */;
INSERT INTO `paytm_step_callback` (`id`, `ORDERID`, `productName`, `productSource`, `BANKNAME`, `BANKTXNID`, `CHECKSUMHASH`, `CURRENCY`, `GATEWAYNAME`, `MID`, `PAYMENTMODE`, `RESPCODE`, `RESPMSG`, `STATUS`, `SUBS_ID`, `TXNAMOUNT`, `TXNDATE`, `TXNID`, `appid`, `appver`, `carrierid`, `ccode`, `devicecountry`, `devicetimezone`, `geo`, `iid`, `languageid`, `paysource`, `platform`, `platformid`, `platformname`, `platformtype`, `regionid`, `userid`, `ver`, `vuserid`, `billingTransactionId`) VALUES
	(1, 'testOrder9900000001', 'PAYTM', 'ACT_DP_IN_PP01_SUCCESS', 'WALLET', '19900000001', 'checksumhashdummyval', 'INR', 'WALLET', 'Vuclip71864611141257', 'PM1', '01', 'Txn Successful.', 'TXN_SUCCESS', '19900000001', '99.00', '2018-07-17 14:20:40.0', '19900000001', 'viu_android', '1.0.71', '9', 'IN', 'US', '0530', '2', 'ecfc546df954b0ef', 'en', 'Paytm', 'app', '100', 'paytm', 'WALLET,merchant', 'hindi', '9900000001', '1.0', '9900000001', '19900000001'),
	(2, 'testOrder9900000002', 'PAYTM', 'ACT_DP_IN_FAILURE_PP01', 'WALLET', '29900000002', 'checksumhashdummyval', 'INR', 'WALLET', 'Vuclip71864611141257', 'PM2', '01', 'Txn Successful.', 'TXN_SUCCESS', '29900000002', '99.00', '2018-07-17 14:20:40.0', '29900000002', 'viu_android', '1.0.71', '9', 'IN', 'US', '0530', '2', 'ecfc546df954b0ef', 'en', 'Paytm', 'app', '100', 'paytm', 'WALLET,merchant', 'telgu', '9900000002', '1.0', '9900000002', '29900000002'),
	(4, 'testOrder9900000003', 'PAYTM', 'WAP_ACTIVATION99_PENDING', 'WALLET', '39900000003', 'checksumhashdummyval', 'INR', 'WALLET', 'Vuclip71864611141257', 'PM3', '01', 'Txn Successful.', 'TXN_SUCCESS', '319900000003', '99.00', '2018-07-17 14:20:40.0', '39900000003', 'viu_android', '1.0.71', '9', 'IN', 'US', '0530', '2', 'ecfc546df954b0ef', 'en', 'Paytm', 'app', '100', 'paytm', 'WALLET,merchant', 'telgu', '9900000003', '1.0', '9900000003', '39900000003');
/*!40000 ALTER TABLE `paytm_step_callback` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.paytm_step_notification
CREATE TABLE IF NOT EXISTS `paytm_step_notification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ORDERID` varchar(55) NOT NULL,
  `productName` varchar(55) NOT NULL,
  `productSource` varchar(55) NOT NULL,
  `BANKNAME` varchar(55) DEFAULT NULL,
  `CUSTID` varchar(20) DEFAULT NULL,
  `MERC_UNQ_REF` varchar(20) DEFAULT NULL,
  `TXNDATETIME` varchar(20) DEFAULT NULL,
  `BANKTXNID` varchar(55) DEFAULT NULL,
  `CHECKSUMHASH` varchar(55) DEFAULT NULL,
  `CURRENCY` varchar(55) DEFAULT NULL,
  `GATEWAYNAME` varchar(55) DEFAULT NULL,
  `MID` varchar(55) DEFAULT NULL,
  `PAYMENTMODE` varchar(55) DEFAULT NULL,
  `RESPCODE` varchar(55) DEFAULT NULL,
  `RESPMSG` varchar(55) DEFAULT NULL,
  `STATUS` varchar(55) DEFAULT NULL,
  `SUBS_ID` varchar(55) DEFAULT NULL,
  `TXNAMOUNT` varchar(55) DEFAULT NULL,
  `TXNDATE` varchar(55) DEFAULT NULL,
  `TXNID` varchar(55) DEFAULT NULL,
  `appid` varchar(55) DEFAULT NULL,
  `appver` varchar(55) DEFAULT NULL,
  `carrierid` varchar(55) DEFAULT NULL,
  `ccode` varchar(55) DEFAULT NULL,
  `devicecountry` varchar(55) DEFAULT NULL,
  `devicetimezone` varchar(55) DEFAULT NULL,
  `geo` varchar(55) DEFAULT NULL,
  `iid` varchar(55) DEFAULT NULL,
  `languageid` varchar(55) DEFAULT NULL,
  `paysource` varchar(55) DEFAULT NULL,
  `platform` varchar(55) DEFAULT NULL,
  `platformid` varchar(55) DEFAULT NULL,
  `platformname` varchar(55) DEFAULT NULL,
  `platformtype` varchar(55) DEFAULT NULL,
  `regionid` varchar(55) DEFAULT NULL,
  `userid` varchar(55) DEFAULT NULL,
  `ver` varchar(55) DEFAULT NULL,
  `vuserid` varchar(55) DEFAULT NULL,
  `billingTransactionId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `productSource_UNIQUE` (`productSource`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.paytm_step_notification: ~4 rows (approximately)
/*!40000 ALTER TABLE `paytm_step_notification` DISABLE KEYS */;
INSERT INTO `paytm_step_notification` (`id`, `ORDERID`, `productName`, `productSource`, `BANKNAME`, `CUSTID`, `MERC_UNQ_REF`, `TXNDATETIME`, `BANKTXNID`, `CHECKSUMHASH`, `CURRENCY`, `GATEWAYNAME`, `MID`, `PAYMENTMODE`, `RESPCODE`, `RESPMSG`, `STATUS`, `SUBS_ID`, `TXNAMOUNT`, `TXNDATE`, `TXNID`, `appid`, `appver`, `carrierid`, `ccode`, `devicecountry`, `devicetimezone`, `geo`, `iid`, `languageid`, `paysource`, `platform`, `platformid`, `platformname`, `platformtype`, `regionid`, `userid`, `ver`, `vuserid`, `billingTransactionId`) VALUES
	(1, 'replacedin codyfromtrxid', 'PAYTM', 'ACT_DP_IN_PP01_SUCCESS', 'WALLET', '9900000001', '', '2018-10-31 2018:43:0', '19900000001', 'checksumhashdummyval', 'INR', 'WALLET', 'Vuclip71864611141257', 'PM1', '01', 'Txn Successful.', 'TXN_SUCCESS', '19900000001', '99.00', '2018-07-17 14:20:40.0', '19900000001', 'viu_android', '1.0.71', '9', 'IN', 'US', '0530', '2', 'ecfc546df954b0ef', 'en', 'Paytm', 'app', '100', 'paytm', 'WALLET,merchant', 'hindi', '9900000001', '1.0', '9900000001', '19900000001'),
	(2, 'replacedin codyfromtrxid', 'PAYTM', 'ACT_DP_IN_FAILURE_PP01', 'WALLET', '9900000002', '', '2018-10-31 2018:43:0', '29900000002', 'checksumhashdummyval', 'INR', 'WALLET', 'Vuclip71864611141257', 'PM2', '227', 'Txn Failed.', 'TXN_FAILURE', '29900000002', '99.00', '2018-07-17 14:20:40.0', '29900000002', 'viu_android', '1.0.71', '9', 'IN', 'US', '0530', '2', 'ecfc546df954b0ef', 'en', 'Paytm', 'app', '100', 'paytm', 'WALLET,merchant', 'telgu', '9900000002', '1.0', '9900000002', '29900000002'),
	(3, 'replacedin codyfromtrxid', 'PAYTM', 'ACT_DP_IN_PENDING_PP01', 'WALLET', '9900000003', '', '2018-10-31 2018:43:0', '39900000003', 'checksumhashdummyval', 'INR', 'WALLET', 'Vuclip71864611141257', 'PM3', '06', 'Txn Pending.', 'TXN_PENDING', '39900000003', '99.00', '2018-07-17 14:20:40.0', '39900000003', 'viu_android', '1.0.71', '9', 'IN', 'US', '0530', '2', 'ecfc546df954b0ef', 'en', 'Paytm', 'app', '100', 'paytm', 'WALLET,merchant', 'telgu', '9900000003', '1.0', '9900000003', '39900000003'),
	(5, 'replacedin codyfromtrxid', 'PAYTM', 'REN_DP_IN_PP01_SUCCESS', 'WALLET', '9900000011', '', '2018-10-31 2018:43:0', '199000000111', 'checksumhashdummyval', 'INR', 'WALLET', 'Vuclip71864611141257', 'PM3', '01', 'Txn Successful.', 'TXN_SUCCESS', '199000000111', '99.00', '2018-07-17 14:20:40.0', '199000000111', 'viu_android', '1.0.71', '9', 'IN', 'US', '0530', '2', 'ecfc546df954b0ef', 'en', 'Paytm', 'app', '100', 'paytm', 'WALLET,merchant', 'telgu', '9900000011', '1.0', '9900000011', '199000000111');
/*!40000 ALTER TABLE `paytm_step_notification` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.save_country_config
CREATE TABLE IF NOT EXISTS `save_country_config` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `serviceName` varchar(55) DEFAULT '',
  `partnerConfigName` varchar(55) DEFAULT '',
  `json` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.save_country_config: ~0 rows (approximately)
/*!40000 ALTER TABLE `save_country_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `save_country_config` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.save_partner_config
CREATE TABLE IF NOT EXISTS `save_partner_config` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `serviceName` varchar(55) DEFAULT '',
  `partnerConfigName` varchar(55) DEFAULT '',
  `json` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.save_partner_config: ~1 rows (approximately)
/*!40000 ALTER TABLE `save_partner_config` DISABLE KEYS */;
INSERT INTO `save_partner_config` (`id`, `serviceName`, `partnerConfigName`, `json`) VALUES
	(2, 'subscription-service', 'default', '{"type": "telco", "status": "ACTIVE", "partnerId": 1, "description": "Etisalat UAE", "partnerName": "Etisalat UAE", "operationType": "Create", "stepUpCharging": true, "userIdentifier": "user1", "hasMoActivations": true, "renewalManagedBy": "Vuclip", "hasMoDeactivations": true, "activationManagedBy": "Vuclip", "balanceCheckRequired": true, "autoRenewalApplicable": false, "deactivationManagedBy": "Vuclip", "partnerActivationConsentParserUrl": "http://35.206.119.0:8089/vuconnect/consent/activationConsentParser", "partnerDeactivationConsentParserUrl": "http://35.206.119.0:8089/vuconnect/consent/activationConsent", "partnerActivationConsentInitiationUrl": "http://35.206.119.0:8089/vuconnect/consent/activationConsent", "partnerDeactivationConsentInitiationUrl": "http://35.206.119.0:8089/vuconnect/consent/activationConsent"}');
/*!40000 ALTER TABLE `save_partner_config` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.save_product_config
CREATE TABLE IF NOT EXISTS `save_product_config` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `serviceName` varchar(55) DEFAULT '',
  `partnerConfigName` varchar(55) DEFAULT '',
  `json` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.save_product_config: ~1 rows (approximately)
/*!40000 ALTER TABLE `save_product_config` DISABLE KEYS */;
INSERT INTO `save_product_config` (`id`, `serviceName`, `partnerConfigName`, `json`) VALUES
	(2, 'subscription-service', 'default', '{"retry": [{"status": "active", "retryId": 1, "batchSize": 0, "partnerId": 1, "productId": 1, "retryable": true, "countryCode": "MY", "typeOfCycle": "CALANDER_DAY", "activityType": "ACTIVATION", "attemptWindow": "7:00AM-2:00PM", "executingDays": "1101011", "maxRetryCount": 30, "operationType": "Create", "schedulingDays": "Monday,Tuesday", "executingTimeWindow": "7:10-8:10,9:00-12:00", "actionDefaultEiligible": false, "retryIntervalInMinutes": 120, "schedulingFrequencyInMinutes": 300}], "product": {"url": "www.viu.com", "cassId": 123, "status": "ACTIVE", "errorUrl": "www.viu.com", "productId": 1, "storeType": "Full Store", "callbackUrl": "www.viu.com", "productName": "VIU", "productType": "OTT", "operationType": "Create", "consentCancelUrl": "www.viu.com", "encryptionEnable": true, "encryptionValidityInMinutes": 30}, "blackouts": [{"period": "\'0:01-0:02\'", "partnerId": 1, "productId": 1, "blackoutId": 1, "countryCode": "MY", "operationType": "Create", "blackoutWindow": "\'0:01-0:02\'"}], "smsConfigs": [{"type": "CONTENT_SMS", "status": "active", "autoPlay": false, "batchSize": 300, "criterias": [{"smsText": "SMS Text", "criteriaId": 1, "criterions": [{"name": "activity", "value": "ACTIVATION", "operator": "==", "criterionId": 1, "groupingOperator": "NONE"}], "dateCoumputationCriterion": {"name": "next_billing_date", "unit": "HOUR", "value": "24", "operator": "+", "dateComputationCriterionId": 1}}], "partnerId": 1, "productId": 1, "smsLength": 300, "countryCode": "MY", "smsConfigId": 1, "operationType": "Create", "redirectionContext": "Redirection Context", "defaultSmsLanguageId": 1}], "pricePoints": [{"ujId": 1, "appId": 1, "price": 33, "itemId": 1, "status": "active", "timeUnit": "DAY", "validity": 30, "partnerId": 1, "productId": 1, "serviceId": "100", "itemTypeId": 12, "billingCode": "BC03", "countryCode": "MY", "description": "Price Point 1", "noOfCredits": 99999, "freeTrialDays": 10, "operationType": "Create", "parkingPeriod": 20, "suspendPeriod": 30, "actInitValidity": 5, "exclusionPeriod": 60, "fallbackApplicable": false, "freeTrialApplicable": false, "balanceCheckRequired": true, "freeTrialBillingCode": "BC03", "autoRenewalApplicable": true, "fallbackPpBillingCode": "BC03", "notificationWaitPeriod": 10, "activationCoolDownPeriod": 25, "deactivationRetryValidity": 15, "contentAccessPostDeactivation": true, "noOfDaysContentAccessAllowInParking": 20, "noOfDaysContentAccessAllowInSuspend": 0}], "stateConfigs": [{"partnerId": 1, "productId": 1, "pricePoint": "BC03", "countryCode": "MY", "graceDuration": 12, "operationType": "Create", "stateConfigId": 1, "activeDuration": 30, "actInitDuration": 300, "parkingDuration": 30, "suspendDuration": 30, "blacklistDuration": 30}], "activityFlows": [{"mode": "WAP", "name": "ACTIVATION", "actions": [{"action": "CONSENT", "actionId": 1, "flowType": "VUCLIP_CONSENT"}], "partnerId": 1, "productId": 1, "billingCode": "BC03", "countryCode": "MY", "operationType": "Create", "activityFlowId": 1}, {"mode": "WAP", "name": "DEACTIVATION", "actions": [{"action": "CONSENT", "actionId": 1, "flowType": "VUCLIP_CONSENT"}], "partnerId": 1, "productId": 1, "billingCode": "BC03", "countryCode": "MY", "operationType": "Create", "activityFlowId": 1}, {"mode": "WAP", "name": "RENEWAL", "actions": [{"action": "CONSENT", "actionId": 1, "flowType": "VUCLIP_CONSENT"}], "partnerId": 1, "productId": 1, "billingCode": "BC03", "countryCode": "MY", "operationType": "Create", "activityFlowId": 1}], "churnNotifications": [{"period": "24", "partnerId": 1, "productId": 1, "countryCode": "MY", "typeOfChurn": "ALL", "operationType": "Create", "churnNotificationId": 30}], "adNetworkNotifications": [{"id": 5, "partnerId": 1, "productId": 1, "countryCode": "MY", "operationType": "Create", "freePercentage": 20, "paidPercentage": 30, "winbackPercentage": 30, "adNetworkNotificationId": 30}], "productPartnerMappings": [{"timeUnit": "DAY", "countries": ["MY"], "partnerId": 1, "productId": 1, "dateFormat": "dd-mm-yyyy", "billingUserId": "USERID", "operationType": "Create", "cooldownValidity": 3, "optOutSmsEnabled": true, "blacklistValidity": 30, "cooldownApplicable": true, "blacklistApplicable": true, "validityFromPartner": true, "preRenewalSmsEnabled": false, "allowedFreeTrialCount": 1, "displayRenewalConsent": false, "stepUpChargingApplicable": false, "chargingDependOnSmsDelivery": true, "partnerConsentParserEndpoint": "Parse EndPoint", "partnerConsentUrlGenerationEndpoint": "Url Generation EndPoint"}]}');
/*!40000 ALTER TABLE `save_product_config` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_activity_event
CREATE TABLE IF NOT EXISTS `step_activity_event` (
  `id` bigint(50) NOT NULL AUTO_INCREMENT,
  `productName` varchar(45) NOT NULL,
  `productSource` varchar(145) NOT NULL DEFAULT '',
  `userId` varchar(55) NOT NULL DEFAULT '',
  `msisdn` varchar(55) DEFAULT NULL,
  `subscriptionId` varchar(120) DEFAULT NULL,
  `transactionId` varchar(155) DEFAULT NULL,
  `activity` varchar(155) DEFAULT NULL,
  `action` varchar(155) DEFAULT NULL,
  `transactionState` varchar(155) DEFAULT NULL,
  `closed` varchar(11) DEFAULT NULL,
  `targetState` varchar(100) DEFAULT NULL,
  `actionResult` varchar(155) DEFAULT NULL,
  `delayed` varchar(255) DEFAULT NULL,
  `requestedBillingCode` varchar(50) DEFAULT NULL,
  `requestedPrice` varchar(50) DEFAULT NULL,
  `attemptedBillingCode` varchar(50) DEFAULT NULL,
  `attemptedPrice` varchar(155) DEFAULT NULL,
  `adNetworkParams` varchar(255) DEFAULT NULL,
  `dirtNetworkParams` varchar(245) DEFAULT NULL,
  `clientTransactionId` varchar(100) DEFAULT NULL,
  `errorCode` varchar(100) DEFAULT NULL,
  `errorDesc` varchar(100) DEFAULT NULL,
  `clientUserId` varchar(100) DEFAULT NULL,
  `partnerTransactionId` varchar(100) DEFAULT NULL,
  `serviceId` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_activity_event: ~79 rows (approximately)
/*!40000 ALTER TABLE `step_activity_event` DISABLE KEYS */;
INSERT INTO `step_activity_event` (`id`, `productName`, `productSource`, `userId`, `msisdn`, `subscriptionId`, `transactionId`, `activity`, `action`, `transactionState`, `closed`, `targetState`, `actionResult`, `delayed`, `requestedBillingCode`, `requestedPrice`, `attemptedBillingCode`, `attemptedPrice`, `adNetworkParams`, `dirtNetworkParams`, `clientTransactionId`, `errorCode`, `errorDesc`, `clientUserId`, `partnerTransactionId`, `serviceId`) VALUES
	(13, 'subscription-service', 'ST_ACT_INIT_ACTIVATION_FAILURE', '2000000000', '2000000000', '2000000000', 'TRXID_2000000000', 'ACTIVATION', 'CHARGING', 'FAILURE', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', NULL, NULL, NULL, NULL, NULL, NULL),
	(15, 'subscription-service', 'ST_ACT_INIT_ACTIVATION_LOW_BALANCE', '11111112', '11111112', '11111112', 'TRXID_2000000002', 'ACTIVATION', 'CHARGING', 'LOW_BALANCE', 'true', 'PARKING', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', NULL, NULL, NULL, NULL, NULL, ''),
	(16, 'subscription-service', 'ST_ACT_INIT_ACTIVATION_ERROR', '2000000003', '2000000003', '2000000003', 'TRXID_2000000003', 'ACTIVATION', 'CHARGING', 'ERROR', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', NULL, NULL, NULL, NULL, NULL, NULL),
	(17, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_SUCCESS_TRUE', '2000000004', '2000000004', '2000000004', 'TRXID_2000000004', 'ACTIVATION', 'REGISTRATION', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', NULL, NULL, NULL, NULL, NULL, NULL),
	(19, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_SUCCESS_FALSE', '2000000005', '2000000005', '2000000005', 'TRXID_2000000005', 'ACTIVATION', 'REGISTRATION', 'SUCCESS', 'false', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', NULL, NULL, NULL, NULL, NULL, NULL),
	(20, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_ERROR', '2000000007', '2000000007', '2000000007', 'TRXID_2000000007', 'ACTIVATION', 'REGISTRATION', 'ERROR', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', NULL, NULL, NULL, NULL, NULL, NULL),
	(21, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_FAILURE', '2000000006', '2000000006', '2000000006', 'TRXID_2000000006', 'ACTIVATION', 'REGISTRATION', 'FAILURE', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', NULL, NULL, NULL, NULL, NULL, NULL),
	(22, 'subscription-service', 'CONFIRM_IS_NOT_CLOSED', '5000000001', '5000000001', '', 'TRXID_5000000001', 'ACTIVATION', 'CONSENT', 'CONFIRMED', 'false', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', '', NULL, NULL, NULL, NULL, NULL),
	(23, 'subscription-service', 'CONFIRM_IS_CLOSED', '5000000002', '5000000002', '', 'TRXID_5000000002', 'ACTIVATION', 'CONSENT', 'CONFIRMED', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', '', NULL, NULL, NULL, NULL, NULL),
	(24, 'subscription-service', 'CONFIRM_CONSENT_CHRG_CLOSED', '5000000004', '5000000004', '', 'TRXID_5000000004', 'ACTIVATION', 'CONSENT_WITH_CHARGING', 'CONFIRMED', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', '', NULL, NULL, NULL, NULL, NULL),
	(25, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_CHARGING_SUCCESS_TRUE_ACTIVATED', '77000000000', '77000000000', '77000', 'TRX_ID_77000000000', 'ACTIVATION', 'CHARGING', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(27, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_CHARGING_LOW_BALANCE_TRUE_PARKING', '77000000001', '77000000001', '77001', 'TRX_ID_77000000001', 'ACTIVATION', 'CHARGING', 'LOW_BALANCE', 'true', 'PARKING', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(28, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_SUCCESS_TRUE_ACTIVATED', '77000000002', '77000000002', '77002', 'TRX_ID_77000000002', 'ACTIVATION', 'REGISTRATION', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(29, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_SUCCESS_FALSE_ACT_INIT', '77000000003', '77000000003', '77003', 'TRX_ID_77000000003', 'ACTIVATION', 'REGISTRATION', 'SUCCESS', 'false', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(30, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_ERROR_TRUE_ACT_INIT', '77000000004', '77000000004', '77004', 'TRX_ID_77000000004', 'ACTIVATION', 'REGISTRATION', 'ERROR', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(31, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_FAILURE_TRUE_ACT_INIT', '77000000005', '77000000005', '77005', 'TRX_ID_77000000005', 'ACTIVATION', 'REGISTRATION', 'FAILURE', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(33, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_CHARGING_SUCCESS_TRUE_ACTIVATED', '77000000007', '77000000007', '77007', 'TRX_ID_77000000007', 'ACTIVATION_RETRY', 'CHARGING', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(34, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_SUCCESS_TRUE_ACTIVATED', '77000000008', '77000000008', '77008', 'TRX_ID_77000000008', 'ACTIVATION_RETRY', 'REGISTRATION', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(35, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_SUCCESS_FALSE_ACT_INIT', '77000000009', '77000000009', '77009', 'TRX_ID_77000000009', 'ACTIVATION_RETRY', 'REGISTRATION', 'SUCCESS', 'false', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(36, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_ERROR_TRUE_ACT_INIT', '770000000010', '770000000010', '770010', 'TRX_ID_770000000010', 'ACTIVATION_RETRY', 'REGISTRATION', 'ERROR', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(37, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_FAILURE_TRUE_ACT_INIT', '770000000011', '770000000011', '770011', 'TRX_ID_770000000011', 'ACTIVATION_RETRY', 'REGISTRATION', 'FAILURE', 'true', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(38, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_CHARGING_LOW_BALANCE_TRUE_PARKING', '770000000012', '770000000012', '770012', 'TRX_ID_770000000012', 'ACTIVATION_RETRY', 'CHARGING', 'LOW_BALANCE', 'true', 'PARKING', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(40, 'subscription-service', 'S_T_PARKING_WINBACK_CHARGING_LOW_BALANCE_TRUE_PARKING', '770000000014', '770000000014', '770014', 'TRX_ID_770000000014', 'WINBACK', 'CHARGING', 'LOW_BALANCE', 'true', 'PARKING', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(41, 'subscription-service', 'S_T_PARKING_WINBACK_CHARGING_ERROR_TRUE_PARKING', '770000000015', '770000000015', '770015', 'TRX_ID_770000000015', 'WINBACK', 'CHARGING', 'ERROR', 'true', 'PARKING', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(42, 'subscription-service', 'S_T_PARKING_WINBACK_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000016', '770000000016', '770016', 'TRX_ID_770000000016', 'WINBACK', 'CHARGING', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(43, 'subscription-service', 'S_T_ACT_INIT_RENEWAL_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000017', '770000000017', '770017', 'TRX_ID_770000000017', 'RENEWAL', 'CHARGING', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(44, 'subscription-service', 'S_T_ACT_INIT_RENEWAL_CHARGING_LOW_BALANCE_TRUE_SUSPEND', '770000000018', '770000000018', '770018', 'TRX_ID_770000000018', 'RENEWAL', 'CHARGING', 'LOW_BALANCE', 'true', 'SUSPEND', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(45, 'subscription-service', 'S_T_ACT_INIT_RENEWAL_CHARGING_FAILURE_TRUE_SUSPEND', '770000000019', '770000000019', '770019', 'TRX_ID_770000000019', 'RENEWAL', 'CHARGING', 'FAILURE', 'true', 'SUSPEND', 'FAILURE', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(46, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000020', '770000000020', '770020', 'TRX_ID_770000000020', 'RENEWAL', 'CHARGING', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(47, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_ERROR_TRUE_ACTIVATED', '770000000021', '770000000021', '770021', 'TRX_ID_770000000021', 'RENEWAL', 'CHARGING', 'ERROR', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(48, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_LOW_BALANCE_TRUE_SUSPEND', '770000000022', '770000000022', '770022', 'TRX_ID_770000000022', 'RENEWAL', 'CHARGING', 'LOW_BALANCE', 'true', 'SUSPEND', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(49, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_FAILURE_TRUE_SUSPEND', '770000000023', '770000000023', '770023', 'TRX_ID_770000000023', 'RENEWAL', 'CHARGING', 'FAILURE', 'true', 'SUSPEND', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(50, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_FAILURE_TRUE_SUSPEND', '770000000024', '770000000024', '770024', 'TRX_ID_770000000024', 'RENEWAL', 'CHARGING', 'FAILURE', 'true', 'SUSPEND', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(51, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_ERROR_TRUE_SUSPEND', '770000000025', '770000000025', '770025', 'TRX_ID_770000000025', 'RENEWAL', 'CHARGING', 'ERROR', 'true', 'SUSPEND', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(52, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_LOW_BALANCE_TRUE_SUSPEND', '770000000026', '770000000026', '770026', 'TRX_ID_770000000026', 'RENEWAL', 'CHARGING', 'LOW_BALANCE', 'true', 'SUSPEND', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(53, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000027', '770000000027', '770027', 'TRX_ID_770000000027', 'RENEWAL', 'CHARGING', 'SUCCESS', 'true', 'ACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(54, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_RETRY_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000028', '770000000028', '770028', 'TRX_ID_770000000028', 'DEACTIVATION_RETRY', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(55, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_RETRY_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000029', '770000000029', '770029', 'TRX_ID_770000000029', 'DEACTIVATION_RETRY', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(56, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_RETRY_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000030', '770000000030', '770030', 'TRX_ID_770000000030', 'DEACTIVATION_RETRY', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(57, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000031', '770000000031', '770031', 'TRX_ID_770000000031', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(58, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000032', '770000000032', '770032', 'TRX_ID_770000000032', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(59, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000033', '770000000033', '770033', 'TRX_ID_770000000033', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'IN_PROGRESS', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(60, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000034', '770000000034', '770034', 'TRX_ID_770000000034', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(61, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000035', '770000000035', '770035', 'TRX_ID_770000000035', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(62, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000036', '770000000036', '770036', 'TRX_ID_770000000036', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(63, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000037', '770000000037', '770037', 'TRX_ID_770000000037', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'IN_PROGRESS', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(64, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000038', '770000000038', '770038', 'TRX_ID_770000000038', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(65, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000039', '770000000039', '770039', 'TRX_ID_770000000039', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(66, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000040', '770000000040', '770040', 'TRX_ID_770000000040', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(67, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000041', '770000000041', '770041', 'TRX_ID_770000000041', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'IN_PROGRESS', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(68, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000042', '770000000042', '770042', 'TRX_ID_770000000042', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(69, 'subscription-service', 'S_T_ACTIVATED_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000043', '770000000043', '770043', 'TRX_ID_770000000043', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(70, 'subscription-service', 'S_T_ACTIVATED_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000044', '770000000044', '770044', 'TRX_ID_770000000044', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(71, 'subscription-service', 'S_T_ACTIVATED_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000045', '770000000045', '770045', 'TRX_ID_770000000045', 'SYSTEM_CHURN', 'PROCESS_DEACTIVATE', 'IN_PROGRESS', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(73, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000047', '770000000047', '770047', 'TRX_ID_770000000047', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(74, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000048', '770000000048', '770048', 'TRX_ID_770000000048', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(75, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000049', '770000000049', '770049', 'TRX_ID_770000000049', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(76, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000050', '770000000050', '770050', 'TRX_ID_770000000050', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(77, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000051', '770000000051', '770051', 'TRX_ID_770000000051', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(78, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000052', '770000000052', '770052', 'TRX_ID_770000000052', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(79, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000053', '770000000053', '770053', 'TRX_ID_770000000053', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(80, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000054', '770000000054', '770054', 'TRX_ID_770000000054', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(81, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000055', '770000000055', '770055', 'TRX_ID_770000000055', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(82, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000056', '770000000056', '770056', 'TRX_ID_770000000056', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(83, 'subscription-service', 'S_T_PARKING_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000057', '770000000057', '770057', 'TRX_ID_770000000057', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(84, 'subscription-service', 'S_T_PARKING_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000058', '770000000058', '770058', 'TRX_ID_770000000058', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(85, 'subscription-service', 'S_T_PARKING_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000059', '770000000059', '770059', 'TRX_ID_770000000059', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(86, 'subscription-service', 'S_T_PARKING_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000060', '770000000060', '770060', 'TRX_ID_770000000060', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(87, 'subscription-service', 'S_T_PARKING_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000061', '770000000061', '770061', 'TRX_ID_770000000061', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(88, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000062', '770000000062', '770062', 'TRX_ID_770000000062', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'false', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(89, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000063', '770000000063', '770063', 'TRX_ID_770000000063', 'DEACTIVATION', 'DEACTIVATE_CONSENT', 'CONFIRMED', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(90, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000064', '770000000064', '770064', 'TRX_ID_770000000064', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(91, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000065', '770000000065', '770065', 'TRX_ID_770000000065', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(92, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000066', '770000000066', '770066', 'TRX_ID_770000000066', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(93, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000067', '770000000067', '770067', 'TRX_ID_770000000067', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'SUCCESS', 'true', 'DEACTIVATED', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(94, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000068', '770000000068', '770068', 'TRX_ID_770000000068', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'FAILURE', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(95, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000069', '770000000069', '770069', 'TRX_ID_770000000069', 'DEACTIVATION', 'PROCESS_DEACTIVATE', 'ERROR', 'true', 'DCT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(96, 'subscription-service', 'CONFIRM_FAILURE', '5000000005', '5000000005', '', 'TRXID_5000000001', 'ACTIVATION', 'CONSENT', 'FAILURE', 'false', 'NA', 'FAILURE', 'false', 'BC03', '10', 'BC03', '10', 'NA', 'NA', '', NULL, NULL, NULL, NULL, NULL),
	(97, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_CHARGING_SUCCESS_FALSE_ACTIVATED', '77000000100', '77000000100', '77100', 'TRX_ID_77000000100', 'ACTIVATION', 'CHARGING', 'SUCCESS', 'false', 'ACT_INIT', 'SUCCESS', 'false', 'BC03', '10', 'BC03', '10', 'NA', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `step_activity_event` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_charge_user
CREATE TABLE IF NOT EXISTS `step_charge_user` (
  `productName` varchar(55) NOT NULL,
  `productSource` varchar(55) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(55) NOT NULL,
  `msisdn` varchar(55) NOT NULL,
  `billingCode` varchar(55) DEFAULT NULL,
  `circleCode` varchar(55) DEFAULT NULL,
  `orderId` varchar(45) NOT NULL,
  `chargeDescription` varchar(55) DEFAULT NULL,
  `partnerToken` varchar(55) DEFAULT NULL,
  `headerRefCode` varchar(55) DEFAULT NULL,
  `itemId` varchar(55) DEFAULT NULL,
  `itemTypeId` varchar(55) DEFAULT NULL,
  `callBackUrl` varchar(255) DEFAULT NULL,
  `consentPageImageUrl` varchar(255) DEFAULT NULL,
  `consentPageNoUrl` varchar(255) DEFAULT NULL,
  `mode` varchar(55) DEFAULT NULL,
  `dirtNetworkParams` varchar(55) DEFAULT NULL,
  `source` varchar(55) DEFAULT NULL,
  `availFreeTrial` varchar(55) DEFAULT NULL,
  `deviceType` varchar(55) DEFAULT NULL,
  `adult` varchar(55) DEFAULT NULL,
  `languageId` varchar(45) NOT NULL,
  `microSiteId` varchar(45) NOT NULL,
  `clientRequestInfo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userId_UNIQUE` (`userId`),
  UNIQUE KEY `msisdn_UNIQUE` (`msisdn`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_charge_user: ~14 rows (approximately)
/*!40000 ALTER TABLE `step_charge_user` DISABLE KEYS */;
INSERT INTO `step_charge_user` (`productName`, `productSource`, `id`, `userId`, `msisdn`, `billingCode`, `circleCode`, `orderId`, `chargeDescription`, `partnerToken`, `headerRefCode`, `itemId`, `itemTypeId`, `callBackUrl`, `consentPageImageUrl`, `consentPageNoUrl`, `mode`, `dirtNetworkParams`, `source`, `availFreeTrial`, `deviceType`, `adult`, `languageId`, `microSiteId`, `clientRequestInfo`) VALUES
	('PAYTM', 'ACT_DP_IN_PP01_SUCCESS', 2, '9900000001', '9900000001', '1-2-IN-990-1537461295378', 'MH', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'NO', 'iphone', 'abc', 'en', '123', '123'),
	('PAYTM', 'ACT_DP_IN_FAILURE_PP01', 7, '9900000002', '9900000002', '1-2-IN-990-1537461295378', 'MH', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'NO', 'iphone', 'abc', 'en', '123', '123'),
	('PAYTM', 'WAP_ACTIVATION99_PENDING', 8, '9900000003', '9900000003', '1-2-IN-990-1537461295378', 'MH', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'NO', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'ACT_FT_AE_PP01_SUCCESS', 9, '8900000003', '8900000003', '1-3-AE-799-1542191810585', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'ACT_DP_AE_PP01_SUCCESS', 10, '8900000001', '8900000001', '1-3-AE-799-1542191810533', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'WAP_ACTIVATION-COMMONDP8_SUCCESS', 11, '8900000002', '8900000002', '1-3-AE-799-1542191810585', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'DCT_DP_WV_AE_PP01_SUCCESS', 12, '8900000004', '8900000004', '1-3-AE-799-1542191810533', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'DCT_DP_WOV_AE_PP01_SUCCESS', 13, '8900000005', '8900000005', '1-3-AE-799-1542191810533', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'REN_DP_AE_PP01_SUCCESS', 14, '8900000006', '8900000006', '1-3-AE-799-1542191810533', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'REN_FT_AE_PP01_SUCCESS', 15, '8900000007', '8900000007', '1-3-AE-799-1542191810585', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'ACT_FT_SA_PP01_SUCCESS', 16, '8700000003', '8700000003', '1-3-SA-799-1542265367821', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'DCT_DP_WV_SA_PP01_SUCCESS', 17, '8700000004', '8700000004', '1-3-SA-799-1542265367821', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'DCT_DP_WOV_SA_PP01_SUCCESS', 18, '8700000005', '8700000005', '1-3-SA-799-1542265367821', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123'),
	('PAYPAL', 'REN_DP_SA_PP01_SUCCESS', 19, '8700000006', '8700000006', '1-3-SA-799-1542265367821', 'NA', '123', 'test1', 'test1', 'test1', '1', '12', 'http://www.google.com/', 'http://www.google.com/', 'http://192.168.250.72:8080/home', 'WAP', 'kp=48578745510%2Ctid', 'D_KIM_58478584', 'Yes', 'iphone', 'abc', 'en', '123', '123');
/*!40000 ALTER TABLE `step_charge_user` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_create_scheduled_activity_service
CREATE TABLE IF NOT EXISTS `step_create_scheduled_activity_service` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `msisdn` varchar(45) NOT NULL,
  `countryCode` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `attempNumber` varchar(45) DEFAULT NULL,
  `isEligible` varchar(45) DEFAULT NULL,
  `userId` varchar(45) NOT NULL,
  `date` varchar(55) DEFAULT NULL,
  `subscriptionId` varchar(45) DEFAULT NULL,
  `tableName` varchar(45) DEFAULT NULL,
  `enable` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `msisdn_UNIQUE` (`msisdn`),
  UNIQUE KEY `userId_UNIQUE` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_create_scheduled_activity_service: ~1 rows (approximately)
/*!40000 ALTER TABLE `step_create_scheduled_activity_service` DISABLE KEYS */;
INSERT INTO `step_create_scheduled_activity_service` (`id`, `msisdn`, `countryCode`, `status`, `attempNumber`, `isEligible`, `userId`, `date`, `subscriptionId`, `tableName`, `enable`) VALUES
	(1, '9900000011', 'IN', 'OPEN', '1', '1', '9900000011', 'willserfromcreatedusersubscriptionrecord', '990110001', 'renewal', 'true');
/*!40000 ALTER TABLE `step_create_scheduled_activity_service` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_create_talend_entry
CREATE TABLE IF NOT EXISTS `step_create_talend_entry` (
  `ubsTransactionId` varchar(500) NOT NULL,
  `partnerTransactionId` varchar(500) DEFAULT NULL,
  `msisdn` varchar(20) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  `billingCode` varchar(45) DEFAULT NULL,
  `activityType` varchar(500) DEFAULT NULL,
  `productId` varchar(20) DEFAULT NULL,
  `partnerId` varchar(20) DEFAULT NULL,
  `countryCode` varchar(45) DEFAULT NULL,
  `accessMode` varchar(40) DEFAULT NULL,
  `createDate` varchar(50) NOT NULL,
  `lastUpdateDate` varchar(50) NOT NULL,
  PRIMARY KEY (`ubsTransactionId`(255))
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_create_talend_entry: ~11 rows (approximately)
/*!40000 ALTER TABLE `step_create_talend_entry` DISABLE KEYS */;
INSERT INTO `step_create_talend_entry` (`ubsTransactionId`, `partnerTransactionId`, `msisdn`, `userId`, `billingCode`, `activityType`, `productId`, `partnerId`, `countryCode`, `accessMode`, `createDate`, `lastUpdateDate`) VALUES
	('TRANSACTION_KEY8700000004', 'I-COMMONS8-8700000004', '8700000004', '8700000004', '1-3-SA-799-1542265367821', 'ACTIVATION', '1', '3', 'SA', 'WAP', 'now()', 'now()'),
	('TRANSACTION_KEY8700000005', 'I-COMMONS8-8700000005', '8700000005', '8700000005', '1-3-SA-799-1542265367821', 'ACTIVATION', '1', '3', 'SA', 'WAP', 'now()', 'now()'),
	('TRANSACTION_KEY8700000006', 'I-COMMONS8-8700000006', '8700000006', '8700000006', '1-3-SA-799-1542265367821', 'ACTIVATION', '1', '3', 'SA', 'WAP', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY'),
	('TRANSACTION_KEY8900000004', 'I-DP8-8900000004', '8900000004', '8900000004', '1-3-AE-799-1542191810533', 'ACTIVATION', '1', '3', 'AE', 'WAP', 'now()', 'now()'),
	('TRANSACTION_KEY8900000005', 'I-DP8-8900000005', '8900000005', '8900000005', '1-3-AE-799-1542191810533', 'ACTIVATION', '1', '3', 'AE', 'WAP', 'now()', 'now()'),
	('TRANSACTION_KEY8900000006', 'I-DP8-8900000006', '8900000006', '8900000006', '1-3-AE-799-1542191810585', 'ACTIVATION', '1', '3', 'AE', 'WAP', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY'),
	('TRANSACTION_KEY8900000007', 'I-COMMON8-8900000007', '8900000007', '8900000007', '1-3-AE-0-1542191810506', 'ACTIVATION', '1', '3', 'AE', 'WAP', 'now()- INTERVAL 8  DAY', 'now()- INTERVAL 8  DAY'),
	('TRANSACTION_KEY9900000004', '199000000119', '9900000004', '9900000004', '1-2-IN-990-1537461295378', 'ACTIVATION', '1', '2', 'IN', 'WAP', 'now()- INTERVAL 1  DAY', 'now()- INTERVAL 1  DAY'),
	('TRANSACTION_KEY9900000005', '199000000559', '9900000005', '9900000005', '1-2-IN-990-1537461295378', 'ACTIVATION', '1', '2', 'IN', 'WAP', 'now()- INTERVAL 90  DAY', 'now()- INTERVAL 90  DAY'),
	('TRANSACTION_KEY9900000006', '199299000559', '9900000006', '9900000006', '1-2-IN-2990-1537461295340', 'ACTIVATION', '1', '2', 'IN', 'WAP', 'now()', 'now()'),
	('TRANSACTION_KEY9900000007', '199299000560', '9900000007', '9900000007', '1-2-IN-2990-1537461295340', 'ACTIVATION', '1', '2', 'IN', 'WAP', 'now() -  INTERVAL 180  DAY', 'now() -  INTERVAL 180  DAY');
/*!40000 ALTER TABLE `step_create_talend_entry` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_create_user_subscription
CREATE TABLE IF NOT EXISTS `step_create_user_subscription` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productName` varchar(45) NOT NULL,
  `productSource` varchar(145) NOT NULL DEFAULT '',
  `userId` varchar(255) DEFAULT NULL,
  `msisdn` varchar(45) DEFAULT NULL,
  `subscriptionId` varchar(20) NOT NULL,
  `productId` varchar(11) DEFAULT NULL,
  `partnerId` varchar(11) DEFAULT NULL,
  `createdOn` varchar(50) DEFAULT NULL,
  `lastUpdatedOn` varchar(50) DEFAULT NULL,
  `activationDate` varchar(50) DEFAULT NULL,
  `startDate` varchar(50) DEFAULT NULL,
  `endDate` varchar(50) DEFAULT NULL,
  `deactivationDate` varchar(50) DEFAULT NULL,
  `nextBillingDate` varchar(50) DEFAULT NULL,
  `lastChargeDate` varchar(50) DEFAULT NULL,
  `chargedBillingCode` varchar(45) DEFAULT NULL,
  `subscriptionBillingCode` varchar(45) DEFAULT NULL,
  `chargedPrice` double DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `circleCode` varchar(255) DEFAULT NULL,
  `customerTransactionId` varchar(45) DEFAULT NULL,
  `itemId` varchar(11) DEFAULT NULL,
  `itemTypeId` varchar(11) DEFAULT NULL,
  `mode` varchar(45) DEFAULT NULL,
  `paid` varchar(20) DEFAULT NULL,
  `renewalAllowed` varchar(20) DEFAULT NULL,
  `subscriptionStatus` varchar(255) DEFAULT NULL,
  `validityDays` varchar(11) DEFAULT NULL,
  `userPrefferedLanguage` varchar(255) DEFAULT NULL,
  `userSource` varchar(45) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_create_user_subscription: ~112 rows (approximately)
/*!40000 ALTER TABLE `step_create_user_subscription` DISABLE KEYS */;
INSERT INTO `step_create_user_subscription` (`id`, `productName`, `productSource`, `userId`, `msisdn`, `subscriptionId`, `productId`, `partnerId`, `createdOn`, `lastUpdatedOn`, `activationDate`, `startDate`, `endDate`, `deactivationDate`, `nextBillingDate`, `lastChargeDate`, `chargedBillingCode`, `subscriptionBillingCode`, `chargedPrice`, `country`, `circleCode`, `customerTransactionId`, `itemId`, `itemTypeId`, `mode`, `paid`, `renewalAllowed`, `subscriptionStatus`, `validityDays`, `userPrefferedLanguage`, `userSource`, `currency`) VALUES
	(3, 'PAYTM', 'REN_DP_IN_PP01_SUCCESS', '9900000011', '9900000011', '990110001', '1', '2', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 1 DAY', 'NOW() - INTERVAL 1 DAY', '1-2-IN-990-1537461295378', '1-2-IN-990-1537461295378', 99, 'IN', 'MH', '199000000111', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '90', 'en', 'USER_SOURCE', 'INR'),
	(4, 'subscription-service', 'GET_USER_STATUS_ACT_INIT', '1000000000', '1000000000', '11011', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 1 DAY', 'NOW() - INTERVAL 1 DAY', 'BC03', 'BC03', 99, 'IN', 'MH', '199000000111', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '90', 'en', 'USER_SOURCE', 'INR'),
	(5, 'subscription-service', 'GET_USER_STATUS_ACTIVATED', '1000000001', '1000000001', '11012', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 1 DAY', 'NOW() - INTERVAL 1 DAY', 'BC03', 'BC03', 99, 'IN', 'MH', '199000000111', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '90', 'en', 'USER_SOURCE', 'INR'),
	(6, 'subscription-service', 'GET_USER_STATUS_DEACTIVATEDVALIDITYEXPIRED', '1000000002', '1000000002', '11013', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 1 DAY', 'NOW() - INTERVAL 1 DAY', 'BC03', 'BC03', 99, 'IN', 'MH', '199000000111', '1', '12', 'WAP', '1', '1', 'DEACTIVATED', '90', 'en', 'USER_SOURCE', 'INR'),
	(8, 'subscription-service', 'GET_USER_STATUS_DEACTIVATED', '1000000003', '1000000003', '11014', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() - INTERVAL 100  DAY', 'null', 'NOW() - INTERVAL 1 DAY', 'NOW() - INTERVAL 1 DAY', 'BC03', 'BC03', 99, 'IN', 'MH', '199000000111', '1', '12', 'WAP', '1', '1', 'DEACTIVATED', '90', 'en', 'USER_SOURCE', 'INR'),
	(9, 'subscription-service', 'GET_USER_STATUS_NEW_USER', '1000000004', '1000000004', '11015', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 1 DAY', 'NOW() - INTERVAL 1 DAY', 'BC03', 'BC03', 99, 'IN', 'MH', '199000000111', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '90', 'en', 'USER_SOURCE', 'INR'),
	(10, 'PAYPAL', 'DCT_DP_WV_AE_PP01_SUCCESS', '8900000004', '8900000004', '132990001', '1', '3', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 30 DAY', 'NOW() - INTERVAL 1 DAY', '1-3-AE-799-1542191810533', '1-3-AE-799-1542191810533', 30, 'AE', NULL, 'I-DP8-8900000004', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'AED'),
	(12, 'subscription-service', 'ST_ACT_INIT_ACTIVATION_FAILURE', '2000000000', '2000000000', '2000000000', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000001', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '90', 'en', 'USER_SOURCE', 'INR'),
	(16, 'subscription-service', 'ST_ACT_INIT_ACTIVATION_LOW_BALANCE', '2000000002', '2000000002', '2000000002', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000021', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '5', 'en', 'USER_SOURCE', 'INR'),
	(17, 'subscription-service', 'ST_ACT_INIT_ACTIVATION_ERROR', '2000000003', '2000000003', '2000000003', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000031', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '5', 'en', 'USER_SOURCE', 'INR'),
	(18, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_SUCCESS_TRUE', '2000000004', '2000000004', '2000000004', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000041', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '5', 'en', 'USER_SOURCE', 'INR'),
	(19, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_SUCCESS_FALSE', '2000000005', '2000000005', '2000000005', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000051', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '5', 'en', 'USER_SOURCE', 'INR'),
	(20, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_FAILURE', '2000000006', '2000000006', '2000000006', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000061', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '5', 'en', 'USER_SOURCE', 'INR'),
	(21, 'subscription-service', 'ST_ACT_INIT_REGISTRATION_ERROR', '2000000007', '2000000007', '2000000007', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '5', 'en', 'USER_SOURCE', 'INR'),
	(22, 'PAYPAL', 'DCT_DP_WOV_AE_PP01_SUCCESS', '8900000005', '8900000005', '132990002', '1', '3', 'now()', 'now()', 'now()', 'now()', 'NOW() - INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 30 DAY', 'NOW() - INTERVAL 1 DAY', '1-3-AE-799-1542191810533', '1-3-AE-799-1542191810533', 30, 'AE', NULL, 'I-DP8-8900000005', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'AED'),
	(23, 'PAYPAL', 'REN_DP_AE_PP01_SUCCESS', '8900000006', '8900000006', '132990003', '1', '3', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW()', 'NOW() - INTERVAL 28 DAY', '1-3-AE-799-1542191810585', '1-3-AE-799-1542191810585', 30, 'AE', NULL, 'I-DP8-8900000006', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'AED'),
	(24, 'PAYPAL', 'REN_FT_AE_PP01_SUCCESS', '8900000007', '8900000007', '132990004', '1', '3', 'now()- INTERVAL 8  DAY', 'now()- INTERVAL 8  DAY', 'now()- INTERVAL 8  DAY', 'now()- INTERVAL 8  DAY', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW()', 'NOW() - INTERVAL 28 DAY', '1-3-AE-0-1542191810506', '1-3-AE-799-1542191810585', 30, 'AE', NULL, 'I-COMMON8-8900000007', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '8', 'en', 'USER_SOURCE', 'AED'),
	(25, 'subscription-service', 'BLOCK_TEST_BLACKLIST_USER', '3000000001', '3000000001', '3000000001', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '1', '1', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(26, 'subscription-service', 'BLOCK_TEST_NOT_BLACKLIST_USER', '3000000002', '3000000002', '3000000002', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() - INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '1', '1', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(27, 'subscription-service', 'BLOCK_TEST_NOT_BLACKLIST_NEW_USER', '3000000003', '3000000003', '3000000003', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '1', '1', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(28, 'subscription-service', 'BLOCK_TEST_NEW_USER', '3000000004', '3000000004', '3000000004', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() + INTERVAL 5 DAY', 'NOW() ', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '1', '1', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(29, 'subscription-service', 'DEACTIVATED_UNBLOCK_BLACKLIST', '3000000005', '3000000005', '3000000005', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 300  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(30, 'subscription-service', 'DEACTIVATED_UNBLOCK_COOLDOWN', '3000000006', '3000000006', '3000000006', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 300  DAY', '', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(31, 'subscription-service', 'DEACTIVATED_UNBLOCK_NOT_BLACKLISTED', '3000000007', '3000000007', '3000000007', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30 DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(32, 'subscription-service', 'BLOCK_ACTIVATED_BLACKLIST_WO_USERID', ' ', '4000000001', '4000000001', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 100 DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(33, 'subscription-service', 'CONFIRM_IS_NOT_CLOSED', '5000000001', '5000000001', '', '1', '1', '1541738453289', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 100 DAY', 'NOW() - INTERVAL 30  DAY', '1541738453289', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '150000000011', '1', '12', 'WAP', '0', '0', 'NA', '5', 'en', 'USER_SOURCE', 'INR'),
	(34, 'subscription-service', 'CONFIRM_IS_CLOSED', '5000000002', '5000000002', '', '1', '1', '1541738453289', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 100 DAY', 'NOW() - INTERVAL 30  DAY', '1541738453289', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '150000000011', '1', '12', 'WAP', '0', '0', 'NA', '5', 'en', 'USER_SOURCE', 'INR'),
	(35, 'subscription-service', 'GET_USER_STATUS_RESPONSE_ACT_INIT', '6000000001', '6000000001', '6000000001', '1', '1', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 2  DAY', 'null', 'NOW() + INTERVAL 1 DAY', 'NOW() - INTERVAL 1 DAY', 'BC03', 'BC03', 99, 'IN', 'MH', '160000000011', '1', '12', 'WAP', '1', '1', 'ACT_INIT', '90', 'en', 'USER_SOURCE', 'INR'),
	(36, 'subscription-service', 'ST_CONFIRM_DEACTIVATION_ACTIVATION', '5000000003', '5000000003', '5000000003', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30 DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(37, 'subscription-service', 'CONFIRM_CONSENT_CHRG_CLOSED', '5000000004', '5000000004', '5000000004', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30 DAY', 'NOW() - INTERVAL 30  DAY', '1530253086000', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(38, 'subscription-service', 'BLOCK_ACTIVATED_BLACKLIST_WO_MSISDN', '4000000002', '', '4000000002', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 100 DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(39, 'subscription-service', 'BLOCK_ACTIVATED_BLACKLIST', '4000000003', '4000000003', '4000000003', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 100 DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(40, 'subscription-service', 'BLOCK_ACTIVATED_COOLDOWN', '4000000004', '4000000004', '4000000004', '1', '1', 'NOW() - INTERVAL 30  DAY', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 100 DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '120000000071', '1', '12', 'WAP', '0', '0', 'DEACTIVATED', '5', 'en', 'USER_SOURCE', 'INR'),
	(42, 'subscription-service', 'ST_ACT_INIT_ACTIVATION_SUCCESS', '11111111', '11111111', '11111111', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929724200000', '1930253086000', NULL, '1535520606000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '11111111', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USERSOURCE', 'INR'),
	(43, 'subscription-service', 'ST_ACT_INIT__ACTIVATION_LOWBALANCE', '11111112', '11111112', '11111112', '8181', '8181', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1930253086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '11111112', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USERSOURCE', 'CURRENCY'),
	(44, 'PAYTM', 'DCT_DP_WV_IN_PP01_SUCCESS', '9900000004', '9900000004', '990110002', '1', '2', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 90  DAY', 'null', 'NOW() + INTERVAL 90 DAY', 'NOW() ', '1-2-IN-990-1537461295378', '1-2-IN-990-1537461295378', 99, 'IN', 'MH', '199000000119', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '90', 'en', 'USER_SOURCE', 'INR'),
	(45, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_CHARGING_SUCCESS_TRUE_ACTIVATED', '77000000000', '77000000000', '77000', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929724200000', '1930253086000', NULL, '1535520606000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000000', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(46, 'PAYTM', 'DCT_DP_WOV_IN_PP01_SUCCESS', '9900000005', '9900000005', '990110003', '1', '2', 'now()- INTERVAL 90 DAY', 'now()- INTERVAL 90 DAY', 'now()- INTERVAL 90 DAY', 'now()- INTERVAL 90 DAY', 'NOW()', 'null', 'NOW() ', 'now()- INTERVAL 90 DAY', '1-2-IN-990-1537461295378', '1-2-IN-990-1537461295378', 99, 'IN', 'MH', '199000000559', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '90', 'en', 'USER_SOURCE', 'INR'),
	(47, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_CHARGING_LOW_BALANCE_TRUE_PARKING', '77000000001', '77000000001', '77001', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1930253086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000001', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(48, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_SUCCESS_TRUE_ACTIVATED', '77000000002', '77000000002', '77002', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000002', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(49, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_SUCCESS_FALSE_ACT_INIT', '77000000003', '77000000003', '77003', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000003', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(50, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_ERROR_TRUE_ACT_INIT', '77000000004', '77000000004', '77004', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000004', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(51, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_REGISTRATION_FAILURE_TRUE_ACT_INIT', '77000000005', '77000000005', '77005', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000005', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(53, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_CHARGING_SUCCESS_TRUE_ACTIVATED', '77000000007', '77000000007', '77007', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1530253086000', '1930253086000', NULL, '1535520606000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000007', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(54, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_SUCCESS_TRUE_ACTIVATED', '77000000008', '77000000008', '77008', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000008', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(55, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_SUCCESS_FALSE_ACT_INIT', '77000000009', '77000000009', '77009', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000009', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(56, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_ERROR_TRUE_ACT_INIT', '770000000010', '770000000010', '770010', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000010', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(57, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_REGISTRATION_FAILURE_TRUE_ACT_INIT', '770000000011', '770000000011', '770011', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000011', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(58, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_RETRY_CHARGING_LOW_BALANCE_TRUE_PARKING', '770000000012', '770000000012', '770012', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1930253086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000012', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(60, 'subscription-service', 'S_T_PARKING_WINBACK_CHARGING_LOW_BALANCE_TRUE_PARKING', '770000000014', '770000000014', '770014', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1530253086000', '1944077086000', NULL, '1530253086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000014', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(61, 'subscription-service', 'S_T_PARKING_WINBACK_CHARGING_ERROR_TRUE_PARKING', '770000000015', '770000000015', '770015', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000015', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(62, 'subscription-service', 'S_T_PARKING_WINBACK_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000016', '770000000016', '770016', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000016', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(63, 'subscription-service', 'S_T_ACT_INIT_RENEWAL_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000017', '770000000017', '770017', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000017', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(64, 'subscription-service', 'S_T_ACT_INIT_RENEWAL_CHARGING_LOW_BALANCE_TRUE_SUSPEND', '770000000018', '770000000018', '770018', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000018', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(65, 'subscription-service', 'S_T_ACT_INIT_RENEWAL_CHARGING_FAILURE_TRUE_SUSPEND', '770000000019', '770000000019', '770019', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1930253086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000019', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(66, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000020', '770000000020', '770020', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000020', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(67, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_ERROR_TRUE_ACTIVATED', '770000000021', '770000000021', '770021', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000021', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(68, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_LOW_BALANCE_TRUE_SUSPEND', '770000000022', '770000000022', '770022', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000022', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(69, 'subscription-service', 'S_T_ACTIVATED_RENEWAL_CHARGING_FAILURE_TRUE_SUSPEND', '770000000023', '770000000023', '770023', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000023', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(70, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_FAILURE_TRUE_SUSPEND', '770000000024', '770000000024', '770024', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000024', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(71, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_ERROR_TRUE_SUSPEND', '770000000025', '770000000025', '770025', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000025', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(72, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_LOW_BALANCE_TRUE_SUSPEND', '770000000026', '770000000026', '770026', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000026', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(73, 'subscription-service', 'S_T_SUSPEND_RENEWAL_CHARGING_SUCCESS_TRUE_ACTIVATED', '770000000027', '770000000027', '770027', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1944077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000027', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(74, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_RETRY_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000028', '770000000028', '770028', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000028', '1', '12', 'WAP', '0', '0', 'DCT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(75, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_RETRY_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000029', '770000000029', '770029', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000029', '1', '12', 'WAP', '0', '0', 'DCT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(76, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_RETRY_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000030', '770000000030', '770030', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1543645086000', '1544077086000', NULL, '1545805086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000030', '1', '12', 'WAP', '0', '0', 'DCT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(77, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000031', '770000000031', '770031', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, '1530253086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000031', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(78, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000032', '770000000032', '770032', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000032', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(79, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000033', '770000000033', '770033', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000033', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(80, 'subscription-service', 'S_T_ACT_INIT_SYSTEM_CHURN_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000034', '770000000034', '770034', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000034', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(81, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000035', '770000000035', '770035', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000035', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(82, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000036', '770000000036', '770036', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000036', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(83, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000037', '770000000037', '770037', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000037', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(84, 'subscription-service', 'S_T_SUSPEND_SYSTEM_CHURN_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000038', '770000000038', '770038', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000038', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(85, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000039', '770000000039', '770039', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000039', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(86, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000040', '770000000040', '770040', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000040', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(87, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000041', '770000000041', '770041', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000041', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(88, 'subscription-service', 'S_T_PARKING_SYSTEM_CHURN_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000042', '770000000042', '770042', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000042', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(89, 'subscription-service', 'S_T_ACTIVATED_SYSTEM_CHURN_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000043', '770000000043', '770043', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000043', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(90, 'subscription-service', 'S_T_ACTIVATED_SYSTEM_CHURN_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000044', '770000000044', '770044', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000044', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(91, 'subscription-service', 'S_T_ACTIVATED_SYSTEM_CHURN_PROCESS_DEACTIVATE_IN_PROGRESS_FALSE_DCT_INIT', '770000000045', '770000000045', '770045', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000045', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(93, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000047', '770000000047', '770047', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, '1530253086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000047', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(94, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000048', '770000000048', '770048', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000048', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(95, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000049', '770000000049', '770049', '1', '1', '2018-06-29 11:47:54', NULL, '1930253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000049', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(96, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000050', '770000000050', '770050', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000050', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(97, 'subscription-service', 'S_T_ACT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000051', '770000000051', '770051', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000051', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(98, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000052', '770000000052', '770052', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, '1530253086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000052', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(99, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000053', '770000000053', '770053', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000053', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(100, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000054', '770000000054', '770054', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000054', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(101, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000055', '770000000055', '770055', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000055', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(102, 'subscription-service', 'S_T_SUSPEND_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000056', '770000000056', '770056', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000056', '1', '12', 'WAP', '0', '0', 'SUSPEND', '30', 'en', 'USER_SOURCE', 'INR'),
	(103, 'subscription-service', 'S_T_PARKING_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000057', '770000000057', '770057', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, '1530253086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000057', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(104, 'subscription-service', 'S_T_PARKING_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000058', '770000000058', '770058', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000058', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(105, 'subscription-service', 'S_T_PARKING_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000059', '770000000059', '770059', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000059', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(106, 'subscription-service', 'S_T_PARKING_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000060', '770000000060', '770060', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000060', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(107, 'subscription-service', 'S_T_PARKING_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000061', '770000000061', '770061', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000061', '1', '12', 'WAP', '0', '0', 'PARKING', '30', 'en', 'USER_SOURCE', 'INR'),
	(108, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_FALSE_DCT_INIT', '770000000062', '770000000062', '770062', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, '1530253086000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000062', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(109, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_DEACTIVATE_CONSENT_CONFIRMED_TRUE_DEACTIVATED', '770000000063', '770000000063', '770063', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000063', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(110, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000064', '770000000064', '770064', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000064', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(111, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000065', '770000000065', '770065', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000065', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(112, 'subscription-service', 'S_T_ACTIVATED_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000066', '770000000066', '770066', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000066', '1', '12', 'WAP', '0', '0', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'INR'),
	(113, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_SUCCESS_TRUE_DEACTIVATED', '770000000067', '770000000067', '770067', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000067', '1', '12', 'WAP', '0', '0', 'DCT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(114, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_FAILURE_TRUE_DCT_INIT', '770000000068', '770000000068', '770068', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000068', '1', '12', 'WAP', '0', '0', 'DCT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(115, 'subscription-service', 'S_T_DCT_INIT_DEACTIVATION_PROCESS_DEACTIVATE_ERROR_TRUE_DCT_INIT', '770000000069', '770000000069', '770069', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929810600000', '1930253086000', NULL, 'null', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '770000000069', '1', '12', 'WAP', '0', '0', 'DCT_INIT', '30', 'en', 'USER_SOURCE', 'INR'),
	(116, 'PAYTM', 'DCT_DP_WV_IN_PP02_SUCCESS', '9900000006', '9900000006', '990110004', '1', '2', 'now()', 'now()', 'now()', 'now()', 'NOW()+ INTERVAL 180  DAY', 'null', 'NOW() +  INTERVAL 180 DAY', 'now()', '1-2-IN-2990-1537461295340', '1-2-IN-2990-1537461295340', 299, 'IN', 'MH', '199299000559', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '180', 'en', 'USER_SOURCE', 'INR'),
	(117, 'PAYTM', 'DCT_DP_WOV_IN_PP02_SUCCESS', '9900000007', '9900000007', '990110005', '1', '2', 'now() - INTERVAL 180  DAY', 'now() -  INTERVAL 180  DAY', 'now() -  INTERVAL 180  DAY', 'now() -  INTERVAL 180  DAY', 'NOW()', 'null', 'NOW()', 'now()- INTERVAL 180 DAY', '1-2-IN-2990-1537461295340', '1-2-IN-2990-1537461295340', 299, 'IN', 'MH', '199299000560', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '180', 'en', 'USER_SOURCE', 'INR'),
	(118, 'PAYPAL', 'DCT_DP_WOV_SA_PP01_SUCCESS', '8700000005', '8700000005', '132990005', '1', '3', 'now()', 'now()', 'now()', 'now()', 'NOW() - INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 30 DAY', 'NOW() - INTERVAL 1 DAY', '1-3-SA-799-1542265367821', '1-3-SA-799-1542265367821', 30, 'SA', NULL, 'I-COMMONS8-8700000005', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'SAR'),
	(119, 'PAYPAL', 'DCT_DP_WV_SA_PP01_SUCCESS', '8700000004', '8700000004', '132990006', '1', '3', 'now()', 'now()', 'now()', 'now()', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW() - INTERVAL 30 DAY', 'NOW() - INTERVAL 1 DAY', '1-3-SA-799-1542265367821', '1-3-SA-799-1542265367821', 30, 'SA', NULL, 'I-COMMONS8-8700000004', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'SAR'),
	(120, 'PAYPAL', 'REN_FT_SA_PP01_SUCCESS', '8700000007', '8700000007', '132990007', '1', '3', 'now()- INTERVAL 8  DAY', 'now()- INTERVAL 8  DAY', 'now()- INTERVAL 8  DAY', 'now()- INTERVAL 8  DAY', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW()', 'NOW() - INTERVAL 28 DAY', '1-3-SA-0-1542265367808', '1-3-SA-799-1542265367821', 30, 'SA', NULL, 'I-COMMON8-8700000007', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '7', 'en', 'USER_SOURCE', 'SAR'),
	(122, 'PAYPAL', 'REN_DP_SA_PP01_SUCCESS', '8700000006', '8700000006', '132990008', '1', '3', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY', 'now()- INTERVAL 28  DAY', 'NOW() + INTERVAL 1  DAY', 'null', 'NOW()', 'NOW() - INTERVAL 28 DAY', '1-3-SA-799-1542265367821', '1-3-SA-799-1542265367821', 30, 'SA', NULL, 'I-COMMONS8-8700000006', '1', '12', 'WAP', '1', '1', 'ACTIVATED', '30', 'en', 'USER_SOURCE', 'SAR'),
	(123, 'subscription-service', 'CONFIRM_ERROR', '5000000005', '5000000005', '', '1', '1', '1541738453289', 'now()', 'NOW() - INTERVAL 30  DAY', 'NOW() - INTERVAL 30  DAY', 'NOW() + INTERVAL 100 DAY', 'NOW() - INTERVAL 30  DAY', '1541738453289', 'NOW() - INTERVAL 30  DAY', 'BC03', 'BC03', 99, 'MY', 'MH', '150000000011', '1', '12', 'WAP', '0', '0', 'NA', '5', 'en', 'USER_SOURCE', 'INR'),
	(124, 'subscription-service', 'S_T_ACT_INIT_ACTIVATION_CHARGING_SUCCESS_FALSE_ACTIVATED', '77000000100', '77000000100', '77100', '1', '1', '2018-06-29 11:47:54', NULL, '1530253086000', '1929724200000', '1930253086000', NULL, '1535520606000', NULL, 'BC03', 'BC03', 0, 'MY', 'MH', '77000000100', '1', '12', 'WAP', '0', '0', 'ACT_INIT', '30', 'en', 'USER_SOURCE', 'INR');
/*!40000 ALTER TABLE `step_create_user_subscription` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_free_trial_history
CREATE TABLE IF NOT EXISTS `step_free_trial_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productName` varchar(100) DEFAULT NULL,
  `productSource` varchar(100) DEFAULT NULL,
  `userId` varchar(255) DEFAULT NULL,
  `msisdn` varchar(255) DEFAULT NULL,
  `createdOn` varchar(90) DEFAULT NULL,
  `lastUpdatedOn` varchar(90) DEFAULT NULL,
  `availedFreeTrialCount` varchar(20) DEFAULT NULL,
  `lastFreeTrialBillingCode` varchar(255) DEFAULT NULL,
  `lastFreeTrialDate` varchar(90) DEFAULT NULL,
  `partnerId` varchar(20) DEFAULT NULL,
  `productId` varchar(20) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table ubs_test_data_service.step_free_trial_history: ~2 rows (approximately)
/*!40000 ALTER TABLE `step_free_trial_history` DISABLE KEYS */;
INSERT INTO `step_free_trial_history` (`id`, `productName`, `productSource`, `userId`, `msisdn`, `createdOn`, `lastUpdatedOn`, `availedFreeTrialCount`, `lastFreeTrialBillingCode`, `lastFreeTrialDate`, `partnerId`, `productId`, `country`) VALUES
	(1, 'subscription-service', 'VALID_USER_FREE', '1122000000', '1122000000', '2018-04-29 11:47:54', '2018-04-29 11:47:54', '1', 'BC03', '2018-04-29 11:47:54', '1', '1', 'MY'),
	(2, 'subscription-service', 'NEW_USER', '1122000001', '1122000001', 'NA', 'NA', 'NA', 'NA', 'NA', '1', '1', 'MY');
/*!40000 ALTER TABLE `step_free_trial_history` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_validation_ad_network
CREATE TABLE IF NOT EXISTS `step_validation_ad_network` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `adNotificationstatus` varchar(255) DEFAULT NULL,
  `churnAdNotificationStatus` varchar(255) DEFAULT NULL,
  `churnAdNetworkTransactionId` varchar(255) DEFAULT NULL,
  `churnRetryCount` varchar(50) DEFAULT NULL,
  `msisdn` varchar(255) NOT NULL,
  `userId` varchar(255) NOT NULL,
  `retryCount` varchar(50) DEFAULT NULL,
  `userSource` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `msisdn_UNIQUE` (`msisdn`),
  UNIQUE KEY `userId_UNIQUE` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_validation_ad_network: ~3 rows (approximately)
/*!40000 ALTER TABLE `step_validation_ad_network` DISABLE KEYS */;
INSERT INTO `step_validation_ad_network` (`id`, `adNotificationstatus`, `churnAdNotificationStatus`, `churnAdNetworkTransactionId`, `churnRetryCount`, `msisdn`, `userId`, `retryCount`, `userSource`) VALUES
	(1, 'NA', 'NA', 'NA', 'NA', '9900000001', '9900000001', 'NA', 'NA'),
	(3, 'NA', 'NA', 'NA', 'NA', '9900000002', '9900000002', 'NA', 'NA'),
	(4, 'NA', 'NA', 'NA', 'NA', '9900000003', '9900000003', 'NA', 'NA');
/*!40000 ALTER TABLE `step_validation_ad_network` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_validation_get_user_status
CREATE TABLE IF NOT EXISTS `step_validation_get_user_status` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(45) DEFAULT NULL,
  `msisdn` varchar(50) DEFAULT NULL,
  `successful` varchar(50) DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL,
  `responseCode` varchar(50) DEFAULT NULL,
  `summary` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_validation_get_user_status: ~6 rows (approximately)
/*!40000 ALTER TABLE `step_validation_get_user_status` DISABLE KEYS */;
INSERT INTO `step_validation_get_user_status` (`id`, `userId`, `msisdn`, `successful`, `message`, `responseCode`, `summary`) VALUES
	(1, '1000000000', '1000000000', 'true', 'success', '200', 'ACTIVATION_IN_PROGRESS'),
	(2, '1000000001', '1000000001', 'true', 'success', '200', 'ACTIVE'),
	(3, '1000000002', '1000000002', 'true', 'success', '200', 'INACTIVE_WITH_VALIDITY'),
	(4, '1000000003', '1000000003', 'true', 'success', '200', 'INACTIVE'),
	(5, '1000000004', '1000000004', 'true', 'success', '200', 'null'),
	(6, '6000000001', '6000000001', 'true', 'success', '200', 'ACTIVATION_IN_PROGRESS');
/*!40000 ALTER TABLE `step_validation_get_user_status` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_validation_scheduled_activity_service
CREATE TABLE IF NOT EXISTS `step_validation_scheduled_activity_service` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `msisdn` varchar(45) NOT NULL,
  `countryCode` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `attempNumber` varchar(45) DEFAULT NULL,
  `isEligible` varchar(45) DEFAULT NULL,
  `userId` varchar(45) NOT NULL,
  `date` varchar(55) DEFAULT NULL,
  `subscriptionId` varchar(45) DEFAULT NULL,
  `tableName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_validation_scheduled_activity_service: ~5 rows (approximately)
/*!40000 ALTER TABLE `step_validation_scheduled_activity_service` DISABLE KEYS */;
INSERT INTO `step_validation_scheduled_activity_service` (`id`, `msisdn`, `countryCode`, `status`, `attempNumber`, `isEligible`, `userId`, `date`, `subscriptionId`, `tableName`) VALUES
	(2, '9900000001', 'IN', 'OPEN', '1', 'false', '9900000001', 'NA', 'NA', 'renewal'),
	(3, '9900000002', 'IN', 'null', '1', 'false', '9900000002', 'NA', 'NA', 'renewal'),
	(4, '9900000003', 'IN', 'null', '1', 'false', '9900000003', 'NA', 'NA', 'renewal'),
	(5, '9900000011', 'IN', 'NA', 'NA', 'NA', '9900000011', 'NA', '990110001', 'renewal'),
	(6, '8900000003', 'AE', NULL, NULL, NULL, '', NULL, NULL, NULL);
/*!40000 ALTER TABLE `step_validation_scheduled_activity_service` ENABLE KEYS */;

-- Dumping structure for table ubs_test_data_service.step_validation_user_subscription
CREATE TABLE IF NOT EXISTS `step_validation_user_subscription` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(45) DEFAULT NULL,
  `msisdn` varchar(50) DEFAULT NULL,
  `chargedPrice` varchar(50) DEFAULT NULL,
  `chargedBillingCode` varchar(50) DEFAULT NULL,
  `partnerId` varchar(50) DEFAULT NULL,
  `productId` varchar(50) DEFAULT NULL,
  `subscriptionBillingCode` varchar(50) DEFAULT NULL,
  `subscriptionStatus` varchar(50) DEFAULT NULL,
  `validityDays` varchar(50) DEFAULT NULL,
  `summary` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

-- Dumping data for table ubs_test_data_service.step_validation_user_subscription: ~20 rows (approximately)
/*!40000 ALTER TABLE `step_validation_user_subscription` DISABLE KEYS */;
INSERT INTO `step_validation_user_subscription` (`id`, `userId`, `msisdn`, `chargedPrice`, `chargedBillingCode`, `partnerId`, `productId`, `subscriptionBillingCode`, `subscriptionStatus`, `validityDays`, `summary`) VALUES
	(1, '9900000001', '9900000001', '99.0', '1-2-IN-990-1537461295378', '2', '1', '1-2-IN-990-1537461295378', 'ACTIVATED', '90', 'ACTIVE'),
	(2, '9900000002', '9900000002', '99.0', '1-2-IN-990-1537461295378', '2', '1', '1-2-IN-990-1537461295378', 'ACT_INIT', '0', 'null'),
	(3, '9900000003', '9900000003', '99.0', '1-2-IN-990-1537461295378', '2', '1', '1-2-IN-990-1537461295378', 'ACT_INIT', '0', 'null'),
	(4, '9900000011', '9900000011', '99.0', '1-2-IN-990-1537461295378', '2', '1', '1-2-IN-990-1537461295378', 'ACTIVATED', '90', 'ACTIVE'),
	(5, '8900000003', NULL, '0.0', '1-3-AE-0-1542191810506', '3', '1', '1-3-AE-799-1542191810585', 'ACTIVATED', '8', 'ACTIVE'),
	(6, '8900000001', NULL, '7.99', '1-3-AE-799-1542191810533', '3', '1', '1-3-AE-799-1542191810533', 'ACTIVATED', '30', 'ACTIVE'),
	(7, '8900000002', NULL, '30.0', '1-3-AE-799-1542191810585', '3', '1', '1-3-AE-799-1542191810585', 'ACTIVATED', '30', 'ACTIVE'),
	(13, '8900000004', '8900000004', '30.0', '1-3-AE-799-1542191810533', '3', '1', '1-3-AE-799-1542191810533', 'DEACTIVATED', '30', 'INACTIVE_WITH_VALIDITY'),
	(14, '8900000005', '8900000005', '30.0', '1-3-AE-799-1542191810533', '3', '1', '1-3-AE-799-1542191810533', 'DEACTIVATED', '30', 'INACTIVE'),
	(15, '8900000006', '8900000006', '30.0', '1-3-AE-799-1542191810585', '3', '1', '1-3-AE-799-1542191810585', 'ACTIVATED', '30', 'ACTIVE'),
	(16, '8900000007', '8900000007', '30.0', '1-3-AE-799-1542191810585', '3', '1', '1-3-AE-799-1542191810585', 'ACTIVATED', '30', 'ACTIVE'),
	(17, '6000000001', '6000000001', '99', 'BC03', '1', '1', 'BC03', 'ACT_INIT', '90', 'ACTIVATION_IN_PROGRESS'),
	(18, '9900000004', '9900000004', '99.0', '1-2-IN-990-1537461295378', '2', '1', '1-2-IN-990-1537461295378', 'DEACTIVATED', '90', 'INACTIVE_WITH_VALIDITY'),
	(19, '9900000005', '9900000005', '99.0', '1-2-IN-990-1537461295378', '2', '1', '1-2-IN-990-1537461295378', 'DEACTIVATED', '90', 'INACTIVE'),
	(20, '9900000006', '9900000006', '299.0', '1-2-IN-2990-1537461295340', '2', '1', '1-2-IN-2990-1537461295340', 'DEACTIVATED', '180', 'INACTIVE_WITH_VALIDITY'),
	(21, '9900000007', '9900000007', '299.0', '1-2-IN-2990-1537461295340', '2', '1', '1-2-IN-2990-1537461295340', 'DEACTIVATED', '180', 'INACTIVE'),
	(22, '8700000003', NULL, '0.0', '1-3-SA-0-1542265367808', '3', '1', '1-3-SA-799-1542265367821', 'ACTIVATED', '7', 'ACTIVE'),
	(23, '8700000004', '8700000004', '30.0', '1-3-SA-799-1542265367821', '3', '1', '1-3-SA-799-1542265367821', 'DEACTIVATED', '30', 'INACTIVE_WITH_VALIDITY'),
	(24, '8700000005', '8700000005', '30.0', '1-3-SA-799-1542265367821', '3', '1', '1-3-SA-799-1542265367821', 'DEACTIVATED', '30', 'INACTIVE'),
	(25, '8700000006', '8700000006', '30.0', '1-3-SA-799-1542265367821', '3', '1', '1-3-SA-799-1542265367821', 'ACTIVATED', '30', 'ACTIVE');
/*!40000 ALTER TABLE `step_validation_user_subscription` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
