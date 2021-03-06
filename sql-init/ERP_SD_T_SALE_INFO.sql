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

Date: 2019-02-13 11:43:48
*/


-- ----------------------------
-- Table structure for ERP_SD_T_SALE_INFO
-- ----------------------------
DROP TABLE "SSDW"."ERP_SD_T_SALE_INFO";
CREATE TABLE "SSDW"."ERP_SD_T_SALE_INFO" (
"ID" VARCHAR2(10 BYTE) NOT NULL ,
"YEAR" VARCHAR2(10 BYTE) NOT NULL ,
"MONTH" VARCHAR2(10 BYTE) NOT NULL ,
"EMPLOYEE_NO" VARCHAR2(20 BYTE) NOT NULL ,
"DEPARTMENT" VARCHAR2(30 BYTE) NOT NULL ,
"POST" VARCHAR2(30 BYTE) NOT NULL ,
"POST_LEVEL" VARCHAR2(4 BYTE) NOT NULL ,
"TOTAL_ORDER_SIZE" NUMBER(15,3) NOT NULL ,
"YEAR_TARGET_SIZE" NUMBER(15,3) NOT NULL ,
"TOTAL_ORDER_MONEY" NUMBER(15,3) NOT NULL ,
"YEAR_TARGET_MONEY" NUMBER(15,3) NOT NULL ,
"CURRENT_MONTH_SIZE" NUMBER(15,3) NOT NULL ,
"MONTH_TARGET_SIZE" NUMBER(15,3) NOT NULL ,
"CURRENT_MONTH_MONEY" NUMBER(15,3) NOT NULL ,
"MONTH_TARGET_MONEY" NUMBER(15,3) NOT NULL ,
"TOTAL_OUTPUT_SIZE" NUMBER(15,3) NOT NULL ,
"PRICE_PER_TON" NUMBER(15,3) NOT NULL ,
"TOTAL_OUTPUT_MONEY" NUMBER(15,3) NOT NULL ,
"TOTAL_RETURN_MONEY" NUMBER(15,3) NOT NULL ,
"CURRENT_MONTH_OUTPUT_SIZE" NUMBER(15,3) NOT NULL ,
"CURRENT_MONTH_OUTPUT_MONEY" NUMBER(15,3) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."ID" IS 'id';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."YEAR" IS '年份';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."MONTH" IS '月份';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."EMPLOYEE_NO" IS '工号';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."DEPARTMENT" IS '部门';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."POST" IS '岗位';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."POST_LEVEL" IS '级别';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."TOTAL_ORDER_SIZE" IS '累计订单量';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."YEAR_TARGET_SIZE" IS '年度目标量';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."TOTAL_ORDER_MONEY" IS '累计订单额';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."YEAR_TARGET_MONEY" IS '年度目标额';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."CURRENT_MONTH_SIZE" IS '当月订单量';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."MONTH_TARGET_SIZE" IS '月度目标量';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."CURRENT_MONTH_MONEY" IS '当月订单额';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."MONTH_TARGET_MONEY" IS '月度目标额';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."TOTAL_OUTPUT_SIZE" IS '累计出库量';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."PRICE_PER_TON" IS '吨钢加价';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."TOTAL_OUTPUT_MONEY" IS '累计出库额';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."TOTAL_RETURN_MONEY" IS '累计回款';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."CURRENT_MONTH_OUTPUT_SIZE" IS '当月出库量';
COMMENT ON COLUMN "SSDW"."ERP_SD_T_SALE_INFO"."CURRENT_MONTH_OUTPUT_MONEY" IS '当月出库额';

-- ----------------------------
-- Records of ERP_SD_T_SALE_INFO
-- ----------------------------
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('998', '2019', '01', '2209', '营销一部', '蚂蚁王', '2', '47534.33', '6000000', '1786188.65', '120000000', '47534.33', '500000', '1786188.65', '10000000', '93243.07', '265363.5580', '3252920.40', '4829685.32', '93243.07', '3252920.40');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('999', '2019', '01', '2322', '营销一部', '大蚂蚁', '1', '7520', '940000', '282940.04', '38310000', '7520', '70000', '282940.04', '2300000', '0', '49395.5580', '0', '86652.20', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1000', '2019', '01', '2712', '营销六部', '大蚂蚁', '1', '9224.60', '0', '269522.12', '0', '9224.60', '0', '269522.12', '0', '0', '158927.7780', '0', '37500', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1001', '2019', '01', '2895', '营销五部', '小蚂蚁', '1', '8608', '0', '293388.40', '0', '8608', '0', '293388.40', '0', '0', '189200', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1003', '2019', '01', '2223', '营销五部', '小蚂蚁', '3', '36667', '0', '990307.10', '0', '36667', '0', '990307.10', '0', '25735', '134000', '799379.50', '653438.62', '25735', '799379.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1004', '2019', '01', '2320', '营销五部', '小蚂蚁', '2', '157000', '0', '5272000', '0', '157000', '0', '5272000', '0', '13734', '72600', '460375.50', '400000', '13734', '460375.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1005', '2019', '01', '1748', '营销一部', '大蚂蚁', '1', '12311.33', '940000', '418788.09', '38310000', '12311.33', '70000', '418788.09', '2300000', '10362.07', '76813', '373315.67', '2365622.60', '10362.07', '373315.67');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1006', '2019', '01', '2239', '营销一部', '小蚂蚁', 'null', '0', '312000', '0', '10000000', '0', '24000', '0', '640000', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1007', '2019', '01', '2557', '营销五部', '小蚂蚁', '2', '8062', '0', '207507.60', '0', '8062', '0', '207507.60', '0', '1616', '36800', '46182.60', '0', '1616', '46182.60');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1008', '2019', '01', '2283', '营销一部', '大蚂蚁', '1', '543', '940000', '14661', '9400000', '543', '70000', '14661', '700000', '9718', '0', '350019.25', '854347.86', '9718', '350019.25');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1009', '2019', '01', '2576', '营销五部', '大蚂蚁', '1', '74576.94', '0', '1474519.98', '0', '74576.94', '0', '1474519.98', '0', '3968', '48766.3470', '244910.70', '751650.10', '3968', '244910.70');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1010', '2019', '01', '2565', '营销一部', '小蚂蚁', 'null', '7520', '282000', '282940.04', '9000000', '7520', '21000', '282940.04', '690000', '0', '49395.5580', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1011', '2019', '01', '2619', '营销一部', '小蚂蚁', 'null', '0', '282000', '0', '9000000', '0', '21000', '0', '690000', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1012', '2019', '01', '2618', '营销二部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1013', '2019', '01', '2643', '营销二部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1014', '2019', '01', '2566', '营销一部', '大蚂蚁', '3', '21420', '1809000', '854549.52', '60000000', '21420', '117000', '854549.52', '3840000', '71707', '136955', '2469889.48', '1490030.55', '71707', '2469889.48');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1015', '2019', '01', '2249', '营销二部', '大蚂蚁', '3', '0', '0', '0', '0', '0', '0', '0', '0', '27857', '0', '1042383.20', '1428335', '27857', '1042383.20');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1016', '2019', '01', '2639', '营销二部', '大蚂蚁', '2', '86461.30', '0', '2911494.89', '0', '86461.30', '0', '2911494.89', '0', '0', '17000', '0', '959584.08', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1017', '2019', '01', '2666', '营销二部', '蚂蚁王', '2', '531486.94', '6000000', '12257313.53', '120000000', '531486.94', '500000', '12257313.53', '10000000', '60419', '81300', '1887776.30', '4964925.56', '60419', '1887776.30');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1018', '2019', '01', '2278', '营销二部', '大蚂蚁', '1', '0', '0', '0', '0', '0', '0', '0', '0', '13189', '0', '335633.40', '273369.21', '13189', '335633.40');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1019', '2019', '01', '2637', '营销二部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '18971', '0', '664150.60', '699400', '18971', '664150.60');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1020', '2019', '01', '2580', '营销一部', '小蚂蚁', 'null', '2007', '564000', '56070.90', '10000000', '2007', '24000', '56070.90', '640000', '5483', '4300', '141496.30', '0', '5483', '141496.30');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1021', '2019', '01', '1657', '营销三部', '蚂蚁王', '2', '244033.26', '6000000', '8368493.74', '120000000', '244033.26', '500000', '8368493.74', '10000000', '170777.45', '398875.0750', '5316831.44', '7298179.63', '170777.45', '5316831.44');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1022', '2019', '01', '2591', '营销一部', '大蚂蚁', '2', '5740', '940000', '215250', '30000000', '5740', '70000', '215250', '2300000', '1456', '2200', '59696', '33032.11', '1456', '59696');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1023', '2019', '01', '2252', '营销二部', '大蚂蚁', '1', '445025.64', '0', '9345818.64', '0', '445025.64', '0', '9345818.64', '0', '19373', '64300', '509759.70', '2303637.27', '19373', '509759.70');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1024', '2019', '01', '2609', '营销三部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1025', '2019', '01', '2537', '营销三部', '大蚂蚁', '2', '15801', '0', '397720.80', '0', '15801', '0', '397720.80', '0', '7347', '158600', '113878.50', '1212738.95', '7347', '113878.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1026', '2019', '01', '2613', '营销三部', '大蚂蚁', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1027', '2019', '01', '2205', '营销四部', '蚂蚁王', '3', '518546.60', '6000000', '15024379.51', '120000000', '518546.60', '500000', '15024379.51', '10000000', '431606', '498225.9210', '12627679.50', '20732557.30', '431606', '12627679.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1028', '2019', '01', '2602', '营销三部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '85', '0', '4206', '0', '85', '4206');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1029', '2019', '01', '2207', '营销三部', '大蚂蚁', '3', '26818.26', '0', '1173136.24', '0', '26818.26', '0', '1173136.24', '0', '64302.45', '563175.0750', '2256385.94', '3838654.48', '64302.45', '2256385.94');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1030', '2019', '01', '2510', '营销三部', '小蚂蚁', 'null', '15801', '0', '397720.80', '0', '15801', '0', '397720.80', '0', '7347', '158600', '113878.50', '168561.64', '7347', '113878.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1031', '2019', '01', '2321', '营销三部', '大蚂蚁', '2', '201414', '0', '6797636.70', '0', '201414', '0', '6797636.70', '0', '99128', '-322900', '2946567', '2246786.20', '99128', '2946567');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1032', '2019', '01', '2583', '营销三部', '小蚂蚁', 'null', '30512', '0', '1073089.30', '0', '30512', '0', '1073089.30', '0', '42139', '10300', '1152084.85', '346950.52', '42139', '1152084.85');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1033', '2019', '01', '2575', '营销四部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1034', '2019', '01', '1772', '营销四部', '大蚂蚁', '2', '22718', '0', '593474.60', '0', '22718', '0', '593474.60', '0', '44219', '-2300', '1546781.90', '2602286.45', '44219', '1546781.90');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1035', '2019', '01', '2621', '营销四部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1036', '2019', '01', '1796', '营销四部', '大蚂蚁', '2', '4593', '0', '129718.40', '0', '4593', '0', '129718.40', '0', '102814', '49700', '2623608.50', '2301903.30', '102814', '2623608.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1037', '2019', '01', '2072', '营销四部', '大蚂蚁', '1', '50589', '0', '1629461.10', '0', '50589', '0', '1629461.10', '0', '26828', '73400', '866667.50', '823852.77', '26828', '866667.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1038', '2019', '01', '2651', '营销三部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1039', '2019', '01', '2243', '营销四部', '大蚂蚁', '3', '364599', '0', '10336746.20', '0', '364599', '0', '10336746.20', '0', '228847', '115150', '6589136.10', '12014990.01', '228847', '6589136.10');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1040', '2019', '01', '2632', '营销四部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '5923', '0', '159081.30', '159081.30', '5923', '159081.30');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1041', '2019', '01', '2212', '营销四部', '大蚂蚁', '3', '66475.60', '0', '2063481.41', '0', '66475.60', '0', '2063481.41', '0', '20198', '257475.9210', '752548.50', '2714012.17', '20198', '752548.50');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1042', '2019', '01', '2502', '营销四部', '大蚂蚁', '1', '9572', '0', '271497.80', '0', '9572', '0', '271497.80', '0', '8700', '4800', '248937', '275512.60', '8700', '248937');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1043', '2019', '01', '2652', '营销四部', '小蚂蚁', 'null', '3028', '0', '81488.60', '0', '3028', '0', '81488.60', '0', '0', '9400', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1044', '2019', '01', '2649', '营销四部', '小蚂蚁', 'null', '1136', '0', '30672', '0', '1136', '0', '30672', '0', '0', '1400', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1045', '2019', '01', '2518', '营销四部', '小蚂蚁', 'null', '5064', '0', '193937.20', '0', '5064', '0', '193937.20', '0', '752', '58200', '24064', '375845.30', '752', '24064');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1046', '2019', '01', '2597', '营销四部', '小蚂蚁', 'null', '1520', '0', '37150.50', '0', '1520', '0', '37150.50', '0', '17595', '-9200', '704387.40', '244054.50', '17595', '704387.40');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1047', '2019', '01', '2225', '营销五部', '大蚂蚁', '2', '65355', '0', '1855679.50', '0', '65355', '0', '1855679.50', '0', '59674', '334900', '1858042.90', '1520715.22', '59674', '1858042.90');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1048', '2019', '01', '2155', '营销五部', '大蚂蚁', '3', '111714.20', '0', '2334453.66', '0', '111714.20', '0', '2334453.66', '0', '150098.63', '78085.8640', '2928528.09', '2295203.61', '150098.63', '2928528.09');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1049', '2019', '01', '2246', '营销五部', '大蚂蚁', '2', '269796', '0', '7845556.70', '0', '269796', '0', '7845556.70', '0', '64365.77', '96700', '1807145.31', '2502103', '64365.77', '1807145.31');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1116', '2019', '02', '2895', '营销五部', '小蚂蚁', '1', '8608', '0', '293388.40', '0', '0', '0', '0', '0', '0', '189200', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1114', '2019', '02', '2209', '营销一部', '蚂蚁王', '2', '63491.33', '6000000', '2468732.45', '120000000', '0', '500000', '0', '10000000', '103148.56', '367463.5580', '3480746.67', '5893938.24', '9905.49', '227826.27');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1115', '2019', '02', '2322', '营销一部', '大蚂蚁', '1', '7520', '940000', '282940.04', '38310000', '0', '20000', '0', '780000', '0', '49395.5580', '0', '86652.20', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1117', '2019', '02', '2712', '营销六部', '大蚂蚁', '1', '9224.60', '0', '269522.12', '0', '0', '0', '0', '0', '0', '158927.7780', '0', '37500', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1118', '2019', '02', '2557', '营销五部', '小蚂蚁', '2', '14748', '0', '375652.90', '0', '0', '0', '0', '0', '1616', '51100', '46182.60', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1119', '2019', '02', '2576', '营销五部', '大蚂蚁', '1', '74576.94', '0', '1474519.98', '0', '0', '0', '0', '0', '3968', '48766.3470', '244910.70', '751650.10', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1120', '2019', '02', '2283', '营销一部', '大蚂蚁', '1', '2866', '940000', '81804.90', '9400000', '0', '20000', '0', '200000', '9718', '26300', '350019.25', '854347.86', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1121', '2019', '02', '2320', '营销五部', '小蚂蚁', '2', '157000', '0', '5272000', '0', '0', '0', '0', '0', '13734', '72600', '460375.50', '400000', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1122', '2019', '02', '2223', '营销五部', '小蚂蚁', '3', '117106', '0', '3363257.60', '0', '80439', '0', '2372950.50', '0', '25735', '134700', '799379.50', '653438.62', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1123', '2019', '02', '2565', '营销一部', '小蚂蚁', 'null', '7520', '282000', '282940.04', '9000000', '0', '6000', '0', '180000', '0', '49395.5580', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1124', '2019', '02', '1748', '营销一部', '大蚂蚁', '1', '12311.33', '940000', '418788.09', '38310000', '0', '20000', '0', '780000', '20267.56', '76813', '601141.94', '2365622.60', '9905.49', '227826.27');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1125', '2019', '02', '2146', '营销六部', '蚂蚁王', '1', '9224.60', '6000000', '269522.12', '120000000', '0', '500000', '0', '10000000', '0', '158927.7780', '0', '163696', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1126', '2019', '02', '2619', '营销一部', '小蚂蚁', 'null', '0', '282000', '0', '9000000', '0', '6000', '0', '180000', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1127', '2019', '02', '2239', '营销一部', '小蚂蚁', 'null', '0', '312000', '0', '10000000', '0', '8000', '0', '240000', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1128', '2019', '02', '2566', '营销一部', '大蚂蚁', '3', '35046', '1809000', '1464449.42', '60000000', '0', '40000', '0', '1440000', '71707', '192755', '2469889.48', '1490030.55', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1129', '2019', '02', '2618', '营销二部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1130', '2019', '02', '2249', '营销二部', '大蚂蚁', '3', '0', '0', '0', '0', '0', '0', '0', '0', '27857', '0', '1042383.20', '2105245.54', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1131', '2019', '02', '2643', '营销二部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1132', '2019', '02', '2580', '营销一部', '小蚂蚁', 'null', '2007', '564000', '56070.90', '10000000', '0', '8000', '0', '240000', '5483', '4300', '141496.30', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1133', '2019', '02', '2666', '营销二部', '蚂蚁王', '2', '535962.07', '6000000', '12382262.17', '120000000', '0', '500000', '0', '10000000', '60419', '82000', '1887776.30', '5841836.10', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1134', '2019', '02', '2278', '营销二部', '大蚂蚁', '1', '0', '0', '0', '0', '0', '0', '0', '0', '13189', '0', '335633.40', '273369.21', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1135', '2019', '02', '2639', '营销二部', '大蚂蚁', '2', '86461.30', '0', '2911494.89', '0', '0', '0', '0', '0', '0', '17000', '0', '959584.08', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1136', '2019', '02', '2591', '营销一部', '大蚂蚁', '2', '5748', '1252000', '220750', '40000000', '0', '28000', '0', '840000', '1456', '22200', '59696', '1097285.03', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1137', '2019', '02', '1657', '营销三部', '蚂蚁王', '2', '438730.26', '6000000', '13932196.04', '120000000', '0', '500000', '0', '10000000', '212916.45', '567565.0750', '6468916.29', '9888284.45', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1138', '2019', '02', '2637', '营销二部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '18971', '0', '664150.60', '699400', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1139', '2019', '02', '2252', '营销二部', '大蚂蚁', '1', '449500.77', '0', '9470767.28', '0', '0', '0', '0', '0', '19373', '65000', '509759.70', '2503637.27', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1140', '2019', '02', '2609', '营销三部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1141', '2019', '02', '2613', '营销三部', '大蚂蚁', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1142', '2019', '02', '2537', '营销三部', '大蚂蚁', '2', '179986', '0', '4888333.80', '0', '0', '0', '0', '0', '7347', '316990', '113878.50', '1212738.95', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1143', '2019', '02', '2602', '营销三部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '85', '0', '4206', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1144', '2019', '02', '2207', '营销三部', '大蚂蚁', '3', '26818.26', '0', '1173136.24', '0', '0', '0', '0', '0', '64302.45', '563175.0750', '2256385.94', '6081808.78', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1145', '2019', '02', '2321', '营销三部', '大蚂蚁', '2', '231926', '0', '7870726', '0', '0', '0', '0', '0', '141267', '-312600', '4098651.85', '2593736.72', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1146', '2019', '02', '2205', '营销四部', '蚂蚁王', '3', '579375.70', '6000000', '16809938.68', '120000000', '0', '500000', '0', '10000000', '431606', '494125.8420', '12627679.50', '20732557.40', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1147', '2019', '02', '2510', '营销三部', '小蚂蚁', 'null', '15801', '0', '397720.80', '0', '0', '0', '0', '0', '7347', '158600', '113878.50', '168561.64', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1148', '2019', '02', '1772', '营销四部', '大蚂蚁', '2', '23281', '0', '613123.30', '0', '0', '0', '0', '0', '44219', '-2000', '1546781.90', '2602286.45', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1149', '2019', '02', '2583', '营销三部', '小蚂蚁', 'null', '30512', '0', '1073089.30', '0', '0', '0', '0', '0', '42139', '10300', '1152084.85', '346950.52', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1150', '2019', '02', '1796', '营销四部', '大蚂蚁', '2', '4593', '0', '129718.40', '0', '0', '0', '0', '0', '102814', '49700', '2623608.50', '2301903.40', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1151', '2019', '02', '2575', '营销四部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1152', '2019', '02', '2621', '营销四部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1153', '2019', '02', '2212', '营销四部', '大蚂蚁', '3', '124192.70', '0', '3745485.68', '0', '0', '0', '0', '0', '20198', '240675.8420', '752548.50', '2714012.17', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1154', '2019', '02', '2651', '营销三部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1155', '2019', '02', '2072', '营销四部', '大蚂蚁', '1', '50589', '0', '1629461.10', '0', '0', '0', '0', '0', '26828', '73400', '866667.50', '823852.77', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1156', '2019', '02', '2502', '营销四部', '大蚂蚁', '1', '9572', '0', '271497.80', '0', '0', '0', '0', '0', '8700', '4800', '248937', '275512.60', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1157', '2019', '02', '2518', '营销四部', '小蚂蚁', 'null', '5064', '0', '193937.20', '0', '0', '0', '0', '0', '752', '58200', '24064', '375845.30', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1158', '2019', '02', '2632', '营销四部', '小蚂蚁', 'null', '0', '0', '0', '0', '0', '0', '0', '0', '5923', '0', '159081.30', '159081.30', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1159', '2019', '02', '2243', '营销四部', '大蚂蚁', '3', '367148', '0', '10420652.40', '0', '0', '0', '0', '0', '228847', '127550', '6589136.10', '12014990.01', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1160', '2019', '02', '2649', '营销四部', '小蚂蚁', 'null', '1136', '0', '30672', '0', '0', '0', '0', '0', '0', '1400', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1161', '2019', '02', '2652', '营销四部', '小蚂蚁', 'null', '3028', '0', '81488.60', '0', '0', '0', '0', '0', '0', '9400', '0', '0', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1162', '2019', '02', '2597', '营销四部', '小蚂蚁', 'null', '1520', '0', '37150.50', '0', '0', '0', '0', '0', '17595', '-9200', '704387.40', '244054.50', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1163', '2019', '02', '2225', '营销五部', '大蚂蚁', '2', '145794', '0', '4228630', '0', '80439', '0', '2372950.50', '0', '59674', '335600', '1858042.90', '1520715.22', '0', '0');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1164', '2019', '02', '2246', '营销五部', '大蚂蚁', '2', '357982', '0', '9806412.70', '0', '0', '0', '0', '0', '150583.17', '204700', '2418538.42', '2543015.50', '86217.39', '611393.11');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1165', '2019', '02', '2155', '营销五部', '大蚂蚁', '3', '118400.20', '0', '2502598.96', '0', '0', '0', '0', '0', '193940.85', '92385.8640', '3034306.89', '2295203.61', '43842.22', '105778.80');
INSERT INTO "SSDW"."ERP_SD_T_SALE_INFO" VALUES ('1050', '2019', '01', '2146', '营销六部', '蚂蚁王', '1', '9224.60', '6000000', '269522.12', '120000000', '9224.60', '500000', '269522.12', '10000000', '0', '158927.7780', '0', '163696', '0', '0');

-- ----------------------------
-- Indexes structure for table ERP_SD_T_SALE_INFO
-- ----------------------------

-- ----------------------------
-- Triggers structure for table ERP_SD_T_SALE_INFO
-- ----------------------------
CREATE OR REPLACE TRIGGER "SSDW"."TR_SALE_INFO_ID" BEFORE INSERT ON "SSDW"."ERP_SD_T_SALE_INFO" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW ENABLE
begin  
   if inserting then 
      if :NEW."ID" is null then 
         select SEQ_SALE_INFO_ID.nextval into :NEW."ID" from dual; 
      end if; 
   end if; 
end;

-- ----------------------------
-- Checks structure for table ERP_SD_T_SALE_INFO
-- ----------------------------
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("YEAR" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("MONTH" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("EMPLOYEE_NO" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("DEPARTMENT" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("POST" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("POST_LEVEL" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("TOTAL_ORDER_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("YEAR_TARGET_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("TOTAL_ORDER_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("YEAR_TARGET_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("CURRENT_MONTH_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("MONTH_TARGET_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("CURRENT_MONTH_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("MONTH_TARGET_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("TOTAL_OUTPUT_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("PRICE_PER_TON" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("TOTAL_OUTPUT_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("TOTAL_RETURN_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("CURRENT_MONTH_OUTPUT_SIZE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("CURRENT_MONTH_OUTPUT_MONEY" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD CHECK ("ID" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table ERP_SD_T_SALE_INFO
-- ----------------------------
ALTER TABLE "SSDW"."ERP_SD_T_SALE_INFO" ADD PRIMARY KEY ("ID");
