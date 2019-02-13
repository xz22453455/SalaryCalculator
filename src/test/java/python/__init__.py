# -*- coding: UTF-8 -*-
ss = 80
yy = 125
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
aa = max(target_quantity_performance(ss), target_amount_performance(yy))
print(aa)