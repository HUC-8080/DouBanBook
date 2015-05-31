/**
 * <p>Title: EncodeBase64.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 31, 2015
 * @version 
 */
package com.douban.common.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

/**
 * @author 马金健
 *
 */
public class EncodeBase64 {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 31, 2015 10:28:20 AM
	 * @version 
	 */
	public EncodeBase64() {
		// TODO Auto-generated constructor stub
	}
	
	/**
     * 编码
     * @param cookieStr
     * @return
     */
    public static String encodeBase64(String cookieStr){
        
        try {
            cookieStr = new String(Base64.encodeBase64(cookieStr.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cookieStr;
    }

    /**
     * 解码
     * @param cookieStr
     * @return
     */
    public static String decodeBase64(String cookieStr){
        try {
            cookieStr = new String(Base64.decodeBase64(cookieStr.getBytes()), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cookieStr;
    }


}
