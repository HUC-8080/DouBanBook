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

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import net.sf.json.JSONObject;

/**
 * @author 马金健
 * 
 */
public class PhoneValidator {

	private static final String APP_KEY = PhoneValidatorConfig.APP_KEY;
	private static final String CODE = PhoneValidatorConfig.CODE;
	private static final String TEL = PhoneValidatorConfig.TEL;


	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.validator</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 22, 2015 1:09:51 PM
	 * @version 
	 */
	public PhoneValidator() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	public static int send(final String telephone) throws UnsupportedEncodingException {
		int validateCode = PhoneValidatorCode.generalCode();
		String url = "http://v.juhe.cn/sms/send?mobile=";// url为请求的api接口地址
		String strCode = URLEncoder.encode("#code#="+validateCode+"&#tel#="+PhoneValidator.TEL);
		String urlAll = new StringBuffer(url).append(telephone)
				.append("&tpl_id=").append(PhoneValidator.CODE)
				.append("&tpl_value=").append(strCode)
				.append("&key=").append(PhoneValidator.APP_KEY).toString();
		String charset = "UTF-8";
		System.out.println(urlAll);
		String jsonResult = get(urlAll, charset);// 得到JSON字符串
		JSONObject object = JSONObject.fromObject(jsonResult);// 转化为JSON类
		String code = object.getString("error_code");// 得到错误码
		// 错误码判断
		if (code.equals("0")) {
			// 根据需要取得数据
			return validateCode;
		} else {
			System.out.println("error_code:" + code + ",reason:"
					+ object.getString("reason"));
			return 0;
		}
	}

	/**
	 * 
	 * @param urlAll
	 *            :请求接口
	 * @param charset
	 *            :字符编码
	 * @return 返回json结果
	 */
	public static String get(String urlAll, String charset) {
		BufferedReader reader = null;
		String result = null;
		StringBuffer sbf = new StringBuffer();
		String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";// 模拟浏览器
		try {
			URL url = new URL(urlAll);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("GET");
			connection.setReadTimeout(30000);
			connection.setConnectTimeout(30000);
			connection.setRequestProperty("User-agent", userAgent);
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, charset));
			String strRead = null;
			while ((strRead = reader.readLine()) != null) {
				sbf.append(strRead);
				sbf.append("\r\n");
			}
			reader.close();
			result = sbf.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
