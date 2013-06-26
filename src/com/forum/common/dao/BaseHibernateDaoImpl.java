package com.forum.common.dao;

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
	
}
