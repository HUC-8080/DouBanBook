/**
 * <p>Title: IUserDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 8, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.User;

/**
 * @author 马金健
 *
 */
public interface IUserDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<User></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 14, 2015 8:02:01 AM
	 * @version 
	 */
	public List<User> selectAll();
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectUser</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 9:52:23 AM
	 * @version 
	 */
	public int selectUser(final User user);
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 9:52:50 AM
	 * @version 
	 */
	public int insert(final User user);
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: update</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 9:53:09 AM
	 * @version 
	 */
	public int update(final User user);

	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: select</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return User</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 9:53:42 AM
	 * @version 
	 */
	public User select(final String username);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: deleteByUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 14, 2015 8:39:40 AM
	 * @version 
	 */
	public int deleteByUserId(final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectUserInfo</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return User</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 18, 2015 6:31:39 PM
	 * @version 
	 */
	public User selectUserInfo(final long userid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByTelephone</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return User</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 24, 2015 3:49:51 PM
	 * @version 
	 */
	public User selectByField(final String field, final String value);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByEmail</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return User</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 24, 2015 4:49:19 PM
	 * @version 
	 */
	public User selectByEmail(final String email);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByTelephone</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return User</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 24, 2015 4:54:26 PM
	 * @version 
	 */
	public User selectByTelephone(final String telephone);
	
}
