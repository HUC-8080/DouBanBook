/**
 * <p>Title: SessionUtil.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 21, 2015
 * @version 
 */
package com.douban.common.util;

import java.util.Random;

/**
 * @author 马金健
 *
 */
public class SessionUtil {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:07:05 PM
	 * @version 
	 */
	public SessionUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: getSessionId</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return long</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 21, 2015 7:12:08 PM
	 * @version 
	 */
	public static long getSessionId(){
		return new Random().nextLong();
	}
}
