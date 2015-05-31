/**
 * <p>Title: CommunityUserBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 27, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.ICommunityUserBiz;
import com.douban.model.dao.impl.CommunityUserDaoImpl;
import com.douban.model.entity.po.CommunityUser;

/**
 * @author 马金健
 *
 */
public class CommunityUserBizImpl implements ICommunityUserBiz {

	private int affectedRows = 0;
	private CommunityUserDaoImpl communityUserDao;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 27, 2015 8:19:22 AM
	 * @version 
	 */
	public CommunityUserBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityUserBiz#add(com.douban.model.entity.po.CommunityUser)
	 */
	/**
	 * @param communityUserDao the communityUserDao to set
	 */
	public void setCommunityUserDao(CommunityUserDaoImpl communityUserDao) {
		this.communityUserDao = communityUserDao;
	}

	@Override
	public boolean add(CommunityUser communityUser) {
		// TODO Auto-generated method stub
		this.affectedRows = this.communityUserDao.insert(communityUser);
		if(this.affectedRows > 0){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityUserBiz#userIsJoinedThisCommunity(com.douban.model.entity.po.CommunityUser)
	 */
	@Override
	public boolean userIsJoinedThisCommunity(CommunityUser communityUser) {
		// TODO Auto-generated method stub
		if(this.communityUserDao.selectByCommunityIdWithUserId(communityUser) != null){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityUserBiz#quitCommunity(com.douban.model.entity.po.CommunityUser)
	 */
	@Override
	public boolean quitCommunity(CommunityUser communityUser) {
		// TODO Auto-generated method stub
		this.affectedRows = this.communityUserDao.delete(communityUser);
		if(this.affectedRows > 0 ){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityUserBiz#selectByCommunityIdWithUserId(com.douban.model.entity.po.CommunityUser)
	 */
	@Override
	public CommunityUser selectByCommunityIdWithUserId(
			CommunityUser communityUser) {
		// TODO Auto-generated method stub
		return this.communityUserDao.selectByCommunityIdWithUserId(communityUser);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityUserBiz#myCommunities(long)
	 */
	@Override
	public List<CommunityUser> myCommunities(long userid) {
		// TODO Auto-generated method stub
		return this.communityUserDao.selectByUserId(userid);
	}

}
