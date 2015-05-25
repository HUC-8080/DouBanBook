/**
 * <p>Title: ISessionBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 21, 2015
 * @version 
 */
package com.douban.model.biz;

import com.douban.model.entity.po.Session;

/**
 * @author 马金健
 *
 */
public interface ISessionBiz {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: addSession</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:26:46 PM
	 * @version 
	 */
	public boolean addSession(final Session session);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: removeSession</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:27:05 PM
	 * @version 
	 */
	public boolean removeSession(final Session session);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: find</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Session</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:27:44 PM
	 * @version 
	 */
	public Session find(final Session session);
}
