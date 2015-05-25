/**
 * <p>Title: Rank.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 12, 2015
 * @version 
 */
package com.douban.model.entity.vo;

import java.io.Serializable;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class Rank implements Serializable, Comparable<Rank>{
	
	private long bookid;
	private Integer count;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 12, 2015 6:28:15 PM
	 * @version 
	 */
	public Rank() {
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
	 * @date May 12, 2015 6:29:28 PM
	 * @version 
	 */
	public Rank(long bookid, int count) {
		super();
		this.bookid = bookid;
		this.count = count;
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

	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rank [bookid=" + bookid + ", count=" + count + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Rank arg0) {
		// TODO Auto-generated method stub
		return arg0.getCount().compareTo(this.getCount());
	}
}
