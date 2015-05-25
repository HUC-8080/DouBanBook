/**
 * <p>Title: RankResult.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 12, 2015
 * @version 
 */
package com.douban.model.entity.result;

import java.util.List;

import com.douban.model.entity.vo.Rank;

/**
 * @author 马金健
 *
 */
public class RankResult {
	
	private String msg;
	private int code;
	private List<Rank> ranks;
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 12, 2015 6:33:50 PM
	 * @version 
	 */
	public RankResult() {
		super();
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
	 * @date May 12, 2015 6:33:55 PM
	 * @version 
	 */
	public RankResult(String msg, int code, List<Rank> ranks) {
		super();
		this.msg = msg;
		this.code = code;
		this.ranks = ranks;
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
	 * @return the ranks
	 */
	public List<Rank> getRanks() {
		return ranks;
	}
	/**
	 * @param ranks the ranks to set
	 */
	public void setRanks(List<Rank> ranks) {
		this.ranks = ranks;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RankResult [msg=" + msg + ", code=" + code + ", ranks=" + ranks
				+ "]";
	}

}
