/**
 * <p>Title: CommunityController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.common.util.CookieUtil;
import com.douban.common.util.IPAddress;
import com.douban.model.biz.impl.AdminBizImpl;
import com.douban.model.biz.impl.AdminLogBizImpl;
import com.douban.model.biz.impl.CommunityBizImpl;
import com.douban.model.biz.impl.CommunityUserBizImpl;
import com.douban.model.biz.impl.UserBizImpl;
import com.douban.model.entity.po.Admin;
import com.douban.model.entity.po.AdminLog;
import com.douban.model.entity.po.AdminSession;
import com.douban.model.entity.po.Community;
import com.douban.model.entity.po.CommunityUser;
import com.douban.model.entity.po.Session;
import com.douban.model.entity.result.CommunityResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","community"}))
public class CommunityController extends ActionSupport implements
		ModelDriven<Object> {
	
	private CommunityResult result;
	private List<Community> communities;
	private Community community;
	private CommunityUser communityUser;
	private AdminLog adminLog;
	private Admin admin;
	
	private String op;
	private long communityid;
	private long userid;
	private String username;
	private String name;
	private String description;
	
	private CommunityBizImpl communityBiz;
	private CommunityUserBizImpl communityUserBiz;
	private UserBizImpl userBiz;
	private AdminLogBizImpl adminLogBiz;
	private AdminBizImpl adminBiz;
	private Session session;
	private AdminSession adminSession;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 5:06:13 PM
	 * @version 
	 */
	public CommunityController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param communityBiz the communityBiz to set
	 */
	public void setCommunityBiz(CommunityBizImpl communityBiz) {
		this.communityBiz = communityBiz;
	}

	/**
	 * @param communityUserBiz the communityUserBiz to set
	 */
	public void setCommunityUserBiz(CommunityUserBizImpl communityUserBiz) {
		this.communityUserBiz = communityUserBiz;
	}

	/**
	 * @param userBiz the userBiz to set
	 */
	public void setUserBiz(UserBizImpl userBiz) {
		this.userBiz = userBiz;
	}

	/**
	 * @param adminLogBiz the adminLogBiz to set
	 */
	public void setAdminLogBiz(AdminLogBizImpl adminLogBiz) {
		this.adminLogBiz = adminLogBiz;
	}

	/**
	 * @param adminBiz the adminBiz to set
	 */
	public void setAdminBiz(AdminBizImpl adminBiz) {
		this.adminBiz = adminBiz;
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
	 * @return the id
	 */
	public long getCommunityid() {
		return communityid;
	}

	/**
	 * @param id the id to set
	 */
	public void setCommunityid(long communityid) {
		this.communityid = communityid;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public HttpHeaders index(){
		//-------------------获取圈子列表----------------------------
		if(op.equals("communityList")){
			this.communities = this.communityBiz.findAll();
			this.result = new CommunityResult("获取圈子列表成功", 8000, null, this.communities);
		//-------------------加入圈子--------------------------------
		}else if(op.equals("joinCommunity")){
			this.communityUser = new CommunityUser();
			this.communityUser.setCommunityid(this.communityid);
			this.communityUser.setUserid(userid);
			if(this.communityUserBiz.add(communityUser)){
				this.result = new CommunityResult("加入圈子成功", 8001, null, null);
			}
		//-------------------圈子审核--------------------------------
		}else if(op.equals("check")){
			//圈子审核操作
			this.community = this.communityBiz.findById(communityid);
			this.community.setVerify(true);
			this.communityBiz.check(community);
			
			//写入管理员日志
			this.adminLog = new AdminLog();
			this.adminSession = CookieUtil.getAdminCookie(ServletActionContext.getRequest());
			this.admin = this.adminBiz.queryInfo(this.adminSession.getAdminid());
			this.adminLog.setAdmin(this.admin);
			this.adminLog.setMsg("审核圈子名为"+this.community.getName()+"的圈子");
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			this.adminLog.setDate(format.format(date));
			this.adminLog.setIp(IPAddress.getIpAddr(ServletActionContext.getRequest()));
			this.adminLogBiz.addLog(adminLog);

			this.result = new CommunityResult("圈子审核成功", 8090, null, null);
		//-------------------判断用户是否加入了这个圈子--------------
		}else if(op.equals("userIsJoinThisCommunity")){
			this.communityUser = new CommunityUser();
			this.communityUser.setCommunityid(communityid);
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			if(this.session != null){
				this.communityUser.setUserid(this.session.getUserid());
				if(this.communityUserBiz.userIsJoinedThisCommunity(communityUser)){
					this.result = new CommunityResult("用户已经加入这个圈子", 8002, null, null);
				}else{
					this.result = new CommunityResult("用户尚未加入这个圈子", 8003, null, null);
				}
			}else{
				this.result = new CommunityResult("用户尚未加入这个圈子", 8003, null, null);
			}
		//---------------------这个圈子名称是否已经被使用了----------
		}else if(op.equals("communityNameIsUsed")){
			if(this.communityBiz.communitynameIsUsed(name)){
				this.result = new CommunityResult("这个圈子名称尚未被使用", 8004, null, null);
			}else{
				this.result = new CommunityResult("这个圈子名称已经被使用", 8005, null, null);
			}
		//---------------------退出圈子------------------------------
		}else if(op.equals("quitCommunity")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.communityUser = new CommunityUser();
			this.communityUser.setCommunityid(this.communityid);
			this.communityUser.setUserid(this.session.getUserid());
			this.communityUser = this.communityUserBiz.selectByCommunityIdWithUserId(communityUser);
			this.communityUserBiz.quitCommunity(communityUser);
			this.result = new CommunityResult("退出圈子成功", 8006, null, null);
		//------------------我加入的圈子列表------------------------
		}else if(op.equals("mycommunities")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			if(this.communityUserBiz.myCommunities(this.session.getUserid()) == null){
				this.result = new CommunityResult("你还未加入任何圈子", 8008, null, null);
			}else{
				this.communities = this.communityBiz.selectMyCommunities(this.communityUserBiz.myCommunities(this.session.getUserid()));
				this.result = new CommunityResult("查找我的圈子成功", 8007, null, this.communities);
			}
		//-------------------删除圈子-------------------------------
		}else if(op.equals("deleteCommunity")){
			this.community = this.communityBiz.findById(communityid);
			this.communityBiz.quitCommunity(community);
			
			//写入管理员日志
			this.adminLog = new AdminLog();
			this.adminSession = CookieUtil.getAdminCookie(ServletActionContext.getRequest());
			this.admin = this.adminBiz.queryInfo(this.adminSession.getAdminid());
			this.adminLog.setAdmin(this.admin);
			this.adminLog.setMsg("删除圈子名为"+this.community.getName()+"的圈子");
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			this.adminLog.setDate(format.format(date));
			this.adminLog.setIp(IPAddress.getIpAddr(ServletActionContext.getRequest()));
			this.adminLogBiz.addLog(adminLog);
			
			this.result = new CommunityResult("删除圈子成功", 8009, null, null);
		}else if(op.equals("queryCommunityName")){
			this.community = this.communityBiz.findById(communityid);
			this.result = new CommunityResult("查询圈子名成功", 8061, this.community, null);
		}
		return new DefaultHttpHeaders();
	}

	public HttpHeaders create(){
		//-------------------创建圈子--------------------------------
		if(op.equals("createcommunity")){
			this.community = new Community();
			this.community.setName(name);
			this.community.setDescription(description);
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.community.setDate(format.format(date));
			this.community.setUser(this.userBiz.queryInfo(username));
			this.communityBiz.add(community);
			
			return new DefaultHttpHeaders("createCommunitySuccess");
		}
		return new DefaultHttpHeaders(); 
	}
}
