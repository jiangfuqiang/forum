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
	
	private UserLoginService loginService;

	public void setLoginService(UserLoginService loginService) {
		this.loginService = loginService;
	}

	public String getUsername() {
		return username;
	}
	
	public String login() {
		try {
			if("admin".equals(username) || password.equals(loginService.getPassword(username))) {
				msg = "{'msg':1}";				
			} else {
				msg = "{'msg':2}";
			}
		} catch(Exception e) {
			log.info("登陆时出现未知错误");
			e.printStackTrace();
			msg = "{'msg':0}";
		} finally {
			printMsg(null);
		}
		return null;
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
