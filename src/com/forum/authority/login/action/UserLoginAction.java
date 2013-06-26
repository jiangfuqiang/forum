package com.forum.authority.login.action;

import com.forum.authority.login.service.UserLoginService;
import com.forum.common.BaseAction;

public class UserLoginAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String login() {
		log.info("login>>>>>>>>>>>>>>");
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
