/**
 * <p>Title: CommentDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.ICommentDao;
import com.douban.model.entity.po.Comment;

/**
 * @author 马金健
 *
 */
public class CommentDaoImpl implements ICommentDao {
	
	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private int affectedRows = 0;
	private List<Comment> comments;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:16:35 PM
	 * @version 
	 */
	public CommentDaoImpl() {
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
	 * @see com.douban.model.dao.ICommentDao#selectAll(com.douban.model.entity.po.Comment)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> selectAll() {
		// TODO Auto-generated method stub
		String strSQL = "FROM Comment";
		Object[] params = new Object[]{};
		this.comments = (List<Comment>) this.hibernateTemplate.find(strSQL, params);
		return this.comments;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICommentDao#selectByArticleId(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> selectByArticleId(long articleid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Comment WHERE articleid = ?";
		Object[] params = new Object[]{articleid};
		this.comments = (List<Comment>) this.hibernateTemplate.find(strSQL, params);
		return this.comments;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ICommentDao#insert(com.douban.model.entity.po.Article)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final Comment comment) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(comment);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

}
