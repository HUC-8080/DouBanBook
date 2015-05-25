/**
 * <p>Title: UserDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 8, 2015
 * @version 
 */
package com.douban.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.douban.model.dao.IUserDao;
import com.douban.model.entity.po.User;

/**
 * @author 马金健
 *
 */
public class UserDaoImpl implements IUserDao{
	
	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	private List<User> users = null;
	private User user;
	private int affectedRows;

	/**
	 * <p>Project: DouBan</p>
	 * <p>Package: com.douban.model.dao.impl</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 8, 2015 9:44:01 AM
	 * @version 
	 */
	public UserDaoImpl() {
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
	 * @see com.douban.model.dao.IUserDao#selectUser(com.douban.model.entity.po.User)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public int selectUser(User user) {
		// TODO Auto-generated method stub
		//1:自定义strSQL语句
		String strSQL = "FROM User WHERE username = ? AND password = ?";
		Object[] params = {user.getUsername(),user.getPassword()};
		
		//2:执行strSQL语句
		this.users = (List<User>) this.hibernateTemplate.find(strSQL, params);
		return this.users.size();
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#insert(com.douban.model.entity.po.User)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int insert(final User user) {
		affectedRows = 0;
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.save(user);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#update(com.douban.model.entity.po.User)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int update(final User user) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.user = new User();
		this.user.setId(user.getId());
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.update(user);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#select(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User select(String username) {
		// TODO Auto-generated method stub
		//步骤1：自定义strSQL语句
		String strSQL = "FROM User WHERE username = ?";
		Object[] params = new Object[]{username};
				
		this.users = (List<User>) this.hibernateTemplate.find(strSQL, params);
		
		if(this.users.size() == 0){
			return null;
		}
				
		return this.users.get(0);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#selectAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		String strSQL = "FROM User";
		Object[] params = new Object[]{};
		this.users = (List<User>) this.hibernateTemplate.find(strSQL, params);
		return this.users;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#deleteByUserId(int)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int deleteByUserId(long userid) {
		// TODO Auto-generated method stub
		affectedRows = 0;
		this.user = new User();
		this.user.setId(userid);
		this.transactionTemplate = new TransactionTemplate(this.transactionManager);
		this.transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				hibernateTemplate.delete(user);
				affectedRows = 1;
				return 1;
			}
		
		});
		return affectedRows;
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#selectUserInfo(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User selectUserInfo(long userid) {
		// TODO Auto-generated method stub
		String strSQL = "FROM User WHERE id=?";
		Object[] params = new Object[]{userid};
		this.users = (List<User>) this.hibernateTemplate.find(strSQL, params);
		return this.users.get(0);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#selectByField(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User selectByField(String field, String value) {
		// TODO Auto-generated method stub
		String strSQL = "FROM User WHERE ?=?";
		Object[] params = new Object[]{field, value};
		this.users = (List<User>) this.hibernateTemplate.find(strSQL, params);
		if(this.users.size() == 0 || this.users != null){
			return null;
		}
		return this.users.get(0);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#selectByEmail(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User selectByEmail(String email) {
		// TODO Auto-generated method stub
		String strSQL = "FROM User WHERE email=?";
		Object[] params = new Object[]{email};
		this.users = (List<User>) this.hibernateTemplate.find(strSQL, params);
		if(this.users.size() == 0 || this.users == null){
			return null;
		}
		return this.users.get(0);
	}

	/* (non-Javadoc)
	 * @see com.douban.model.dao.IUserDao#selectByTelephone(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User selectByTelephone(String telephone) {
		// TODO Auto-generated method stub
		String strSQL = "FROM User WHERE telephone = ?";
		Object[] params = new Object[]{telephone};
		this.users = (List<User>) this.hibernateTemplate.find(strSQL, params);
		if(this.users.size() == 0 || this.users == null ){
			return null;
		}
		return this.users.get(0);
	}

}
