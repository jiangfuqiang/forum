package com.forum.common.exception;

import org.apache.log4j.Logger;

public class InitSystemException extends Exception {
	
	private static Logger log = Logger.getLogger(InitSystemException.class);
	
	public InitSystemException(String msg) {
		log.info("初始化系统异常【"+msg+"】，服务器即将停止启动>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.exit(0);
	}
	
}
