/**
 * <p>Title: CollectResult.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.entity.result;

import java.util.List;

import com.douban.model.entity.po.Collect;

/**
 * @author 马金健
 *
 */
public class CollectResult {
	
	private String msg;
	private int code;
	private Collect collect;
	private List<Collect> collects;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:48:27 AM
	 * @version 
	 */
	public CollectResult() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 18, 2015 4:57:32 PM
	 * @version 
	 */
	public CollectResult(String msg, int code, Collect collect,
			List<Collect> collects) {
		super();
		this.msg = msg;
		this.code = code;
		this.collect = collect;
		this.collects = collects;
	}



	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the collect
	 */
	public Collect getCollect() {
		return collect;
	}

	/**
	 * @param collect the collect to set
	 */
	public void setCollect(Collect collect) {
		this.collect = collect;
	}

	/**
	 * @return the collects
	 */
	public List<Collect> getCollects() {
		return collects;
	}

	/**
	 * @param collects the collects to set
	 */
	public void setCollects(List<Collect> collects) {
		this.collects = collects;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CollectResult [msg=" + msg + ", code=" + code + ", collect="
				+ collect + ", collects=" + collects + "]";
	}

}
