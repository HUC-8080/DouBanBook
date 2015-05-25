/**
 * <p>Title: MailAuthenticator.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 20, 2015
 * @version 
 */
package com.douban.common.validator;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @author 马金健
 *
 */
public class MailAuthenticator extends Authenticator {
	
	private String username;
	private String password;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.validator</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 20, 2015 12:14:24 AM
	 * @version 
	 */
	public MailAuthenticator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.validator</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 20, 2015 12:15:35 AM
	 * @version 
	 */
	public MailAuthenticator(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see javax.mail.Authenticator#getPasswordAuthentication()
	 */
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		// TODO Auto-generated method stub
		if ((this.username != null) && (this.username.length() > 0) && (this.password != null) 
		   && (this.password.length   () > 0)) {

		      return new PasswordAuthentication(username, password);
		}

		return null;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
