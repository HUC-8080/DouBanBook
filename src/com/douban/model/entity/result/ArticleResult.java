/**
 * <p>Title: ArticleResult.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Jun 1, 2015
 * @version 
 */
package com.douban.model.entity.result;

import java.util.List;

import com.douban.model.entity.po.Article;

/**
 * @author 马金健
 *
 */
public class ArticleResult {
	
	private String msg;
	private int code;
	private Article article;
	private List<Article> articles;
	

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 12:40:05 PM
	 * @version 
	 */
	public ArticleResult() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 1, 2015 12:45:42 PM
	 * @version 
	 */
	public ArticleResult(String msg, int code, Article article,
			List<Article> articles) {
		super();
		this.msg = msg;
		this.code = code;
		this.article = article;
		this.articles = articles;
	}


	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}


	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
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


	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}


	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}


	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}


	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArticleResult [msg=" + msg + ", code=" + code + ", article="
				+ article + ", articles=" + articles + "]";
	}

}
