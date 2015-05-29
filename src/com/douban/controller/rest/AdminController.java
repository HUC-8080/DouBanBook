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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.common.util.CookieUtil;
import com.douban.common.util.SessionUtil;
import com.douban.model.biz.impl.AdminBizImpl;
import com.douban.model.biz.impl.AdminLogBizImpl;
import com.douban.model.biz.impl.AdminSessionBizImpl;
import com.douban.model.entity.po.Admin;
import com.douban.model.entity.po.AdminLog;
import com.douban.model.entity.po.AdminSession;
import com.douban.model.entity.result.AdminResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","administrator"}))
public class AdminController extends ActionSupport implements
		ModelDriven<Object> {
	
	private String op;
	private String username;
	private String password;
	private int code;
	
	private Admin admin;
	private AdminLog adminLog;
	private AdminResult result;
	private AdminBizImpl adminBiz;
	private AdminSessionBizImpl adminSessionBiz;
	private AdminLogBizImpl adminLogBiz;
	private AdminSession session;

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

	/**
	 * @return the adminSessionBiz
	 */
	public AdminSessionBizImpl getAdminSessionBiz() {
		return adminSessionBiz;
	}

	/**
	 * @param adminSessionBiz the adminSessionBiz to set
	 */
	public void setAdminSessionBiz(AdminSessionBizImpl adminSessionBiz) {
		this.adminSessionBiz = adminSessionBiz;
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

	public HttpHeaders index(){
		//-----------------------判断管理员是否已经登陆---------------------------
		if(op.equals("isLogin")){
			this.session = CookieUtil.getAdminCookie(ServletActionContext.getRequest());
			if(this.session == null){
				this.result = new AdminResult("此用户尚未登陆", 6003, null);
			}else if(this.adminSessionBiz.find(this.session) != null){
				this.result = new AdminResult("此用户已经登陆", 6002, null);
			}else{
				this.result = new AdminResult("此用户尚未登陆", 6003, null);
			}
		}
		return new DefaultHttpHeaders();
	}
	
	public HttpHeaders create(){
		Logger logger = Logger.getGlobal();
		if(op.equals("login")){
			this.admin = this.adminBiz.login(username, password);
			if(this.admin != null){
				
				//----------------------管理员日志------------------------
				this.adminLog = new AdminLog();
				this.adminLog.setAdminId(this.admin.getId());
				
				Date date = new Date();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				this.adminLog.setDate(format.format(date));

				this.adminLog.setMsg("登录");
				this.adminLogBiz.addLog(this.adminLog);
				//----------------------管理员cookie----------------------
				long sessionid = SessionUtil.getSessionId();
				//第一步：写入cookie
				Cookie cookie = CookieUtil.addAdminCookie(this.admin.getId(), sessionid);
				ServletActionContext.getResponse().addCookie(cookie);
				//第二部：写入数据库
				this.session = new AdminSession();
				this.session.setAdminid(this.admin.getId());
				this.session.setSessionid(sessionid);
				this.adminSessionBiz.add(session);
				
				this.admin.setPassword("");
				this.result = new AdminResult("登录成功", 6000, this.admin);	//code=6000 登录失败
				this.code = 6000;
				logger.info(this.result.toString());
				return new DefaultHttpHeaders("adminLoginSuccess");
			}else{
				this.result = new AdminResult("登录失败", 6001, null);
				logger.info(this.result.toString());
				this.code = 6001;
				return new DefaultHttpHeaders("adminLoginFailed");
			}
		}
		return new DefaultHttpHeaders("eeee");
		
	}
}
