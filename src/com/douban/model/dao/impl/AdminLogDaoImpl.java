/**
 * <p>Title: AdminLogDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 15, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.IAdminLogDao;
import com.douban.model.entity.po.AdminLog;

/**
 * @author 马金健
 *
 */
public class AdminLogDaoImpl implements IAdminLogDao {
	
	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private List<AdminLog> adminLogs;
	private int affectedRows = 0;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 15, 2015 9:35:12 AM
	 * @version 
	 */
	public AdminLogDaoImpl() {
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
	 * @see com.douban.model.dao.IAdminLogDao#insert(com.douban.model.entity.po.AdminLog)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final AdminLog adminLog) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(adminLog);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IAdminLogDao#selectAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<AdminLog> selectAll() {
		// TODO Auto-generated method stub
		String strSQL = "FROM AdminLog";
		Object[] params = new Object[]{};
		this.adminLogs = (List<AdminLog>) this.hibernateTemplate.find(strSQL, params);
		return this.adminLogs;
	}

}
