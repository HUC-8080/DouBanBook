/**
 * <p>Title: IAdminBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 13, 2015
 * @version 
 */
package com.douban.model.biz;

import com.douban.model.entity.po.Admin;

/**
 * @author 马金健
 *
 */
public interface IAdminBiz {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: login</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Admin</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 13, 2015 10:07:36 PM
	 * @version 
	 */
	public Admin login(final String username, final String password);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: queryInfo</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Admin</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 10:56:50 AM
	 * @version 
	 */
	public Admin queryInfo(final long adminId);
}
