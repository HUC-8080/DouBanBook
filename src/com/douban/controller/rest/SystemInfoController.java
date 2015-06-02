/**
 * <p>Title: SystemInfoController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.controller.rest;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.ArticleBizImpl;
import com.douban.model.biz.impl.CommentBizImpl;
import com.douban.model.biz.impl.CommunityBizImpl;
import com.douban.model.biz.impl.UserBizImpl;
import com.douban.model.entity.result.SystemInfoResult;
import com.douban.model.entity.vo.SystemInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","systeminfo"}))
public class SystemInfoController extends ActionSupport implements ModelDriven<Object> {

	private SystemInfoResult result;
	private SystemInfo info;
	private UserBizImpl userBiz;
	private CommunityBizImpl communityBiz;
	private ArticleBizImpl articleBiz;
	private CommentBizImpl commentBiz;
	
	private String op;
	
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
	 * @param userBiz the userBiz to set
	 */
	public void setUserBiz(UserBizImpl userBiz) {
		this.userBiz = userBiz;
	}

	/**
	 * @param communityBiz the communityBiz to set
	 */
	public void setCommunityBiz(CommunityBizImpl communityBiz) {
		this.communityBiz = communityBiz;
	}

	/**
	 * @param articleBiz the articleBiz to set
	 */
	public void setArticleBiz(ArticleBizImpl articleBiz) {
		this.articleBiz = articleBiz;
	}

	/**
	 * @param commentBiz the commentBiz to set
	 */
	public void setCommentBiz(CommentBizImpl commentBiz) {
		this.commentBiz = commentBiz;
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 1:36:10 PM
	 * @version 
	 */
	public SystemInfoController() {
		// TODO Auto-generated constructor stub
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
		if(op.equals("sysinfo")){
			int userCount = this.userBiz.userCount();
			int communityCount = this.communityBiz.communityCount();
			int commentCount = this.commentBiz.commentCount();
			int articleCount = this.articleBiz.articleCount();
			this.info = new SystemInfo();
			this.info.setUserCount(userCount);
			this.info.setCommunityCount(communityCount);
			this.info.setCommentCount(commentCount);
			this.info.setArticleCount(articleCount);
			this.result = new SystemInfoResult("获取系统统计信息成功", 9000, info);
		}
		return new DefaultHttpHeaders();
	}

}
