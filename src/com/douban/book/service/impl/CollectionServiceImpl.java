/**
 * <p>Title: CollectionsService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 23, 2015
 * @version 
 */
package com.douban.book.service.impl;

import java.util.List;

import com.douban.book.service.CollectionService;
import com.douban.common.util.HttpRequest;
import com.douban.common.util.json.JSONCollection;
import com.douban.model.entity.vo.Collection;

/**
 * @author 马金健
 *
 */
public class CollectionServiceImpl implements CollectionService {

	private static final String URL = "https://api.douban.com/v2/book/user";
	private List<Collection> collections;
//	private Collection collection;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.service.book</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 23, 2015 10:50:45 PM
	 * @version 
	 */
	public CollectionServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.book.service.CollectionService#selectUserCollections(java.lang.String, int, int)
	 */
	@Override
	public List<Collection> selectUserCollections(String user_id, int start,
			int count) {
		// TODO Auto-generated method stub
		String query = URL+"/"+user_id+"/collections";
		String result = HttpRequest.sendGet(query, null);
		System.out.println(result);
		collections = JSONCollection.getCollections(result);
		return collections;
	}

	/* (non-Javadoc)
	 * @see com.douban.book.service.CollectionService#selectUserBookCollection(java.lang.String)
	 */
	@Override
	public Collection selectUserBookCollection(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
