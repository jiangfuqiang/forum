package com.forum.authority.login.dao;

public interface UserLoginDao {
	/**
	 * 
	 * 功能:通过userId获取密码
	 * 作者: jiangfuqiang
	 * 创建日期:2013-7-3
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param userId
	 * @return
	 */
	public String getPassword(String userId);
}
