/**
 * <p>Title: FriendBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 19, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import com.douban.model.biz.IFriendBiz;
import com.douban.model.dao.impl.FriendDaoImpl;
import com.douban.model.entity.po.Friend;


/**
 * @author 马金健
 *
 */
public class FriendBizImpl implements IFriendBiz {
	
	private FriendDaoImpl friendDao;
	private boolean flag = false;
	private int affectedRows = 0;

	/**
	 * @param friendDao the friendDao to set
	 */
	public void setFriendDao(FriendDaoImpl friendDao) {
		this.friendDao = friendDao;
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 19, 2015 3:14:16 PM
	 * @version 
	 */
	public FriendBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IFriendBiz#addFriend(com.douban.model.entity.po.Friend)
	 */
	@Override
	public boolean addFriend(Friend friend) {
		// TODO Auto-generated method stub
		this.affectedRows = this.friendDao.insert(friend);
		this.flag = this.affectedRows > 0 ? true : false;
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IFriendBiz#removeFriend(com.douban.model.entity.po.Friend)
	 */
	@Override
	public boolean removeFriend(Friend friend) {
		// TODO Auto-generated method stub
		this.affectedRows = this.friendDao.delete(friend);
		this.flag = this.affectedRows > 0 ? true : false;
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IFriendBiz#findByFriendid(long)
	 */
	@Override
	public Friend findByFriendid(long friendid) {
		// TODO Auto-generated method stub
		return this.friendDao.selectByFriendId(friendid);
	}

}
