CREATE TABLE `codapay_txn` (
  `txn_type` VARCHAR(100) NOT NULL,
  `api_key` VARCHAR(250) DEFAULT NULL,
  `json` VARCHAR(500) DEFAULT NULL,
  PRIMARY KEY (`txn_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `codapay_txn` (`txn_type`,`api_key`,`json`) VALUES ('codapay_check_status','394b3f5c092d3c5bb1a5112928c7b997','{\"subscriptionResult\":{\"resultCode\":0,\"subscriptionInfo\":{\"subscriptionId\":501,\"subscriptionStatus\":\"Active\"}}}');
INSERT INTO `codapay_txn` (`txn_type`,`api_key`,`json`) VALUES ('codapay_init_txn','6f4f89e0b7fe3f607267478df27991d4','<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<initResult>\n    <resultCode>0</resultCode>\n    <txnId>5497300735439847964</txnId>\n</initResult>');
INSERT INTO `codapay_txn` (`txn_type`,`api_key`,`json`) VALUES ('codapay_inquiry_payment_result','6f4f89e0b7fe3f607267478df27991d4','<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><paymentResult><orderId>dXNlcklkMTIzZDhmMzllOTEtN2EwYS00ZmI3LWI2ZDItNDEwMDkyMzRlMzg5</orderId><profile><entry><key>PaymentType</key><value>1</value></entry></profile><resultCode>0</resultCode><resultDesc></resultDesc><totalPrice>1000.0</totalPrice><txnId>5486923858172100878</txnId></paymentResult>');
