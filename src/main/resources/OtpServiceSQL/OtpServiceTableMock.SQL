use ubs_mock_services;
CREATE TABLE `otp_pg_regenerate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `response` varchar(1000) DEFAULT NULL,
  `otpTransactionId` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE `otp_pg_verify` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `response` varchar(1000) DEFAULT NULL,
  `otpTransactionId` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE `otp_pg_generate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `response` varchar(1000) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE `otp_cas_initialize` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `response` varchar(1000) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE `cas_consentApi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `response` varchar(1000) DEFAULT NULL,
  `billingTransactionId` varchar(45) DEFAULT NULL,
  UNIQUE KEY `order_id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

