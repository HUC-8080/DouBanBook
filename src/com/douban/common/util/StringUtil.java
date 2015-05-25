/**
 * <p>Title: StringUtil.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 25, 2015
 * @version 
 */
package com.douban.common.util;

/**
 * @author 马金健
 *
 */
public class StringUtil {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 25, 2015 3:49:08 PM
	 * @version 
	 */
	public StringUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: replaceSubStringWithEmail</p>
	 * <p>Description: 将邮箱中字符隐藏</p>
	 * <p>@param </p>
	 * <p>@return String</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 25, 2015 3:57:06 PM
	 * @version 
	 */
	public static String replaceSubStringWithEmail(String email){
		String[] emailArr = email.split("@");
		String prefix = StringUtil.replaceSubString(emailArr[0], emailArr[0].length() - 3);
		return prefix + "@" + emailArr[1];
	}
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: replaceSubString</p>
	 * <p>Description: 将给定字符串的后n位字符用*代替</p>
	 * <p>@param </p>
	 * <p>@return String</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 25, 2015 3:57:28 PM
	 * @version 
	 */
	public static String replaceSubString(String str,int n){
        String sub="";
        try {
            sub = str.substring(0, str.length()-n);
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<n;i++){
                sb=sb.append("*");
            }
            sub+=sb.toString();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sub;
    }
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: getMailHost</p>
	 * <p>Description: 获取邮箱登陆主页网址</p>
	 * <p>@param </p>
	 * <p>@return String</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 25, 2015 4:18:04 PM
	 * @version 
	 */
	public static String getMailHost(String email){
		String[] emailArr = email.split("@");
		String subffix = emailArr[1];
		String mail_host = "mail."+subffix;
		return mail_host;
	}
	public static void main(String[] args) {
		System.out.println(StringUtil.getMailHost("13920532105@sina.cn"));
	}
}
