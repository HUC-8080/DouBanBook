/**
 * <p>Title: AdvertDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 11, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.IAdvertDao;
import com.douban.model.entity.po.Advert;

/**
 * @author 马金健
 *
 */
public class AdvertDaoImpl implements IAdvertDao {

	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private List<Advert> adverts;
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
	 * @date May 11, 2015 8:56:05 PM
	 * @version 
	 */
	public AdvertDaoImpl() {
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
	 * @see com.douban.model.dao.IAdvertDao#selectAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Advert> selectAll() {
		// TODO Auto-generated method stub
		String strSQL = "FROM Advert";
		Object[] params = new Object[]{};
		
		adverts = (List<Advert>) this.hibernateTemplate.find(strSQL, params);
		return adverts;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IAdvertDao#update(com.douban.model.entity.po.Advert)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int update(final Advert advert) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(advert);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}
}
