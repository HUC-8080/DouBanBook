/**
 * <p>Title: UserBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 8, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.IUserBiz;
import com.douban.model.dao.impl.UserDaoImpl;
import com.douban.model.entity.po.User;

/**
 * @author 马金健
 *
 */
public class UserBizImpl implements IUserBiz{

	private UserDaoImpl userDao = null;
	
	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 9:45:05 AM
	 * @version 
	 */
	public UserBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#validate(com.douban.model.entity.po.User)
	 */
	@Override
	public boolean validate(User user) {
		// TODO Auto-generated method stub
		boolean flag = this.userDao.selectUser(user) > 0 ? true : false ;
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#register(com.douban.model.entity.po.User)
	 */
	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		boolean flag = this.userDao.insert(user) > 0 ? true : false;
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#modifyInfo(com.douban.model.entity.po.User)
	 */
	@Override
	public boolean modifyInfo(User user) {
		// TODO Auto-generated method stub
		if(this.userDao.update(user) > 0){
			return true;
		}
		return false;
		
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#queryInfo(int)
	 */
	@Override
	public User queryInfo(String username) {
		// TODO Auto-generated method stub
		return this.userDao.select(username);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#findAll()
	 */
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userDao.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#removeByUserId(long)
	 */
	@Override
	public boolean removeByUserId(long userid) {
		// TODO Auto-generated method stub
		if(this.userDao.deleteByUserId(userid) > 0){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#queryUserInfo(long)
	 */
	@Override
	public User queryUserInfo(long userid) {
		// TODO Auto-generated method stub
		return this.userDao.selectUserInfo(userid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#telephoneIsRegistered(java.lang.String)
	 */
	@Override
	public boolean telephoneIsRegistered(String telephone) {
		// TODO Auto-generated method stub
		if(this.userDao.selectByTelephone(telephone) != null){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#emailIsRegistered(java.lang.String)
	 */
	@Override
	public boolean emailIsRegistered(String email) {
		// TODO Auto-generated method stub
		if(this.userDao.selectByEmail(email) != null){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IUserBiz#userCount()
	 */
	@Override
	public int userCount() {
		// TODO Auto-generated method stub
		return this.userDao.selectAll().size();
	}

}
