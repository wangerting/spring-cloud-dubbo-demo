/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : wanget-shop

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 27/07/2021 18:04:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pro_brand
-- ----------------------------
DROP TABLE IF EXISTS `pro_brand`;
CREATE TABLE `pro_brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `logo` varchar(200) DEFAULT NULL COMMENT 'logo',
  `status` tinyint(2) DEFAULT '0' COMMENT '状态：0：禁用，1：启用',
  `desc` varchar(500) DEFAULT NULL COMMENT '描述',
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=370 DEFAULT CHARSET=utf8 COMMENT='品牌';

-- ----------------------------
-- Records of pro_brand
-- ----------------------------
BEGIN;
INSERT INTO `pro_brand` VALUES (1, '测试', '', 0, '测试1222', '2018-12-05 15:28:04', '2018-12-05 22:03:01');
INSERT INTO `pro_brand` VALUES (2, 'test-1', '', 1, 'ASEATSA', '2018-12-06 21:09:45', NULL);
INSERT INTO `pro_brand` VALUES (3, 'ZX', '', 1, 'ASDF', '2018-12-06 21:11:33', NULL);
INSERT INTO `pro_brand` VALUES (6, 'DC', '', 1, 'DC', '2018-12-06 21:17:30', NULL);
INSERT INTO `pro_brand` VALUES (7, 'dd', '', 1, 'dd', '2018-12-06 23:04:27', '2018-12-06 23:14:47');
INSERT INTO `pro_brand` VALUES (8, 'DCX', '', 1, '22', '2018-12-06 23:04:24', '2018-12-06 23:14:39');
INSERT INTO `pro_brand` VALUES (9, 'DCDD', '', 1, 'DCDD', '2018-12-06 23:14:11', NULL);
INSERT INTO `pro_brand` VALUES (10, 'DCDDD', '', 0, NULL, NULL, NULL);
INSERT INTO `pro_brand` VALUES (11, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (12, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (13, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (14, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (15, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (16, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (17, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (18, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (19, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (20, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (21, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (22, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (23, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (24, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (25, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (26, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (27, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (28, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (29, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (30, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (31, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (32, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (33, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (34, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (35, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (36, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (37, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (38, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (39, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (40, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (41, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (42, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (43, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (44, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (45, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (46, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (47, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (48, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (49, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (50, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (51, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (52, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (53, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (54, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (55, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (56, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (57, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (58, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (59, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (60, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (61, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (62, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (63, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (64, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (65, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (66, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (67, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (68, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (69, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (70, 'DCDDD', '', 0, '分页数据', '2018-12-07 10:00:52', NULL);
INSERT INTO `pro_brand` VALUES (71, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (72, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (73, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (74, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (75, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (76, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (77, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (78, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (79, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (80, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (81, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (82, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (83, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (84, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (85, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (86, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (87, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (88, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (89, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (90, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (91, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (92, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (93, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (94, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (95, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (96, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (97, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (98, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (99, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (100, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (101, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (102, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (103, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (104, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (105, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (106, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (107, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (108, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (109, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (110, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (111, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (112, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (113, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (114, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (115, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (116, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (117, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (118, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (119, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (120, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (121, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (122, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (123, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (124, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (125, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (126, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (127, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (128, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (129, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (130, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:27', NULL);
INSERT INTO `pro_brand` VALUES (131, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (132, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (133, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (134, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (135, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (136, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (137, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (138, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (139, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (140, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (141, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (142, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (143, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (144, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (145, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (146, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (147, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (148, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (149, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (150, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (151, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (152, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (153, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (154, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (155, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (156, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (157, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (158, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (159, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (160, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (161, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (162, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (163, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (164, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (165, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (166, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (167, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (168, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (169, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (170, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (171, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (172, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (173, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (174, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (175, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (176, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (177, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (178, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (179, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (180, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (181, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (182, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (183, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (184, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (185, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (186, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (187, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (188, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (189, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (190, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:28', NULL);
INSERT INTO `pro_brand` VALUES (191, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (192, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (193, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (194, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (195, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (196, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (197, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (198, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (199, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (200, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (201, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (202, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (203, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (204, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (205, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (206, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (207, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (208, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (209, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (210, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (211, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (212, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (213, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (214, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (215, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (216, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (217, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (218, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (219, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (220, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (221, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (222, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (223, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (224, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (225, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (226, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (227, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (228, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (229, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (230, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (231, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (232, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (233, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (234, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (235, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (236, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (237, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (238, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (239, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (240, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (241, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (242, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (243, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (244, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (245, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (246, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (247, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (248, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (249, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (250, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:29', NULL);
INSERT INTO `pro_brand` VALUES (251, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (252, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (253, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (254, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (255, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (256, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (257, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (258, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (259, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (260, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (261, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (262, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (263, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (264, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (265, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (266, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (267, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (268, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (269, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (270, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (271, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (272, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (273, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (274, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (275, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (276, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (277, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (278, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (279, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (280, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (281, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (282, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (283, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (284, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (285, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (286, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (287, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (288, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (289, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (290, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (291, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (292, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (293, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (294, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (295, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (296, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (297, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (298, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (299, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (300, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (301, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (302, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (303, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (304, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (305, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (306, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (307, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (308, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (309, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (310, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:30', NULL);
INSERT INTO `pro_brand` VALUES (311, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (312, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (313, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (314, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (315, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (316, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (317, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (318, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (319, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (320, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (321, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (322, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (323, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (324, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (325, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (326, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (327, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (328, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (329, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (330, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (331, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (332, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (333, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (334, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (335, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (336, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (337, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (338, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (339, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (340, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (341, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (342, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (343, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (344, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (345, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (346, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (347, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (348, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (349, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (350, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (351, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (352, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (353, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (354, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (355, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (356, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (357, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (358, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (359, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (360, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (361, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (362, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (363, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (364, 'DCDDD', '', 0, '分页数据', '2018-12-07 16:01:32', NULL);
INSERT INTO `pro_brand` VALUES (365, 'DCDDD', 'proBrand/223662900_4563.jpg', 1, '分页数据', '2018-12-07 16:01:32', '2018-12-21 16:17:17');
INSERT INTO `pro_brand` VALUES (366, 'DCDDD', 'proBrand/8972_webBanner_1502267784_8514.jpg', 1, '分页数据', '2018-12-07 16:01:32', '2018-12-21 16:03:39');
INSERT INTO `pro_brand` VALUES (367, 'DCDDD', 'proBrand/2308_avatar_1451016014_8690.jpg', 1, '分页数据', '2018-12-07 16:01:32', '2018-12-17 21:52:33');
INSERT INTO `pro_brand` VALUES (368, 'DCDDD', 'proBrand/6126_avatar_1451125344_5741.jpg', 1, '分页数据111', '2018-12-07 16:01:32', '2018-12-07 22:14:25');
INSERT INTO `pro_brand` VALUES (369, 'DCDDD', 'proBrand/5878_avatar_1451016014_8690.jpg', 1, '分页数据222', '2018-12-07 16:01:32', '2018-12-21 16:03:23');
COMMIT;

-- ----------------------------
-- Table structure for pro_category
-- ----------------------------
DROP TABLE IF EXISTS `pro_category`;
CREATE TABLE `pro_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '类型：1：一级，2：二级，3：子级',
  `p_id` int(11) NOT NULL DEFAULT '-1' COMMENT '父id',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `status` tinyint(2) DEFAULT NULL COMMENT '状态：0：禁用，1：启用',
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='产品分类';

-- ----------------------------
-- Records of pro_category
-- ----------------------------
BEGIN;
INSERT INTO `pro_category` VALUES (1, 1, -1, '上衣', 1, '2018-12-10 20:39:12', '2018-12-21 16:03:57');
INSERT INTO `pro_category` VALUES (2, 1, -1, '下衣', 1, '2018-12-10 20:40:58', '2018-12-17 15:02:27');
INSERT INTO `pro_category` VALUES (3, 2, 1, '外套', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (4, 2, 1, 'T恤', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (5, 2, 1, '衬衫', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (6, 2, 1, '毛衣', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (7, 2, 2, '裤子', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (8, 2, 2, '裙子', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (9, 3, 3, '皮衣', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (10, 3, 3, '外套-2', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (11, 3, 3, '外套-3', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (12, 3, 4, 'T恤-1', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (13, 3, 4, 'T恤-2', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (14, 3, 4, 'T恤-3', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (15, 3, 4, 'T恤-5', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (16, 3, 5, '衬衫-1', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (17, 3, 5, '衬衫-2', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (18, 3, 5, '衬衫-3', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (19, 3, 5, '衬衫-4', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (20, 3, 5, '衬衫-5', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (21, 3, 5, '衬衫-6', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (22, 3, 6, '毛衣-1', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (23, 3, 6, '毛衣-2', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (24, 3, 7, '裤子-1', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (25, 3, 7, '裤子-2', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (26, 3, 8, '裙子-1', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (27, 3, 8, '裙子-2', 1, '2018-12-11 13:35:30', NULL);
INSERT INTO `pro_category` VALUES (28, 1, -1, '测试1', 1, '2018-12-17 14:28:02', '2018-12-17 15:09:22');
INSERT INTO `pro_category` VALUES (29, 2, 28, 'test-1-2', 1, '2018-12-17 15:00:20', NULL);
INSERT INTO `pro_category` VALUES (30, 3, 29, 'test-1-2-3', 1, '2018-12-17 15:00:34', '2018-12-17 15:00:49');
COMMIT;

-- ----------------------------
-- Table structure for pro_product
-- ----------------------------
DROP TABLE IF EXISTS `pro_product`;
CREATE TABLE `pro_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand_id` int(11) NOT NULL DEFAULT '0' COMMENT '品牌',
  `category_id` int(11) NOT NULL DEFAULT '0' COMMENT '分类',
  `shop_id` int(11) NOT NULL DEFAULT '0' COMMENT '店铺',
  `name` varchar(50) DEFAULT '0' COMMENT '名称',
  `image` varchar(200) DEFAULT '0' COMMENT '图片',
  `price` decimal(20,6) DEFAULT '1.000000' COMMENT '价格',
  `purchase_price` decimal(20,6) DEFAULT '1.000000' COMMENT '进价',
  `sale_price` decimal(20,6) DEFAULT '1.000000' COMMENT '足销价',
  `stock` int(11) DEFAULT '0' COMMENT '库存',
  `status` tinyint(2) DEFAULT '0' COMMENT '状态：0：下架，1：上架',
  `number` varchar(50) DEFAULT '11-11-11-11' COMMENT '编号',
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2141 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_product
-- ----------------------------
BEGIN;
INSERT INTO `pro_product` VALUES (1, 10, 21, 1, 'mq-1-u', 'proProduct/937313900_9198.jpg', 20000.000000, 1800.000000, 19990.000000, 195, 1, 'mq-0001-u', '2019-01-10 10:22:16', '2021-07-27 16:25:30');
INSERT INTO `pro_product` VALUES (2, 10, 21, 1, 'mq-2-u', 'proProduct/937313900_9198.jpg', 20000.000000, 1800.000000, 19990.000000, 207, 1, 'mq-0001-u', '2019-01-10 10:22:16', '2021-07-23 18:17:58');
INSERT INTO `pro_product` VALUES (3, 10, 21, 1, 'mq-3-u', 'proProduct/937313900_9198.jpg', 20000.000000, 1800.000000, 19990.000000, 210, 1, 'mq-0001-u', '2019-01-10 10:22:16', '2019-01-10 13:11:02');
INSERT INTO `pro_product` VALUES (2140, 10, 21, 1, 'mq-4-u', 'proProduct/937313900_9198.jpg', 20000.000000, 1800.000000, 19990.000000, 3030, 0, 'mq-0001-u', '2019-01-10 10:22:16', '2019-01-10 17:17:57');
COMMIT;

-- ----------------------------
-- Table structure for pro_shop
-- ----------------------------
DROP TABLE IF EXISTS `pro_shop`;
CREATE TABLE `pro_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `logo` varchar(50) DEFAULT NULL COMMENT 'logo',
  `status` tinyint(2) DEFAULT NULL COMMENT '状态：0：禁用，1：启用',
  `desc` varchar(500) DEFAULT NULL COMMENT '描述',
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='店铺';

-- ----------------------------
-- Records of pro_shop
-- ----------------------------
BEGIN;
INSERT INTO `pro_shop` VALUES (1, '店铺1', 'proShop/1644_avatar_default.jpg', 1, '店铺1', '2018-12-17 15:26:08', NULL);
INSERT INTO `pro_shop` VALUES (2, '店铺2', 'proShop/8391_avatar_1451016014_8690.jpg', 1, '测试', '2018-12-17 21:59:56', NULL);
COMMIT;

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

SET FOREIGN_KEY_CHECKS = 1;
