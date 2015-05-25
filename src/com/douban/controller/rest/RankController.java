/**
 * <p>Title: RankController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 12, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.util.Collections;
import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.CollectBizImpl;
import com.douban.model.entity.result.RankResult;
import com.douban.model.entity.vo.Rank;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */

@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","rank"}))
public class RankController extends ActionSupport implements
		ModelDriven<Object> {

	private CollectBizImpl collectBiz;
	private RankResult result;
	private List<Rank> ranks;
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date May 12, 2015 5:08:28 PM
	 * @version 
	 */
	public RankController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param collectBiz the collectBiz to set
	 */
	public void setCollectBiz(CollectBizImpl collectBiz) {
		this.collectBiz = collectBiz;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return result != null ? result : null;
	}
	

	public HttpHeaders index(){
		this.ranks = collectBiz.findRank();
		Collections.sort(this.ranks);
		this.result = new RankResult("收藏排行榜", 5001, ranks);
		return new DefaultHttpHeaders("");
	}

}
