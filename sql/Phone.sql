/*
 Navicat MySQL Data Transfer

 Source Server         : no-password
 Source Server Version : 50626
 Source Host           : localhost
 Source Database       : test

 Target Server Version : 50626
 File Encoding         : utf-8

 Date: 04/26/2018 11:21:35 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `Phone`
-- ----------------------------
DROP TABLE IF EXISTS `Phone`;
CREATE TABLE `Phone` (
  `id` bigint(20) NOT NULL,
  `number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `Phone`
-- ----------------------------
BEGIN;
INSERT INTO `Phone` VALUES ('1', '123-456-7890'), ('3', '123-456-7890'), ('5', '123-456-7890'), ('7', '123-456-7890'), ('9', '123-456-7890');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
