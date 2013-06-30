package com.forum.authority.login.action;

import com.forum.authority.login.service.UserLoginService;
import com.forum.common.BaseAction;
import com.forum.common.EncryptAndDencrypt;
import com.forum.init.CacheData;

public class UserLoginAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String login() {
		try {
			log.info("login>>>>>>>>>>>>>>" +  EncryptAndDencrypt.encryptData("蒋富强") + ", " + EncryptAndDencrypt.verifyData(EncryptAndDencrypt.encryptData("蒋富强"), "蒋富强1"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private UserLoginService loginService;

	public UserLoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(UserLoginService loginService) {
		this.loginService = loginService;
	}
	
	
}
