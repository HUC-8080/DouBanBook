/**
 * <p>Title: AdminBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 13, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import com.douban.model.biz.IAdminBiz;
import com.douban.model.dao.impl.AdminDaoImpl;
import com.douban.model.entity.po.Admin;

/**
 * @author 马金健
 *
 */
public class AdminBizImpl implements IAdminBiz {
	
	private AdminDaoImpl adminDao;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 13, 2015 10:07:50 PM
	 * @version 
	 */
	public AdminBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adminDao the adminDao to set
	 */
	public void setAdminDao(AdminDaoImpl adminDao) {
		this.adminDao = adminDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdminBiz#login(java.lang.String, java.lang.String)
	 */
	@Override
	public Admin login(String username, String password) {
		// TODO Auto-generated method stub
		return this.adminDao.selectByUsernameWithPassword(username, password);
	}

}
