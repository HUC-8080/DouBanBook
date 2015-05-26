/**
 * <p>Title: IAdminSessionBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.biz;

import com.douban.model.entity.po.AdminSession;

/**
 * @author 马金健
 *
 */
public interface IAdminSessionBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: add</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:13:18 PM
	 * @version 
	 */
	public boolean add(final AdminSession session);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: remove</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:13:37 PM
	 * @version 
	 */
	public boolean remove(final AdminSession session);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: find</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return AdminSession</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:14:03 PM
	 * @version 
	 */
	public AdminSession find(final AdminSession session);
}
