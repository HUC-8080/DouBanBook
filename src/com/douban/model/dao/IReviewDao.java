/**
 * <p>Title: IReviewDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.Review;

/**
 * @author 马金健
 *
 */
public interface IReviewDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Review></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 11:55:00 AM
	 * @version 
	 */
	public List<Review> selectAllByBookId(final int bookid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAllByUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Review></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 11:55:33 AM
	 * @version 
	 */
	public List<Review> selectAllByUserId(final int userid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 11:56:00 AM
	 * @version 
	 */
	public int insert(final Review review);
}
