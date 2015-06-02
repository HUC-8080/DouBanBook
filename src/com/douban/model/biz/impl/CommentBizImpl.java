/**
 * <p>Title: CommentBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.ICommentBiz;
import com.douban.model.dao.impl.CommentDaoImpl;
import com.douban.model.entity.po.Comment;

/**
 * @author 马金健
 *
 */
public class CommentBizImpl implements ICommentBiz {
	
	private CommentDaoImpl commentDao;
	private int affectedRows = 0;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:21:32 PM
	 * @version 
	 */
	public CommentBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param commentDao the commentDao to set
	 */
	public void setCommentDao(CommentDaoImpl commentDao) {
		this.commentDao = commentDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommentBiz#findAll()
	 */
	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return this.commentDao.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommentBiz#findByArticleId(long)
	 */
	@Override
	public List<Comment> findByArticleId(long articleid) {
		// TODO Auto-generated method stub
		return this.commentDao.selectByArticleId(articleid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommentBiz#writeComment(com.douban.model.entity.po.Comment)
	 */
	@Override
	public boolean writeComment(Comment comment) {
		// TODO Auto-generated method stub
		this.affectedRows = this.commentDao.insert(comment);
		if(this.affectedRows > 0 ){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommentBiz#commentCount()
	 */
	@Override
	public int commentCount() {
		// TODO Auto-generated method stub
		return this.findAll().size();
	}

}
