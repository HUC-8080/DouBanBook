/**
 * <p>Title: IFriendBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 19, 2015
 * @version 
 */
package com.douban.model.biz;

import com.douban.model.entity.po.Friend;

/**
 * @author 马金健
 *
 */
public interface IFriendBiz {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: addFriend</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 3:13:28 PM
	 * @version 
	 */
	public boolean addFriend(final Friend friend);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: removeFriend</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 3:13:50 PM
	 * @version 
	 */
	public boolean removeFriend(final Friend friend);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findByFriendid</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Friend</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 4:01:26 PM
	 * @version 
	 */
	public Friend findByFriendid(final long friendid);
}
