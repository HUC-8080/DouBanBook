/**
 * <p>Title: BookController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 30, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.book.service.impl.BookServiceImpl;
import com.douban.model.entity.result.BookResult;
import com.douban.model.entity.vo.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","books/search"}))
public class BooksController extends ActionSupport implements ModelDriven<Object> {

	private String op;
	private String ranks;
	private String bookids;
	private String id;
	private String tag;
	private String q;
	private int start;
	private int count;
	private int total;
	
	private Book book;
	private BookResult result;
	private List<Book> books;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 30, 2015 10:02:01 AM
	 * @version 
	 */
	public BooksController() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return (result != null ? result : book );
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
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
	 * @return the ranks
	 */
	public String getRanks() {
		return ranks;
	}

	/**
	 * @param ranks the ranks to set
	 */
	public void setRanks(String ranks) {
		this.ranks = ranks;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the bookids
	 */
	public String getBookids() {
		return bookids;
	}

	/**
	 * @param bookids the bookids to set
	 */
	public void setBookids(String bookids) {
		this.bookids = bookids;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * @return the q
	 */
	public String getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(String q) {
		this.q = q;
	}

	/**
	 * @return the start
	 */
	public int getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	public HttpHeaders show(){
		Logger logger = Logger.getGlobal();
		if(tag != null){
			try {
				tag = new String(tag.getBytes("iso-8859-1"),"UTF-8");
				logger.info("tag:"+tag);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			total = new BookServiceImpl().getTotalByTag(tag);
			start = this.getStart() != 0 ? this.getStart() : 0;
			count = this.getCount() != 0 ? this.getCount() : 10;
			books = new BookServiceImpl().selectByTag(tag, start, count);
			result = new BookResult(start, count, total, books);
		}
		if(q != null){
			try {
				q = new String(q.getBytes("iso-8859-1"),"UTF-8");
				logger.info("q:"+q);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			total = new BookServiceImpl().getTotalByQ(q);
			start = this.getStart() != 0 ? this.getStart() : 0;
			count = this.getCount() != 0 ? this.getCount() : 10;
			books = new BookServiceImpl().selectByQ(q, start, count);
			result = new BookResult(start, count, total, books);
		}
		if(op != null && op.equals("getRanks")){
			System.out.println(this.ranks);
			String[] bookids = this.ranks.split(",");
			this.books = new ArrayList<Book>();
			for (int i = 0; i < bookids.length; i++) {
				this.book = new BookServiceImpl().selectById(bookids[i]);
				this.books.add(book);
			}
			result = new BookResult(0, 10, books.size(), books);
		}
		if(op != null && op.equals("collectBooks")){
			String[] ids = this.bookids.split(",");
			this.books = new ArrayList<Book>();
			for (int i = 0; i < ids.length; i++) {
				this.book = new BookServiceImpl().selectById(ids[i]);
				this.books.add(book);
			}
			result = new BookResult(0, 10, books.size(), books);
		}
		return new DefaultHttpHeaders("show");
	}
	
	public HttpHeaders index(){
		Logger logger = Logger.getGlobal();
		if(tag != null){
			try {
				q = new String(q.getBytes("iso-8859-1"),"UTF-8");
				logger.info("q:"+q);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			total = new BookServiceImpl().getTotalByTag(tag);
			start = this.getStart() != 0 ? this.getStart() : 0;
			count = this.getCount() != 0 ? this.getCount() : 10;
			books = new BookServiceImpl().selectByTag(tag, start, count);
			result = new BookResult(start, count, total, books);
		}
		if(q != null){
			try {
				q = new String(q.getBytes("iso-8859-1"),"UTF-8");
				logger.info("q:"+q);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			total = new BookServiceImpl().getTotalByQ(q);
			start = this.getStart() != 0 ? this.getStart() : 0;
			count = this.getCount() != 0 ? this.getCount() : 10;
			books = new BookServiceImpl().selectByQ(q, start, count);
			result = new BookResult(start, count, total, books);
		}
		if(op != null && op.equals("getRanks")){
			String[] bookids = this.ranks.split(",");
			for (int i = 0; i < bookids.length; i++) {
				this.book = new BookServiceImpl().selectById(bookids[i]);
				this.books.add(book);
			}
			result = new BookResult(0, 10, books.size(), books);
		}
		return new DefaultHttpHeaders("index").disableCaching();
	}
}
