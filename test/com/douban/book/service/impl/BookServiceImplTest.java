/**
 * <p>Title: BookServiceImplTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 25, 2015
 * @version 
 */
package com.douban.book.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.douban.book.service.BookService;
import com.douban.model.entity.vo.Book;

/**
 * @author 马金健
 *
 */
public class BookServiceImplTest {
	
	private List<Book> books;
	private Book book;
	private BookService bookService;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service.impl</p>
	 * <p>Title: setUp</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:23:32 PM
	 * @version 
	 */
	@Before
	public void setUp() throws Exception {
		bookService = new BookServiceImpl();
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.BookServiceImpl#selectByQ(java.lang.String, int, int)}.
	 */
	@Test
	public void testSelectByQ() {
		books = bookService.selectByQ("新书", 0, 20);
		System.out.println(books);
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.BookServiceImpl#selectByTag(java.lang.String, int, int)}.
	 */
	@Test
	public void testSelectByTag() {
		books = bookService.selectByTag("解放军", 0, 20);
		System.out.println(books);
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.BookServiceImpl#selectById(java.lang.String)}.
	 */
	@Test
	public void testSelectById() {
		book = bookService.selectById("3646652");
		System.out.println(book);
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.BookServiceImpl#selectByIsbn(java.lang.String)}.
	 */
	@Test
	public void testSelectByIsbn() {
		book = bookService.selectByIsbn("7505715666");
		System.out.println(book);
		fail("Not yet implemented");
	}

}
