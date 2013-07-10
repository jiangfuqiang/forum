package com.forum.authority.login.dao.impl;

import com.forum.authority.login.dao.UserLoginDao;
import com.forum.common.EncryptAndDencrypt;
import com.forum.common.dao.BaseHibernateDaoImpl;
import com.forum.init.CacheData;


public class UserLoginDaoImpl extends BaseHibernateDaoImpl implements UserLoginDao {
	
	public String getPassword(String userId) {
		
		String hql = CacheData.JDBC_CACHE.get("select_password");
		Object obj = this.getSignleColumn(hql, new Object[]{userId});
		if(null == obj) {
			return "";
		}
		return String.valueOf(obj);
	}
	
}
