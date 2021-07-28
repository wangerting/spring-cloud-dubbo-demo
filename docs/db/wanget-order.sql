/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : wanget-order

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 27/07/2021 18:04:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log` (
  `branch_id` bigint(20) NOT NULL COMMENT 'branch transaction id',
  `xid` varchar(100) NOT NULL COMMENT 'global transaction id',
  `context` varchar(128) NOT NULL COMMENT 'undo_log context,such as serialization',
  `rollback_info` longblob NOT NULL COMMENT 'rollback info',
  `log_status` int(11) NOT NULL COMMENT '0:normal status,1:defense status',
  `log_created` datetime(6) NOT NULL COMMENT 'create datetime',
  `log_modified` datetime(6) NOT NULL COMMENT 'modify datetime',
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='AT transaction mode undo table';

-- ----------------------------
-- Table structure for web_order
-- ----------------------------
DROP TABLE IF EXISTS `web_order`;
CREATE TABLE `web_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL COMMENT '配送地址',
  `addressee` varchar(200) DEFAULT NULL COMMENT '收件人',
  `tel` varchar(20) DEFAULT NULL COMMENT '收件人电话',
  `order_status` tinyint(4) DEFAULT NULL COMMENT '订单状态;0:未知,1:未支付,2:已支付,3:已取消,4:已完成',
  `delivery_status` tinyint(4) DEFAULT NULL COMMENT '派送状态;0:未知,1:出库中,2:已打包,3:已打包,4:派送完成',
  `refund_status` tinyint(4) DEFAULT NULL COMMENT '退款状态',
  `pay_type` tinyint(4) DEFAULT NULL COMMENT '支付方式;0:未知,1:支付宝,2:微信\n',
  `pay_order_id` varchar(50) DEFAULT NULL COMMENT '第三方订单号',
  `invoice` varchar(100) DEFAULT NULL COMMENT '发票抬头',
  `delivery_method` tinyint(4) DEFAULT '1' COMMENT '配送方式：1：送货上门，2：自取',
  `amount` decimal(20,6) DEFAULT NULL COMMENT '应金额',
  `amount_payable` decimal(20,6) DEFAULT NULL COMMENT '实付金额',
  `ctime` timestamp NULL DEFAULT NULL COMMENT '下单时间',
  `utime` timestamp NULL DEFAULT NULL,
  `pdtime` timestamp NULL DEFAULT NULL COMMENT '配送/自取时间',
  `ftime` timestamp NULL DEFAULT NULL COMMENT '失效时间',
  PRIMARY KEY (`id`),
  KEY `index_userId_ctime` (`user_id`,`ctime`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='订单';

-- ----------------------------
-- Records of web_order
-- ----------------------------
BEGIN;
INSERT INTO `web_order` VALUES (1, 1, 'wangerting', 1, '王二廷', '15010012408', 1, 0, 0, 1, '', '', 0, 22000.000000, 19800.000000, '2018-12-25 11:32:14', NULL, NULL, '2018-12-25 14:32:14');
INSERT INTO `web_order` VALUES (2, 1, 'wangerting', 1, '王二廷', '15010012408', 1, 0, 0, 1, '', '', 0, 47000.000000, 42300.000000, '2018-12-25 11:41:25', NULL, NULL, '2018-12-25 14:41:25');
INSERT INTO `web_order` VALUES (3, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 100000.000000, 99950.000000, '2021-07-23 18:17:58', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (4, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 20000.000000, 19990.000000, '2021-07-26 10:46:43', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (5, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 20000.000000, 19990.000000, '2021-07-26 10:57:52', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (6, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 20000.000000, 19990.000000, '2021-07-26 11:14:00', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (7, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 20000.000000, 19990.000000, '2021-07-26 15:59:25', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (8, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 20000.000000, 19990.000000, '2021-07-26 16:05:11', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (9, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 20000.000000, 19990.000000, '2021-07-27 15:16:39', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (10, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 20000.000000, 19990.000000, '2021-07-27 15:20:28', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (11, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 60000.000000, 59970.000000, '2021-07-27 15:24:18', NULL, NULL, NULL);
INSERT INTO `web_order` VALUES (12, 1, 'wangerting', NULL, NULL, NULL, 1, 1, 2, 0, NULL, NULL, 0, 60000.000000, 59970.000000, '2021-07-27 16:25:30', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for web_order_product
-- ----------------------------
DROP TABLE IF EXISTS `web_order_product`;
CREATE TABLE `web_order_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL COMMENT '产品id',
  `shop_id` int(11) DEFAULT NULL COMMENT '店铺id',
  `user_id` int(11) DEFAULT NULL,
  `delivery_id` int(11) DEFAULT NULL COMMENT '配送员',
  `product_name` varchar(200) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL COMMENT '个数',
  `amount` decimal(20,6) DEFAULT NULL COMMENT '金额',
  `amount_payable` decimal(20,6) DEFAULT NULL COMMENT '实付金额',
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  `stime` timestamp NULL DEFAULT NULL COMMENT '开始配送时间',
  `etime` timestamp NULL DEFAULT NULL COMMENT '配送完成时间',
  `order_status` tinyint(2) DEFAULT '0',
  `delivery_status` tinyint(2) DEFAULT '0',
  `refund_status` tinyint(2) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `index_orderId_productId` (`order_id`,`product_id`),
  KEY `index_ctime` (`ctime`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='订单与产品关联表';

-- ----------------------------
-- Records of web_order_product
-- ----------------------------
BEGIN;
INSERT INTO `web_order_product` VALUES (1, 1, 2, 1, 1, 0, '商品2', 1, 2000.000000, 1800.000000, '2018-12-25 11:32:26', NULL, NULL, NULL, 0, 0, 0);
INSERT INTO `web_order_product` VALUES (2, 1, 3, 1, 1, 0, '商品3', 1, 20000.000000, 18000.000000, '2018-12-25 11:32:26', NULL, NULL, NULL, 0, 0, 0);
INSERT INTO `web_order_product` VALUES (3, 2, 1, 1, 1, 0, '商品-1', 5, 1000.000000, 900.000000, '2018-12-25 11:41:25', NULL, NULL, NULL, 0, 0, 0);
INSERT INTO `web_order_product` VALUES (4, 2, 2, 1, 1, 0, '商品2', 3, 6000.000000, 5400.000000, '2018-12-25 11:41:25', NULL, NULL, NULL, 0, 0, 0);
INSERT INTO `web_order_product` VALUES (5, 2, 3, 1, 1, 0, '商品3', 2, 40000.000000, 36000.000000, '2018-12-25 11:41:25', NULL, NULL, NULL, 0, 0, 0);
INSERT INTO `web_order_product` VALUES (6, 3, 1, 1, 1, NULL, 'mq-1-u', 2, 40000.000000, 39980.000000, '2021-07-23 18:17:59', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (7, 3, 2, 1, 1, NULL, 'mq-2-u', 3, 60000.000000, 59970.000000, '2021-07-23 18:17:59', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (8, 4, 1, 1, 1, NULL, 'mq-1-u', 1, 20000.000000, 19990.000000, '2021-07-26 10:46:43', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (9, 5, 1, 1, 1, NULL, 'mq-1-u', 1, 20000.000000, 19990.000000, '2021-07-26 10:57:52', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (10, 6, 1, 1, 1, NULL, 'mq-1-u', 1, 20000.000000, 19990.000000, '2021-07-26 11:14:00', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (11, 7, 1, 1, 1, NULL, 'mq-1-u', 1, 20000.000000, 19990.000000, '2021-07-26 15:59:25', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (12, 8, 1, 1, 1, NULL, 'mq-1-u', 1, 20000.000000, 19990.000000, '2021-07-26 16:05:11', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (13, 9, 1, 1, 1, NULL, 'mq-1-u', 1, 20000.000000, 19990.000000, '2021-07-27 15:16:39', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (14, 10, 1, 1, 1, NULL, 'mq-1-u', 1, 20000.000000, 19990.000000, '2021-07-27 15:20:28', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (15, 11, 1, 1, 1, NULL, 'mq-1-u', 3, 60000.000000, 59970.000000, '2021-07-27 15:24:19', NULL, NULL, NULL, 1, 1, 0);
INSERT INTO `web_order_product` VALUES (16, 12, 1, 1, 1, NULL, 'mq-1-u', 3, 60000.000000, 59970.000000, '2021-07-27 16:25:30', NULL, NULL, NULL, 1, 1, 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
