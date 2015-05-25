/**
 * <p>Title: Friend.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 19, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class Friend implements Serializable {

	private long id;
	private long userid;
	private long friendid;
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 11:47:44 AM
	 * @version 
	 */
	public Friend() {
		super();
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
	 * @date May 19, 2015 11:47:33 AM
	 * @version 
	 */
	public Friend(long id, long userid, long friendid) {
		super();
		this.id = id;
		this.userid = userid;
		this.friendid = friendid;
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
	/**
	 * @return the friendid
	 */
	public long getFriendid() {
		return friendid;
	}
	/**
	 * @param friendid the friendid to set
	 */
	public void setFriendid(long friendid) {
		this.friendid = friendid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Friend [id=" + id + ", userid=" + userid + ", friendid="
				+ friendid + "]";
	}
}
