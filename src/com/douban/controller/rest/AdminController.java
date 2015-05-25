/**
 * <p>Title: AdminController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 13, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.util.Date;
import java.util.logging.Logger;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.AdminBizImpl;
import com.douban.model.biz.impl.AdminLogBizImpl;
import com.douban.model.entity.po.Admin;
import com.douban.model.entity.po.AdminLog;
import com.douban.model.entity.result.AdminResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","admin"}))
public class AdminController extends ActionSupport implements
		ModelDriven<Object> {
	
	private String op;
	private String username;
	private String password;
	private Admin admin;
	private AdminLog adminLog;
	private AdminResult result;
	private AdminBizImpl adminBiz;
	private AdminLogBizImpl adminLogBiz;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 13, 2015 10:09:17 PM
	 * @version 
	 */
	public AdminController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adminBiz the adminBiz to set
	 */
	public void setAdminBiz(AdminBizImpl adminBiz) {
		this.adminBiz = adminBiz;
	}

	/**
	 * @param adminLogBiz the adminLogBiz to set
	 */
	public void setAdminLogBiz(AdminLogBizImpl adminLogBiz) {
		this.adminLogBiz = adminLogBiz;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return this.result != null ? this.result : null;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public HttpHeaders index(){
		if(op.equals("login")){
			this.admin = this.adminBiz.login(username, password);
			if(this.admin != null){
				this.result = new AdminResult("登录成功", 6000, this.admin);	//code=6000 登录失败
			}else{
				this.result = new AdminResult("登录失败", 6001, null);
			}
		}else if(op.equals("isLogin")){
			
		}else if(op.equals("deleteUser")){
			
		}
		return new DefaultHttpHeaders();
	}
	
	public HttpHeaders create(){
		Logger logger = Logger.getGlobal();
		if(op.equals("login")){
			this.admin = this.adminBiz.login(username, password);
			if(this.admin != null){
				this.adminLog = new AdminLog();
				this.adminLog.setAdminid(this.admin.getId());
				this.adminLog.setDate(new Date().toString());
				this.adminLog.setMsg("登录");
				this.adminLogBiz.addLog(this.adminLog);
				this.result = new AdminResult("登录成功", 6000, this.admin);	//code=6000 登录失败
				logger.info(this.result.toString());
				return new DefaultHttpHeaders("index");
			}else{
				this.result = new AdminResult("登录失败", 6001, null);
				logger.info(this.result.toString());
				return new DefaultHttpHeaders("login");
			}
		}
		return new DefaultHttpHeaders();
		
	}
}
