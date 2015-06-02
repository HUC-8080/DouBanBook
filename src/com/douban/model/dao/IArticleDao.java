/**
 * <p>Title: IArticleDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.Article;

/**
 * @author 马金健
 *
 */
public interface IArticleDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Article></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:54:59 PM
	 * @version 
	 */
	public List<Article> selectAll();

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByCommunityId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Article></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:45:10 PM
	 * @version 
	 */
	public List<Article> selectByCommunityId(final long communityid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:45:48 PM
	 * @version 
	 */
	public int insert(final Article article);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Article></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:46:33 PM
	 * @version 
	 */
	public List<Article> selectByUserId(final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: update</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 11:04:01 PM
	 * @version 
	 */
	public int update(final Article article);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Article</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 11:07:18 PM
	 * @version 
	 */
	public Article selectById(final long articleid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: delete</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 11:20:24 PM
	 * @version 
	 */
	public int delete(final Article article);
}
