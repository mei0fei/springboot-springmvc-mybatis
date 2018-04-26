/*
 Navicat MySQL Data Transfer

 Source Server         : no-password
 Source Server Version : 50626
 Source Host           : localhost
 Source Database       : test

 Target Server Version : 50626
 File Encoding         : utf-8

 Date: 04/26/2018 11:21:21 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `student`
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES ('1', 'meifei', 'meifei@qq.com', '2010-09-09'), ('17', 'hello', 'hello@qq.com', '2017-10-22');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
