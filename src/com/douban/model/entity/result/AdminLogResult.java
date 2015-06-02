/**
 * <p>Title: AdminLogResult.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.model.entity.result;

import java.util.List;

import com.douban.model.entity.po.AdminLog;

/**
 * @author 马金健
 *
 */
public class AdminLogResult {
	
	private String msg;
	private int code;
	private List<AdminLog> adminLogs;
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 4:34:51 PM
	 * @version 
	 */
	public AdminLogResult() {
		super();
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
	 * @date May 31, 2015 4:34:57 PM
	 * @version 
	 */
	public AdminLogResult(String msg, int code, List<AdminLog> adminLogs) {
		super();
		this.msg = msg;
		this.code = code;
		this.adminLogs = adminLogs;
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
	 * @return the adminLogs
	 */
	public List<AdminLog> getAdminLogs() {
		return adminLogs;
	}
	/**
	 * @param adminLogs the adminLogs to set
	 */
	public void setAdminLogs(List<AdminLog> adminLogs) {
		this.adminLogs = adminLogs;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AdminLogResult [msg=" + msg + ", code=" + code + ", adminLogs="
				+ adminLogs + "]";
	}
}
