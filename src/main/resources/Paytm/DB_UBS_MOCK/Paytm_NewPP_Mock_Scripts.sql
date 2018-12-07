UBS Mock Service

/********Activation*********/

INSERT INTO `ubs_mock_services`.`paytm_status` (`user_id`, `order_id`, `json`) VALUES ('2990000001', 'testOrder2990000001', '{\"MID\": \"Vuclip71864611141257\", \"TXNID\": \"29900000002\", \"STATUS\": \"TXN_SUCCESS\", \"ORDERID\": \"getttingsetincontroller\", \"RESPMSG\": \"Txn Success\", \"SUBS_ID\": \"29900000002\", \"TXNDATE\": \"2012-11-09 02:10:29.742447\", \"TXNTYPE\": \"SALE\", \"BANKNAME\": \"WALLET\", \"RESPCODE\": \"01\", \"BANKTXNID\": \"29900000002\", \"TXNAMOUNT\": \"299.00\", \"REFUNDAMT \": \"1\", \"GATEWAYNAME\": \"WALLET\", \"PAYMENTMODE\": \"CC\"}');

INSERT INTO `ubs_mock_services`.`paytm_status` (`user_id`, `order_id`, `json`) VALUES ('5990000001', 'testOrder5990000001', '{\"MID\": \"Vuclip71864611141257\", \"TXNID\": \"59900000003\", \"STATUS\": \"TXN_SUCCESS\", \"ORDERID\": \"getttingsetincontroller\", \"RESPMSG\": \"Txn Success\", \"SUBS_ID\": \"59900000003\", \"TXNDATE\": \"2012-11-09 02:10:29.742447\", \"TXNTYPE\": \"SALE\", \"BANKNAME\": \"WALLET\", \"RESPCODE\": \"01\", \"BANKTXNID\": \"59900000003\", \"TXNAMOUNT\": \"599.00\", \"REFUNDAMT \": \"1\", \"GATEWAYNAME\": \"WALLET\", \"PAYMENTMODE\": \"CC\"}');


/*********Renewals*********/

/******Paytm_Status*********/
INSERT INTO `ubs_mock_services`.`paytm_status` (`user_id`, `order_id`, `json`) VALUES ('2990000011', 'testOrder2990000011', '{\"MID\": \"Vuclip71864611141257\", \"TXNID\": \"299000000111\", \"STATUS\": \"TXN_SUCCESS\", \"ORDERID\": \"testOrder2990000011\", \"RESPMSG\": \"Txn Success..\", \"SUBS_ID\": \"299000000111\", \"TXNDATE\": \"2012-11-09 02:10:29.742447\", \"TXNTYPE\": \"SALE\", \"BANKNAME\": \"WALLET\", \"RESPCODE\": \"01\", \"BANKTXNID\": \"299000000111\", \"TXNAMOUNT\": \"1\", \"REFUNDAMT \": \"1\", \"GATEWAYNAME\": \"WALLET\", \"PAYMENTMODE\": \"CC\"}');

INSERT INTO `ubs_mock_services`.`paytm_status` (`user_id`, `order_id`, `json`) VALUES ('5990000011', 'testOrder5990000011', '{\"MID\": \"Vuclip71864611141257\", \"TXNID\": \"599000000111\", \"STATUS\": \"TXN_SUCCESS\", \"ORDERID\": \"testOrder5990000011\", \"RESPMSG\": \"Txn Success..\", \"SUBS_ID\": \"599000000111\", \"TXNDATE\": \"2012-11-09 02:10:29.742447\", \"TXNTYPE\": \"SALE\", \"BANKNAME\": \"WALLET\", \"RESPCODE\": \"01\", \"BANKTXNID\": \"599000000111\", \"TXNAMOUNT\": \"1\", \"REFUNDAMT \": \"1\", \"GATEWAYNAME\": \"WALLET\", \"PAYMENTMODE\": \"CC\"}');

/******Paytm_Renewal*********/
INSERT INTO `ubs_mock_services`.`paytm_renewal` (`user_id`, `order_id`, `json`) VALUES ('2990000011', 'testOrder2990000011', '{\"MID\": \"Vuclip71864611141257\", \"TXNID\": \"20181027111212800110168091842868716\", \"STATUS\": \"TXN_ACCEPTED\", \"ORDERID\": \"willsetincontroller\", \"RESPMSG\": \"Subscription Txn accepted.\", \"SUBS_ID\": \"100003113045\", \"RESPCODE\": \"900\", \"TXNAMOUNT\": \"299.00\", \"CHECKSUMHASH\": \"U6Dbh30AFezF1rbNjyUwxkGzOahj/mZcXm2amal7kjjjygUODptWYvEh/l1DoiJ0PC8kDm5ULYov+/WVgoddDNrSeJWfRkHaXawTq0huDBM=\"}');

INSERT INTO `ubs_mock_services`.`paytm_renewal` (`user_id`, `order_id`, `json`) VALUES ('5990000011', 'testOrder5990000011', '{\"MID\": \"Vuclip71864611141257\", \"TXNID\": \"20181027111212800110168091842868716\", \"STATUS\": \"TXN_ACCEPTED\", \"ORDERID\": \"willsetincontroller\", \"RESPMSG\": \"Subscription Txn accepted.\", \"SUBS_ID\": \"100003113045\", \"RESPCODE\": \"900\", \"TXNAMOUNT\": \"599.00\", \"CHECKSUMHASH\": \"U6Dbh30AFezF1rbNjyUwxkGzOahj/mZcXm2amal7kjjjygUODptWYvEh/l1DoiJ0PC8kDm5ULYov+/WVgoddDNrSeJWfRkHaXawTq0huDBM=\"}');



