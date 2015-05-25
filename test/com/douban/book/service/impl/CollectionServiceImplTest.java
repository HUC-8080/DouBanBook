/**
 * <p>Title: CollectionServiceImplTest.java</p>
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

import com.douban.model.entity.vo.Collection;

/**
 * @author 马金健
 *
 */
public class CollectionServiceImplTest {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service.impl</p>
	 * <p>Title: setUp</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 10:26:15 PM
	 * @version 
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.CollectionServiceImpl#selectUserCollections(java.lang.String, int, int)}.
	 */
	@Test
	public void testSelectUserCollections() {
		List<Collection> collections = new CollectionServiceImpl().selectUserCollections("119606191", 0, 10);
		System.out.println(collections);
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.CollectionServiceImpl#selectUserBookCollection(java.lang.String)}.
	 */
	@Test
	public void testSelectUserBookCollection() {
		fail("Not yet implemented");
	}

}
