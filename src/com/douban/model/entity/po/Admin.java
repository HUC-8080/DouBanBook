/**
 * <p>Title: Admin.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 13, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class Admin implements Serializable {
	
	private long id;
	private String username;
	private String password;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 13, 2015 10:00:03 PM
	 * @version 
	 */
	public Admin() {
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
	 * @date May 13, 2015 10:01:48 PM
	 * @version 
	 */
	public Admin(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}

}
