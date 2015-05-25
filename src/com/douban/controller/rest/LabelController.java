/**
 * <p>Title: LabelController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 7, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.LabelBizImpl;
import com.douban.model.entity.po.Label;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","label"}))
public class LabelController extends ActionSupport implements ModelDriven<Object> {

	private List<Label> labels;
	private Label label;
	
	private LabelBizImpl labelBiz;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 7, 2015 9:09:41 AM
	 * @version 
	 */
	public LabelController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param labelBiz the labelBiz to set
	 */
	public void setLabelBiz(LabelBizImpl labelBiz) {
		this.labelBiz = labelBiz;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return labels != null ? labels : label;
	}

	public HttpHeaders index(){
		labels = this.labelBiz.findAll();
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
}
