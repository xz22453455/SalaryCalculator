/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ScheduleConfig
 * Author:   wangcm
 * Date:     2018/12/19 0019 15:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.calculator.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;


/**
 * 〈配置schedule多线程执行〉<br>
 * 〈〉
 * @author
 * @since 1.0.0
 */

@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
          scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(20));
    }
}
