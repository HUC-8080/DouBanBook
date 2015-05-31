/**
 * <p>Title: IPAddress.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.common.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 马金健
 *
 */
public class IPAddress {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 9:16:28 AM
	 * @version 
	 */
	public IPAddress() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: getIpAddr</p>
	 * <p>Description: 获取真实的ip地址</p>
	 * <p>@param </p>
	 * <p>@return String</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 9:16:53 AM
	 * @version 
	 */
	public static String getIpAddr(HttpServletRequest request) {  
	    String ip = request.getHeader("x-forwarded-for");  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("WL-Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getRemoteAddr();  
	    }  
	    return ip;  
	}  

}
