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

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.CommunityBizImpl;
import com.douban.model.entity.po.Community;
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
	private String op;
	
	private CommunityBizImpl communityBiz;

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
	
	public HttpHeaders index(){
		if(op.equals("communityList")){
			this.communities = this.communityBiz.findAll();
			this.result = new CommunityResult("获取圈子列表成功", 8000, null, this.communities);
		}
		return new DefaultHttpHeaders();
	}

}
