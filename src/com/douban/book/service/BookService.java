/**
 * <p>Title: BookService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 24, 2015
 * @version 
 */
package com.douban.book.service;

import java.util.List;

import com.douban.model.entity.vo.Book;

/**
 * @author 马金健
 *
 */
public interface BookService {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectByQ</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Book></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:37:34 PM
	 * @version 
	 */
	public List<Book> selectByQ(final String q, final int start, final int count);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectByTag</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Book></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:37:38 PM
	 * @version 
	 */
	public List<Book> selectByTag(final String tag, final int start, final int count);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectById</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Book</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:37:43 PM
	 * @version 
	 */
	public Book selectById(final String id);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectByIsbn</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Book</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:37:48 PM
	 * @version 
	 */
	public Book selectByIsbn(final String isbn);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: getTotal</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 6, 2015 10:39:36 AM
	 * @version 
	 */
	public int getTotalByTag(final String tag);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: getTotalByQ</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 6, 2015 10:41:11 AM
	 * @version 
	 */
	public int getTotalByQ(final String q);
}
