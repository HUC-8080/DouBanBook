/**
 * <p>Title: images.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 22, 2015
 * @version 
 */
package com.douban.model.entity.vo;

/**
 * @author 马金健
 *
 */
public class Images {
	
	private String small;
	private String large;
	private String medium;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 22, 2015 4:13:32 PM
	 * @version 
	 */
	public Images() {
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
	 * @date Apr 22, 2015 4:14:50 PM
	 * @version 
	 */
	public Images(String small, String large, String medium) {
		super();
		this.small = small;
		this.large = large;
		this.medium = medium;
	}

	/**
	 * @return the small
	 */
	public String getSmall() {
		return small;
	}

	/**
	 * @param small the small to set
	 */
	public void setSmall(String small) {
		this.small = small;
	}

	/**
	 * @return the large
	 */
	public String getLarge() {
		return large;
	}

	/**
	 * @param large the large to set
	 */
	public void setLarge(String large) {
		this.large = large;
	}

	/**
	 * @return the medium
	 */
	public String getMedium() {
		return medium;
	}

	/**
	 * @param medium the medium to set
	 */
	public void setMedium(String medium) {
		this.medium = medium;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Images [small=" + small + ", large=" + large + ", medium="
				+ medium + "]";
	}

}
