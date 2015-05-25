/**
 * <p>Title: AdminLogBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 15, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.IAdminLogBiz;
import com.douban.model.dao.impl.AdminLogDaoImpl;
import com.douban.model.entity.po.AdminLog;

/**
 * @author 马金健
 *
 */
public class AdminLogBizImpl implements IAdminLogBiz {
	
	private AdminLogDaoImpl adminLogDao;
	private List<AdminLog> adminLogs;
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
	 * @date May 15, 2015 9:40:29 AM
	 * @version 
	 */
	public AdminLogBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdminLogBiz#addLog(com.douban.model.entity.po.AdminLog)
	 */
	/**
	 * @param adminLogDao the adminLogDao to set
	 */
	public void setAdminLogDao(AdminLogDaoImpl adminLogDao) {
		this.adminLogDao = adminLogDao;
	}

	@Override
	public boolean addLog(AdminLog adminLog) {
		// TODO Auto-generated method stub
		this.affectedRows = this.adminLogDao.insert(adminLog);
		return this.affectedRows > 0 ? true : false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdminLogBiz#findAll()
	 */
	@Override
	public List<AdminLog> findAll() {
		// TODO Auto-generated method stub
		this.adminLogs = this.adminLogDao.selectAll();
		return this.adminLogs;
	}

}
