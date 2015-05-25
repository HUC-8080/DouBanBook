/**
 * <p>Title: IAdvertDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 11, 2015
 * @version 
 */
package com.douban.model.dao;

import java.util.List;

import com.douban.model.entity.po.Advert;

/**
 * @author 马金健
 *
 */
public interface IAdvertDao {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Advert></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 11, 2015 8:52:51 PM
	 * @version 
	 */
	public List<Advert> selectAll();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: update</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 11, 2015 8:53:50 PM
	 * @version 
	 */
	public int update(final Advert advert);
}

