/**
 * <p>Title: ICommunityDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.Community;

/**
 * @author 马金健
 *
 */
public interface ICommunityDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Community></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 4:50:03 PM
	 * @version 
	 */
	public List<Community> selectAll();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 4:50:00 PM
	 * @version 
	 */
	public int insert(final Community community);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Community</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 5:01:52 PM
	 * @version 
	 */
	public Community selectById(final long communityid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByName</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Community</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 29, 2015 11:21:24 AM
	 * @version 
	 */
	public Community selectByName(final String name);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: update</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 28, 2015 10:49:29 AM
	 * @version 
	 */
	public int update(final Community community);
}
