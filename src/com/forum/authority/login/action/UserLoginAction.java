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
	private String username;
	private String password;
	public String login() {
		try {
			log.info("login>>>>>>>>>>>>>>" + username + ", " + password);
		} catch(Exception e) {
			e.printStackTrace();
		}
		msg = "{'msg':'1'}";
		printMsg(null);
		return null;
	}
	
	private UserLoginService loginService;

	public UserLoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(UserLoginService loginService) {
		this.loginService = loginService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
