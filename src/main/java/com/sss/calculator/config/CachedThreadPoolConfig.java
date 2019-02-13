package com.sss.calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 缓存线程池
 * 适合处理服务耗时短的服务
 */
@Configuration
public class CachedThreadPoolConfig {

    private static volatile ExecutorService threadPool = null;
    private static final int CORE_SIZE = 10;
    private static final int MAX_SIZE = 20;
    private static final int KEEP_ALIVE_TIME = 5;

    @Bean
    public ExecutorService getCachedThreadPool() {
        if (null != threadPool) {
            return threadPool;
        }
        synchronized (CachedThreadPoolConfig.class) {
            if (null != threadPool) {
                return threadPool;
            }
            threadPool = new ThreadPoolExecutor(CORE_SIZE, MAX_SIZE, KEEP_ALIVE_TIME, TimeUnit.MINUTES, new LinkedBlockingQueue<>());
            return threadPool;
        }
    }
}
