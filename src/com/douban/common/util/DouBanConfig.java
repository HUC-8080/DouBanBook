/**
 * <p>Title: DouBanConfig.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 29, 2015
 * @version 
 */
package com.douban.common.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 马金健
 *
 */
public class DouBanConfig {

	private static final Properties DOUBAN = new Properties();
	
	static{
		try {
			DOUBAN.load(DouBanConfig.class.newInstance().getClass().getResourceAsStream("douban.config.properties"));
		} catch (InstantiationException | IllegalAccessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 29, 2015 4:12:14 PM
	 * @version 
	 */
	public DouBanConfig() {
		// TODO Auto-generated constructor stub
	}
	
	public static final String API_KEY = DOUBAN.getProperty("API_KEY");
	public static final String SECRET_KEY = DOUBAN.getProperty("SECRET_KEY");
	public static final String AUTH_URL = DOUBAN.getProperty("AUTH_URL");
	public static final String ACCESS_TOKEN_URL = DOUBAN.getProperty("ACCESS_TOKEN_URL");
	public static final String ACCESS_TOKEN_REDIRECT_URL = DOUBAN.getProperty("ACCESS_TOKEN_REDIRECT_URL");

}
