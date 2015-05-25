/**
 * <p>Title: CollectionService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 24, 2015
 * @version 
 */
package com.douban.book.service;

import java.util.List;

import com.douban.model.entity.vo.Collection;


/**
 * @author 马金健
 *
 */
public interface CollectionService {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectUserCollections</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Collection></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 10:18:44 PM
	 * @version 
	 */
	public List<Collection> selectUserCollections(final String user_id, final int start, final int count);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.book.service</p>
	 * <p>Title: selectUserBookCollection</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Collection</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 10:19:20 PM
	 * @version 
	 */
	public Collection selectUserBookCollection(final String user_id);
}
