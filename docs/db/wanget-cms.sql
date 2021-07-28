/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : wanget-cms

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 27/07/2021 18:04:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cms_article
-- ----------------------------
DROP TABLE IF EXISTS `cms_article`;
CREATE TABLE `cms_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `article_type_id` int(11) DEFAULT NULL COMMENT '类型',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容',
  `image` varchar(50) DEFAULT NULL COMMENT '图片',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态，0：禁用，1：启用\n',
  `recommend` tinyint(4) DEFAULT '1' COMMENT '是否推荐',
  `view_count` int(11) DEFAULT '0' COMMENT '浏览次数',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `ctime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `utime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `auditor` int(11) DEFAULT NULL COMMENT '审核员',
  `atime` timestamp NULL DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`id`),
  KEY `index_title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='文章';

-- ----------------------------
-- Records of cms_article
-- ----------------------------
BEGIN;
INSERT INTO `cms_article` VALUES (1, 1, '测试1', '测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1测试1', 'cmsArticle/612519200_8439.jpg', 1, 1, 0, 1, '2018-12-24 14:08:05', '2018-12-24 14:24:53', 0, NULL);
INSERT INTO `cms_article` VALUES (2, 1, '测试2', '测试2测试2测试2测试2测试2测试2测试2测试2', 'cmsArticle/794916900_8732.jpg', 1, 2, 0, 1, '2018-12-24 14:26:37', '2018-12-24 14:28:16', 0, NULL);
INSERT INTO `cms_article` VALUES (3, 3, '测试3', '测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3测试3', 'cmsArticle/622961900_7265.jpg', 1, 1, 0, 1, '2018-12-24 14:28:44', NULL, 0, NULL);
INSERT INTO `cms_article` VALUES (4, 1, '副编辑器', '<p><span style=\"font-size: 36px;\">大沙发斯蒂芬</span></p><p><span style=\"font-size: 36px;\"></span></p><p><p></p></p><table class=\"table table-bordered\" style=\"margin: 0px 0px 20px; padding: 0px; font-family: &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; border-collapse: collapse; border-spacing: 0px; box-sizing: border-box; max-width: 100%; background-color: transparent; width: 1130px; border: 1px solid rgb(221, 221, 221);\"><tbody style=\"margin: 0px; padding: 0px; font-family: &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; box-sizing: border-box;\"><tr style=\"margin: 0px; padding: 0px; font-family: &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; box-sizing: border-box;\"><td style=\"margin: 0px; padding: 8px; font-family: &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); word-break: break-all; box-sizing: border-box; line-height: 1.42857; vertical-align: top; border: 1px solid rgb(221, 221, 221);\">啊啊啊</td><td style=\"margin: 0px; padding: 8px; font-family: &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); word-break: break-all; box-sizing: border-box; line-height: 1.42857; vertical-align: top; border: 1px solid rgb(221, 221, 221);\">大大大</td><td style=\"margin: 0px; padding: 8px; font-family: &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); word-break: break-all; box-sizing: border-box; line-height: 1.42857; vertical-align: top; border: 1px solid rgb(221, 221, 221);\">嘻嘻嘻</td></tr></tbody></table>', 'cmsArticle/124877600_3358.jpg', 1, 2, 0, 1, '2018-12-24 15:21:10', NULL, 0, NULL);
INSERT INTO `cms_article` VALUES (5, 1, '富编辑器2', '<p><img src=\"/uploads/cmsArticleContent/105260100_2465.jpg\" style=\"width: 110px;\">啊哈哈哈哈快看快看打算发的说法<br></p><p></p><table class=\"table table-bordered\"><tbody><tr><td>大大大</td><td>信息</td></tr><tr><td>订单</td><td>订单</td></tr></tbody></table>阿斯顿发生发大水<p></p>', 'cmsArticle/707918400_7571.jpg', 4, 2, 0, 1, '2018-12-24 16:04:58', '2018-12-24 17:19:06', 0, NULL);
COMMIT;

-- ----------------------------
-- Table structure for cms_article_tag
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_tag`;
CREATE TABLE `cms_article_tag` (
  `article_id` int(11) DEFAULT NULL,
  `tag_id` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_article_tag
-- ----------------------------
BEGIN;
INSERT INTO `cms_article_tag` VALUES (1, 1, 1);
INSERT INTO `cms_article_tag` VALUES (1, 2, 2);
INSERT INTO `cms_article_tag` VALUES (1, 3, 3);
INSERT INTO `cms_article_tag` VALUES (2, 1, 4);
INSERT INTO `cms_article_tag` VALUES (2, 25, 5);
INSERT INTO `cms_article_tag` VALUES (2, 39, 6);
INSERT INTO `cms_article_tag` VALUES (3, 14, 7);
INSERT INTO `cms_article_tag` VALUES (3, 17, 8);
INSERT INTO `cms_article_tag` VALUES (3, 27, 9);
INSERT INTO `cms_article_tag` VALUES (4, 1, 10);
INSERT INTO `cms_article_tag` VALUES (4, 25, 11);
INSERT INTO `cms_article_tag` VALUES (5, 2, 12);
INSERT INTO `cms_article_tag` VALUES (5, 14, 13);
COMMIT;

-- ----------------------------
-- Table structure for cms_article_type
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_type`;
CREATE TABLE `cms_article_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `status` tinyint(4) NOT NULL COMMENT '状态，0：禁用，1：启用',
  `creater` int(11) DEFAULT NULL,
  `updater` int(11) DEFAULT NULL,
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='文章类型';

-- ----------------------------
-- Records of cms_article_type
-- ----------------------------
BEGIN;
INSERT INTO `cms_article_type` VALUES (1, '文章', 1, 1, 0, '2018-12-24 13:15:47', NULL);
INSERT INTO `cms_article_type` VALUES (2, '视频', 1, 1, 0, '2018-12-24 13:16:02', NULL);
INSERT INTO `cms_article_type` VALUES (3, '新闻', 1, 1, 0, '2018-12-24 13:16:15', NULL);
COMMIT;

-- ----------------------------
-- Table structure for cms_banner
-- ----------------------------
DROP TABLE IF EXISTS `cms_banner`;
CREATE TABLE `cms_banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` tinyint(4) DEFAULT NULL COMMENT '状态，0：禁用，1：启用',
  `title` varchar(50) DEFAULT NULL,
  `index` tinyint(3) DEFAULT NULL COMMENT '位置',
  `url` varchar(100) DEFAULT NULL,
  `content` varchar(150) DEFAULT NULL,
  `image` varchar(150) DEFAULT NULL,
  `creater` int(11) DEFAULT NULL,
  `updater` int(11) DEFAULT NULL,
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='banner';

-- ----------------------------
-- Records of cms_banner
-- ----------------------------
BEGIN;
INSERT INTO `cms_banner` VALUES (1, 1, '测试1', 1, '#', '测试1', 'webBanner/520_webBanner_1502267784_8514.jpg', 1, 0, '2018-12-20 17:40:26', NULL);
COMMIT;

-- ----------------------------
-- Table structure for cms_comments
-- ----------------------------
DROP TABLE IF EXISTS `cms_comments`;
CREATE TABLE `cms_comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT '-1',
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `article_id` int(11) DEFAULT NULL,
  `content` text,
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_articleId` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论';

-- ----------------------------
-- Table structure for cms_tag
-- ----------------------------
DROP TABLE IF EXISTS `cms_tag`;
CREATE TABLE `cms_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `ctime` timestamp NULL DEFAULT NULL,
  `utime` timestamp NULL DEFAULT NULL,
  `creater` int(11) DEFAULT NULL,
  `updater` int(11) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL COMMENT '状态，0：禁用，1：启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COMMENT='关键词';

-- ----------------------------
-- Records of cms_tag
-- ----------------------------
BEGIN;
INSERT INTO `cms_tag` VALUES (1, '关键字', '2018-12-24 11:58:10', '2018-12-24 11:59:06', 1, 1, 1);
INSERT INTO `cms_tag` VALUES (2, '关键字2', '2018-12-24 11:58:38', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (3, '关键字3', '2018-12-24 11:59:16', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (4, '关机字5', '2018-12-24 11:59:26', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (5, '关机字4', '2018-12-24 11:59:26', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (6, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (7, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (8, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (9, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (10, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (11, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (12, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (13, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (14, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (15, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (16, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (17, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (18, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (19, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (20, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (21, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (22, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (23, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (24, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (25, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (26, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (27, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (28, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (29, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (30, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (31, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (32, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (33, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (34, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (35, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (36, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (37, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (38, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (39, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (40, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (41, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (42, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (43, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (44, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (45, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (46, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (47, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (48, '关机字4', '2018-12-24 13:13:33', NULL, 1, 0, 1);
INSERT INTO `cms_tag` VALUES (49, '测试-rpc', '2019-01-02 13:20:01', NULL, 1, 0, 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
