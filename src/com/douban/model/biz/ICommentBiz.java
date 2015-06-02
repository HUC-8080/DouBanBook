/**
 * <p>Title: ICommentBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.Comment;

/**
 * @author 马金健
 *
 */
public interface ICommentBiz {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Comment></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:16:11 PM
	 * @version 
	 */
	public List<Comment> findAll();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findByArticleId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Comment></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:15:04 PM
	 * @version 
	 */
	public List<Comment> findByArticleId(final long articleid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: writeComment</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:15:35 PM
	 * @version 
	 */
	public boolean writeComment(final Comment comment);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: commentCount</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 2:24:39 PM
	 * @version 
	 */
	public int commentCount();
	
}
