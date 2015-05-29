/**
 * <p>Title: ICommunityUserDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 27, 2015
 * @version 
 */
package com.douban.model.dao;

import com.douban.model.entity.po.CommunityUser;

/**
 * @author 马金健
 *
 */
public interface ICommunityUserDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 27, 2015 8:16:04 AM
	 * @version 
	 */
	public int insert(final CommunityUser communityUser);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByCommunityIdWithUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return CommunityUser</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 29, 2015 10:46:07 AM
	 * @version 
	 */
	public CommunityUser selectByCommunityIdWithUserId(final CommunityUser communityUser);

}
