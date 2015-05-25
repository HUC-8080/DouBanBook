/**
 * <p>Title: MailValidatorConfig.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 22, 2015
 * @version 
 */
package com.douban.common.validator;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 马金健
 *
 */
public class MailValidatorConfig {
	
	private static final Properties PROPERTIES = new Properties();

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.validator</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 22, 2015 12:34:22 PM
	 * @version 
	 */
	public MailValidatorConfig() {
		// TODO Auto-generated constructor stub
	}
	
	static{
		try {
			PROPERTIES.load(MailValidatorConfig.class.newInstance().getClass().getResourceAsStream("mailvalidator.properties"));
		} catch (InstantiationException | IllegalAccessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static final String SMTP_HOST = PROPERTIES.getProperty("SMTP_HOST");
	public static final String USER_NAME = PROPERTIES.getProperty("USER_NAME");
	public static final String USER_PASS = PROPERTIES.getProperty("USER_PASS");
	public static final String SMTP_PORT = PROPERTIES.getProperty("SMTP_PORT");
}
