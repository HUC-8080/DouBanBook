/**
 * <p>Title: ICommunityBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.Community;
import com.douban.model.entity.po.CommunityUser;

/**
 * @author 马金健
 *
 */
public interface ICommunityBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Community></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 5:00:45 PM
	 * @version 
	 */
	public List<Community> findAll();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: add</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 5:00:41 PM
	 * @version 
	 */
	public boolean add(final Community community);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Community</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 5:01:12 PM
	 * @version 
	 */
	public Community findById(final long communityid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findByName</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Community</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 29, 2015 11:24:31 AM
	 * @version 
	 */
	public boolean communitynameIsUsed(final String name);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: check</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 28, 2015 10:51:51 AM
	 * @version 
	 */
	public boolean check(final Community community);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: quitCommunity</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 29, 2015 6:26:44 PM
	 * @version 
	 */
	public boolean quitCommunity(final Community community);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: selectMyCommunities</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Community></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 30, 2015 1:26:29 PM
	 * @version 
	 */
	public List<Community> selectMyCommunities(final List<CommunityUser> communityUsers);
}
