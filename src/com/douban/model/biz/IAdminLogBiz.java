/**
 * <p>Title: IAdminLogBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 15, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.AdminLog;

/**
 * @author 马金健
 *
 */
public interface IAdminLogBiz {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: addLog</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 15, 2015 9:39:55 AM
	 * @version 
	 */
	public boolean addLog(final AdminLog adminLog);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<AdminLog></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 15, 2015 9:40:14 AM
	 * @version 
	 */
	public List<AdminLog> findAll();
}
