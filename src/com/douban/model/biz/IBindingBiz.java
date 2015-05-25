/**
 * <p>Title: IBindingBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 20, 2015
 * @version 
 */
package com.douban.model.biz;

import com.douban.model.entity.po.Binding;

/**
 * @author 马金健
 *
 */
public interface IBindingBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findByUserId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return Binding</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:21:27 AM
	 * @version 
	 */
	public Binding findByUserId(final long userid);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: addBindTel</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:21:55 AM
	 * @version 
	 */
	public boolean addBindTel(final Binding binding);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: addBindEmail</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:22:13 AM
	 * @version 
	 */
	public boolean addBindEmail(final Binding binding);
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: modifyBindTel</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:22:39 AM
	 * @version 
	 */
	public boolean modifyBindTel(final Binding binding);

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: modifyBindEmail</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return boolean</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:23:03 AM
	 * @version 
	 */
	public boolean modifyBindEmail(final Binding binding);
}
