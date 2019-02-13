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

Date: 2019-02-13 11:42:40
*/


-- ----------------------------
-- Table structure for ERP_HR_DF_ASSESS_SALARY
-- ----------------------------
DROP TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY";
CREATE TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY" (
"JOBGRADE" VARCHAR2(18 BYTE) NOT NULL ,
"STAR_LEVEL" VARCHAR2(10 BYTE) NOT NULL ,
"YEAR" VARCHAR2(10 BYTE) NOT NULL ,
"CATEGOTY" VARCHAR2(20 BYTE) NULL ,
"EXAMINATION_ITEM" VARCHAR2(20 BYTE) NOT NULL ,
"ASSESSMENT_METHOD" VARCHAR2(500 BYTE) NULL ,
"ALGORITHM" VARCHAR2(1000 BYTE) NULL ,
"ASSESSMENT_SALARY" VARCHAR2(15 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."JOBGRADE" IS '岗位级别';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."STAR_LEVEL" IS '星级';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."YEAR" IS '年份';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."CATEGOTY" IS '类别';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."EXAMINATION_ITEM" IS '考核项目';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."ASSESSMENT_METHOD" IS '考核办法';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."ALGORITHM" IS '算法';
COMMENT ON COLUMN "SSDW"."ERP_HR_DF_ASSESS_SALARY"."ASSESSMENT_SALARY" IS '考核薪资';

-- ----------------------------
-- Records of ERP_HR_DF_ASSESS_SALARY
-- ----------------------------
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('蚂蚁王', '2', '2019', '岗位考核', '订单完成情况', '累计订单量或额完成比例大于等于70%，按对应比例计算；小于70%不计算，超过100%时取当月订单量或额与出库量或额的平均值来计算超额工资，最多3倍上限。年终结算，本部门净利润目标达成则免责，差额补回。', '#订单完成情况计算

tmp1 = A1 / AA1
tmp2 = A2 / AA2
rate1 = max(tmp1, tmp2)
SS1 = 0.0
if 0.7 <= rate1 <= 1.0:
    SS1 = KK1*rate1
    print SS1
elif rate1 < 0.7:
    SS1 = 0
    print SS1
else:
    SS1 = min(max((B1+D1)/2/BB1, (B2+D2)/2/BB2)*KK1, 3*KK1)
    print SS1', '7000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('大蚂蚁', '1', '2019', '岗位考核', '出库完成情况', '以累计出库量或额匹配绩效工资参照表累进计算，多退少补。', '# 出库完成情况

# 累计出库量计算
SS4=0.0
def target_quantity_performance(x):
    if x >= 100:
        return 3000
    elif x >= 80:
        return 2800
    elif x >= 70:
        return 2500
    elif x >= 60:
        return 2200
    elif x >= 50:
        return 2000
    elif x >= 40:
        return 1800
    elif x >= 30:
        return 1500
    elif x >= 20:
        return 1000
    else:
        return 0
# 累计出库额计算
def target_amount_performance(x):
    if x >= 275:
        return 3000
    elif x >= 200:
        return 2800
    elif x >= 175:
        return 2500
    elif x >= 150:
        return 2200
    elif x >= 125:
        return 2000
    elif x >= 100:
        return 1800
    elif x >= 75:
        return 1500
    elif x >= 50:
        return 1000
    else:
        return 0

SS4 = max(target_quantity_performance(C1/1000), target_amount_performance(C2/1000))
print(SS4)', '5000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('蚂蚁王', '2', '2019', '岗位考核', '利润完成情况', '累计出库量或额完成比例达到70%开始计算：吨钢加价每超过100元，对应10%比例累进计算，最多10000元上限。', '#利润完成情况计算

tmp3 = C1 / AA1
tmp4 = C2 / AA2
rate2 = max(tmp3, tmp4)
SS2 = 0.0
if rate2 >= 0.7:
    SS2 = min(math.floor(E/100)*0.1*KK2, 10000)
    print SS2
else:
    SS2 = 0
    print SS2', '6000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('蚂蚁王', '2', '2019', '绩效考核', '回款完成情况', '累计回款完成比例大于等于70%，按对应比例计算；小于70%不计算。年终结算，本部净利润目标达成则免责，多退少补。', '#回款完成情况计算

tmp5 = F / AA2
SS3 = 0.0
if tmp5 >= 0.7:
    SS3 = KK3 * tmp5
    print SS3
else:
    SS3 = 0
    print SS3', '8000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('大蚂蚁', '2', '2019', '岗位考核', '订单完成情况', '累计订单量或额完成比例大于等于70%，按对应比例计算；小于70%不计算，超过100%时取当月订单量或额与出库量或额的平均值来计算超额工资，最多3倍上限。年终结算，本部门净利润目标达成则免责，差额补回。', '#订单完成情况计算

tmp1 = A1 / AA1
tmp2 = A2 / AA2
rate1 = max(tmp1, tmp2)
SS1 = 0.0
if 0.7 <= rate1 <= 1.0:
    SS1 = KK1*rate1
    print SS1
elif rate1 < 0.7:
    SS1 = 0
    print SS1
else:
    SS1 = min(max((B1+D1)/2/BB1, (B2+D2)/2/BB2)*KK1, 3*KK1)
    print SS1', '7000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('大蚂蚁', '2', '2019', '岗位考核', '出库完成情况', '以累计出库量或额匹配绩效工资参照表累进计算，多退少补。', '# 出库完成情况
# 累计出库量计算
SS4=0.0
def target_quantity_performance(x):
    if x >= 100:
        return 3000
    elif x >= 80:
        return 2800
    elif x >= 70:
        return 2500
    elif x >= 60:
        return 2200
    elif x >= 50:
        return 2000
    elif x >= 40:
        return 1800
    elif x >= 30:
        return 1500
    elif x >= 20:
        return 1000
    else:
        return 0
# 累计出库额计算
def target_amount_performance(x):
    if x >= 275:
        return 3000
    elif x >= 200:
        return 2800
    elif x >= 175:
        return 2500
    elif x >= 150:
        return 2200
    elif x >= 125:
        return 2000
    elif x >= 100:
        return 1800
    elif x >= 75:
        return 1500
    elif x >= 50:
        return 1000
    else:
        return 0

SS4 = max(target_quantity_performance(C1/1000), target_amount_performance(C2/1000))
print(SS4)', '7000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('蚂蚁王', '1', '2019', '岗位考核', '订单完成情况', '累计订单量或额完成比例大于等于70%，按对应比例计算；小于70%不计算，超过100%时取当月订单量或额与出库量或额的平均值来计算超额工资，最多3倍上限。年终结算，本部门净利润目标达成则免责，差额补回。', '#订单完成情况计算

tmp1 = A1 / AA1
tmp2 = A2 / AA2
rate1 = max(tmp1, tmp2)
SS1 = 0.0
if 0.7 <= rate1 <= 1.0:
    SS1 = KK1*rate1
    print SS1
elif rate1 < 0.7:
    SS1 = 0
    print SS1
else:
    SS1 = min(max((B1+D1)/2/BB1, (B2+D2)/2/BB2)*KK1, 3*KK1)
    print SS1', '5000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('蚂蚁王', '1', '2019', '岗位考核', '利润完成情况', '累计出库量或额完成比例达到70%开始计算：吨钢加价每超过100元，对应10%比例累进计算，最多10000元上限。', '#利润完成情况计算

tmp3 = C1 / AA1
tmp4 = C2 / AA2
rate2 = max(tmp3, tmp4)
SS2 = 0.0
if rate2 >= 0.7:
    SS2 = min(math.floor(E/100)*0.1*KK2, 10000)
    print SS2
else:
    SS2 = 0
    print SS2', '3000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('蚂蚁王', '1', '2019', '绩效考核', '回款完成情况', '累计回款完成比例大于等于70%，按对应比例计算；小于70%不计算。年终结算，本部净利润目标达成则免责，多退少补。', '#回款完成情况计算

tmp5 = F / AA2
SS3 = 0.0
if tmp5 >= 0.7:
    SS3 = KK3 * tmp5
    print SS3
else:
    SS3 = 0
    print SS3', '8000');
INSERT INTO "SSDW"."ERP_HR_DF_ASSESS_SALARY" VALUES ('大蚂蚁', '1', '2019', '岗位考核', '订单完成情况', '累计订单量或额完成比例大于等于70%，按对应比例计算；小于70%不计算，超过100%时取当月订单量或额与出库量或额的平均值来计算超额工资，最多3倍上限。年终结算，本部门净利润目标达成则免责，差额补回。', '#订单完成情况计算

tmp1 = A1 / AA1
tmp2 = A2 / AA2
rate1 = max(tmp1, tmp2)
SS1 = 0.0
if 0.7 <= rate1 <= 1.0:
    SS1 = KK1*rate1
    print SS1
elif rate1 < 0.7:
    SS1 = 0
    print SS1
else:
    SS1 = min(max((B1+D1)/2/BB1, (B2+D2)/2/BB2)*KK1, 3*KK1)
    print SS1', '5000');

-- ----------------------------
-- Indexes structure for table ERP_HR_DF_ASSESS_SALARY
-- ----------------------------

-- ----------------------------
-- Checks structure for table ERP_HR_DF_ASSESS_SALARY
-- ----------------------------
ALTER TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY" ADD CHECK ("JOBGRADE" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY" ADD CHECK ("STAR_LEVEL" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY" ADD CHECK ("YEAR" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY" ADD CHECK ("EXAMINATION_ITEM" IS NOT NULL);
ALTER TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY" ADD CHECK ("EXAMINATION_ITEM" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table ERP_HR_DF_ASSESS_SALARY
-- ----------------------------
ALTER TABLE "SSDW"."ERP_HR_DF_ASSESS_SALARY" ADD PRIMARY KEY ("JOBGRADE", "STAR_LEVEL", "YEAR", "EXAMINATION_ITEM");
