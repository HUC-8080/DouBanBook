/**
 * <p>Title: CommunityDaoImpl.java</p>
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

import com.douban.model.dao.ICommunityDao;
import com.douban.model.entity.po.Community;

/**
 * @author 马金健
 *
 */
public class CommunityDaoImpl implements ICommunityDao {
	
	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private List<Community> communities;
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
	 * @date May 26, 2015 4:50:37 PM
	 * @version 
	 */
	public CommunityDaoImpl() {
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
	 * @see com.douban.model.dao.ICommunityDao#selectAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Community> selectAll() {
		// TODO Auto-generated method stub
		String strSQL = "FROM Community";
		Object[] params = new Object[]{};
		this.communities = (List<Community>) this.hibernateTemplate.find(strSQL, params);
		if(this.communities != null){
			return this.communities;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICommunityDao#insert(com.douban.model.entity.po.Community)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final Community community) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(community);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICommunityDao#selectById(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Community selectById(long communityid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Community WHERE id = ?";
		Object[] params = new Object[]{communityid};
		this.communities = (List<Community>) this.hibernateTemplate.find(strSQL, params);
		if(this.communities != null){
			return this.communities.get(0);
		}
		return null;
	}

}
