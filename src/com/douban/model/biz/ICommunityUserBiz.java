/**
 * <p>Title: ICommunityUserBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 27, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.CommunityUser;

/**
 * @author 马金健
 *
 */
public interface ICommunityUserBiz {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: add</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 27, 2015 8:18:52 AM
	 * @version 
	 */
	public boolean add(final CommunityUser communityUser);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: userIsJoinedThisCommunity</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 29, 2015 10:52:25 AM
	 * @version 
	 */
	public boolean userIsJoinedThisCommunity(final CommunityUser communityUser);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: quitCommunity</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 29, 2015 6:58:32 PM
	 * @version 
	 */
	public boolean quitCommunity(final CommunityUser communityUser);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: selectByCommunityIdWithUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return CommunityUser</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 29, 2015 7:05:27 PM
	 * @version 
	 */
	public CommunityUser selectByCommunityIdWithUserId(final CommunityUser communityUser);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: myCommunities</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<CommunityUser></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 30, 2015 1:23:55 PM
	 * @version 
	 */
	public List<CommunityUser> myCommunities(final long userid);
}
