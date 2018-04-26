/*
 Navicat MySQL Data Transfer

 Source Server         : no-password
 Source Server Version : 50626
 Source Host           : localhost
 Source Database       : test

 Target Server Version : 50626
 File Encoding         : utf-8

 Date: 04/26/2018 11:21:30 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `PhoneDetails`
-- ----------------------------
DROP TABLE IF EXISTS `PhoneDetails`;
CREATE TABLE `PhoneDetails` (
  `id` bigint(20) NOT NULL,
  `provider` varchar(255) DEFAULT NULL,
  `technology` varchar(255) DEFAULT NULL,
  `phone_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKeotuev8ja8v0sdh29dynqj05p` (`phone_id`),
  CONSTRAINT `FKeotuev8ja8v0sdh29dynqj05p` FOREIGN KEY (`phone_id`) REFERENCES `Phone` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `PhoneDetails`
-- ----------------------------
BEGIN;
INSERT INTO `PhoneDetails` VALUES ('2', 'T-Mobile', 'GSM', '1'), ('4', 'T-Mobile', 'GSM', '3'), ('6', 'T-Mobile', 'GSM', '5'), ('8', 'T-Mobile', 'GSM', '7'), ('10', 'T-Mobile', 'GSM', '9');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
