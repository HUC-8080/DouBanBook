/**
 * <p>Title: AccessToken.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 26, 2015
 * @version 
 */
package com.douban.model.entity.vo;

/**
 * @author 马金健
 *
 */
public class AccessToken {

	private String accessToken = null;
	private Integer expiresIn = null;
	private String refreshToken = null;
	private String userId = null;
	private String userName = null;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 7:36:35 PM
	 * @version 
	 */
	public AccessToken() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 7:37:31 PM
	 * @version 
	 */
	public AccessToken(String accessToken, Integer expiresIn,
			String refreshToken, String userId, String userName) {
		super();
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
		this.refreshToken = refreshToken;
		this.userId = userId;
		this.userName = userName;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the expiresIn
	 */
	public Integer getExpiresIn() {
		return expiresIn;
	}

	/**
	 * @param expiresIn the expiresIn to set
	 */
	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	/**
	 * @return the refreshToken
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * @param refreshToken the refreshToken to set
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * @return the doubanUserId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param doubanUserId the doubanUserId to set
	 */
	public void setDoubanUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the doubanUserName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param doubanUserName the doubanUserName to set
	 */
	public void setDoubanUserName(String userName) {
		this.userName = userName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccessToken [accessToken=" + accessToken + ", expiresIn="
				+ expiresIn + ", refreshToken=" + refreshToken
				+ ", userId=" + userId + ", userName="
				+ userName + "]";
	}

}
