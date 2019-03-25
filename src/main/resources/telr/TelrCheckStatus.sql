CREATE TABLE ubs_mock_services.`telr_check_status` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `response` VARCHAR(10000) DEFAULT NULL,
  `agrementId` VARCHAR(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;



INSERT INTO `ubs_mock_services`.`telr_check_status` (`id`, `response`, `agrementId`) VALUES ('1', '<?xml version=\"1.0\" encoding=\"UTF-8\"?> <agreement>     <id>10003</id>     <eventcount>4</eventcount>     <event>         <type>1</type>         <typetxt>Agreement created</typetxt>         <date>Fri, 04 Jan 2019 06:56:28 +0000</date>     </event>     <event>         <type>7</type>         <typetxt>Transaction authorised</typetxt>         <date>Fri, 04 Jan 2019 06:56:28 +0000</date>         <paytype>1</paytype>         <paytypetxt>Initial</paytypetxt>         <amount>1.00</amount>         <tranref>030020118143</tranref>     </event>     <event>         <type>7</type>         <typetxt>Transaction authorised</typetxt>         <date>Sat, 05 Jan 2019 04:34:13 +0000</date>         <paytype>2</paytype>         <paytypetxt>Installment</paytypetxt>         <paycount>1</paycount>         <amount>30.00</amount>         <tranref>090000022969</tranref>     </event>     <event>         <type>5</type>         <typetxt>Agreement cancelled</typetxt>         <date>Mon, 07 Jan 2019 05:54:24 +0000</date>     </event> </agreement>', '10003');
