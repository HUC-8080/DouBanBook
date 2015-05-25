/**
 * <p>Title: UserServiceImplTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 26, 2015
 * @version 
 */
package com.douban.book.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.douban.model.entity.vo.User;

/**
 * @author 马金健
 *
 */
public class UserServiceImplTest {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service.impl</p>
	 * <p>Title: setUp</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 26, 2015 7:15:39 PM
	 * @version 
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.UserServiceImpl#selectUserInfo(java.lang.String)}.
	 */
	@Test
	public void testSelectUserInfo() {
		User user = new UserServiceImpl().selectUserInfo("119606191");
		System.out.println(user);
		fail("Not yet implemented");
	}

}
