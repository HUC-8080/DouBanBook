/**
 * <p>Title: ReviewDaoImpl.java</p>
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

import com.douban.model.dao.IReviewDao;
import com.douban.model.entity.po.Review;

/**
 * @author 马金健
 *
 */
public class ReviewDaoImpl implements IReviewDao {

	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private int affectedRows;
	private List<Review> reviews;
	
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
	 * @date May 8, 2015 11:56:28 AM
	 * @version 
	 */
	public ReviewDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IReviewDao#selectAllByBookId(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Review> selectAllByBookId(int bookid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Review WHERE bookid=?";
		Object[] params = new Object[]{bookid};
		reviews = (List<Review>) this.hibernateTemplate.find(strSQL, params);
		return reviews;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IReviewDao#selectAllByUserId(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Review> selectAllByUserId(int userid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Review WHERE userid=?";
		Object[] params = new Object[]{userid};
		reviews = (List<Review>) this.hibernateTemplate.find(strSQL, params);
		return reviews;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IReviewDao#insert(com.douban.model.entity.po.Review)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final Review review) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(review);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

}
