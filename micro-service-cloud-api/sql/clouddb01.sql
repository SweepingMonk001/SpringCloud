/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50636
Source Host           : localhost:3306
Source Database       : clouddb01

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2019-01-24 18:03:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', 'clouddb01');
INSERT INTO `dept` VALUES ('2', '财务部', 'clouddb01');
INSERT INTO `dept` VALUES ('3', '市场部', 'clouddb01');
INSERT INTO `dept` VALUES ('4', '运维部', 'clouddb01');
INSERT INTO `dept` VALUES ('5', '100', 'clouddb01');
