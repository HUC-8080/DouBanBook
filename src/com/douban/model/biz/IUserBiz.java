/**
 * <p>Title: IUserBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 8, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.User;

/**
 * @author 马金健
 *
 */
public interface IUserBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<User></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 14, 2015 8:04:51 AM
	 * @version 
	 */
	public List<User> findAll(); 
	
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: validate</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 10:06:33 AM
	 * @version 
	 */
	public boolean validate(final User user);
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: register</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 10:06:53 AM
	 * @version 
	 */
	public boolean register(final User user);
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: modifyInfo</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 10:07:40 AM
	 * @version 
	 */
	public boolean modifyInfo(final User user);
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: queryInfo</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 10:08:13 AM
	 * @version 
	 */
	public User queryInfo(final String username);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: removeByUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 14, 2015 8:42:58 AM
	 * @version 
	 */
	public boolean removeByUserId(final long userid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: queryUserInfo</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return User</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 18, 2015 6:34:07 PM
	 * @version 
	 */
	public User queryUserInfo(final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: telephoneIsRegistered</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 24, 2015 3:55:03 PM
	 * @version 
	 */
	public boolean telephoneIsRegistered(final String telephone);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: emailIsRegistered</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 24, 2015 3:55:35 PM
	 * @version 
	 */
	public boolean emailIsRegistered(final String email);
}
