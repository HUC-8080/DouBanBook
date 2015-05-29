/**
 * <p>Title: Community.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
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
public class Community implements Serializable{
	
	private long id;
	private String name;
	private String description;
	private String date;
//	private Set<User> users = new HashSet<User>();
	private Set<Article> articles = new HashSet<Article>();
	private User user = new User();
	private boolean verify;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 4:14:16 PM
	 * @version 
	 */
	public Community() {
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
	 * @date May 27, 2015 9:13:15 AM
	 * @version 
	 */
	public Community(long id, String name, String description, String date,
			Set<Article> articles, User user, boolean verify) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.articles = articles;
		this.user = user;
		this.verify = verify;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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

	/**
	 * @return the articles
	 */
	public Set<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the verify
	 */
	public boolean isVerify() {
		return verify;
	}

	/**
	 * @param verify the verify to set
	 */
	public void setVerify(boolean verify) {
		this.verify = verify;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Community [id=" + id + ", name=" + name + ", description="
				+ description + ", date=" + date + ", articles=" + articles
				+ ", user=" + user + ", verify=" + verify + "]";
	}

}
