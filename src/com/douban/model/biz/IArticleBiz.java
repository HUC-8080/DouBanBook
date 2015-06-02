/**
 * <p>Title: IArticleBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.Article;

/**
 * @author 马金健
 *
 */
public interface IArticleBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Article></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:56:54 PM
	 * @version 
	 */
	public List<Article> findAll();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findByCommunityId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Article></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:51:27 PM
	 * @version 
	 */
	public List<Article> findByCommunityId(final long communityid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findByUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Article></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:51:47 PM
	 * @version 
	 */
	public List<Article> findByUserId(final long userid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: writeArticle</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:52:09 PM
	 * @version 
	 */
	public boolean writeArticle(final Article article);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: articleCount</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:58:16 PM
	 * @version 
	 */
	public int articleCount();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: shield</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 11:05:29 PM
	 * @version 
	 */
	public boolean shield(final Article article);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Article</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 11:10:06 PM
	 * @version 
	 */
	public Article findById(final long articleid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: remove</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 11:19:00 PM
	 * @version 
	 */
	public boolean remove(final Article article);
}
