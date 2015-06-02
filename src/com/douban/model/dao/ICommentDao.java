/**
 * <p>Title: ICommentDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.Comment;

/**
 * @author 马金健
 *
 */
public interface ICommentDao {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Comment></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:08:40 PM
	 * @version 
	 */
	public List<Comment> selectAll();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByArticleId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Comment></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:09:33 PM
	 * @version 
	 */
	public List<Comment> selectByArticleId(final long articleid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:09:53 PM
	 * @version 
	 */
	public int insert(final Comment comment);
}
