/**
 * <p>Title: IAdminLogDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 15, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.AdminLog;

/**
 * @author 马金健
 *
 */
public interface IAdminLogDao {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 15, 2015 9:34:11 AM
	 * @version 
	 */
	public int insert(AdminLog adminLog);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<AdminLog></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 15, 2015 9:34:31 AM
	 * @version 
	 */
	public List<AdminLog> selectAll();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: deleteById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 11:43:05 PM
	 * @version 
	 */
	public int deleteById(final long adminlogid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return AdminLog</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 11:45:12 PM
	 * @version 
	 */
	public AdminLog selectById(final long adminlogid);
}
