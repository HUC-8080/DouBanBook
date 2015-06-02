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

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.ArticleBizImpl;
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
	
	private String op;
	private long articleid;
	

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

	public HttpHeaders index(){
		//-------------------------查询文章列表----------------------------
		if(this.op.equals("articleList")){
			this.articles = this.articleBiz.findAll();
			if(this.articles.size() != 0){
				this.result = new ArticleResult("查询文章列表成功", 8080, null, this.articles);	
			}else{
				this.result = new ArticleResult("尚无任何文章", 8090, null, null);
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
		}
		return new DefaultHttpHeaders();
	}

}
