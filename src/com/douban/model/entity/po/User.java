/**
 * <p>Title: User.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 8, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class User implements Serializable {
	
	private long   id;
	private String username;
	private String password;
	private String realname;
	private String sex;
	private String birth;
	private String hobby;
	private String email;
	private String telephone;
	private Boolean isgag;	//禁言
	private String regdate;
	private Set<Friend> friends = new HashSet<Friend>();
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 9:36:08 AM
	 * @version 
	 */
	public User() {
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
	 * @date May 14, 2015 9:34:20 AM
	 * @version 
	 */
	public User(long id, String username, String password, String realname,
			String sex, String birth, String hobby, String email,
			String telephone, Boolean isgag, String regdate, Set<Friend> friends) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.sex = sex;
		this.birth = birth;
		this.hobby = hobby;
		this.email = email;
		this.telephone = telephone;
		this.isgag = isgag;
		this.regdate = regdate;
		this.friends = friends;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
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

	/**
	 * @return the realname
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * @param realname the realname to set
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * @return the hobby
	 */
	public String getHobby() {
		return hobby;
	}

	/**
	 * @param hobby the hobby to set
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the isgag
	 */
	public Boolean getIsgag() {
		return isgag;
	}

	/**
	 * @param isgag the isgag to set
	 */
	public void setIsgag(Boolean isgag) {
		this.isgag = isgag;
	}

	/**
	 * @return the regdate
	 */
	public String getRegdate() {
		return regdate;
	}



	/**
	 * @param regdate the regdate to set
	 */
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}



	/**
	 * @return the friends
	 */
	public Set<Friend> getFriends() {
		return friends;
	}

	/**
	 * @param friends the friends to set
	 */
	public void setFriends(Set<Friend> friends) {
		this.friends = friends;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", realname=" + realname + ", sex=" + sex
				+ ", birth=" + birth + ", hobby=" + hobby + ", email=" + email
				+ ", telephone=" + telephone + ", isgag=" + isgag
				+ ", regdate=" + regdate + ", friends=" + friends.toString() + "]";
	}
}
