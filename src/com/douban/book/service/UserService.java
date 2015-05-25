/**
 * <p>Title: UserService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 26, 2015
 * @version 
 */
package com.douban.book.service;

import com.douban.model.entity.vo.User;

/**
 * @author 马金健
 *
 */
public interface UserService {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectUserInfo</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return User</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 7:08:49 PM
	 * @version 
	 */
	public User selectUserInfo(final String id);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: getAuthorizationCode</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return String</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 7:25:11 PM
	 * @version 
	 */
	public String getAuthorizationCode();
}
