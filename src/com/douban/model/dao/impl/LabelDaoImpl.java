/**
 * <p>Title: LabelDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 7, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.ILabelDao;
import com.douban.model.entity.po.Label;

/**
 * @author 马金健
 *
 */
public class LabelDaoImpl implements ILabelDao {

	private HibernateTemplate hibernateTemplate;
	@SuppressWarnings("unused")
	private PlatformTransactionManager transactionManager;
	@SuppressWarnings("unused")
	private TransactionTemplate transactionTemplate;
	private List<Label> labels = null;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 7, 2015 8:38:54 AM
	 * @version 
	 */
	public LabelDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * @param transactionManager the transactionManager to set
	 */
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.ILabelDao#selectAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Label> selectAll() {
		// TODO Auto-generated method stub
		String strSQL = "FROM Label WHERE parent_id=0";
		Object[] params = new Object[]{};
		labels = (List<Label>) this.hibernateTemplate.find(strSQL, params);
		return labels;
	}

}
