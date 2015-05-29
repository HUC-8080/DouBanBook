/**
 * <p>Title: CommunityUserDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 27, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.ICommunityUserDao;
import com.douban.model.entity.po.CommunityUser;

/**
 * @author 马金健
 *
 */
public class CommunityUserDaoImpl implements ICommunityUserDao {

	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private int affectedRows = 0;
	private List<CommunityUser> communityUsers;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 27, 2015 8:16:26 AM
	 * @version 
	 */
	public CommunityUserDaoImpl() {
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
	 * @see com.douban.model.dao.ICommunityUserDao#insert(com.douban.model.entity.po.CommunityUser)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final CommunityUser communityUser) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(communityUser);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICommunityUserDao#selectByCommunityIdWithUserId(com.douban.model.entity.po.CommunityUser)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public CommunityUser selectByCommunityIdWithUserId(
			CommunityUser communityUser) {
		// TODO Auto-generated method stub
		String strSQL = "FROM CommunityUser WHERE userid = ? AND communityid = ?";
		Object[] params = new Object[]{communityUser.getUserid(), communityUser.getCommunityid()};
		this.communityUsers = (List<CommunityUser>) this.hibernateTemplate.find(strSQL, params);
		if(this.communityUsers != null && this.communityUsers.size() != 0){
			return this.communityUsers.get(0);
		}
		return null;
	}

}
