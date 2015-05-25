/**
 * <p>Title: IReviewBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.Review;

/**
 * @author 马金健
 *
 */
public interface IReviewBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAllByBookId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Review></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 12:00:38 PM
	 * @version 
	 */
	public List<Review> findAllByBookId(final int bookid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAllByUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Review></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 12:00:59 PM
	 * @version 
	 */
	public List<Review> findAllByUserId(final int userid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: add</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 12:01:15 PM
	 * @version 
	 */
	public boolean add(final Review review);
}
