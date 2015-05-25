/**
 * <p>Title: SessionBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 21, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import com.douban.model.biz.ISessionBiz;
import com.douban.model.dao.impl.SessionDaoImpl;
import com.douban.model.entity.po.Session;

/**
 * @author 马金健
 *
 */
public class SessionBizImpl implements ISessionBiz {
	
	private SessionDaoImpl sessionDao;
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
	 * @date May 21, 2015 7:29:27 PM
	 * @version 
	 */
	public SessionBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sessionDao the sessionDao to set
	 */
	public void setSessionDao(SessionDaoImpl sessionDao) {
		this.sessionDao = sessionDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ISessionBiz#addSession(com.douban.model.entity.po.Session)
	 */
	@Override
	public boolean addSession(Session session) {
		// TODO Auto-generated method stub
		this.affectedRows = this.sessionDao.insert(session);
		if(this.affectedRows > 0){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ISessionBiz#removeSession(com.douban.model.entity.po.Session)
	 */
	@Override
	public boolean removeSession(Session session) {
		// TODO Auto-generated method stub
		this.affectedRows = this.sessionDao.delete(session);
		if(this.affectedRows > 0){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ISessionBiz#find(com.douban.model.entity.po.Session)
	 */
	@Override
	public Session find(Session session) {
		// TODO Auto-generated method stub
		return this.sessionDao.select(session);
	}

}
