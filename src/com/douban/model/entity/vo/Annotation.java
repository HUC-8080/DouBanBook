/**
 * <p>Title: Annotation.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 27, 2015
 * @version 
 */
package com.douban.model.entity.vo;

import java.util.Map;

/**
 * @author 马金健
 *
 */
public class Annotation {
	
	private String chapter;
	private Book book;
	private User author_user;
	private int privacy;
	private String abstract_photo;
	private String summary;
	private String content;
	private Map<Integer, String> photos;
	private int last_photo;
	private int comments_count;
	private boolean hasmath;
	private String book_id;
	private String time;
	private String author_id;
	private String id;
	private int page_no;
	

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 27, 2015 5:01:00 PM
	 * @version 
	 */
	public Annotation() {
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
	 * @date Apr 27, 2015 5:22:11 PM
	 * @version 
	 */
	public Annotation(String chapter, Book book, User author_user, int privacy,
			String abstract_photo, String summary, String content,
			int last_photo, int comments_count, boolean hasmath,
			String book_id, String time, String author_id, String id,
			int page_no) {
		super();
		this.chapter = chapter;
		this.book = book;
		this.author_user = author_user;
		this.privacy = privacy;
		this.abstract_photo = abstract_photo;
		this.summary = summary;
		this.content = content;
		this.last_photo = last_photo;
		this.comments_count = comments_count;
		this.hasmath = hasmath;
		this.book_id = book_id;
		this.time = time;
		this.author_id = author_id;
		this.id = id;
		this.page_no = page_no;
	}


	/**
	 * @return the chapter
	 */
	public String getChapter() {
		return chapter;
	}


	/**
	 * @param chapter the chapter to set
	 */
	public void setChapter(String chapter) {
		this.chapter = chapter;
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
	 * @return the author_user
	 */
	public User getAuthor_user() {
		return author_user;
	}


	/**
	 * @param author_user the author_user to set
	 */
	public void setAuthor_user(User author_user) {
		this.author_user = author_user;
	}


	/**
	 * @return the privacy
	 */
	public int getPrivacy() {
		return privacy;
	}


	/**
	 * @param privacy the privacy to set
	 */
	public void setPrivacy(int privacy) {
		this.privacy = privacy;
	}


	/**
	 * @return the abstract_photo
	 */
	public String getAbstract_photo() {
		return abstract_photo;
	}


	/**
	 * @param abstract_photo the abstract_photo to set
	 */
	public void setAbstract_photo(String abstract_photo) {
		this.abstract_photo = abstract_photo;
	}


	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}


	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
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
	 * @return the photos
	 */
	public Map<Integer, String> getPhotos() {
		return photos;
	}


	/**
	 * @param photos the photos to set
	 */
	public void setPhotos(Map<Integer, String> photos) {
		this.photos = photos;
	}


	/**
	 * @return the last_photo
	 */
	public int getLast_photo() {
		return last_photo;
	}


	/**
	 * @param last_photo the last_photo to set
	 */
	public void setLast_photo(int last_photo) {
		this.last_photo = last_photo;
	}


	/**
	 * @return the comments_count
	 */
	public int getComments_count() {
		return comments_count;
	}


	/**
	 * @param comments_count the comments_count to set
	 */
	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}


	/**
	 * @return the hasmath
	 */
	public boolean isHasmath() {
		return hasmath;
	}


	/**
	 * @param hasmath the hasmath to set
	 */
	public void setHasmath(boolean hasmath) {
		this.hasmath = hasmath;
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
	 * @return the time
	 */
	public String getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}


	/**
	 * @return the author_id
	 */
	public String getAuthor_id() {
		return author_id;
	}


	/**
	 * @param author_id the author_id to set
	 */
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the page_no
	 */
	public int getPage_no() {
		return page_no;
	}


	/**
	 * @param page_no the page_no to set
	 */
	public void setPage_no(int page_no) {
		this.page_no = page_no;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Annotation [chapter=" + chapter + ", book=" + book
				+ ", author_user=" + author_user + ", privacy=" + privacy
				+ ", abstract_photo=" + abstract_photo + ", summary=" + summary
				+ ", content=" + content + ", last_photo=" + last_photo
				+ ", comments_count=" + comments_count + ", hasmath=" + hasmath
				+ ", book_id=" + book_id + ", time=" + time + ", author_id="
				+ author_id + ", id=" + id + ", page_no=" + page_no + "]";
	}

}
