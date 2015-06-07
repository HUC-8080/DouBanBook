/**
 * <p>Title: Review.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class Review implements Serializable {

	private int id;
	private int bookid;
	private User user;
	private String content;
	private String date;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 11:45:06 AM
	 * @version 
	 */
	public Review() {
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
	 * @date May 8, 2015 11:46:31 AM
	 * @version 
	 */
	public Review(int id, int bookid, User user, String content, String date) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.user = user;
		this.content = content;
		this.date = date;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the bookid
	 */
	public int getBookid() {
		return bookid;
	}

	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	/**
	 * @return the userid
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUser(User user) {
		this.user = user;
		this.user.setPassword("");
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Review [id=" + id + ", bookid=" + bookid + ", user=" + user
				+ ", content=" + content + ", date=" + date + "]";
	}

}
