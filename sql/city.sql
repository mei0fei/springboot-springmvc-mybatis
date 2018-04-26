/*
 Navicat MySQL Data Transfer

 Source Server         : no-password
 Source Server Version : 50626
 Source Host           : localhost
 Source Database       : test

 Target Server Version : 50626
 File Encoding         : utf-8

 Date: 04/26/2018 11:15:30 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL,
  `state` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL,
  `country` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
--  Records of `city`
-- ----------------------------
BEGIN;
INSERT INTO `city` VALUES ('1', 'San Francisco', 'CA', 'US'), ('2', '深圳', '广东', '中国'), ('3', '深圳', '广东', '中国'), ('4', '厦门', '福建', '中国'), ('5', '长沙', '湖南', '中国'), ('6', '南昌', '江西', '中国'), ('7', '武汉', '湖北', '中国');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
