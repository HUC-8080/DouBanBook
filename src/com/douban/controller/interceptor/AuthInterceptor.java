/**
 * <p>Title: AuthInterceptor.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 15, 2015
 * @version 
 */
package com.douban.controller.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
public class AuthInterceptor extends AbstractInterceptor {
	
	@SuppressWarnings("rawtypes")
	private Map session;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.interceptor</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 15, 2015 8:19:47 AM
	 * @version 
	 */
	public AuthInterceptor() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		this.session = invocation.getInvocationContext().getSession();
		if(null == this.session.get("admin") && this.session.get("admin").equals("")){
			return Action.LOGIN;
		}
		return invocation.invoke();
	}

}
