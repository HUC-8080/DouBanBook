/**
 * <p>Title: Advert.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 11, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class Advert implements Serializable {
	
	private int id;
	private boolean isShow;
	private String url;
	private String path;
	private String location;
	private String showPage;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 11, 2015 8:46:40 PM
	 * @version 
	 */
	public Advert() {
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
	 * @date May 11, 2015 8:55:05 PM
	 * @version 
	 */
	public Advert(int id, boolean isShow, String url, String path,
			String location, String showPage) {
		super();
		this.id = id;
		this.isShow = isShow;
		this.url = url;
		this.path = path;
		this.location = location;
		this.showPage = showPage;
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
	 * @return the isShow
	 */
	public boolean isShow() {
		return isShow;
	}

	/**
	 * @param isShow the isShow to set
	 */
	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the showPage
	 */
	public String getShowPage() {
		return showPage;
	}

	/**
	 * @param showPage the showPage to set
	 */
	public void setShowPage(String showPage) {
		this.showPage = showPage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Advert [id=" + id + ", isShow=" + isShow + ", url=" + url
				+ ", path=" + path + ", location=" + location + ", showPage="
				+ showPage + "]";
	}

}
