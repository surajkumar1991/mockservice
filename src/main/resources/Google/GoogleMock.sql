CREATE TABLE `google_access_token` (
  `id` int(11) NOT NULL,
  `client_id` varchar(100) DEFAULT NULL,
  `json` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


INSERT INTO `ubs_mock_services`.`google_access_token` (`id`, `client_id`, `json`) VALUES ('1', '626184388234-42jebu0fe6gnkgijdgqgc4qrb19r5okp.apps.googleusercontent.com', '{\"scope\": \"https://www.googleapis.com/auth/androidpublisher\", \"expires_in\": 3600, \"token_type\": \"Bearer\", \"access_token\": \"ya29.Gl3RBrIzdL2UHKDQrBenKRIh-ML8Vzlb2QeWg33GSoM6WcbbRlEv3k5ZptSAaCevU6kBNQBpDxJnfjOnH-ZJ8DHKIi3e4HjSS9mY5BuqxyJ-p9meZ_EXGDt-tW9jaEc\"}');



CREATE TABLE `google_check_status` (
  `id` int(11) NOT NULL,
  `serviceId` varchar(45) DEFAULT NULL,
  `partnerToken` varchar(45) DEFAULT NULL,
  `response` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `ubs_mock_services`.`google_check_status` (`id`, `serviceId`, `partnerToken`, `response`) VALUES ('1', 'viu_india_yearly_august_18', 'pt1', '{\"kind\": \"androidpublisher#subscriptionPurchase\", \"orderId\": \"GPA.3369-2284-6005-87026..0\", \"countryCode\": \"IN\", \"autoRenewing\": true, \"paymentState\": 1, \"startTimeMillis\": \"1552933800000\", \"developerPayload\": \"4efb167af26ebd443f596fb46ab2c240\", \"expiryTimeMillis\": \"1584469800000\", \"priceAmountMicros\": \"100000000000\", \"priceCurrencyCode\": \"INR\"}');
