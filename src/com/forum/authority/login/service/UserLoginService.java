package com.forum.authority.login.service;

import java.util.List;

public interface UserLoginService {
	
	/**
	 * ID获取用户的指定信息
	 * 功能: 通过
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param id
	 * @return
	 */
	public List<Object[]> getUserInfos(String infoHql,String ids);
	
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
