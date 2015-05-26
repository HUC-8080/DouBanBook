/**
 * <p>Title: BindingController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 20, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.common.util.CookieUtil;
import com.douban.common.util.StringUtil;
import com.douban.common.validator.MailValidator;
import com.douban.common.validator.PhoneValidator;
import com.douban.model.biz.impl.BindingBizImpl;
import com.douban.model.biz.impl.UserBizImpl;
import com.douban.model.entity.po.Binding;
import com.douban.model.entity.po.Session;
import com.douban.model.entity.po.User;
import com.douban.model.entity.result.BindingResult;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","binding"}))
public class BindingController extends ActionSupport implements
		ModelDriven<Object> {
	
	private BindingResult result;
	private Binding binding;
	private User user;
	private BindingBizImpl bindingBiz;
	private UserBizImpl userBiz;

	private String op;
	private String telephone;
	private String email;
	private int validatecode;
	private int code;
	private String email_host;
	private long userid;
	private int mode;
	private String username;
	
	private Session session;
	private Logger logger;
	@SuppressWarnings("rawtypes")
	private Map session2;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:23:39 AM
	 * @version 
	 */
	public BindingController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	 * @param bindingBiz the bindingBiz to set
	 */
	public void setBindingBiz(BindingBizImpl bindingBiz) {
		this.bindingBiz = bindingBiz;
	}

	/**
	 * @param userBiz the userBiz to set
	 */
	public void setUserBiz(UserBizImpl userBiz) {
		this.userBiz = userBiz;
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
	 * @return the userid
	 */
	public long getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(long userid) {
		this.userid = userid;
	}

	/**
	 * @return the email_host
	 */
	public String getEmail_host() {
		return email_host;
	}

	/**
	 * @param email_host the email_host to set
	 */
	public void setEmail_host(String email_host) {
		this.email_host = email_host;
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
		this.logger = Logger.getGlobal();
		this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
		if(op.equals("isBinding")){
			this.binding = this.bindingBiz.findByUserId(this.session.getUserid());
			if(this.binding != null){
				this.result = new BindingResult("查找绑定信息成功", 7001, this.binding);
				this.logger.info(this.result.toString());
			}else{
				this.result = new BindingResult("尚未绑定任何信息", 7006, null);
				this.logger.info(this.result.toString());
			}
		}else if(op.equals("bindingTel")){
			this.binding = this.bindingBiz.findByUserId(this.session.getUserid());
			this.binding.setTelephone(telephone);
			if(this.bindingBiz.addBindTel(this.binding)){
				this.result = new BindingResult("绑定手机成功", 7002, this.binding);
			}else{
				this.result = new BindingResult("绑定手机失败", 7003, this.binding);
			}
		}else if(op.equals("bindingEmail")){
			this.binding = this.bindingBiz.findByUserId(this.session.getUserid());
			this.binding.setEmail(email);
			if(this.bindingBiz.addBindTel(this.binding)){
				this.result = new BindingResult("绑定邮箱成功", 7004, this.binding);
			}else{
				this.result = new BindingResult("绑定邮箱失败", 7005, this.binding);
			}
		//------------------------邮箱激活------------------------------
		}else if(op.equals("email_activated")){
			this.session2 = ActionContext.getContext().getSession();
			String email_activated = (String) this.session2.get("email_activated");
			String[] activated = email_activated.split("#");
			this.userid = Long.parseLong(activated[0]);
			this.email = activated[1];
			this.binding = new Binding();
			this.binding.setEmail(this.email);
			this.binding.setUserid(this.userid);
			this.bindingBiz.addBindEmail(binding);
			this.code = 7012;
			return new DefaultHttpHeaders("bindingEmailSuccess");
		}
		return new DefaultHttpHeaders();
	}
	
	@SuppressWarnings("unchecked")
	public HttpHeaders create(){
		//-----------------------手机验证码-------------------------
		if(op.equals("phone_validate_code")){
			try {
				int validateCode = PhoneValidator.send(telephone);
				if(validateCode != 0){
					this.session2 = ActionContext.getContext().getSession();
					this.session2.put("validateCode", validateCode);
				}
				return new DefaultHttpHeaders();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//---------------------提交手机验证表单--------------------
		}else if(op.equals("phone_activation")){
			this.session2 = ActionContext.getContext().getSession();
			int validateCode = (int) this.session2.get("validateCode");
			this.session2.remove("validateCode");
			if(this.validatecode != validateCode){
				this.code = 7009;
				return new DefaultHttpHeaders("phone_validate_code_wrong");
			}else{
				this.binding = new Binding();
				
				this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
				this.binding.setUserid(this.session.getUserid());
				this.binding.setTelephone(telephone);
				this.bindingBiz.addBindTel(binding);
				this.code = 7010;
				return new DefaultHttpHeaders("phone_validate_code_success");
			}
		//-----------------------邮箱验证-------------------------
		}else if(op.equals("mail_activation")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.user = this.userBiz.queryUserInfo(this.session.getUserid());
			String email_activated = this.user.getId() + "#" + this.email ;
			this.session2 = ActionContext.getContext().getSession();
			this.session2.put("email_activated", email_activated);
			MailValidator.mailActivationContent(this.user.getId(), this.user.getUsername(), email);
			this.email = StringUtil.replaceSubStringWithEmail(email);
			this.email_host = StringUtil.getMailHost(email);
			this.code = 7011;
			return new DefaultHttpHeaders("mail_send_success");
		//------------------------忘记密码-----------------------------
		}else if(op.equals("forget_pass")){
			//通过手机找回密码
			if(this.mode == 0){
				this.user = this.userBiz.queryInfo(username);
				if(this.user != null){
					this.binding = this.bindingBiz.findByUserId(this.user.getId());
					if(this.binding.getTelephone().equals(this.telephone)){
						this.session2 = ActionContext.getContext().getSession();
						int validateCode = (int) this.session2.get("validateCode");
						if(this.validatecode != validateCode){
							this.code = 7012;
							return new DefaultHttpHeaders("forget_pass_valdatecode_error");
						}else{
							this.code = 7013;
							return new DefaultHttpHeaders("forget_pass_success");
						}
					}else{
						this.code = 7014;
						return new DefaultHttpHeaders("forget_pass_telephone_error");
					}
				}else{
					this.code = 7015;
					return new DefaultHttpHeaders("forget_pass_username_error");
				}
				
			//通过邮箱找回密码
			}else if(this.mode == 1){
				this.user = this.userBiz.queryInfo(username);
				if(this.user != null){
					if(this.email.equals(this.user.getEmail())){
						MailValidator.mailModifyPassContent(this.user.getId(), this.username, this.email);
						return new DefaultHttpHeaders("forget_pass_success");
					}else{
						this.code = 7016;
						return new DefaultHttpHeaders("forget_pass_mail_error");
					}
				}else{
					this.code = 7015;
					return new DefaultHttpHeaders("forget_pass_username_error");
				}
			}
		}
		return null;
	}
}
