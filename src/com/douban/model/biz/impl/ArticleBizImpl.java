/**
 * <p>Title: ArticleBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.IArticleBiz;
import com.douban.model.dao.impl.ArticleDaoImpl;
import com.douban.model.entity.po.Article;

/**
 * @author 马金健
 *
 */
public class ArticleBizImpl implements IArticleBiz {
	
	private int affectedRows = 0;
	private ArticleDaoImpl articleDao;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:52:41 PM
	 * @version 
	 */
	public ArticleBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param articleDao the articleDao to set
	 */
	public void setArticleDao(ArticleDaoImpl articleDao) {
		this.articleDao = articleDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#findByCommunityId(long)
	 */
	@Override
	public List<Article> findByCommunityId(long communityid) {
		// TODO Auto-generated method stub
		return this.articleDao.selectByCommunityId(communityid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#findByUserId(long)
	 */
	@Override
	public List<Article> findByUserId(long userid) {
		// TODO Auto-generated method stub
		return this.articleDao.selectByUserId(userid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#writeArticle(com.douban.model.entity.po.Article)
	 */
	@Override
	public boolean writeArticle(Article article) {
		// TODO Auto-generated method stub
		this.affectedRows = this.articleDao.insert(article);
		if(this.affectedRows > 0 ){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#findAll()
	 */
	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return this.articleDao.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#articleCount()
	 */
	@Override
	public int articleCount() {
		// TODO Auto-generated method stub
		return this.findAll().size();
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#shield(com.douban.model.entity.po.Article)
	 */
	@Override
	public boolean shield(Article article) {
		// TODO Auto-generated method stub
		this.affectedRows = this.articleDao.update(article);
		if(this.affectedRows > 0){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#findById(long)
	 */
	@Override
	public Article findById(long articleid) {
		// TODO Auto-generated method stub
		return this.articleDao.selectById(articleid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IArticleBiz#remove(com.douban.model.entity.po.Article)
	 */
	@Override
	public boolean remove(Article article) {
		// TODO Auto-generated method stub
		this.affectedRows = this.articleDao.delete(article);
		return false;
	}

}
