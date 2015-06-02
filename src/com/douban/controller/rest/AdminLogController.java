/**
 * <p>Title: AdminLogController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.AdminLogBizImpl;
import com.douban.model.entity.po.AdminLog;
import com.douban.model.entity.result.AdminLogResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","adminlog"}))
public class AdminLogController extends ActionSupport implements
		ModelDriven<Object> {

	private AdminLogResult result;
	
	private AdminLogBizImpl adminLogBiz;
	
	private String op;
	private long adminlogid;
	private List<AdminLog> adminLogs;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 4:07:51 PM
	 * @version 
	 */
	public AdminLogController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adminLogBiz the adminLogBiz to set
	 */
	public void setAdminLogBiz(AdminLogBizImpl adminLogBiz) {
		this.adminLogBiz = adminLogBiz;
	}

	/**
	 * @return the result
	 */
	public AdminLogResult getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(AdminLogResult result) {
		this.result = result;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}

	/**
	 * @return the adminlogid
	 */
	public long getAdminlogid() {
		return adminlogid;
	}

	/**
	 * @param adminlogid the adminlogid to set
	 */
	public void setAdminlogid(long adminlogid) {
		this.adminlogid = adminlogid;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return this.result != null ? this.result : null;
	}
	
	public HttpHeaders index(){
		//----------------------查询管理员日志----------------------
		if(op.equals("selectAdminLog")){
			this.adminLogs = this.adminLogBiz.findAll();
			this.result = new AdminLogResult("获取管理员日志成功", 9008, adminLogs);
		//----------------------删除管理员日志----------------------
		}else if(op.equals("deleteLog")){
			this.adminLogBiz.removeAdminLog(adminlogid);
			this.result = new AdminLogResult("删除管理员日志成功", 9009, null);
		}
		return new DefaultHttpHeaders();
	}

}
