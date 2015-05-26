/**
 * <p>Title: AdminSession.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class AdminSession implements Serializable {
	
	private long id;
	private long adminid;
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
	 * @date May 26, 2015 8:57:19 PM
	 * @version 
	 */
	public AdminSession() {
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
	 * @date May 26, 2015 8:58:20 PM
	 * @version 
	 */
	public AdminSession(long id, long adminid, long sessionid) {
		super();
		this.id = id;
		this.adminid = adminid;
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
	 * @return the adminid
	 */
	public long getAdminid() {
		return adminid;
	}

	/**
	 * @param adminid the adminid to set
	 */
	public void setAdminid(long adminid) {
		this.adminid = adminid;
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
		return "AdminSession [id=" + id + ", adminid=" + adminid
				+ ", sessionid=" + sessionid + "]";
	}

}
