/**
 * <p>Title: User.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 26, 2015
 * @version 
 */
package com.douban.model.entity.vo;

/**
 * @author 马金健
 *
 */
public class User {
	
	private String loc_id;
	private String name;
	private String created;
	private boolean is_banned;
	private boolean is_suicide;
	private String loc_name;
	private String avatar;
	private String signature;
	private String uid;
	private String alt;
	private String desc;
	private String type;
	private String id;
	private String large_avatar;
	private String url;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 6:58:43 PM
	 * @version 
	 */
	public User() {
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
	 * @date Apr 26, 2015 7:02:02 PM
	 * @version 
	 */
	public User(String loc_id, String name, String created, boolean is_banned,
			boolean is_suicide, String loc_name, String avatar,
			String signature, String uid, String alt, String desc, String type,
			String id, String large_avatar, String url) {
		super();
		this.loc_id = loc_id;
		this.name = name;
		this.created = created;
		this.is_banned = is_banned;
		this.is_suicide = is_suicide;
		this.loc_name = loc_name;
		this.avatar = avatar;
		this.signature = signature;
		this.uid = uid;
		this.alt = alt;
		this.desc = desc;
		this.type = type;
		this.id = id;
		this.large_avatar = large_avatar;
		this.url = url;
	}

	/**
	 * @return the loc_id
	 */
	public String getLoc_id() {
		return loc_id;
	}

	/**
	 * @param loc_id the loc_id to set
	 */
	public void setLoc_id(String loc_id) {
		this.loc_id = loc_id;
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
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * @return the is_banned
	 */
	public boolean isIs_banned() {
		return is_banned;
	}

	/**
	 * @param is_banned the is_banned to set
	 */
	public void setIs_banned(boolean is_banned) {
		this.is_banned = is_banned;
	}

	/**
	 * @return the is_suicide
	 */
	public boolean isIs_suicide() {
		return is_suicide;
	}

	/**
	 * @param is_suicide the is_suicide to set
	 */
	public void setIs_suicide(boolean is_suicide) {
		this.is_suicide = is_suicide;
	}

	/**
	 * @return the loc_name
	 */
	public String getLoc_name() {
		return loc_name;
	}

	/**
	 * @param loc_name the loc_name to set
	 */
	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the alt
	 */
	public String getAlt() {
		return alt;
	}

	/**
	 * @param alt the alt to set
	 */
	public void setAlt(String alt) {
		this.alt = alt;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the large_avatar
	 */
	public String getLarge_avatar() {
		return large_avatar;
	}

	/**
	 * @param large_avatar the large_avatar to set
	 */
	public void setLarge_avatar(String large_avatar) {
		this.large_avatar = large_avatar;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [loc_id=" + loc_id + ", name=" + name + ", created="
				+ created + ", is_banned=" + is_banned + ", is_suicide="
				+ is_suicide + ", loc_name=" + loc_name + ", avatar=" + avatar
				+ ", signature=" + signature + ", uid=" + uid + ", alt=" + alt
				+ ", desc=" + desc + ", type=" + type + ", id=" + id
				+ ", large_avatar=" + large_avatar + ", url="+ url +"]";
	}

}
