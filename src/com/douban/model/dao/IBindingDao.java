/**
 * <p>Title: IBindingDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 20, 2015
 * @version 
 */
package com.douban.model.dao;

import com.douban.model.entity.po.Binding;

/**
 * @author 马金健
 *
 */
public interface IBindingDao {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: selectBinding</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Binding</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:04:19 AM
	 * @version 
	 */
	public Binding selectBinding(final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insertBindTel</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:08:30 AM
	 * @version 
	 */
	public int insertBindTel(final Binding binding);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: insertBindEmail</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:08:56 AM
	 * @version 
	 */
	public int insertBindEmail(final Binding binding);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: updateBindTel</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:09:32 AM
	 * @version 
	 */
	public int updateBindTel(final Binding binding);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao</p>
	 * <p>Title: updateBindEmail</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:09:51 AM
	 * @version 
	 */
	public int updateBindEmail(final Binding binding);

}
