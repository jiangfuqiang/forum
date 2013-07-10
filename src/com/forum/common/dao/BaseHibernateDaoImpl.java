package com.forum.common.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.forum.common.entity.Entity;

public class BaseHibernateDaoImpl extends HibernateDaoSupport implements IHibernateDao {

	protected Session getNewSession() {
		return this.getSessionFactory().getCurrentSession();
	}
	
	public void delete(Entity entity) {
		getNewSession().delete(entity);
	}

	public void deleteByHql(String hql) {
		getNewSession().createQuery(hql).executeUpdate();
	}

	public void deleteBySql(String sql) {
		// TODO Auto-generated method stub
		getNewSession().createSQLQuery(sql).executeUpdate();
	}

	public void save(Entity entity) {
		// TODO Auto-generated method stub
		getNewSession().save(entity);
	}

	public void update(Entity entity) {
		// TODO Auto-generated method stub
		getNewSession().update(entity);
	}

	public void updateByHql(String hql) {
		getNewSession().createQuery(hql).executeUpdate();
	}

	public void updateBySql(String sql) {
		getNewSession().createSQLQuery(sql).executeUpdate();
	}
	
	/**
	 * 
	 * 功能: 根据条件取得指定列的数据
	 * 作者: jiangfuqiang
	 * 创建日期:2013-7-4
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param filter
	 * @return
	 */
	public Object getSignleColumn(String hql, Object... filter) {
		Query query = getNewSession().createQuery(hql);
		if(null != filter && filter.length > 0) {
			for(int i = 0; i < filter.length; i++) {
				query.setParameter(i, filter[i]);
			}
		}
		List<Object> list =  query.list();
		if(list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
}
