package com.forum.common.dao;

import com.forum.common.entity.Entity;

/**
 * 
 * 功能:操作数据的定义接口
 * 创建日期:2013-6-23
 * Title:
 * Description：对本文件的详细描述，原则上不能少于50字
 * @author jiangfuqiang
 * @version 1.0
 */
public interface IHibernateDao {
	/**
	 * 
	 * 功能: 保存实体
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param entity
	 */
	public void save(Entity entity);
	
	/**
	 * 
	 * 功能: 更新实体
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param entity
	 */
	public void update(Entity entity);
	
	/**
	 * 
	 * 功能: 通过语句更新实体
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param hql
	 */
	public void updateByHql(String hql);
	
	/**
	 * 
	 * 功能: 通过SQL语句更新数据
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param sql
	 */
	public void updateBySql(String sql);
	
	/**
	 * 
	 * 功能: 删除实体
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param entity
	 */
	public void delete(Entity entity);
	
	/**
	 * 
	 * 功能:通过hql语句删除数据
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param hql
	 */
	public void deleteByHql(String hql);
	
	/**
	 * 
	 * 功能: 通过sql语句删除数据
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-23
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param sql
	 */
	public void deleteBySql(String sql);
}
