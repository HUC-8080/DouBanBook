/**
 * <p>Title: IAdvertBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 11, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.Advert;

/**
 * @author 马金健
 *
 */
public interface IAdvertBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: selectByPage</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Advert></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 11, 2015 9:02:57 PM
	 * @version 
	 */
	public List<Advert> selectByPage(final String page);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: modify</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 11, 2015 9:03:15 PM
	 * @version 
	 */
	public boolean modify(final Advert advert);
}
