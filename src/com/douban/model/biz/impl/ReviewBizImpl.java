/**
 * <p>Title: ReviewBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.IReviewBiz;
import com.douban.model.dao.impl.ReviewDaoImpl;
import com.douban.model.entity.po.Review;

/**
 * @author 马金健
 *
 */
public class ReviewBizImpl implements IReviewBiz {
	
	private ReviewDaoImpl reviewDao;
	private int affectedRows = 0;

	/**
	 * @param reviewDao the reviewDao to set
	 */
	public void setReviewDao(ReviewDaoImpl reviewDao) {
		this.reviewDao = reviewDao;
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 12:01:35 PM
	 * @version 
	 */
	public ReviewBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IReviewBiz#findAllByBookId(int)
	 */
	@Override
	public List<Review> findAllByBookId(int bookid) {
		// TODO Auto-generated method stub
		return this.reviewDao.selectAllByBookId(bookid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IReviewBiz#findAllByUserId(int)
	 */
	@Override
	public List<Review> findAllByUserId(int userid) {
		// TODO Auto-generated method stub
		return this.reviewDao.selectAllByUserId(userid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IReviewBiz#add(com.douban.model.entity.po.Review)
	 */
	@Override
	public boolean add(Review review) {
		// TODO Auto-generated method stub
		affectedRows = this.reviewDao.insert(review);
		boolean flag = affectedRows > 0 ? true : false;
		return flag;
	}

}
