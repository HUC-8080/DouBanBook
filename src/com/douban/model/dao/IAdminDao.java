/**
 * <p>Title: IAdminDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 13, 2015
 * @version 
 */
package com.douban.model.dao;

import com.douban.model.entity.po.Admin;

/**
 * @author 马金健
 *
 */
public interface IAdminDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByUsernameWithPassword</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Admin</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 13, 2015 10:04:11 PM
	 * @version 
	 */
	public Admin selectByUsernameWithPassword(final String username, final String password);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Admin</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 10:54:42 AM
	 * @version 
	 */
	public Admin selectById(final long adminId);
}
