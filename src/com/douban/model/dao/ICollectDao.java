/**
 * <p>Title: ICollectDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.Collect;

/**
 * @author 马金健
 *
 */
public interface ICollectDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectRank</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Collect></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 12, 2015 5:15:55 PM
	 * @version 
	 */
	public List<Collect> selectRank();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Collect></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:25:21 AM
	 * @version 
	 */
	public List<Collect> selectAll(final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: isCollect</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:43:16 AM
	 * @version 
	 */
	public int isCollect(final Collect collect);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectByBookIdWithUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Collect</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 9, 2015 5:09:18 PM
	 * @version 
	 */
	public Collect selectByBookIdWithUserId(final long bookid, final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:26:09 AM
	 * @version 
	 */
	public int insert(final Collect collect);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: delete</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:26:30 AM
	 * @version 
	 */
	public int delete(final Collect collect);
}
