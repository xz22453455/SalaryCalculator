#!/usr/bin/python
# -*- coding: UTF-8 -*-
import math

# 订单完成情况考核
KK1 = 1000
# 利润完成情况考核
KK2 = 0
# 回款完成情况考核
KK3 = 0
# 出库完成情况考核
KK4 = 3000
SS1 = 0.0
SS2 = 0.0
SS3 = 0.0
SS4 = 0.0
# kg 当月订单量
B1 = 169250
# kg 当月出库量
D1 = 164156
# 月度目标量 kg
BB1 = 54
# 当月订单额kg
B2 = 4996915
# 当月出库额kg
D2 = 4728547
# 月度目标额
BB2 = 158
# 吨钢加价
E = 31250
# 累计订单量
A1 = 169250
# 年度目标量
AA1 = 899
# 累计订单额
A2 = 4996915
# 年度目标额
AA2 = 2600
# 累计出库量
C1 = 164156
# 累计出库额
C2 = 4728547
# 累计回款
F = 8103132
# 算法计算中使用到的变量名 tmp1  tmp2 tmp3 tmp4 tmp5 rate1 rate2
tmp1 = A1 / AA1
tmp2 = A2 / AA2
tmp3 = C1 / AA1
tmp4 = C2 / AA2
tmp5 = F / AA2
rate1 = max(tmp1, tmp2)
rate2 = max(tmp3, tmp4)

# 订单完成情况
if 0.7 <= rate1 <= 1.0:
    SS1 = KK1*rate1
    print SS1
elif rate1 < 0.7:
    SS1 = 0
    print SS1
else:
    SS1 = min(max((B1+D1)/2/BB1, (B2+D2)/2/BB2)*KK1, 3*KK1)
    round(SS1, 3)
    print SS1

# 利润完成情况


if rate2 >= 0.7:
    SS2 = min(math.floor(E/100)*0.1*KK2, 10000)
    print SS2
else:
    SS2 = 0
    print SS2

# 回款完成情况
if tmp5 >= 0.7:
    SS3 = KK3 * tmp5
    print SS3
else:
    SS3 = 0
    print SS3



# 出库完成情况
# 累计出库量计算
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
print(SS4)
