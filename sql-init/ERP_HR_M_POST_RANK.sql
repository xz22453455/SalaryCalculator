/*
Navicat Oracle Data Transfer
Oracle Client Version : 10.2.0.5.0

Source Server         : 202
Source Server Version : 110200
Source Host           : 192.168.0.202:1521
Source Schema         : SSDW

Target Server Type    : ORACLE
Target Server Version : 110200
File Encoding         : 65001

Date: 2019-02-13 11:32:57
*/


-- ----------------------------
-- Table structure for ERP_HR_M_POST_RANK
-- ----------------------------
DROP TABLE "SSDW"."ERP_HR_M_POST_RANK";
CREATE TABLE "SSDW"."ERP_HR_M_POST_RANK" (
"POST" VARCHAR2(15 BYTE) NOT NULL ,
"RANK" VARCHAR2(15 BYTE) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN "SSDW"."ERP_HR_M_POST_RANK"."POST" IS '职位';
COMMENT ON COLUMN "SSDW"."ERP_HR_M_POST_RANK"."RANK" IS '等级';

-- ----------------------------
-- Records of ERP_HR_M_POST_RANK
-- ----------------------------
INSERT INTO "SSDW"."ERP_HR_M_POST_RANK" VALUES ('蚂蚁王', '1');
INSERT INTO "SSDW"."ERP_HR_M_POST_RANK" VALUES ('大蚂蚁', '2');
INSERT INTO "SSDW"."ERP_HR_M_POST_RANK" VALUES ('小蚂蚁', '3');

-- ----------------------------
-- Checks structure for table ERP_HR_M_POST_RANK
-- ----------------------------
ALTER TABLE "SSDW"."ERP_HR_M_POST_RANK" ADD CHECK ("POST" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_M_POST_RANK" ADD CHECK ("RANK" IS NOT NULL);
