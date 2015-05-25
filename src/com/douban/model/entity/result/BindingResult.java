/**
 * <p>Title: BindingResult.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 20, 2015
 * @version 
 */
package com.douban.model.entity.result;

import com.douban.model.entity.po.Binding;

/**
 * @author 马金健
 *
 */
public class BindingResult {
	
	private String msg;
	private int code;
	private Binding binding;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:26:51 AM
	 * @version 
	 */
	public BindingResult() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 20, 2015 9:27:32 AM
	 * @version 
	 */
	public BindingResult(String msg, int code, Binding binding) {
		super();
		this.msg = msg;
		this.code = code;
		this.binding = binding;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the binding
	 */
	public Binding getBinding() {
		return binding;
	}

	/**
	 * @param binding the binding to set
	 */
	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BindingResult [msg=" + msg + ", code=" + code + ", binding="
				+ binding + "]";
	}

}
