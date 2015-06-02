/**
 * <p>Title: ArticleDaoImpl.java</p>
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

import com.douban.model.dao.IArticleDao;
import com.douban.model.entity.po.Article;

/**
 * @author 马金健
 *
 */
public class ArticleDaoImpl implements IArticleDao {
	
	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private int affectedRows = 0;
	private List<Article> articles;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:47:00 PM
	 * @version 
	 */
	public ArticleDaoImpl() {
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
	 * @see com.douban.model.dao.IArticleDao#selectByCommunityId(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> selectByCommunityId(long communityid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Article WHERE communityid = ? ";
		Object[] params = new Object[]{communityid};
		this.articles = (List<Article>) this.hibernateTemplate.find(strSQL, params);
		return this.articles;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IArticleDao#insert(com.douban.model.entity.po.Article)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final Article article) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(article);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IArticleDao#selectByUserId(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> selectByUserId(long userid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Article WHERE userid = ? ";
		Object[] params = new Object[]{userid};
		this.articles = (List<Article>) this.hibernateTemplate.find(strSQL, params);
		return this.articles;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IArticleDao#selectAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> selectAll() {
		// TODO Auto-generated method stub
		String strSQL = "FROM Article";
		Object[] params = new Object[]{};
		this.articles = (List<Article>) this.hibernateTemplate.find(strSQL, params);
		return this.articles;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IArticleDao#update(com.douban.model.entity.po.Article)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int update(final Article article) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.update(article);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IArticleDao#selectById(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Article selectById(long articleid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM Article WHERE id = ?";
		Object[] params = new Object[]{articleid};
		this.articles = (List<Article>) this.hibernateTemplate.find(strSQL, params);
		if(this.articles != null && this.articles.size() != 0){
			return this.articles.get(0);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IArticleDao#delete(com.douban.model.entity.po.Article)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int delete(final Article article) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.delete(article);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

}
