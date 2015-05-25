/**
 * <p>Title: FriendController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 19, 2015
 * @version 
 */
package com.douban.controller.rest;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.FriendBizImpl;
import com.douban.model.entity.po.Friend;
import com.douban.model.entity.result.FriendResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","friend"}))
public class FriendController extends ActionSupport implements
		ModelDriven<Object> {

	private Friend friend;
	private FriendBizImpl friendBiz;
	private FriendResult result;
	private String op;
	private String id;
	private String ids;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 3:17:39 PM
	 * @version 
	 */
	public FriendController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param friendBiz the friendBiz to set
	 */
	public void setFriendBiz(FriendBizImpl friendBiz) {
		this.friendBiz = friendBiz;
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
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return this.result != null ? this.result : null;
	}
	
	public HttpHeaders index(){
		if(op.equals("removeFriend")){
			this.friend = this.friendBiz.findByFriendid(Long.parseLong(id));
			if(this.friendBiz.removeFriend(friend)){
				this.result = new FriendResult("删除好友成功", 6000);
			}else{
				this.result = new FriendResult("删除好友失败", 6001);
			}
		}else if(op.equals("removeFriends")){
			String[] idArr = this.ids.split(",");
			for(int i=0;i<idArr.length;i++){
				this.friend = this.friendBiz.findByFriendid(Long.parseLong(idArr[i]));
				this.friendBiz.removeFriend(friend);
			}
			this.result = new FriendResult("批量删除成功", 6002);
		}
		return new DefaultHttpHeaders();
	}

}
