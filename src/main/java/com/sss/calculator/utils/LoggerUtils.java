package com.sss.calculator.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* @ClassName: LoggerUtils	
* @Description: 日志工具
* @author: WangYiZhi 
* @email: yizhi_wang@126.com
* @date: 2017年10月26日 上午11:31:30 
* @version V1.0  
*/ 
public class LoggerUtils {

	private Logger logger;

	/**
	 * 构造方法，初始化Slf4j的日志对象
	 */
	private LoggerUtils(Logger Slf4jLogger) {
		logger = Slf4jLogger;
	}

	/**
	 * 获取构造器，根据类初始化Logger对象
	 * 
	 * @param
	 *
	 * @return Logger对象
	 */
	public static LoggerUtils getLogger(Class classObject) {
		return new LoggerUtils(LoggerFactory.getLogger(classObject));
	}

	public String getName() {
		return logger.getName();
	}

	public Logger getSlf4jLogger() {
		return logger;
	}

	public boolean equals(LoggerUtils newLogger) {
		return logger.equals(newLogger.getSlf4jLogger());
	}
	
	public void debug(String info) {
		logger.debug(info);
	}

	public void debug(String info, Object obj) {
		logger.debug(info, obj);
	}
	
	public void error(String info) {
		logger.error(info);
	}
	
	public void error(String info, Object obj) {
		logger.error(info, obj);
	}

	public void info(String info) {
		logger.info(info);
	}
	
	public void info(String info, Object obj) {
		logger.info(info, obj);
	}

	
}