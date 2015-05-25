/**
 * <p>Title: AnnotationService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 24, 2015
 * @version 
 */
package com.douban.book.service;

import java.util.List;

import com.douban.model.entity.vo.Annotation;

/**
 * @author 马金健
 *
 */
public interface AnnotationService {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectAnnotationsWithBookId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Annotation></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 27, 2015 5:53:49 PM
	 * @version 
	 */
	public List<Annotation> selectAnnotationsWithBookId(final String id);
}
