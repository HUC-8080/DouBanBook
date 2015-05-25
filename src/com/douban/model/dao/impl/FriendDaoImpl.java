/**
 * <p>Title: FriendDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 19, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.IFriendDao;
import com.douban.model.entity.po.Friend;

/**
 * @author 马金健
 *
 */
public class FriendDaoImpl implements IFriendDao {

	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private int affectedRows = 0;
	private Friend friend;
	
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

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 3:09:48 PM
	 * @version 
	 */
	public FriendDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IFriendDao#delete(com.douban.model.entity.po.Friend)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int delete(final Friend friend) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.delete(friend);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IFriendDao#insert(com.douban.model.entity.po.Friend)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final Friend friend) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(friend);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IFriendDao#selectByFriendId(long)
	 */
	@Override
	public Friend selectByFriendId(long friendid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Friend WHERE friendid = ?";
		Object[] params = new Object[]{friendid};
		this.friend = (Friend) this.hibernateTemplate.find(strSQL, params).get(0);
		return this.friend;
	}

}
