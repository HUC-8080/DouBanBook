/**
 * <p>Title: Collection.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 25, 2015
 * @version 
 */
package com.douban.model.entity.vo;

import java.util.Arrays;

/**
 * @author 马金健
 *
 */
public class Collection {
	
	private String status;
	private Rating rating;
	private String updated;
	private String user_id;
	private Tag[] tags;
	private Book book;
	private String book_id;
	private int id;
	

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:50:02 PM
	 * @version 
	 */
	public Collection() {
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
	 * @date Apr 25, 2015 9:57:03 PM
	 * @version 
	 */
	public Collection(String status, Rating rating, String updated,
			String user_id, Tag[] tags, Book book, String book_id, int id) {
		super();
		this.status = status;
		this.rating = rating;
		this.updated = updated;
		this.user_id = user_id;
		this.tags = tags;
		this.book = book;
		this.book_id = book_id;
		this.id = id;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}


	/**
	 * @param rating the rating to set
	 */
	public void setRating(Rating rating) {
		this.rating = rating;
	}


	/**
	 * @return the updated
	 */
	public String getUpdated() {
		return updated;
	}


	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(String updated) {
		this.updated = updated;
	}


	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}


	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	/**
	 * @return the tags
	 */
	public Tag[] getTags() {
		return tags;
	}


	/**
	 * @param tags the tags to set
	 */
	public void setTags(Tag[] tags) {
		this.tags = tags;
	}


	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}


	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}


	/**
	 * @return the book_id
	 */
	public String getBook_id() {
		return book_id;
	}


	/**
	 * @param book_id the book_id to set
	 */
	public void setBook_id(String book_id) {
		this.book_id = book_id;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Collection [status=" + status + ", rating=" + rating
				+ ", updated=" + updated + ", user_id=" + user_id + ", tags="
				+ Arrays.toString(tags) + ", book=" + book + ", book_id="
				+ book_id + ", id=" + id + "]";
	}

}
