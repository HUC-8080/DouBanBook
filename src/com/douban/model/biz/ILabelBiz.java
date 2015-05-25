/**
 * <p>Title: ILabelBiz.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 7, 2015
 * @version 
 */
package com.douban.model.biz;

import java.util.List;

import com.douban.model.entity.po.Label;

/**
 * @author 马金健
 *
 */
public interface ILabelBiz {
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz</p>
	 * <p>Title: findAll</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return List<Label></p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 7, 2015 9:07:47 AM
	 * @version 
	 */
	public List<Label> findAll();

}
