package com.forum.authority.login.service.impl;

import java.util.List;

import com.forum.authority.login.dao.UserLoginDao;
import com.forum.authority.login.service.UserLoginService;

public class UserLoginServiceImpl implements UserLoginService {
	private UserLoginDao loginDao;

	public UserLoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(UserLoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public List<Object[]> getUserInfos(String infoHql, String ids) {
		
		return null;
	}

	public String getPassword(String userId) {
		return loginDao.getPassword(userId);
	}
	
	
}
