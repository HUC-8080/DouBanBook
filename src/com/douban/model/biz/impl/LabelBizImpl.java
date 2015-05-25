/**
 * <p>Title: LabelBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 7, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import java.util.List;

import com.douban.model.biz.ILabelBiz;
import com.douban.model.dao.impl.LabelDaoImpl;
import com.douban.model.entity.po.Label;

/**
 * @author 马金健
 *
 */
public class LabelBizImpl implements ILabelBiz {

	private LabelDaoImpl labelDao;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.biz.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 7, 2015 9:08:02 AM
	 * @version 
	 */
	public LabelBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param labelDao the labelDao to set
	 */
	public void setLabelDao(LabelDaoImpl labelDao) {
		this.labelDao = labelDao;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.ILabelBiz#findAll()
	 */
	@Override
	public List<Label> findAll() {
		// TODO Auto-generated method stub
		return this.labelDao.selectAll();
	}

}
