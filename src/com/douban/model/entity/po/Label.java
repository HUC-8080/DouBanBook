/**
 * <p>Title: Label.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 7, 2015
 * @version 
 */
package com.douban.model.entity.po;

import java.io.Serializable;
import java.util.Set;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class Label implements Serializable {
	
	private int id;
	private String name;
	private Label parent;
	private Set<Label> labels;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 7, 2015 8:34:08 AM
	 * @version 
	 */
	public Label() {
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
	 * @date May 7, 2015 10:33:52 AM
	 * @version 
	 */
	public Label(int id, String name, Label parent, Set<Label> labels) {
		super();
		this.id = id;
		this.name = name;
		this.parent = parent;
		this.labels = labels;
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
	 * @return the parent
	 */
	public Label getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Label parent) {
		this.parent = parent;
	}

	/**
	 * @return the labels
	 */
	public Set<Label> getLabels() {
		return labels;
	}

	/**
	 * @param labels the labels to set
	 */
	public void setLabels(Set<Label> labels) {
		this.labels = labels;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Label [id=" + id + ", name=" + name + ", parent=" + parent
				+ ", labels=" + labels + "]";
	}


}
