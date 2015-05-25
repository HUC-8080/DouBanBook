/**
 * <p>Title: LoginInterceptor.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 18, 2015
 * @version 
 */
package com.douban.controller.interceptor;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;


/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class LoginInterceptor extends MethodFilterInterceptor {

	private static final Logger LOGGER = Logger.getGlobal();
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.interceptor</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 18, 2015 10:18:15 AM
	 * @version 
	 */
	public LoginInterceptor() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.MethodFilterInterceptor#doIntercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		if(session != null && session.getAttribute("user") != null){
			return invocation.invoke();
		}
		setToGoingUrl(request,invocation);
		return invocation.invoke();
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.interceptor</p>
	 * <p>Title: setToGoingUrl</p>
	 * <p>Description: </p>
	 * <p>@param </p>
	 * <p>@return void</p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 18, 2015 10:25:56 AM
	 * @version 
	 */
	@SuppressWarnings("unused")
	private void setToGoingUrl(HttpServletRequest request,
			ActionInvocation invocation) {
		// TODO Auto-generated method stub
		String url = request.getHeader("referer");
		LOGGER.info("待转向url："+url);
		if(url == null || url.equals("")){
			String path = request.getContextPath();
			String actionName = invocation.getProxy().getActionName();
			String nameSpace = invocation.getProxy().getNamespace();
			url = url + "/" + actionName + "?";
			
		}
		
	}

}
