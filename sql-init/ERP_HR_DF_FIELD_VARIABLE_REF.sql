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

Date: 2019-02-13 11:43:12
*/


-- ----------------------------
-- Table structure for ERP_HR_DF_FIELD_VARIABLE_REF
-- ----------------------------
DROP TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF";
CREATE TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" (
"ORDER_APPRAISAL_SALARY" VARCHAR2(10 BYTE) NOT NULL ,
"PROFIT_APPRAISAL_SALARY" VARCHAR2(10 BYTE) NOT NULL ,
"RETURN_PAY" VARCHAR2(10 BYTE) NOT NULL ,
"DELIVERY_PAY" VARCHAR2(10 BYTE) NOT NULL ,
"CURRENT_MONTH_SIZE" VARCHAR2(10 BYTE) NOT NULL ,
"CURRENT_MONTH_OUTPUT_SIZE" VARCHAR2(10 BYTE) NOT NULL ,
"MONTH_TARGET_SIZE" VARCHAR2(10 BYTE) NOT NULL ,
"CURRENT_MONTH_MONEY" VARCHAR2(10 BYTE) NOT NULL ,
"CURRENT_MONTH_OUTPUT_MONEY" VARCHAR2(10 BYTE) NOT NULL ,
"MONTH_TARGET_MONEY" VARCHAR2(10 BYTE) NOT NULL ,
"PRICE_PER_TON" VARCHAR2(10 BYTE) NOT NULL ,
"TOTAL_ORDER_SIZE" VARCHAR2(10 BYTE) NOT NULL ,
"YEAR_TARGET_SIZE" VARCHAR2(10 BYTE) NOT NULL ,
"TOTAL_ORDER_MONEY" VARCHAR2(10 BYTE) NOT NULL ,
"YEAR_TARGET_MONEY" VARCHAR2(10 BYTE) NOT NULL ,
"TOTAL_OUTPUT_SIZE" VARCHAR2(10 BYTE) NOT NULL ,
"TOTAL_OUTPUT_MONEY" VARCHAR2(10 BYTE) NOT NULL ,
"TOTAL_RETURN_MONEY" VARCHAR2(10 BYTE) NOT NULL ,
"YEAR" VARCHAR2(10 BYTE) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."ORDER_APPRAISAL_SALARY" IS '订单考核工资';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."PROFIT_APPRAISAL_SALARY" IS '利润考核工资';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."RETURN_PAY" IS '回款绩效工资';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."DELIVERY_PAY" IS '出库绩效工资';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."CURRENT_MONTH_SIZE" IS '当月订单量(B1)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."CURRENT_MONTH_OUTPUT_SIZE" IS '当月出库量(D1)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."MONTH_TARGET_SIZE" IS '月度目标量(BB1)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."CURRENT_MONTH_MONEY" IS '当月订单额(B2)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."CURRENT_MONTH_OUTPUT_MONEY" IS '当月出库额(D2)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."MONTH_TARGET_MONEY" IS '月度目标额(BB2)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."PRICE_PER_TON" IS '吨钢加价';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."TOTAL_ORDER_SIZE" IS '累计订单量(A1)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."YEAR_TARGET_SIZE" IS '年度目标量(AA1)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."TOTAL_ORDER_MONEY" IS '累计订单额(A2)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."YEAR_TARGET_MONEY" IS '年度目标额(AA2)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."TOTAL_OUTPUT_SIZE" IS '累计出库量(C1)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."TOTAL_OUTPUT_MONEY" IS '累计出库额(C2)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."TOTAL_RETURN_MONEY" IS '累计回款(F)';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF"."YEAR" IS '年份';

-- ----------------------------
-- Records of ERP_HR_DF_FIELD_VARIABLE_REF
-- ----------------------------
INSERT INTO "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" VALUES ('KK1', 'KK2', 'KK3', 'KK4', 'B1', 'D1', 'BB1', 'B2', 'D2', 'BB2', 'E', 'A1', 'AA1', 'A2', 'AA2', 'C1', 'C2', 'F', '2019');

-- ----------------------------
-- Checks structure for table ERP_HR_DF_FIELD_VARIABLE_REF
-- ----------------------------
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("ORDER_APPRAISAL_SALARY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("PROFIT_APPRAISAL_SALARY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("RETURN_PAY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("DELIVERY_PAY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("CURRENT_MONTH_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("CURRENT_MONTH_OUTPUT_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("MONTH_TARGET_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("CURRENT_MONTH_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("CURRENT_MONTH_OUTPUT_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("MONTH_TARGET_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("PRICE_PER_TON" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("TOTAL_ORDER_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("YEAR_TARGET_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("TOTAL_ORDER_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("YEAR_TARGET_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("TOTAL_OUTPUT_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("TOTAL_OUTPUT_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("TOTAL_RETURN_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_FIELD_VARIABLE_REF" ADD CHECK ("YEAR" IS NOT NULL);
