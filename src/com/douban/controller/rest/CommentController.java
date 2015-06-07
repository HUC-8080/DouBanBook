/**
 * <p>Title: CommentController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Jun 7, 2015
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
import com.douban.model.biz.impl.ArticleBizImpl;
import com.douban.model.biz.impl.CommentBizImpl;
import com.douban.model.biz.impl.UserBizImpl;
import com.douban.model.entity.po.Comment;
import com.douban.model.entity.po.Session;
import com.douban.model.entity.result.CommentResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","comment"}))
public class CommentController extends ActionSupport implements
		ModelDriven<Object> {
	
	private CommentResult result;
	private List<Comment> comments;
	private Comment comment;
	private CommentBizImpl commentBiz;
	private ArticleBizImpl articleBiz;
	private UserBizImpl userBiz;
	private String op;
	private int articleid;
	private String content;
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
	 * @date Jun 7, 2015 7:34:08 AM
	 * @version 
	 */
	public CommentController() {
		// TODO Auto-generated constructor stub
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
	 * @return the articleid
	 */
	public int getArticleid() {
		return articleid;
	}

	/**
	 * @param articleid the articleid to set
	 */
	public void setArticleid(int articleid) {
		this.articleid = articleid;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @param commentBiz the commentBiz to set
	 */
	public void setCommentBiz(CommentBizImpl commentBiz) {
		this.commentBiz = commentBiz;
	}

	/**
	 * @param userBiz the userBiz to set
	 */
	public void setUserBiz(UserBizImpl userBiz) {
		this.userBiz = userBiz;
	}

	/**
	 * @param articleBiz the articleBiz to set
	 */
	public void setArticleBiz(ArticleBizImpl articleBiz) {
		this.articleBiz = articleBiz;
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
		if(op.equals("selectArticleComment")){
			this.comments = this.commentBiz.findByArticleId(this.articleid);
			if(this.comments == null || this.comments.size() == 0){
				this.result = new CommentResult("此文章尚无任何评论", 10004, null, null);
			}else{
				this.result = new CommentResult("查询此文章评论列表成功", 10001, null, this.comments);
			}
		}else if(op.equals("")){
		
		}
		return new DefaultHttpHeaders();
	}
	
	public HttpHeaders create(){
		if(op.equals("publishComment")){
			this.comment = new Comment();
			this.comment.setArticle(this.articleBiz.findById(articleid));
			this.comment.setContent(content);
			
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.comment.setDate(format.format(date));
			this.session = CookieUtil.getCookie(ServletActionContext.getRequest());
			this.comment.setUser(this.userBiz.queryUserInfo(this.session.getUserid()));
			if(this.commentBiz.writeComment(this.comment)){
				return new DefaultHttpHeaders("publishcommentsuccess");
			}
		}
		return new DefaultHttpHeaders();
	}

}
