/**
 * <p>Title: CommunityBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 26, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.ICommunityBiz;
import com.douban.model.dao.impl.CommunityDaoImpl;
import com.douban.model.entity.po.Community;

/**
 * @author 马金健
 *
 */
public class CommunityBizImpl implements ICommunityBiz {
	
	private CommunityDaoImpl communityDao;
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
	 * @date May 26, 2015 5:03:46 PM
	 * @version 
	 */
	public CommunityBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param communityDao the communityDao to set
	 */
	public void setCommunityDao(CommunityDaoImpl communityDao) {
		this.communityDao = communityDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityBiz#findAll()
	 */
	@Override
	public List<Community> findAll() {
		// TODO Auto-generated method stub
		return this.communityDao.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityBiz#add(com.douban.model.entity.po.Community)
	 */
	@Override
	public boolean add(Community community) {
		// TODO Auto-generated method stub
		this.affectedRows = this.communityDao.insert(community);
		if(this.affectedRows > 0 ){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICommunityBiz#findById(long)
	 */
	@Override
	public Community findById(long communityid) {
		// TODO Auto-generated method stub
		return this.communityDao.selectById(communityid);
	}

}
