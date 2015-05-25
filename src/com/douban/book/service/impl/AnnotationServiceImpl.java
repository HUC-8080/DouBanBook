/**
 * <p>Title: AnnotationService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 23, 2015
 * @version 
 */
package com.douban.book.service.impl;

import java.util.List;

import com.douban.book.service.AnnotationService;
import com.douban.common.util.HttpRequest;
import com.douban.common.util.json.JSONAnnotation;
import com.douban.model.entity.vo.Annotation;

/**
 * @author 马金健
 *
 */
public class AnnotationServiceImpl implements AnnotationService {
	
	private static final String URL = "https://api.douban.com/v2/book";
	private List<Annotation> annotations;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.service.book</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 23, 2015 10:51:02 PM
	 * @version 
	 */
	public AnnotationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.book.service.AnnotationService#selectAnnotationsWithBookId(java.lang.String)
	 */
	@Override
	public List<Annotation> selectAnnotationsWithBookId(String id) {
		// TODO Auto-generated method stub
		StringBuffer query = new StringBuffer(URL);
		query.append("/").append(id).append("/annotations");
		String result = HttpRequest.sendGet(query.toString(), null);
		annotations = JSONAnnotation.getAnnotations(result);
		return annotations;
	}

}
