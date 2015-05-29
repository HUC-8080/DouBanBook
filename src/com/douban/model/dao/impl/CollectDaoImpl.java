/**
 * <p>Title: CollectDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.ICollectDao;
import com.douban.model.entity.po.Collect;

/**
 * @author 马金健
 *
 */
public class CollectDaoImpl implements ICollectDao {

	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private int affectedRows;
	private List<Collect> collects;
	
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:26:56 AM
	 * @version 
	 */
	public CollectDaoImpl() {
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
	 * @see com.douban.model.dao.ICollectDao#selectAll(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Collect> selectAll(long userid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Collect WHERE userid=?";
		Object[] params = new Object[]{userid};
		collects = (List<Collect>) this.hibernateTemplate.find(strSQL, params);
		if(this.collects.size() == 0){
			return null;
		}
		return collects;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICollectDao#insert(com.douban.model.entity.po.Collect)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final Collect collect) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(collect);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICollectDao#delete(com.douban.model.entity.po.Collect)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int delete(final Collect collect) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.delete(collect);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICollectDao#isCollect(com.douban.model.entity.po.Collect)
	 */
	@Override
	public int isCollect(Collect collect) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Collect WHERE userid=? AND bookid=?";
		Object[] params = new Object[]{collect.getUserid(),collect.getBookid()};
		if(this.hibernateTemplate.find(strSQL, params).size() > 0){
			return 1;
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICollectDao#selectByBookIdWithUserId(int, int)
	 */
	@Override
	public Collect selectByBookIdWithUserId(long bookid, long userid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Collect WHERE bookid=? AND userid=?";
		Object[] params = new Object[]{bookid, userid};
		return (Collect) this.hibernateTemplate.find(strSQL, params).get(0);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICollectDao#selectRank()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Collect> selectRank() {
		// TODO Auto-generated method stub
		String strSQL = "FROM Collect";
		Object[] params = new Object[]{};
		
		this.collects = (List<Collect>) this.hibernateTemplate.find(strSQL, params);
		return this.collects;
	}

}
