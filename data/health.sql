/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50539
Source Host           : 127.0.0.1:3306
Source Database       : health

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-11-26 20:44:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  `postcode` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `recipient` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '我是管理员', '123', '18320444515');

-- ----------------------------
-- Table structure for good_brief
-- ----------------------------
DROP TABLE IF EXISTS `good_brief`;
CREATE TABLE `good_brief` (
  `id` int(11) NOT NULL,
  `buy` int(11) NOT NULL,
  `end_time` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `small_pic` varchar(255) DEFAULT NULL,
  `sort_id` int(11) NOT NULL,
  `start_time` bigint(20) DEFAULT NULL,
  `volume` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of good_brief
-- ----------------------------
INSERT INTO `good_brief` VALUES ('1', '2', '1542986293', '人参', '10', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f0.jpg', '1', '1542899893', '20');
INSERT INTO `good_brief` VALUES ('2', '4', '1542986293', '桂皮', '20', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f0.jpg', '1', '1542899893', '30');
INSERT INTO `good_brief` VALUES ('3', '5', '1542986293', '板蓝根', '22', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f1.jpg', '1', '1542899893', '40');
INSERT INTO `good_brief` VALUES ('4', '3', '1542986293', '生地', '33', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f2.jpg', '1', '1542899893', '30');
INSERT INTO `good_brief` VALUES ('5', '6', '1542986293', '苹果', '23', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f3.jpg', '2', '1542899893', '20');
INSERT INTO `good_brief` VALUES ('6', '1', '1542986293', '柿子', '32', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f4.jpg', '2', '1542899893', '40');
INSERT INTO `good_brief` VALUES ('7', '8', '1542986293', '荔枝', '12', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f5.jpg', '2', '1542899893', '30');
INSERT INTO `good_brief` VALUES ('8', '5', '1542986293', '猕猴桃', '13', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f6.jpg', '2', '1542899893', '38');
INSERT INTO `good_brief` VALUES ('9', '2', '1542986293', '火龙果', '56', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f7.jpg', '2', '1542899893', '28');
INSERT INTO `good_brief` VALUES ('10', '4', '1542986293', '蜂蜜', '44', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f8.jpg', '3', '1542899893', '30');
INSERT INTO `good_brief` VALUES ('11', '6', '1542986293', '阿胶', '11', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f9.jpg', '3', '1542899893', '40');
INSERT INTO `good_brief` VALUES ('12', '3', '1542986293', '淮山', '21', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f10.jpg', '1', '1542899893', '44');
INSERT INTO `good_brief` VALUES ('13', '2', '1542986293', '枸杞', '14', 'http://imgsrc.baidu.com/imgad/pic/item/342ac65c10385343e2d58c1c9813b07eca8088f11.jpg', '1', '1542899893', '32');

-- ----------------------------
-- Table structure for good_detail
-- ----------------------------
DROP TABLE IF EXISTS `good_detail`;
CREATE TABLE `good_detail` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `gbrief_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of good_detail
-- ----------------------------

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('14');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `address_id` int(11) NOT NULL,
  `buy` int(11) NOT NULL,
  `d_company` varchar(255) DEFAULT NULL,
  `d_id` varchar(255) DEFAULT NULL,
  `gbrief_id` int(11) NOT NULL,
  `is_paid` bit(1) NOT NULL,
  `is_send` bit(1) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for sort
-- ----------------------------
DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sort
-- ----------------------------
INSERT INTO `sort` VALUES ('1', '这个分类包括各种药材', '药材');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '我是昵称1', '123', '18320444515');
