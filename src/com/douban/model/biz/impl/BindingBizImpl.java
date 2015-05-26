/**
 * <p>Title: BindingBizImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 20, 2015
 * @version 
 */
package com.douban.model.biz.impl;

import com.douban.model.biz.IBindingBiz;
import com.douban.model.dao.impl.BindingDaoImpl;
import com.douban.model.entity.po.Binding;

/**
 * @author 马金健
 *
 */
public class BindingBizImpl implements IBindingBiz {

	private BindingDaoImpl bindingDao;
	private Binding binding;
	private int affectedRows = 0;
	
	/**
	 * @param bindingDao the bindingDao to set
	 */
	public void setBindingDao(BindingDaoImpl bindingDao) {
		this.bindingDao = bindingDao;
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
	 * @date May 20, 2015 9:30:09 AM
	 * @version 
	 */
	public BindingBizImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IBindingBiz#findByUserId(long)
	 */
	@Override
	public Binding findByUserId(long userid) {
		// TODO Auto-generated method stub
		return this.bindingDao.selectBinding(userid);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IBindingBiz#addBindTel(com.douban.model.entity.po.Binding)
	 */
	@Override
	public boolean addBindTel(Binding binding) {
		// TODO Auto-generated method stub
		this.binding = this.bindingDao.selectBinding(binding.getUserid());
		this.binding.setTelephone(binding.getTelephone());
		if(this.bindingDao.selectBinding(binding.getUserid()) != null){
			return this.modifyBindTel(this.binding);
		}else{
			this.affectedRows = this.bindingDao.insertBindTel(binding);
			if(this.affectedRows > 0){
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IBindingBiz#addBindEmail(com.douban.model.entity.po.Binding)
	 */
	@Override
	public boolean addBindEmail(Binding binding) {
		// TODO Auto-generated method stub
		this.binding = this.bindingDao.selectBinding(binding.getUserid());
		this.binding.setEmail(binding.getEmail());
		if(this.bindingDao.selectBinding(binding.getUserid()) != null){
			return this.modifyBindEmail(this.binding);
		}else{
			this.affectedRows = this.bindingDao.insertBindEmail(binding);
			if(this.affectedRows > 0){
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IBindingBiz#modifyBindTel(com.douban.model.entity.po.Binding)
	 */
	@Override
	public boolean modifyBindTel(Binding binding) {
		// TODO Auto-generated method stub
		this.affectedRows = this.bindingDao.updateBindTel(binding);
		if(this.affectedRows > 0){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.biz.IBindingBiz#modifyBindEmail(com.douban.model.entity.po.Binding)
	 */
	@Override
	public boolean modifyBindEmail(Binding binding) {
		// TODO Auto-generated method stub
		this.affectedRows = this.bindingDao.updateBindEmail(binding);
		if(this.affectedRows > 0){
			return true;
		}
		return false;
	}

}
