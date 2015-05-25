/**
 * <p>Title: Collect.java</p>
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
public class Collect implements Serializable {

	private long id;
	private long userid;
	private long bookid;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:23:28 AM
	 * @version 
	 */
	public Collect() {
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
	 * @date May 8, 2015 8:24:16 AM
	 * @version 
	 */
	public Collect(int id, int userid, int bookid) {
		super();
		this.id = id;
		this.userid = userid;
		this.bookid = bookid;
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
	 * @return the bookid
	 */
	public long getBookid() {
		return bookid;
	}

	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(long bookid) {
		this.bookid = bookid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Collect [id=" + id + ", userid=" + userid + ", bookid="
				+ bookid + "]";
	}

}
