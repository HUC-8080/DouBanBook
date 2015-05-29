/**
 * <p>Title: CollectBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.ArrayList;
import java.util.List;

import com.douban.model.biz.ICollectBiz;
import com.douban.model.dao.impl.CollectDaoImpl;
import com.douban.model.entity.po.Collect;
import com.douban.model.entity.vo.Rank;


/**
 * @author 马金健
 *
 */
public class CollectBizImpl implements ICollectBiz {
	
	private List<Collect> collects;
	private List<Rank> ranks;
	private int affectedRows = 0;
	private CollectDaoImpl collectDao;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 8:33:52 AM
	 * @version 
	 */
	public CollectBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param collectDao the collectDao to set
	 */
	public void setCollectDao(CollectDaoImpl collectDao) {
		this.collectDao = collectDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICollectBiz#findAll(int)
	 */
	@Override
	public List<Collect> findAll(long userid) {
		// TODO Auto-generated method stub
		return this.collectDao.selectAll(userid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICollectBiz#add(com.douban.model.entity.po.Collect)
	 */
	@Override
	public boolean add(Collect collect) {
		// TODO Auto-generated method stub
		affectedRows = this.collectDao.insert(collect);
		boolean flag = affectedRows > 0 ? true : false;
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICollectBiz#remove(com.douban.model.entity.po.Collect)
	 */
	@Override
	public boolean remove(Collect collect) {
		// TODO Auto-generated method stub
		affectedRows = this.collectDao.delete(collect);
		boolean flag = affectedRows > 0 ? true : false;
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICollectBiz#isCollect(com.douban.model.entity.po.Collect)
	 */
	@Override
	public boolean isCollect(Collect collect) {
		// TODO Auto-generated method stub
		affectedRows = this.collectDao.isCollect(collect);
		if(affectedRows == 1){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICollectBiz#findByBookIdWithUserId(int, int)
	 */
	@Override
	public Collect findByBookIdWithUserId(long bookid, long userid) {
		// TODO Auto-generated method stub
		return this.collectDao.selectByBookIdWithUserId(bookid, userid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ICollectBiz#findRank()
	 */
	@Override
	public List<Rank> findRank() {
		// TODO Auto-generated method stub
		this.collects = this.collectDao.selectRank();
		this.ranks = new ArrayList<Rank>();
		for(int j=0;j<this.collects.size();j++){
			Rank rank = new Rank();
			rank.setBookid(this.collects.get(j).getBookid());
			int count = 1;
			for(int i=j+1;i<this.collects.size();i++){
				if(this.collects.get(j).getBookid() == this.collects.get(i).getBookid()){
					count++;
					this.collects.remove(i);
				}
			}
			rank.setCount(count);
			ranks.add(rank);
		}
		return ranks;
	}

}
