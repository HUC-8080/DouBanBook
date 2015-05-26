/**
 * <p>Title: IAdminSessionDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.dao;

import com.douban.model.entity.po.AdminSession;

/**
 * @author 马金健
 *
 */
public interface IAdminSessionDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:03:06 PM
	 * @version 
	 */
	public int insert(final AdminSession session);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: delete</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:03:22 PM
	 * @version 
	 */
	public int delete(final AdminSession session);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: select</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return AdminSession</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:04:01 PM
	 * @version 
	 */
	public AdminSession select(final AdminSession session);
}
