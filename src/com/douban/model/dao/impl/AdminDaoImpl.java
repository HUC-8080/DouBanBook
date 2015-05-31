/**
 * <p>Title: AdminDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 13, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.IAdminDao;
import com.douban.model.entity.po.Admin;

/**
 * @author 马金健
 *
 */
public class AdminDaoImpl implements IAdminDao {
	
	private HibernateTemplate hibernateTemplate;
	@SuppressWarnings("unused")
	private PlatformTransactionManager transactionManager;
	@SuppressWarnings("unused")
	private TransactionTemplate transactionTemplate;
	private List<Admin> admins;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 13, 2015 10:04:36 PM
	 * @version 
	 */
	public AdminDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * @param transactionManager the transactionManager to set
	 */
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IAdminDao#selectByUsernameWithPassword(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Admin selectByUsernameWithPassword(String username, String password) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Admin WHERE username=? AND password=?";
		Object[] params = new Object[]{username, password};
		this.admins = (List<Admin>) this.hibernateTemplate.find(strSQL, params);
		if(this.admins.size() == 0){
			return null;
		}else{
			return this.admins.get(0);
		}
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IAdminDao#selectById(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Admin selectById(long adminId) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Admin WHERE id = ?";
		Object[] params = new Object[]{adminId};
		this.admins = (List<Admin>) this.hibernateTemplate.find(strSQL, params);
		if(this.admins != null && this.admins.size() != 0){
			return this.admins.get(0);
		}
		return null;
	}

}
