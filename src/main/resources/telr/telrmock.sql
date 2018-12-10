/********************tables ************/

use ubs_mock_services;

CREATE TABLE `telr_create_order` (
  `key` varchar(100) NOT NULL DEFAULT '',
  `json` json DEFAULT NULL,
  `ivp_method` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `telr_delete_order` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `response` varchar(10000) DEFAULT NULL,
  `agrementId` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `telr_refund` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `response` varchar(1000) DEFAULT NULL,
  `transactionref` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



/************INSERTs ***********************/

INSERT INTO `ubs_mock_services`.`telr_create_order` ( `json`, `ivp_method`) VALUES ( '{\"order\": {\"ref\": \"E0E80AB2A149F846EC80BF3DB6899B5B35153079754D8F28198B47DC620524F3\", \"card\": {\"type\": \"Visa Credit\", \"last4\": \"1111\", \"expiry\": {\"year\": 2019, \"month\": 1}, \"first6\": \"411111\", \"country\": \"IN\"}, \"test\": 1, \"amount\": \"3.00\", \"cartid\": \"32113092846661831\", \"status\": {\"code\": 3, \"text\": \"Paid\"}, \"currency\": \"AED\", \"customer\": {\"name\": {\"surname\": \"Test1007\", \"forenames\": \"Akash\"}, \"email\": \"akashtest1007@gmail.com\", \"address\": {\"city\": \"Pune\", \"line1\": \"Vuclip\", \"state\": \"MAH\", \"country\": \"IN\", \"areacode\": \"411007\"}}, \"agreement\": {\"id\": 99150, \"final\": \"0.00\", \"initial\": \"3.00\", \"recurring\": {\"day\": 4, \"count\": 4, \"amount\": \"3.00\", \"period\": \"W\", \"interval\": 1}}, \"paymethod\": \"Card\", \"description\": \"Request+for+activation+at+AED+3%2FWeek+for+which+renewal+sho...\", \"transaction\": {\"ref\": \"040019186221\", \"code\": \"903484\", \"type\": \"sale\", \"class\": \"ECom\", \"status\": \"A\", \"message\": \"Authorised\"}}, \"trace\": \"4001/22717/5c063c87\", \"method\": \"check\"}', 'check');
INSERT INTO `ubs_mock_services`.`telr_create_order` ( `json`, `ivp_method`) VALUES ( '{\"order\": {\"ref\": \"7E8AED94A107220C1A7A10F4844A07C9958A4B427C3A2007B3E5E68F38FC2377\", \"url\": \"https://secure.telr.com/gateway/process.html?o=7E8AED94A107220C1A7A10F4844A07C9958A4B427C3A2007B3E5E68F38FC2377\"}, \"trace\": \"4000/6907/5c0a27bc\", \"method\": \"create\"}', 'create');

INSERT INTO `ubs_mock_services`.`telr_delete_order` ( `response`, `agrementId`) VALUES ( '<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<agreement>\n    <id>99150</id>\n    <store>\n        <id>20985</id>\n        <name>Vuclip Middle East FZ LLC</name>\n    </store>\n    <created>Wed, 28 Nov 2018 11:19:26 +0000</created>\n    <status>5</status>\n    <statustxt>Cancelled</statustxt>\n    <currency>AED</currency>\n    <initial>3.00</initial>\n    <recurring>\n        <period>W</period>\n        <interval>1</interval>\n        <day>4</day>\n        <count>4</count>\n        <amount>3.00</amount>\n    </recurring>\n    <final>0.00</final>\n    <description>4 weekly payments of Dh3.00</description>\n    <transaction>\n        <description>Request+for+activation+at+AED+3%2FWeek+for+which+renewal+sho...</description>\n        <cartid>32113092846661831</cartid>\n        <test>1</test>\n    </transaction>\n    <custid></custid>\n    <billing>\n        <title></title>\n        <fname>Akash</fname>\n        <sname>Test1007</sname>\n        <fullname>Akash Test1007</fullname>\n        <addr1>Vuclip</addr1>\n        <addr2></addr2>\n        <addr3></addr3>\n        <city>Pune</city>\n        <region>MAH</region>\n        <country>India</country>\n        <country_iso>IN</country_iso>\n        <zip>411007</zip>\n        <tel></tel>\n        <email>akashtest1007@gmail.com</email>\n    </billing>\n</agreement>', '99150');

INSERT INTO `ubs_mock_services`.`telr_refund` ( `response`, `transactionref`) VALUES ( 'auth_status=A&auth_code=925039&auth_message=Accepted&auth_tranref=040019209229&auth_cvv=Y&auth_avs=X&auth_trace=4001%2f25038%2f5bffea1f&payment_code=VC&payment_desc=Visa%20Credit%20ending%201111&payment_cardl4=1111&payment_cardl6=444433', '030019563032');

