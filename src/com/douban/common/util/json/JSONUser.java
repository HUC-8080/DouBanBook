/**
 * <p>Title: JSONUser.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 26, 2015
 * @version 
 */
package com.douban.common.util.json;

import net.sf.json.JSONObject;

import com.douban.model.entity.vo.User;

/**
 * @author 马金健
 *
 */
public class JSONUser {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util.json</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 7:03:22 PM
	 * @version 
	 */
	public JSONUser() {
		// TODO Auto-generated constructor stub
	}
	
	public static User getUserInfo(String result){
		JSONObject jsonuser = JSONObject.fromObject(result);
		User user = (User) JSONObject.toBean(jsonuser, User.class);
		return user;
	}

}
