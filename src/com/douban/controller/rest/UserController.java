/**
 * <p>Title: UserController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 6, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.common.util.CookieUtil;
import com.douban.common.util.SessionUtil;
import com.douban.model.biz.impl.SessionBizImpl;
import com.douban.model.biz.impl.UserBizImpl;
import com.douban.model.entity.po.Session;
import com.douban.model.entity.po.User;
import com.douban.model.entity.result.UserResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","user"}))
public class UserController extends ActionSupport implements
		ModelDriven<Object> {

	private long userid;
	private String ids;
	
	//表单数据
	private String username;
	private String password;
	private String email;
	private String telephone;
	private String realname;
	private String sex;
	private String hobby;
	private String birth;
	private int validatecode;
	private int mode;
	
	private String repassword;
	private String newpassword;
	
	//具体操作
	private String op;
	
	//提示代码
	private int code;
	
	//好友部分
	private String friendid;
	private String friendids;
	
	private UserResult result;
	private User user;
	private List<User> users;
	private UserBizImpl userBiz; 
	private SessionBizImpl sessionBiz;
	
	private Session session;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 6, 2015 10:56:15 AM
	 * @version 
	 */
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userBiz the userBiz to set
	 */
	public void setUserBiz(UserBizImpl userBiz) {
		this.userBiz = userBiz;
	}

	/**
	 * @param sessionBiz the sessionBiz to set
	 */
	public void setSessionBiz(SessionBizImpl sessionBiz) {
		this.sessionBiz = sessionBiz;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the userid
	 */
	public long getUserid() {
		return userid;
	}

	/**
	 * @return the ids
	 */
	public String getIds() {
		return ids;
	}

	/**
	 * @param ids the ids to set
	 */
	public void setIds(String ids) {
		this.ids = ids;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(long userid) {
		this.userid = userid;
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
	 * @return the mode
	 */
	public int getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(int mode) {
		this.mode = mode;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the repassword
	 */
	public String getRepassword() {
		return repassword;
	}

	/**
	 * @param repassword the repassword to set
	 */
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	/**
	 * @return the newpassword
	 */
	public String getNewpassword() {
		return newpassword;
	}

	/**
	 * @param newpassword the newpassword to set
	 */
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	/**
	 * @return the tel
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the realname
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * @param realname the realname to set
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the hobby
	 */
	public String getHobby() {
		return hobby;
	}

	/**
	 * @param hobby the hobby to set
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * @return the validatecode
	 */
	public int getValidatecode() {
		return validatecode;
	}

	/**
	 * @param validatecode the validatecode to set
	 */
	public void setValidatecode(int validatecode) {
		this.validatecode = validatecode;
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
	 * @return the friendid
	 */
	public String getFriendid() {
		return friendid;
	}

	/**
	 * @param friendid the friendid to set
	 */
	public void setFriendid(String friendid) {
		this.friendid = friendid;
	}

	/**
	 * @return the friendids
	 */
	public String getFriendids() {
		return friendids;
	}

	/**
	 * @param friendids the friendids to set
	 */
	public void setFriendids(String friendids) {
		this.friendids = friendids;
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

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return result != null ? result : user;
	}
	
	/*
	 * GET请求
	 */
	public HttpHeaders index(){
		Logger logger = Logger.getGlobal();
		//-----------------------用户是否已经登陆-------------------------
		if(op.equals("isLogin")){
			Session session = CookieUtil.getCookie(ServletActionContext.getRequest());
			//存在user_cookie------查询Cookie
			if(session != null){
				session = this.sessionBiz.find(session);
				//用户已经登陆--------查询数据库存储的session表
				if(session != null){
					//查询用户信息
					user = this.userBiz.queryUserInfo(session.getUserid());
					this.user.setPassword("");
					result = new UserResult("此用户已经登录", 1000, user, null);	//此用户已经登录
					logger.info(user.getUsername());
				}else{
					result = new UserResult("此账号尚未登录", 1001, null, null);	//此用户尚未登录
					logger.info(result.getMsg());
				}
			}else{
				result = new UserResult("此账号尚未登录", 1001, null, null);	//此用户尚未登录
				logger.info(result.getMsg());
			}
			return new DefaultHttpHeaders("index").disableCaching();
		//-----------------------用户是否成功登陆-------------------------
		}else if(op.equals("validateLogin")){
			//2：判断登录是否成功
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			//用户之前登陆过
			if(this.session != null){
				this.session = this.sessionBiz.find(session);
				//用户登录未退出
				if(this.session != null){
					this.user = this.userBiz.queryUserInfo(this.session.getUserid());
					this.user.setPassword("");
					this.result = new UserResult("用户已经登陆", 1002, user, null);
				}else{
					this.result = new UserResult("用户尚未登陆", 1003, null, null);
				}
			}else{
				this.result = new UserResult("用户尚未登陆", 1003, null, null);
			}
		}/*else if(op.equals("validateRegister")){
			//3：判断注册是否成功 
			result = (UserResult) session.get("registerResult");
		//-----------------------获取用户列表-------------------------
		}*/else if(op.equals("selectAll")){
			this.users = this.userBiz.findAll();
			List<User> users2 = new ArrayList<User>();
			for(User user2 : this.users){
				user2.setPassword("");
				users2.add(user2);
			}
			result = new UserResult("获取用户列表成功", 1008, null, users2);
		//-----------------------删除用户-------------------------
		}else if(op.equals("deleteUser")){
			if(this.userBiz.removeByUserId(userid)){
				this.result = new UserResult("用户删除成功", 1009, null, null);
			}else{
				this.result = new UserResult("用户删除失败", 1010, null, null);
			}
		//-----------------------批量删除用户-------------------------
		}else if(op.equals("batch_delete")){
			String[] userids = this.ids.split(",");
			for (int i = 0; i < userids.length; i++) {
				this.userid = Long.parseLong(userids[i]);
				this.userBiz.removeByUserId(this.userid);
			}
			this.result = new UserResult("批量删除成功", 1011, null, null);
		//-----------------------禁言用户-------------------------
		}else if(op.equals("gag")){
			this.user = new User();
			this.user.setId(userid);	
			this.user.setIsgag(true);
			if(this.userBiz.modifyInfo(user)){
				this.result = new UserResult("禁言用户成功", 1012, null, null);
			}else{
				this.result = new UserResult("禁言用户失败", 1013, null, null);
			}
		//-----------------------查看用户信息-------------------------
		}else if(op.equals("userinfo")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.user = this.userBiz.queryUserInfo(this.session.getUserid());
			this.user.setPassword("");
			result = new UserResult("获取用户信息成功", 1014, user, null);
		//-----------------------获取用户好友列表-------------------------
		}else if(op.equals("friendsList")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.user = this.userBiz.queryUserInfo(this.session.getUserid());
			this.result = new UserResult("获取用户列表", 1015, this.user, null);
		//-----------------------用户退出-------------------------
		}else if(op.equals("logout")){
			Cookie cookie = CookieUtil.deleteCookie(ServletActionContext.getRequest());
			ServletActionContext.getResponse().addCookie(cookie);
			this.result = new UserResult("用户退出成功", 1016, null, null);
			return new DefaultHttpHeaders("logoutSuccess");
		//-----------------------验证用户名是否已经被注册-----------------
		}else if(op.equals("validateusername")){
			this.user = this.userBiz.queryInfo(username);
			if(this.user != null){
				this.result = new UserResult("此用户名已经被注册", 1020, null, null);
			}else{
				this.result = new UserResult("此用户名尚未被注册", 1023, null, null);
			}
		//-----------------------验证手机是否已经被注册-----------------
		}else if(op.equals("validatetelephone")){
			if(this.userBiz.telephoneIsRegistered(telephone)){
				this.result = new UserResult("此手机已经被注册", 1021, null, null);
			}else{
				this.result = new UserResult("此手机尚未被注册", 1022, null, null);
			}
		//-----------------------验证邮箱是否已经被注册-----------------	
		}else if(op.equals("validateemail")){
			if(this.userBiz.emailIsRegistered(email)){
				this.result = new UserResult("此邮箱已经被注册", 1024, null, null);
			}else{
				this.result = new UserResult("此邮箱尚未被注册", 1025, null, null);
			}
		//-----------------------验证注册表单合法性--------------------
		}else if(op.equals("validateForm")){
			
			this.result = new UserResult("表单合法，可以提交", 1030, null, null);
		}else if(op.equals("selectTelAndEmail")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.user = this.userBiz.queryUserInfo(this.session.getUserid());
			this.telephone = this.user.getTelephone();
			this.email = this.user.getEmail();
			this.user = new User();
			this.user.setTelephone(telephone);
			this.user.setEmail(email);
			this.result = new UserResult("获取邮箱和手机成功", 1031, this.user, null);
		//--------------------------安全邮箱设置密码--------------------------
		}else if(op.equals("setting_pass_email")){
			this.user = this.userBiz.queryUserInfo(userid);
			if(this.user != null && this.email.equals(this.user.getEmail())){
				return new DefaultHttpHeaders("email_setting_pass");
			}else{
				return new DefaultHttpHeaders();
			}
		}
		return null;
	}
	
	/*
	 * POST请求
	 */
	public HttpHeaders create(){
		Logger logger = Logger.getGlobal();
		//-----------------------用户登录-------------------------
		if(op.equals("login")){
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			boolean flag = userBiz.validate(user);
			if(flag){
				logger.info("登录成功");
				//查询userid
				user = userBiz.queryInfo(username);
				result = new UserResult("登录成功",1002, user, null);	//code=200 登录成功
				
				//--------------第一步：写入cookie
				//生成sessionid
				long sessionid = SessionUtil.getSessionId();
				//将userid与sessionid写入Cookie
				Cookie cookie = CookieUtil.addCookie(this.user.getId(), sessionid);
				ServletActionContext.getResponse().addCookie(cookie);
				
				//--------------第二部：写入数据库
				//将userid与sessionid写入数据库
				Session session = new Session();
				session.setSessionid(sessionid);
				session.setUserid(this.user.getId());
				if(this.sessionBiz.addSession(session)){
					result = new UserResult("写入session数据成功", 1008, null, null);
					logger.info(result.toString());
				}else{
					result = new UserResult("写入session数据失败", 1009, null, null);
					logger.info(result.toString());
				}
				return new DefaultHttpHeaders("loginSuccess");
			}else{
				logger.info("登录失败");
				result = new UserResult("账号密码错误", 1003, null, null);	//code=201 登录失败;
				return new DefaultHttpHeaders("loginFailed");
			}
		//-----------------------用户注册-------------------------
		}else if(op.equals("register")){
			//------------------检查表单合法性--------------------
			if(this.userBiz.queryInfo(username) != null){
				this.code = 1020;
				this.result = new UserResult("此用户名已经被注册", 1020, null, null);
				return new DefaultHttpHeaders("registerFailed");
			}
			if(this.userBiz.telephoneIsRegistered(telephone)){
				this.code = 1021;
				this.result = new UserResult("此手机已经被注册", 1021, null, null);
				return new DefaultHttpHeaders("registerFailed");
			}
			if(this.userBiz.emailIsRegistered(email)){
				this.code = 1024;
				this.result = new UserResult("此邮箱已经被注册", 1024, null, null);
				return new DefaultHttpHeaders("registerFailed");
			}
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			user.setTelephone(telephone);
			
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String regdate = format.format(date);
			user.setRegdate(regdate);
			
			boolean flag = userBiz.register(user);
			if(flag){
				logger.info("注册成功");
				this.user.setPassword("");
				result = new UserResult("注册成功", 1004, user, null);	//code=300  注册成功
				this.code = 1004;
				return new DefaultHttpHeaders("registerSuccess");
			}else{
				logger.info("注册失败");
				result = new UserResult("注册失败",1005, null, null);	//code=301	注册失败
				this.code = 1005;
				return new DefaultHttpHeaders("registerFailed");
			}
		//-----------------------设置用户信息-------------------------
		}else if(op.equals("userinfo")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.user = this.userBiz.queryUserInfo(this.session.getUserid());
			logger.info(this.user.toString());
			this.userid = this.user.getId();
			this.user.setUsername(username);
			this.user.setRealname(realname);
			this.user.setSex(sex);
			this.user.setBirth(birth);
			this.user.setHobby(hobby);
			this.user.setEmail(email);
			this.user.setTelephone(telephone);
			if(this.userBiz.modifyInfo(user)){
				result = new UserResult("修改用户信息成功", 1016, null, null);
				return new DefaultHttpHeaders("modifysuccess");
			}else{
				result = new UserResult("修改用户信息失败", 1017, null, null);
				return new DefaultHttpHeaders("modifyfailed");
			}
		//---------------------------完善用户信息-------------------------
		}else if(op.equals("perfect_userinfo")){
			this.user = new User();
			this.user.setUsername(username);
			this.user.setPassword(password);
			this.user.setTelephone(telephone);
			this.user.setEmail(email);
			this.user.setBirth(birth);
			this.user.setRegdate(new Date().toString());
			if(this.userBiz.register(this.user)){
				return new DefaultHttpHeaders("perfect_userinfo_success");	//code == 1018
			}else{
				return new DefaultHttpHeaders("perfect_userinfo_failed");   //code == 1019
			}
		//---------------------------完善用户信息-------------------------	
		}else if(op.equals("modify_pass")){
			this.user = this.userBiz.queryInfo(username);
			if(this.user.getPassword().equals(repassword)){
				this.user.setPassword(newpassword);
				if(this.userBiz.modifyInfo(user)){
					this.code = 1027;
					return new DefaultHttpHeaders("modify_pass_success");
				}
				return new DefaultHttpHeaders();
			}else{
				this.code = 1026;
				return new DefaultHttpHeaders("modify_pass_failed");
			}
		//---------------------------忘记密码设置密码------------------------
		}else if(op.equals("setting_pass")){
			this.user = this.userBiz.queryInfo(username);
			this.user.setUsername(username);
			this.user.setPassword(password);
			if(this.userBiz.modifyInfo(this.user)){
				this.code = 1040;
				return new DefaultHttpHeaders("setting_pass_success");
			}
		}
		
		return null;
	}
}
