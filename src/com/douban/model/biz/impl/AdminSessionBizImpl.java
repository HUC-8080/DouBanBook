/**
 * <p>Title: AdminSessionBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import com.douban.model.biz.IAdminSessionBiz;
import com.douban.model.dao.impl.AdminSessionDaoImpl;
import com.douban.model.entity.po.AdminSession;

/**
 * @author 马金健
 *
 */
public class AdminSessionBizImpl implements IAdminSessionBiz {
	
	private AdminSessionDaoImpl adminSessionDao;
	private int affectedRows = 0;
	

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 26, 2015 9:14:30 PM
	 * @version 
	 */
	public AdminSessionBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adminSessionDao the adminSessionDao to set
	 */
	public void setAdminSessionDao(AdminSessionDaoImpl adminSessionDao) {
		this.adminSessionDao = adminSessionDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdminSessionBiz#add(com.douban.model.entity.po.AdminSession)
	 */
	@Override
	public boolean add(AdminSession session) {
		// TODO Auto-generated method stub
		this.affectedRows = this.adminSessionDao.insert(session);
		if(this.affectedRows > 0){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdminSessionBiz#remove(com.douban.model.entity.po.AdminSession)
	 */
	@Override
	public boolean remove(AdminSession session) {
		// TODO Auto-generated method stub
		this.affectedRows = this.adminSessionDao.delete(session);
		if(this.affectedRows > 0 ){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdminSessionBiz#find(com.douban.model.entity.po.AdminSession)
	 */
	@Override
	public AdminSession find(AdminSession session) {
		// TODO Auto-generated method stub
		return this.adminSessionDao.select(session);
	}

}
