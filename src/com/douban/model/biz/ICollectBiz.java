/**
 * <p>Title: ICollectBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.Collect;
import com.douban.model.entity.vo.Rank;

/**
 * @author 马金健
 *
 */
public interface ICollectBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findRank</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Collect></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 12, 2015 5:17:50 PM
	 * @version 
	 */
	public List<Rank> findRank();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Collect></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:32:20 AM
	 * @version 
	 */
	public List<Collect> findAll(final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findByBookIdWithUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Collect</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 9, 2015 5:11:49 PM
	 * @version 
	 */
	public Collect findByBookIdWithUserId(final long bookid, final long userid);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: isCollect</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:46:39 AM
	 * @version 
	 */
	public boolean isCollect(final Collect collect);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: add</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:32:47 AM
	 * @version 
	 */
	public boolean add(final Collect collect);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: remove</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:33:08 AM
	 * @version 
	 */
	public boolean remove(final Collect collect);
}
