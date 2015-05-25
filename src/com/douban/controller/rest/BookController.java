/**
 * <p>Title: BookController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 7, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.util.logging.Logger;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.book.service.impl.BookServiceImpl;
import com.douban.model.entity.vo.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","book/search"}))
public class BookController extends ActionSupport implements
		ModelDriven<Object> {
	
	private Book book;
	private String bookid;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 7, 2015 8:11:50 PM
	 * @version 
	 */
	public BookController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bookid
	 */
	public String getBookid() {
		return bookid;
	}

	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return book != null ? book : null;
	}
	

	public HttpHeaders index(){
		Logger logger = Logger.getGlobal();
		if(bookid != null){
			logger.info("index");
			logger.info("id:"+bookid);
			book = new BookServiceImpl().selectById(bookid);
		}
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	public HttpHeaders show(){
		Logger logger = Logger.getGlobal();
		if(bookid != null){
			logger.info("show");
			logger.info("id:"+bookid);
			book = new BookServiceImpl().selectById(bookid);
		}
		return new DefaultHttpHeaders("show");
	}

}
