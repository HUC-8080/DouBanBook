/**
 * <p>Title: PhoneValidatorCode.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 19, 2015
 * @version 
 */
package com.douban.common.validator;

/**
 * @author 马金健
 *
 */
public class PhoneValidatorCode {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 19, 2015 11:50:13 PM
	 * @version 
	 */
	public PhoneValidatorCode() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: generalCode</p>
	 * <p>Description: 生成6位验证码</p>
	 * <p>@param </p>
	 * <p>@return int</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 19, 2015 11:51:33 PM
	 * @version 
	 */
	public static int generalCode(){
		return (int) ((Math.random()*9+1)*100000);
	}

}
