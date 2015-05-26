/**
 * <p>Title: CommunityResult.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.entity.result;

import java.util.List;

import com.douban.model.entity.po.Community;

/**
 * @author 马金健
 *
 */
public class CommunityResult {

	private String msg;
	private int code;
	private Community community;
	private List<Community> communities;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 5:07:04 PM
	 * @version 
	 */
	public CommunityResult() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 5:07:56 PM
	 * @version 
	 */
	public CommunityResult(String msg, int code, Community community,
			List<Community> communities) {
		super();
		this.msg = msg;
		this.code = code;
		this.community = community;
		this.communities = communities;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the community
	 */
	public Community getCommunity() {
		return community;
	}

	/**
	 * @param community the community to set
	 */
	public void setCommunity(Community community) {
		this.community = community;
	}

	/**
	 * @return the communities
	 */
	public List<Community> getCommunities() {
		return communities;
	}

	/**
	 * @param communities the communities to set
	 */
	public void setCommunities(List<Community> communities) {
		this.communities = communities;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommunityResult [msg=" + msg + ", code=" + code
				+ ", community=" + community + ", communities=" + communities
				+ "]";
	}

}
