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

Date: 2019-02-13 11:42:55
*/


-- ----------------------------
-- Table structure for ERP_HR_DF_EMPLOYEE
-- ----------------------------
DROP TABLE "SSDW"."ERP_HR_DF_EMPLOYEE";
CREATE TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" (
"EMPLOYEE_NO" VARCHAR2(10 BYTE) NOT NULL ,
"NAME" VARCHAR2(30 BYTE) NOT NULL ,
"SEX" VARCHAR2(3 BYTE) NULL ,
"AGE" NUMBER(3) NULL ,
"NATION" VARCHAR2(10 BYTE) NULL ,
"POLITICS_STATUS" VARCHAR2(20 BYTE) NULL ,
"MARITAL_STATUS" VARCHAR2(10 BYTE) NULL ,
"ID_NUMBER" VARCHAR2(20 BYTE) NULL ,
"NATIVE_PLACE" VARCHAR2(30 BYTE) NULL ,
"LIVE_ADDRESS" VARCHAR2(80 BYTE) NULL ,
"BIRTHDATE" VARCHAR2(20 BYTE) NULL ,
"PLACE_OF_DOMICILE" VARCHAR2(80 BYTE) NULL ,
"GRADUATED_SCHOOL" VARCHAR2(50 BYTE) NULL ,
"MAJOR" VARCHAR2(50 BYTE) NULL ,
"EDUCATION" VARCHAR2(10 BYTE) NULL ,
"DEPARTMENT" VARCHAR2(20 BYTE) NULL ,
"JOB" VARCHAR2(30 BYTE) NULL ,
"POST" VARCHAR2(20 BYTE) NOT NULL ,
"WORK_AGE_MONTH" NUMBER(3) DEFAULT ''  NULL ,
"CONTRACT_EXPIRATION_TIME" NUMBER(3) NULL ,
"HIREDATE" VARCHAR2(20 BYTE) NULL ,
"LAST_CONTRACT_DATE" VARCHAR2(20 BYTE) NULL ,
"NUMBER_CONTRACT" NUMBER(3) NULL ,
"CONTRACT_DEADLINE" VARCHAR2(20 BYTE) NULL ,
"TELEPHONE" VARCHAR2(20 BYTE) NULL ,
"SPARE_TELEPHONE" VARCHAR2(20 BYTE) NULL ,
"COMMENTS" VARCHAR2(50 BYTE) NULL ,
"WORKING_STATE" VARCHAR2(10 BYTE) DEFAULT NULL  NOT NULL ,
"POST_LEVEL" NUMBER NULL ,
"DIRECT_SUPERVISOR_ID" VARCHAR2(10 BYTE) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."EMPLOYEE_NO" IS '工号';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."NAME" IS '姓名';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."SEX" IS '性别';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."AGE" IS '年龄';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."NATION" IS '民族';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."POLITICS_STATUS" IS '政治面貌';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."MARITAL_STATUS" IS '婚姻状况';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."ID_NUMBER" IS '身份证号';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."NATIVE_PLACE" IS '籍贯';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."LIVE_ADDRESS" IS '居住地址';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."BIRTHDATE" IS '出生日期';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."PLACE_OF_DOMICILE" IS '户籍所在地';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."GRADUATED_SCHOOL" IS '毕业院校';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."MAJOR" IS '专业';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."EDUCATION" IS '学历';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."DEPARTMENT" IS '部门';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."JOB" IS '职务';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."POST" IS '级别';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."WORK_AGE_MONTH" IS '工龄（月）';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."CONTRACT_EXPIRATION_TIME" IS '合同年限';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."HIREDATE" IS '入职日期';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."LAST_CONTRACT_DATE" IS '最近一次合同签订日期';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."NUMBER_CONTRACT" IS '第几次签订合同';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."CONTRACT_DEADLINE" IS '合同到期日期';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."TELEPHONE" IS '联系电话';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."SPARE_TELEPHONE" IS '备用联系方式';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."COMMENTS" IS '备注';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."WORKING_STATE" IS '工作状态';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."POST_LEVEL" IS '星级（1：一星，2：二星，3：三星）';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_EMPLOYEE"."DIRECT_SUPERVISOR_ID" IS '直属上级id';

-- ----------------------------
-- Records of ERP_HR_DF_EMPLOYEE
-- ----------------------------
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2576', '邵宏超', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '917');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2320', '李真诚', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '2246');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2223', '梅锦燕', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '3', '2225');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2557', '张志豪', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '2155');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2717', '赵锋', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2246');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2711', '李俊杰', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2576');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2895', '万嘉辉', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2225');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('1748', '姜丽', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2209');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2712', '孟凡超', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销六部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2146');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2209', '魏中鲁', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '蚂蚁王', null, null, null, null, null, null, null, null, null, '在职', '2', '472');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2283', '张保华', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2209');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2322', '秦敏仁', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2209');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2710', '姚仁青', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2712');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2565', '余英', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2322');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2709', '张炯', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2712');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2566', '孙良田', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '3', '2209');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2713', '刘光清', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2712');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2146', '马旺', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销六部', null, '蚂蚁王', null, null, null, null, null, null, null, null, null, '在职', '1', '472');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2239', '吴娇', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2591');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2580', '张帆', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2566');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2591', '翟刚', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '2209');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2619', '张茹', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销一部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '1748');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2249', '周春进', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '3', '2666');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2252', '舒欢', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2666');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2278', '昝孝震', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2666');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2618', '木余余', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2249');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2637', '周一珉', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, 'JS0041');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2639', '李士微', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '2666');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2643', '谢淼淼', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2249');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2657', '朱沛', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, 'JS0041');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2659', '朱健', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2252');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2666', '倪烈松', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销二部', null, '蚂蚁王', null, null, null, null, null, null, null, null, null, '在职', '2', '472');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('1657', '刘磊', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '蚂蚁王', null, null, null, null, null, null, null, null, null, '在职', '2', '472');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2207', '晏纪刚', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '3', '1657');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2321', '胡慧', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '1657');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2510', '徐东康', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2537');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2537', '吕国强', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '1657');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2583', '金磊', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2321');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2602', '陈赢', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2207');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2609', '郭杰', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2537');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2613', '窦建华', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '1657');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('1772', '郭明', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '2205');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('1796', '陈国好', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '2205');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2072', '陈明强', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2205');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2205', '李向阳', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '蚂蚁王', null, null, null, null, null, null, null, null, null, '在职', '3', '472');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2212', '宋彩虹', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '3', '2205');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2243', '康赞', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '3', '2205');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2502', '王福全', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '1', '2205');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2518', '唐翠云', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2072');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2575', '高红梅', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '1796');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2597', '王张磊', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '1772');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2621', '陈楠', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2212');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2632', '王新标', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2243');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2700', '陈昂', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '1796');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2715', '曾招光', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2502');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2718', '卢建铭', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2212');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2651', '丁俊', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销三部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2613');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2649', '南善龙', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2072');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2652', '刘爱梅', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销四部', null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2212');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2701', '陆寅', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '小蚂蚁', null, null, null, null, null, null, null, null, null, '在职', null, '2207');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2225', '时涛', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '917');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2155', '蔡守非', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '3', '917');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('2246', '宋炜炜', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '大蚂蚁', null, null, null, null, null, null, null, null, null, '在职', '2', '917');
INSERT INTO "SSDW"."ERP_HR_DF_EMPLOYEE" VALUES ('917', '董天军', null, null, null, null, null, null, null, null, null, null, null, null, null, '营销五部', null, '蚂蚁王', null, null, null, null, null, null, null, null, null, '在职', '2', '472');

-- ----------------------------
-- Checks structure for table ERP_HR_DF_EMPLOYEE
-- ----------------------------
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("EMPLOYEE_NO" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("NAME" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("SEX" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("AGE" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("NATION" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("POLITICS_STATUS" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("MARITAL_STATUS" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("ID_NUMBER" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("NATIVE_PLACE" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("BIRTHDATE" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("PLACE_OF_DOMICILE" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("GRADUATED_SCHOOL" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("MAJOR" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("EDUCATION" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("DEPARTMENT" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("WORK_AGE_MONTH" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("CONTRACT_EXPIRATION_TIME" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("HIREDATE" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("NUMBER_CONTRACT" IS NOT NULL) DISABLE;
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("WORKING_STATE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("DIRECT_SUPERVISOR_ID" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("POST" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("EMPLOYEE_NO" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_EMPLOYEE" ADD CHECK ("NAME" IS NOT NULL);
