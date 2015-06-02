/**
 * <p>Title: SystemInfo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.entity.vo;

/**
 * @author 马金健
 *
 */
public class SystemInfo {
	
	private int userCount;
	private int communityCount;
	private int articleCount;
	private int commentCount;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:38:52 PM
	 * @version 
	 */
	public SystemInfo() {
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
	 * @date May 31, 2015 1:40:19 PM
	 * @version 
	 */
	public SystemInfo(int userCount, int communityCount, int articleCount,
			int commentCount) {
		super();
		this.userCount = userCount;
		this.communityCount = communityCount;
		this.articleCount = articleCount;
		this.commentCount = commentCount;
	}

	/**
	 * @return the userCount
	 */
	public int getUserCount() {
		return userCount;
	}

	/**
	 * @param userCount the userCount to set
	 */
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}

	/**
	 * @return the communityCount
	 */
	public int getCommunityCount() {
		return communityCount;
	}

	/**
	 * @param communityCount the communityCount to set
	 */
	public void setCommunityCount(int communityCount) {
		this.communityCount = communityCount;
	}

	/**
	 * @return the articleCount
	 */
	public int getArticleCount() {
		return articleCount;
	}

	/**
	 * @param articleCount the articleCount to set
	 */
	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	/**
	 * @return the commentCount
	 */
	public int getCommentCount() {
		return commentCount;
	}

	/**
	 * @param commentCount the commentCount to set
	 */
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SystemInfo [userCount=" + userCount + ", communityCount="
				+ communityCount + ", articleCount=" + articleCount
				+ ", commentCount=" + commentCount + "]";
	}

}
