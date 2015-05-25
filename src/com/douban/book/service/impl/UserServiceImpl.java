/**
 * <p>Title: UserServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 26, 2015
 * @version 
 */
package com.douban.book.service.impl;

import com.douban.book.service.UserService;
import com.douban.common.util.HttpRequest;
import com.douban.common.util.RequestGrantScope;
import com.douban.common.util.json.JSONUser;
import com.douban.model.entity.vo.User;

/**
 * @author 马金健
 *
 */
public class UserServiceImpl implements UserService {
	
	private static final String AUTH_URL = "https://www.douban.com/service/auth2/auth";
	private static final String API_KEY = "0f7aff087d2228082e70fd1977667818";
	private static final String ACCESS_TOKEN_REDIRECT_URL = "http://127.0.0.1/DouBanBook/DouBanCode";
	@SuppressWarnings("unused")
	private static final String ACCESS_TOKEN_URL = "https://www.douban.com/service/auth2/token";
	private static final String URL = "https://api.douban.com/v2/user";
	private User user;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 7:10:24 PM
	 * @version 
	 */
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.book.service.UserService#selectUserInfo(java.lang.String)
	 */
	@Override
	public User selectUserInfo(String id) {
		// TODO Auto-generated method stub
		StringBuffer query = new StringBuffer(URL);
		query.append("/"+id);
		String result = HttpRequest.sendGet(query.toString(), null);
		user = JSONUser.getUserInfo(result);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.douban.book.service.UserService#getAuthorizationCode()
	 */
	@Override
	public String getAuthorizationCode() {
		// TODO Auto-generated method stub
		StringBuffer query = new StringBuffer(AUTH_URL);
		query.append("?client_id="+API_KEY)
			.append("&redirect_uri="+ACCESS_TOKEN_REDIRECT_URL)
			.append("&response_type=code")
			.append(RequestGrantScope.BOOK_READ_SCOPE);
		String result = HttpRequest.sendGet(query.toString(), null);
		return result;
	}

}
