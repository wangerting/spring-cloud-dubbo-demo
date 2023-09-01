/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : wanget-admin

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 22/01/2021 10:26:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `p_id` int(11) NOT NULL DEFAULT '0' COMMENT '父id',
  `type` int(2) NOT NULL DEFAULT '1' COMMENT '1：菜单，2：url，3：按钮',
  `status` int(2) DEFAULT '1',
  `desc` int(11) DEFAULT '1' COMMENT '排序',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `sign` varchar(50) DEFAULT NULL COMMENT 'sign',
  `icon` varchar(50) DEFAULT NULL COMMENT '描述',
  `ctime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `utime` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '修改者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
BEGIN;
INSERT INTO `sys_permission` VALUES (1, -1, 1, 1, 1, '商品管理', 'proProduct', '#', '2018-12-18 10:46:05', '2018-12-18 10:48:40', 0, 0);
INSERT INTO `sys_permission` VALUES (2, -1, 1, 1, 2, '订单管理', 'order', '#', '2018-12-18 10:49:26', '2018-12-18 10:49:43', 0, 0);
INSERT INTO `sys_permission` VALUES (3, 1, 2, 1, 1, '品牌管理', 'proBrand', '#', '2018-12-18 10:51:13', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (4, 1, 2, 1, 2, '分类管理', 'proCategory', '#', '2018-12-18 10:52:49', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (5, 1, 2, 1, 3, '店铺管理', 'proShop', '#', '2018-12-18 10:54:34', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (6, 1, 2, 1, 4, '商品管理', 'proProduct', '#', '2018-12-18 10:54:56', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (7, 2, 2, 1, 1, '订单列表', 'webOrder', '#', '2018-12-18 10:55:27', '2018-12-20 11:20:05', 0, 1);
INSERT INTO `sys_permission` VALUES (8, -1, 1, 1, 6, '系统管理', 'system', '#', '2018-12-18 10:55:45', '2018-12-20 14:46:11', 0, 1);
INSERT INTO `sys_permission` VALUES (9, 8, 2, 1, 1, '员工管理', 'sysUser', '#', '2018-12-18 10:56:31', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (10, 8, 2, 1, 2, '角色管理', 'sysRole', '#', '2018-12-18 10:56:51', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (11, 8, 2, 1, 3, '权限管理', 'sysPermission', '#', '2018-12-18 10:57:13', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (13, 3, 3, 1, 3, '保存', 'proBrand:save', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (14, 3, 3, 1, 4, '删除', 'proBrand:delete', '#', '2018-12-18 11:01:37', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (16, 4, 3, 1, 2, '保存', 'proCategory:save', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (17, 4, 3, 1, 3, '删除', 'proCategory:delete', '#', '2018-12-18 11:01:37', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (19, 5, 3, 1, 2, '保存', 'proShop:save', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (20, 5, 3, 1, 3, '删除', 'proShop:delete', '#', '2018-12-18 11:01:37', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (22, 6, 3, 1, 2, '保存', 'proProduct:save', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (23, 6, 3, 1, 3, '删除', 'proProduct:delete', '#', '2018-12-18 11:01:37', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (25, 7, 3, 1, 2, '保存', 'webOrder:save', '#', '2018-12-18 11:01:17', '2018-12-20 11:20:30', 0, 1);
INSERT INTO `sys_permission` VALUES (26, 7, 3, 1, 3, '删除', 'webOrder:delete', '#', '2018-12-18 11:01:37', '2018-12-20 11:21:11', 0, 1);
INSERT INTO `sys_permission` VALUES (28, 9, 3, 1, 2, '保存', 'sysUser:save', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (29, 9, 3, 1, 3, '删除', 'sysUser:delete', '#', '2018-12-18 11:01:37', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (31, 10, 3, 1, 1, '编辑', 'sysRole:edit', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (32, 10, 3, 1, 3, '删除', 'sysRole:delete', '#', '2018-12-18 11:01:37', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (34, 11, 3, 1, 0, '编辑', 'sysPermission:edit', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (35, 11, 3, 1, 3, '删除', 'sysPermission:delete', '#', '2018-12-18 11:01:37', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (36, 3, 3, 1, 1, '品牌查询', 'proBrand:search', '#', '2018-12-19 17:24:45', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (37, 4, 3, 1, 0, '查询', 'proCategory:search', '#', '2018-12-19 17:26:27', '2018-12-19 17:26:59', 0, 0);
INSERT INTO `sys_permission` VALUES (38, 5, 3, 1, 0, '查询', 'proShop:search', '#', '2018-12-19 17:27:31', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (39, 6, 3, 1, 0, '查询', 'proProduct:search', '#', '2018-12-19 17:28:02', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (40, 9, 3, 1, 0, '查询', 'sysUser:search', '#', '2018-12-19 17:29:43', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (41, 10, 3, 1, 0, '查询', 'sysRole:search', '#', '2018-12-19 17:30:22', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (42, 11, 3, 1, 1, '保存', 'sysPermission:save', '#', '2018-12-18 10:58:44', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (43, 10, 3, 1, 2, '保存', 'sysRole:save', '#', '2018-12-20 10:55:33', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (45, 3, 3, 1, 2, '编辑', 'proBrand:edit', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (46, 4, 3, 1, 1, '编辑', 'proCategory:edit', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (47, 5, 3, 1, 1, '编辑', 'proShop:edit', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (48, 6, 3, 1, 1, '编辑', 'proProduct:edit', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (49, 7, 3, 1, 1, '编辑', 'webOrder:edit', '#', '2018-12-18 11:01:17', '2018-12-20 11:20:52', 0, 1);
INSERT INTO `sys_permission` VALUES (50, 9, 3, 1, 1, '编辑', 'sysUser:edit', '#', '2018-12-18 11:01:17', NULL, 0, 0);
INSERT INTO `sys_permission` VALUES (51, -1, 1, 1, 3, 'web管理', 'web', '#', '2018-12-20 14:45:42', '2018-12-20 14:46:03', 1, 1);
INSERT INTO `sys_permission` VALUES (52, 74, 2, 1, 0, 'banner管理', 'cmsBanner', '#', '2018-12-20 14:46:44', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (53, 52, 3, 1, 1, '查询', 'cmsBanner:search', '#', '2018-12-20 14:47:24', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (54, 52, 3, 1, 2, '编辑', 'cmsBanner:edit', '#', '2018-12-20 14:47:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (55, 52, 3, 1, 3, '保存', 'cmsBanner:save', '#', '2018-12-20 14:48:31', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (56, 52, 3, 1, 4, '删除', 'cmsBanner:delete', '#', '2018-12-20 14:49:00', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (57, 52, 3, 1, 4, '详情', 'cmsBanner:*', '#', '2018-12-20 17:42:36', '2018-12-20 17:45:22', 1, 1);
INSERT INTO `sys_permission` VALUES (58, 9, 3, 1, 4, '详情', 'sysUser:*', '#', '2018-12-20 17:43:07', '2018-12-20 17:45:06', 1, 1);
INSERT INTO `sys_permission` VALUES (59, 51, 2, 1, 2, '地区管理', 'webPublicAreas', '#', '2018-12-20 21:26:32', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (60, 59, 3, 1, 1, '查询', 'webPublicAreas:search', '#', '2018-12-20 21:27:18', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (61, 59, 3, 1, 2, '编辑', 'webPublicAreas:edit', '#', '2018-12-20 21:27:52', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (62, 59, 3, 1, 3, '保存', 'webPublicAreas:save', '#', '2018-12-20 21:28:22', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (63, 51, 2, 1, 3, '用户管理', 'webUser', '#', '2018-12-21 14:37:39', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (64, 63, 3, 1, 1, '查询', 'webUser:search', '#', '2018-12-21 14:38:10', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (65, 63, 3, 1, 2, '编辑', 'webUser:edit', '#', '2018-12-21 14:38:33', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (66, 63, 3, 1, 3, '保存', 'webUser:save', '#', '2018-12-21 14:38:56', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (67, 63, 3, 1, 4, '删除', 'webUser:delete', '#', '2018-12-21 14:39:27', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (68, 63, 3, 1, 5, '详情', 'webUser:*', '#', '2018-12-21 15:46:48', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (69, 6, 3, 1, 5, '详情', 'proProduct:*', '#', '2018-12-21 16:20:10', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (70, 63, 3, 1, 6, '地址管理', 'webUserAddress:address:*', '#', '2018-12-21 16:57:26', '2018-12-21 17:11:40', 1, 1);
INSERT INTO `sys_permission` VALUES (71, 63, 3, 1, 6, '地址编辑', 'webUserAddress:address', '#', '2018-12-21 21:34:08', '2018-12-21 21:43:17', 1, 1);
INSERT INTO `sys_permission` VALUES (72, 63, 3, 1, 7, '地址保存', 'webUserAddress:addressSave', '#', '2018-12-21 21:34:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (73, 63, 3, 1, 8, '查询省市区', 'webUserAddress:areas:*', '#', '2018-12-21 21:35:37', '2018-12-21 22:56:30', 1, 1);
INSERT INTO `sys_permission` VALUES (74, -1, 1, 1, 5, 'cms管理', 'cms', '#', '2018-12-24 11:06:33', '2018-12-24 11:06:50', 1, 1);
INSERT INTO `sys_permission` VALUES (75, 74, 2, 1, 1, '标签管理', 'cmsTag', '#', '2018-12-24 11:07:30', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (76, 74, 2, 1, 2, '文章类型管理', 'cmsArticleType', '#', '2018-12-24 11:08:10', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (77, 74, 2, 1, 3, '文章管理', 'cmsArticle', '#', '2018-12-24 11:08:42', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (78, 75, 3, 1, 0, '查询', 'cmsTag:search', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (79, 75, 3, 1, 1, '编辑', 'cmsTag:edit', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (80, 75, 3, 1, 2, '保存', 'cmsTag:save', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (81, 75, 3, 1, 3, '删除', 'cmsTag:delete', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (82, 75, 3, 1, 4, '详情', 'cmsTag:*', '#', '2018-12-24 11:14:58', NULL, 1, 1);
INSERT INTO `sys_permission` VALUES (83, 76, 3, 1, 0, '查询', 'cmsArticleType:search', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (84, 76, 3, 1, 1, '编辑', 'cmsArticleType:edit', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (85, 76, 3, 1, 2, '保存', 'cmsArticleType:save', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (86, 76, 3, 1, 3, '删除', 'cmsArticleType:delete', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (87, 76, 3, 1, 4, '详情', 'cmsArticleType:*', '#', '2018-12-24 11:14:58', NULL, 1, 1);
INSERT INTO `sys_permission` VALUES (88, 77, 3, 1, 0, '查询', 'cmsArticle:search', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (89, 77, 3, 1, 1, '编辑', 'cmsArticle:edit', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (90, 77, 3, 1, 2, '保存', 'cmsArticle:save', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (91, 77, 3, 1, 3, '删除', 'cmsArticle:delete', '#', '2018-12-24 11:14:58', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (92, 77, 3, 1, 4, '详情', 'cmsArticle:*', '#', '2018-12-24 11:14:58', NULL, 1, 1);
INSERT INTO `sys_permission` VALUES (93, 77, 3, 1, 7, '富编辑器上传', 'summernote:upload', '#', '2018-12-24 15:36:25', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (94, 7, 3, 1, 0, '查询', 'webOrder:search', '#', '2018-12-25 11:14:08', NULL, 1, 0);
INSERT INTO `sys_permission` VALUES (95, 7, 3, 1, 6, '详情', 'webOrder:*', '#', '2018-12-25 11:42:51', NULL, 1, 0);
COMMIT;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `status` int(2) DEFAULT NULL COMMENT '状态，0：禁用，1：启用',
  `sign` varchar(50) DEFAULT NULL,
  `content` char(200) DEFAULT NULL COMMENT '描述',
  `ctime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `utime` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '修改者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` VALUES (2, 'admin', 1, 'admin', 'admin', '2018-12-18 16:52:43', '2018-12-25 11:43:08', 0, 0);
INSERT INTO `sys_role` VALUES (3, '商品管理员', 1, '商品管理员', 'productor', '2018-12-18 17:59:54', '2018-12-20 11:18:53', 0, 0);
INSERT INTO `sys_role` VALUES (4, 'test', 1, 'test', 'test', '2019-01-03 17:48:29', '2019-01-03 17:50:29', 0, 0);
INSERT INTO `sys_role` VALUES (5, 'test2', 1, 'test2', 'test2', '2019-01-03 17:54:44', '2019-01-04 13:58:56', 0, 0);
COMMIT;

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
BEGIN;
INSERT INTO `sys_role_permission` VALUES (3, 1);
INSERT INTO `sys_role_permission` VALUES (3, 3);
INSERT INTO `sys_role_permission` VALUES (3, 36);
INSERT INTO `sys_role_permission` VALUES (3, 45);
INSERT INTO `sys_role_permission` VALUES (3, 13);
INSERT INTO `sys_role_permission` VALUES (3, 14);
INSERT INTO `sys_role_permission` VALUES (3, 4);
INSERT INTO `sys_role_permission` VALUES (3, 37);
INSERT INTO `sys_role_permission` VALUES (3, 46);
INSERT INTO `sys_role_permission` VALUES (3, 16);
INSERT INTO `sys_role_permission` VALUES (3, 17);
INSERT INTO `sys_role_permission` VALUES (3, 5);
INSERT INTO `sys_role_permission` VALUES (3, 38);
INSERT INTO `sys_role_permission` VALUES (3, 47);
INSERT INTO `sys_role_permission` VALUES (3, 19);
INSERT INTO `sys_role_permission` VALUES (3, 20);
INSERT INTO `sys_role_permission` VALUES (3, 6);
INSERT INTO `sys_role_permission` VALUES (3, 39);
INSERT INTO `sys_role_permission` VALUES (3, 48);
INSERT INTO `sys_role_permission` VALUES (3, 22);
INSERT INTO `sys_role_permission` VALUES (3, 23);
INSERT INTO `sys_role_permission` VALUES (3, 2);
INSERT INTO `sys_role_permission` VALUES (3, 7);
INSERT INTO `sys_role_permission` VALUES (3, 25);
INSERT INTO `sys_role_permission` VALUES (3, 49);
INSERT INTO `sys_role_permission` VALUES (3, 26);
INSERT INTO `sys_role_permission` VALUES (2, 1);
INSERT INTO `sys_role_permission` VALUES (2, 3);
INSERT INTO `sys_role_permission` VALUES (2, 36);
INSERT INTO `sys_role_permission` VALUES (2, 45);
INSERT INTO `sys_role_permission` VALUES (2, 13);
INSERT INTO `sys_role_permission` VALUES (2, 14);
INSERT INTO `sys_role_permission` VALUES (2, 4);
INSERT INTO `sys_role_permission` VALUES (2, 37);
INSERT INTO `sys_role_permission` VALUES (2, 46);
INSERT INTO `sys_role_permission` VALUES (2, 16);
INSERT INTO `sys_role_permission` VALUES (2, 17);
INSERT INTO `sys_role_permission` VALUES (2, 5);
INSERT INTO `sys_role_permission` VALUES (2, 38);
INSERT INTO `sys_role_permission` VALUES (2, 47);
INSERT INTO `sys_role_permission` VALUES (2, 19);
INSERT INTO `sys_role_permission` VALUES (2, 20);
INSERT INTO `sys_role_permission` VALUES (2, 6);
INSERT INTO `sys_role_permission` VALUES (2, 39);
INSERT INTO `sys_role_permission` VALUES (2, 48);
INSERT INTO `sys_role_permission` VALUES (2, 22);
INSERT INTO `sys_role_permission` VALUES (2, 23);
INSERT INTO `sys_role_permission` VALUES (2, 69);
INSERT INTO `sys_role_permission` VALUES (2, 2);
INSERT INTO `sys_role_permission` VALUES (2, 7);
INSERT INTO `sys_role_permission` VALUES (2, 94);
INSERT INTO `sys_role_permission` VALUES (2, 49);
INSERT INTO `sys_role_permission` VALUES (2, 25);
INSERT INTO `sys_role_permission` VALUES (2, 26);
INSERT INTO `sys_role_permission` VALUES (2, 95);
INSERT INTO `sys_role_permission` VALUES (2, 51);
INSERT INTO `sys_role_permission` VALUES (2, 52);
INSERT INTO `sys_role_permission` VALUES (2, 53);
INSERT INTO `sys_role_permission` VALUES (2, 54);
INSERT INTO `sys_role_permission` VALUES (2, 55);
INSERT INTO `sys_role_permission` VALUES (2, 56);
INSERT INTO `sys_role_permission` VALUES (2, 57);
INSERT INTO `sys_role_permission` VALUES (2, 59);
INSERT INTO `sys_role_permission` VALUES (2, 60);
INSERT INTO `sys_role_permission` VALUES (2, 61);
INSERT INTO `sys_role_permission` VALUES (2, 62);
INSERT INTO `sys_role_permission` VALUES (2, 63);
INSERT INTO `sys_role_permission` VALUES (2, 64);
INSERT INTO `sys_role_permission` VALUES (2, 65);
INSERT INTO `sys_role_permission` VALUES (2, 66);
INSERT INTO `sys_role_permission` VALUES (2, 67);
INSERT INTO `sys_role_permission` VALUES (2, 68);
INSERT INTO `sys_role_permission` VALUES (2, 70);
INSERT INTO `sys_role_permission` VALUES (2, 71);
INSERT INTO `sys_role_permission` VALUES (2, 72);
INSERT INTO `sys_role_permission` VALUES (2, 73);
INSERT INTO `sys_role_permission` VALUES (2, 74);
INSERT INTO `sys_role_permission` VALUES (2, 75);
INSERT INTO `sys_role_permission` VALUES (2, 78);
INSERT INTO `sys_role_permission` VALUES (2, 79);
INSERT INTO `sys_role_permission` VALUES (2, 80);
INSERT INTO `sys_role_permission` VALUES (2, 81);
INSERT INTO `sys_role_permission` VALUES (2, 82);
INSERT INTO `sys_role_permission` VALUES (2, 76);
INSERT INTO `sys_role_permission` VALUES (2, 83);
INSERT INTO `sys_role_permission` VALUES (2, 84);
INSERT INTO `sys_role_permission` VALUES (2, 85);
INSERT INTO `sys_role_permission` VALUES (2, 86);
INSERT INTO `sys_role_permission` VALUES (2, 87);
INSERT INTO `sys_role_permission` VALUES (2, 77);
INSERT INTO `sys_role_permission` VALUES (2, 88);
INSERT INTO `sys_role_permission` VALUES (2, 89);
INSERT INTO `sys_role_permission` VALUES (2, 90);
INSERT INTO `sys_role_permission` VALUES (2, 91);
INSERT INTO `sys_role_permission` VALUES (2, 92);
INSERT INTO `sys_role_permission` VALUES (2, 93);
INSERT INTO `sys_role_permission` VALUES (2, 8);
INSERT INTO `sys_role_permission` VALUES (2, 9);
INSERT INTO `sys_role_permission` VALUES (2, 40);
INSERT INTO `sys_role_permission` VALUES (2, 50);
INSERT INTO `sys_role_permission` VALUES (2, 28);
INSERT INTO `sys_role_permission` VALUES (2, 29);
INSERT INTO `sys_role_permission` VALUES (2, 58);
INSERT INTO `sys_role_permission` VALUES (2, 10);
INSERT INTO `sys_role_permission` VALUES (2, 41);
INSERT INTO `sys_role_permission` VALUES (2, 31);
INSERT INTO `sys_role_permission` VALUES (2, 43);
INSERT INTO `sys_role_permission` VALUES (2, 32);
INSERT INTO `sys_role_permission` VALUES (2, 11);
INSERT INTO `sys_role_permission` VALUES (2, 34);
INSERT INTO `sys_role_permission` VALUES (2, 42);
INSERT INTO `sys_role_permission` VALUES (2, 35);
INSERT INTO `sys_role_permission` VALUES (4, 1);
INSERT INTO `sys_role_permission` VALUES (4, 3);
INSERT INTO `sys_role_permission` VALUES (4, 36);
INSERT INTO `sys_role_permission` VALUES (4, 45);
INSERT INTO `sys_role_permission` VALUES (4, 13);
INSERT INTO `sys_role_permission` VALUES (4, 14);
INSERT INTO `sys_role_permission` VALUES (5, 1);
INSERT INTO `sys_role_permission` VALUES (5, 3);
INSERT INTO `sys_role_permission` VALUES (5, 36);
INSERT INTO `sys_role_permission` VALUES (5, 4);
INSERT INTO `sys_role_permission` VALUES (5, 37);
INSERT INTO `sys_role_permission` VALUES (5, 5);
INSERT INTO `sys_role_permission` VALUES (5, 38);
INSERT INTO `sys_role_permission` VALUES (5, 47);
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL COMMENT '角色',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `auth_key` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `tel` varchar(50) DEFAULT NULL COMMENT '电话',
  `realname` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `status` int(2) DEFAULT '1' COMMENT '状态：0：禁用，1：启用',
  `ctime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `utime` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '修改者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES (1, 2, 'admin', 'O3kfSu0T', 'wangerting1988@126.com', '15010012408', 'admin', 'a3bf235a19f934f21536d4094d212104', 1, '2018-12-18 20:39:57', '2018-12-18 22:14:01', 0, 0);
INSERT INTO `sys_user` VALUES (2, 3, 'productor', 'xVbUkblY', 'wangerting1988@126.com', '15010012408', '测试', 'c28c43224bfd0335aaf91ff2eccc5e55', 1, '2018-12-18 21:44:20', '2019-01-03 17:42:25', 0, 0);
INSERT INTO `sys_user` VALUES (3, 3, 'test', 'SnRzwt4t', 'set', '15010012408', 'test', 'd63bbb4eea5d8da79b7b34e45354c37a', 1, '2019-01-03 17:47:35', NULL, 0, 0);
INSERT INTO `sys_user` VALUES (4, 5, 'teset2', 'nlAVdQ5C', 'stee', 'eeeee', 'teset2', '6ee6fa620d84155f60e753bb79858051', 1, '2019-01-04 09:41:51', NULL, 0, 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
