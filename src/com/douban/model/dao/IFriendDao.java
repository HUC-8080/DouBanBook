/**
 * <p>Title: IFriendDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 19, 2015
 * @version 
 */
package com.douban.model.dao;

import com.douban.model.entity.po.Friend;

/**
 * @author 马金健
 *
 */
public interface IFriendDao {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: delete</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 11:49:08 AM
	 * @version 
	 */
	public int delete(final Friend friend);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 11:49:52 AM
	 * @version 
	 */
	public int insert(final Friend friend);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByFriendId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Friend</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 3:58:49 PM
	 * @version 
	 */
	public Friend selectByFriendId(final long friendid);
}
