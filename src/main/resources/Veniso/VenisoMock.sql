CREATE TABLE `veniso_direct_api` (
  `id` int(11) NOT NULL,
  `action` varchar(45) NOT NULL,
  `msisdn` varchar(45) NOT NULL,
  `response` json NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `ubs_mock_services`.`veniso_direct_api` (`id`, `action`, `msisdn`, `response`) VALUES ('1', 'ACT', '10001', '{\"atxnid\": \"1234\", \"msisdn\": \"1531317871\", \"status\": \"101\", \"resultdesc\": \"abc\", \"isfreetrial\": \"false\", \"chargedamount\": \"123\", \"chargedplanid\": \"234\"}');
INSERT INTO `ubs_mock_services`.`veniso_direct_api` (`id`, `action`, `msisdn`, `response`) VALUES ('2', 'GETPIN', '801', '{\"status\": \"101\", \"wtxnid\": \"123456\", \"resultdesc\": \"OTP GENERATE RESPONSE\"}');
INSERT INTO `ubs_mock_services`.`veniso_direct_api` (`id`, `action`, `msisdn`, `response`) VALUES ('3', 'RESENDPIN', '802', '{\"status\": \"101\", \"wtxnid\": \"123456\", \"resultdesc\": \"OTP RESEND RESPONSE\"}');
INSERT INTO `ubs_mock_services`.`veniso_direct_api` (`id`, `action`, `msisdn`, `response`) VALUES ('4', 'VERIFYPIN', '803', '{\"otxnid\": \"123456\", \"status\": \"101\", \"resultdesc\": \"OTP VERIFY RESPONSE\"}');



CREATE TABLE `veniso_redirect_api` (
  `id` int(11) NOT NULL,
  `action` varchar(45) NOT NULL,
  `htxnid` varchar(45) NOT NULL,
  `msisdn` varchar(45) NOT NULL,
  `atxnid` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `chargedamount` varchar(45) NOT NULL,
  `rurl` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `ubs_mock_services`.`veniso_redirect_api` (`id`, `action`, `htxnid`, `msisdn`, `atxnid`, `status`, `chargedamount`, `rurl`) VALUES ('1', 'ACT', '10001', '10001', '10001', 'SUCCESS', '10', 'http://127.0.0.1:8081/core-activity-service/rest/billing/activation/consent/?hash=');
