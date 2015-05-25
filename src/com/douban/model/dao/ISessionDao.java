/**
 * <p>Title: ISessionDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 21, 2015
 * @version 
 */
package com.douban.model.dao;

import com.douban.model.entity.po.Session;

/**
 * @author 马金健
 *
 */
public interface ISessionDao {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:19:34 PM
	 * @version 
	 */
	public int insert(final Session session);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: delete</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:19:58 PM
	 * @version 
	 */
	public int delete(final Session session);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: select</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Session</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:20:49 PM
	 * @version 
	 */
	public Session select(final Session session);
}
