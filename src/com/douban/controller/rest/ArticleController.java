/**
 * <p>Title: ArticleController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
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
import com.douban.model.biz.impl.CommunityBizImpl;
import com.douban.model.biz.impl.UserBizImpl;
import com.douban.model.entity.po.Article;
import com.douban.model.entity.result.ArticleResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","article"}))
public class ArticleController extends ActionSupport implements
		ModelDriven<Object> {
	
	private ArticleResult result;
	private List<Article> articles;
	private Article article;
	
	private ArticleBizImpl articleBiz;
	private CommunityBizImpl communityBiz;
	private UserBizImpl userBiz;
	
	private String op;
	private long articleid;
	private long communityid;
	private String content;
	private String name;
	

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 3:40:39 PM
	 * @version 
	 */
	public ArticleController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param articleBiz the articleBiz to set
	 */
	public void setArticleBiz(ArticleBizImpl articleBiz) {
		this.articleBiz = articleBiz;
	}

	/**
	 * @param communityBiz the communityBiz to set
	 */
	public void setCommunityBiz(CommunityBizImpl communityBiz) {
		this.communityBiz = communityBiz;
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
	 * @return the articleid
	 */
	public long getArticleid() {
		return articleid;
	}

	/**
	 * @param articleid the articleid to set
	 */
	public void setArticleid(long articleid) {
		this.articleid = articleid;
	}

	/**
	 * @return the communityid
	 */
	public long getCommunityid() {
		return communityid;
	}

	/**
	 * @param communityid the communityid to set
	 */
	public void setCommunityid(long communityid) {
		this.communityid = communityid;
	}

	public HttpHeaders index(){
		//-------------------------查询文章列表----------------------------
		if(this.op.equals("articleList")){
			this.articles = this.articleBiz.findAll();
			if(this.articles.size() != 0){
				this.result = new ArticleResult("查询文章列表成功", 8080, null, this.articles);	
			}else{
				this.result = new ArticleResult("尚无任何文章", 8090, null, null);
			}
		//--------------------------查询此圈子下有哪些文章-----------------
		}else if(op.equals("articleListByCommunityId")){
			this.articles = this.articleBiz.findByCommunityId(communityid);
			if(this.articles == null || this.articles.size() == 0){
				this.result = new ArticleResult("此圈子下尚无文章", 8082, null, null);
			}else{
				this.result = new ArticleResult("获取此圈子下文章列表成功", 8081, null, this.articles);
			}
		//-------------------------屏蔽文章--------------------------------
		}else if(op.equals("shield")){
			this.article = this.articleBiz.findById(articleid);
			this.article.setShield(true);
			this.articleBiz.shield(this.article);
			this.result = new ArticleResult("屏蔽此文章成功", 8061, null, null);
		//-------------------------删除文章--------------------------------
		}else if(op.equals("delete")){
			this.article = this.articleBiz.findById(articleid);
			this.articleBiz.remove(article);
			this.result = new ArticleResult("删除文章成功", 8062, null, null);
		//-------------------------解除屏蔽文章----------------------------
		}else if(op.equals("releaseshield")){
			this.article = this.articleBiz.findById(articleid);
			this.article.setShield(false);
			this.articleBiz.shield(article);
			this.result = new ArticleResult("解除屏蔽此文件", 8063, null, null);
		}else if(op.equals("selectArticleContent")){
			this.article = this.articleBiz.findById(articleid);
			if(this.article != null){
				this.result = new ArticleResult("查询文章内容成功", 8084, this.article, null);
			}else{
				this.result = new ArticleResult("不存在此文章", 8085, null, null);	
			}
		}
		return new DefaultHttpHeaders();
	}
	
	public HttpHeaders create(){
		if(op.equals("writearticle")){
			this.article = new Article();
			this.article.setCommunity(this.communityBiz.findById(communityid));
			this.article.setUser(this.userBiz.queryUserInfo(CookieUtil.getCookie(ServletActionContext.getRequest()).getUserid()));
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.article.setDate(format.format(date));
			this.article.setContent(content);
			this.article.setName(name);
			if(this.articleBiz.writeArticle(article)){
				return new DefaultHttpHeaders("writearticlesuccess");
			}
		}
		return new DefaultHttpHeaders();
	}

}
