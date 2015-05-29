/**
 * <p>Title: CommunityUser.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 27, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class CommunityUser implements Serializable {
	
	private long id;
	private long communityid;
	private long userid;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 27, 2015 8:13:45 AM
	 * @version 
	 */
	public CommunityUser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 27, 2015 8:14:56 AM
	 * @version 
	 */
	public CommunityUser(long id, long communityid, long userid) {
		super();
		this.id = id;
		this.communityid = communityid;
		this.userid = userid;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the communityid
	 */
	public long getCommunityid() {
		return communityid;
	}

	/**
	 * @param communityid the communityid to set
	 */
	public void setCommunityid(long communityid) {
		this.communityid = communityid;
	}

	/**
	 * @return the userid
	 */
	public long getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(long userid) {
		this.userid = userid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommunityUser [id=" + id + ", communityid=" + communityid
				+ ", userid=" + userid + "]";
	}

}
