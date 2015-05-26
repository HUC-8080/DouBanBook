/**
 * <p>Title: MailValidator.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 19, 2015
 * @version 
 */
package com.douban.common.validator;

import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author 马金健
 *
 */
public class MailValidator {

	private final transient static Properties properties = System.getProperties();
	
	private transient static MailAuthenticator authenticator ;
	
	private transient static Session session;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 19, 2015 11:44:24 PM
	 * @version 
	 */
	public MailValidator() {
		// TODO Auto-generated constructor stub
		init(MailValidatorConfig.SMTP_HOST, MailValidatorConfig.USER_NAME, MailValidatorConfig.USER_PASS);
	}
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.validator</p>
	 * <p>Title: init</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 20, 2015 12:26:47 AM
	 * @version 
	 */
	private static void init(final String smtp_host, final String username, final String password){
		//初始化properties
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.host", smtp_host);
		properties.put("mail.smtp.protocol", "smtp");
		
		//验证密码
		authenticator = new MailAuthenticator(username, password);
		
		//创建session
		session = Session.getInstance(properties, authenticator);
		session.setDebug(true);
	}
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.validator</p>
	 * <p>Title: send</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 20, 2015 12:28:01 AM
	 * @version 
	 * @throws MessagingException 
	 * @throws AddressException 
	 */
	public static void send(final String address, final String subject, final String content) throws AddressException, MessagingException{
		init(MailValidatorConfig.SMTP_HOST, MailValidatorConfig.USER_NAME, MailValidatorConfig.USER_PASS);
		
		//创建MIME类型邮件
		final MimeMessage message = new MimeMessage(session);
		
		//设置发信人
		message.setFrom(new InternetAddress(authenticator.getUsername()));
		
		//设置收件人
		message.setRecipient(RecipientType.TO, new InternetAddress(address));
		
		//设置主题
		message.setSubject(subject);
		
		//设置邮件内容
		message.setContent(content.toString(),"text/html;charset=utf-8");
		
		//发送
		Transport.send(message);
	}
	
	public static void mailActivationContent(long userid, String username, String email){
		String url = "http://localhost/DouBanBook/binding?op=email_activated&userid="+userid+"&email="+email;
		String content = "欢迎你，"+username+":<br/>&nbsp;&nbsp;&nbsp;感谢您使用DouBanBook平台！<br/>&nbsp;&nbsp;&nbsp;请点击一下链接，绑定您的DouBanBook账号！！<br/>&nbsp;&nbsp;&nbsp;<a href='"+url+"'><span>"+url+"</span><a>";
		try {
			MailValidator.send(email, "绑定邮箱", content);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void mailModifyPassContent(long userid, String username, String email){
		String url = "http://localhost/DouBanBook/user?op=setting_pass_email&userid="+userid+"&email="+email;
		String content = "欢迎你，"+username+":<br/>&nbsp;&nbsp;&nbsp;感谢您使用DouBanBook平台！<br/>&nbsp;&nbsp;&nbsp;请点击一下链接，找回你的密码！！<br/>&nbsp;&nbsp;&nbsp;<a href='"+url+"'><span>"+url+"</span><a>";
		try {
			MailValidator.send(email, "找回密码", content);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MailValidator.mailModifyPassContent(6, "HUC-8080", "13920532105@sina.cn");
	}
}
