/**
 * <p>Title: PhoneValidatorConfig.java</p>
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
public class PhoneValidatorConfig {
	
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
	 * @date Apr 22, 2015 12:48:10 PM
	 * @version 
	 */
	public PhoneValidatorConfig() {
		// TODO Auto-generated constructor stub
	}
	
	static{
		try {
			PROPERTIES.load(PhoneValidatorConfig.class.newInstance().getClass().getResourceAsStream("phonevalidator.properties"));
		} catch (InstantiationException | IllegalAccessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static final String APP_KEY = PROPERTIES.getProperty("APP_KEY");
	public static final String CODE = PROPERTIES.getProperty("CODE");
	public static final String TEL = PROPERTIES.getProperty("TEL");
	
}
