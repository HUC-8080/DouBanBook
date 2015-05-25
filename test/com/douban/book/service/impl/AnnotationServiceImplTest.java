/**
 * <p>Title: AnnotationServiceImplTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 27, 2015
 * @version 
 */
package com.douban.book.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.douban.model.entity.vo.Annotation;

/**
 * @author 马金健
 *
 */
public class AnnotationServiceImplTest {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service.impl</p>
	 * <p>Title: setUp</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 27, 2015 5:59:22 PM
	 * @version 
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.douban.book.service.impl.AnnotationServiceImpl#selectAnnotationsWithBookId(java.lang.String)}.
	 */
	@SuppressWarnings("unused")
	@Test
	public void testSelectAnnotationsWithBookId() {
		List<Annotation> annotations = new AnnotationServiceImpl().selectAnnotationsWithBookId("26357269");
		fail("Not yet implemented");
	}

}
