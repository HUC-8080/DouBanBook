/**
 * <p>Title: CommonService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 23, 2015
 * @version 
 */
package com.douban.book.service.impl;

import java.util.List;

import com.douban.book.service.BookService;
import com.douban.common.util.DouBanConfig;
import com.douban.common.util.HttpRequest;
import com.douban.common.util.json.JSONBook;
import com.douban.model.entity.vo.Book;

/**
 * @author 马金健
 *
 */
public class BookServiceImpl implements BookService {
	
	private static final String URL = "https://api.douban.com/v2/book";
	private List<Book> books;
	private Book book;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.service.book.search</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 23, 2015 10:35:07 PM
	 * @version 
	 */
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Book> selectByQ(final String q, final int start, final int count){
		StringBuffer query = new StringBuffer("q="+q);
		if(start != 0){
			query.append("&start="+start);
		}
		if(count != 0){
			query.append("&count="+count);
		}
		query.append("&apikey="+DouBanConfig.API_KEY);
		String result = HttpRequest.sendGet(URL+"/search", query.toString());
		books = JSONBook.getBooks(result);
		return books;
	}
	
	@Override
	public List<Book> selectByTag(final String tag, final int start, final int count){
		StringBuffer query = new StringBuffer("tag="+tag);
		if(start != 0){
			query.append("&start="+start);
		}
		if(count != 0){
			query.append("&count="+count);
		}
		query.append("&apikey="+DouBanConfig.API_KEY);
		String result = HttpRequest.sendGet(URL+"/search", query.toString());
		books = JSONBook.getBooks(result);
		return books;
	}
	
	@Override
	public Book selectById(final String id){
		String result = HttpRequest.sendGet(URL+"/"+id,"&apikey="+DouBanConfig.API_KEY);
		book = JSONBook.getBook(result);
		return book;
	}
	
	@Override
	public Book selectByIsbn(final String isbn){
		String result = HttpRequest.sendGet(URL+"/isbn/"+isbn, "&apikey="+DouBanConfig.API_KEY);
		book = JSONBook.getBook(result);
		return book;
	}

	/* (non-Javadoc)
	 * @see com.douban.book.service.BookService#getTotal(java.lang.String)
	 */
	@Override
	public int getTotalByTag(String tag) {
		// TODO Auto-generated method stub
		StringBuffer query = new StringBuffer("tag="+tag);
		query.append("&apikey="+DouBanConfig.API_KEY);
		String result = HttpRequest.sendGet(URL+"/search", query.toString());
		int total = JSONBook.getTotal(result);
		return total;
	}

	/* (non-Javadoc)
	 * @see com.douban.book.service.BookService#getTotalByQ(java.lang.String)
	 */
	@Override
	public int getTotalByQ(String q) {
		// TODO Auto-generated method stub
		StringBuffer query = new StringBuffer("q="+q);
		query.append("&apikey="+DouBanConfig.API_KEY);
		String result = HttpRequest.sendGet(URL+"/search", query.toString());
		int total = JSONBook.getTotal(result);
		return total;
	}
}
