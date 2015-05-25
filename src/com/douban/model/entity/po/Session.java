/**
 * <p>Title: Session.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 21, 2015
 * @version 
 */
package com.douban.model.entity.po;

/**
 * @author 马金健
 *
 */
public class Session {

	private long id;
	private long userid;
	private long sessionid;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 6:54:58 PM
	 * @version 
	 */
	public Session() {
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
	 * @date May 21, 2015 6:55:45 PM
	 * @version 
	 */
	public Session(long id, long userid, long sessionid) {
		super();
		this.id = id;
		this.userid = userid;
		this.sessionid = sessionid;
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
	 * @return the sessionid
	 */
	public long getSessionid() {
		return sessionid;
	}

	/**
	 * @param sessionid the sessionid to set
	 */
	public void setSessionid(long sessionid) {
		this.sessionid = sessionid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Session [id=" + id + ", userid=" + userid + ", sessionid="
				+ sessionid + "]";
	}

}
