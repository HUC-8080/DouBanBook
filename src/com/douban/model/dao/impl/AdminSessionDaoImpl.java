/**
 * <p>Title: AdminSessionDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.IAdminSessionDao;
import com.douban.model.entity.po.AdminSession;

/**
 * @author 马金健
 *
 */
public class AdminSessionDaoImpl implements IAdminSessionDao {

	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private int affectedRows = 0;
	private List<AdminSession> adminSessions;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:04:31 PM
	 * @version 
	 */
	public AdminSessionDaoImpl() {
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
	 * @see com.douban.model.dao.IAdminSessionDao#insert(com.douban.model.entity.po.AdminSession)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final AdminSession session) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.delete(session);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IAdminSessionDao#delete(com.douban.model.entity.po.AdminSession)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int delete(final AdminSession session) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.delete(session);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IAdminSessionDao#select(com.douban.model.entity.po.AdminSession)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public AdminSession select(AdminSession session) {
		// TODO Auto-generated method stub
		String strSQL = "FROM AdminSession WHERE adminid = ? AND sessionid = ?";
		Object[] params = new Object[]{session.getAdminid(), session.getSessionid()};
		
		this.adminSessions = (List<AdminSession>) this.hibernateTemplate.find(strSQL, params);
		if(this.adminSessions != null){
			return this.adminSessions.get(0);
		}
		return null;
	}

}
