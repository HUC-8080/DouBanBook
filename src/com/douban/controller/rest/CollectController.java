/**
 * <p>Title: CollectController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.util.List;
import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.common.util.CookieUtil;
import com.douban.model.biz.impl.CollectBizImpl;
import com.douban.model.entity.po.Collect;
import com.douban.model.entity.po.Session;
import com.douban.model.entity.result.CollectResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","collect"}))
public class CollectController extends ActionSupport implements
		ModelDriven<Object> {
	
	private CollectResult result;
	private Collect collect;
	private Session session;
	private List<Collect> collects;
	private String op;
	private String ids;
	private int bookid;
	private CollectBizImpl collectBiz;
	
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:38:15 AM
	 * @version 
	 */
	public CollectController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param collectBiz the collectBiz to set
	 */
	public void setCollectBiz(CollectBizImpl collectBiz) {
		this.collectBiz = collectBiz;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return result != null ? result : collect;
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
	 * @return the bookid
	 */
	public int getBookid() {
		return bookid;
	}

	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(int bookid) {
		this.bookid = bookid;
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
	/*
	 * GET请求
	 */
	public HttpHeaders index(){
		Logger logger = Logger.getGlobal();
		logger.info("bookid:"+bookid);
		//-----------------------用户是否已经收藏这本书-------------------------
		if(op.equals("isCollect")){
			collect = new Collect();
			collect.setBookid(bookid);
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			collect.setUserid(this.session.getUserid());
			if(collectBiz.isCollect(collect)){
				result = new CollectResult("此书已被收藏", 3000, collect, null);	//code=4000 已收藏
			}else{
				result = new CollectResult("此书未被收藏", 3001, null, null);				//code=4001 未收藏
			}
		//-----------------------收藏这本书-------------------------
		}else if(op.equals("collect")){
			collect = new Collect();
			collect.setBookid(bookid);
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			collect.setUserid(this.session.getUserid());
			if(collectBiz.add(collect)){
				result = new CollectResult();
				result.setMsg("收藏成功");
				result.setCode(3002);
				result.setCollect(collect);
				logger.info(result.toString());
				logger.info("code:"+3002+"-msg:收藏成功");
			}else{
				result = new CollectResult();
				result.setMsg("收藏失败");
				result.setCode(3003);
				result.setCollect(collect);
				logger.info("code:"+3003+"-msg:收藏失败");
			}
		//-----------------------用户取消收藏这本书-------------------------
		}else if(op.equals("cancelcollect")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			collect = collectBiz.findByBookIdWithUserId(bookid, this.session.getUserid());
			if(collectBiz.remove(collect)){
				result = new CollectResult("取消收藏成功", 3004, collect, null);
				logger.info(result.toString());
			}else{
				result = new CollectResult("取消收藏失败", 3005, collect, null);
				logger.info(result.toString());
			}
		//-----------------------获取用户收藏列表-------------------------
		}else if(op.equals("collectList")){
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.collects = this.collectBiz.findAll(this.session.getUserid());
			if(this.collects != null || this.collects.size() != 0){
				result = new CollectResult("获取用户收藏列表成功", 3006, null, collects);
			}else{
				result = new CollectResult("此用户还没有收藏任何书籍", 3007, null, null);
			}
		//-----------------------批量删除收藏信息-------------------------
		}else if(op.equals("batch_delete")){
			String[] collectIds = this.ids.split(",");
			for(int i=0;i<collectIds.length;i++){
				this.collect = new Collect();
				this.collect.setId(Integer.parseInt(collectIds[i]));
				if(this.collectBiz.remove(collect)){
					logger.info("取消收藏成功");
				}else{
					logger.info("取消收藏成功");
				}
			}
			result = new CollectResult("批量取消收藏成功", 3008, null, null);
		}
		return new DefaultHttpHeaders("");
	}
	
	public HttpHeaders create(){
		Logger logger = Logger.getGlobal();
		logger.info("收藏图书");
		logger.info("bookid:"+bookid);
		//-----------------------用户收藏这本书-------------------------
		if(op.equals("collect")){
			collect = new Collect();
			collect.setBookid(bookid);
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			collect.setUserid(this.session.getUserid());
			if(collectBiz.add(collect)){
				result = new CollectResult();
				result.setMsg("收藏成功");
				result.setCode(3002);
				result.setCollect(collect);
				logger.info(result.toString());
				logger.info("code:"+3002+"-msg:收藏成功");
			}else{
				result = new CollectResult();
				result.setMsg("收藏失败");
				result.setCode(3003);
				result.setCollect(collect);
				logger.info("code:"+3003+"-msg:收藏失败");
			}
		}
		return new DefaultHttpHeaders("");
	}
}
