/**
 * <p>Title: AdvertBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 11, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.IAdvertBiz;
import com.douban.model.dao.impl.AdvertDaoImpl;
import com.douban.model.entity.po.Advert;

/**
 * @author 马金健
 *
 */
public class AdvertBizImpl implements IAdvertBiz {
	
	private AdvertDaoImpl advertDao;
	private List<Advert> adverts;
	private List<Advert> newadverts;
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
	 * @date May 11, 2015 9:03:41 PM
	 * @version 
	 */
	public AdvertBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param advertDao the advertDao to set
	 */
	public void setAdvertDao(AdvertDaoImpl advertDao) {
		this.advertDao = advertDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdvertBiz#selectByPage(java.lang.String)
	 */
	@Override
	public List<Advert> selectByPage(String page) {
		// TODO Auto-generated method stub
		this.adverts = this.advertDao.selectAll();
		for(Advert advert : adverts){
			String[] showPages = advert.getShowPage().split(",");
			for (int i = 0; i < showPages.length; i++) {
				if(page == showPages[i]){
					this.newadverts.add(advert);
				}
			}
		}
		return this.newadverts;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IAdvertBiz#modify(com.douban.model.entity.po.Advert)
	 */
	@Override
	public boolean modify(Advert advert) {
		// TODO Auto-generated method stub
		affectedRows = this.advertDao.update(advert);
		boolean flag = affectedRows > 0 ? true : false;
		return flag;
	}

}
