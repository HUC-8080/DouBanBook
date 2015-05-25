/**
 * <p>Title: ReviewController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date May 8, 2015
 * @version 
 */
package com.douban.controller.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.douban.model.biz.impl.ReviewBizImpl;
import com.douban.model.entity.po.Review;
import com.douban.model.entity.po.User;
import com.douban.model.entity.result.ReviewResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 马金健
 *
 */
@SuppressWarnings("serial")
@Results(@Result(name="success",type="redirectAction",params={"actionName","review"}))
public class ReviewController extends ActionSupport implements
		ModelDriven<Object> {
	
	private String op;
	private int bookid;
	private int userid;
	private String content;
	private ReviewResult result;
	private List<Review> reviews;
	private Review review;
	private ReviewBizImpl reviewBiz;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.controller.rest</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健e
	 * @since JDK 1.7.55 
	 * @date May 8, 2015 12:04:27 PM
	 * @version 
	 */
	public ReviewController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}

	/**
	 * @return the bookid
	 */
	public int getBookid() {
		return bookid;
	}

	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @param reviewBiz the reviewBiz to set
	 */
	public void setReviewBiz(ReviewBizImpl reviewBiz) {
		this.reviewBiz = reviewBiz;
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
		Logger logger = Logger.getGlobal();
		logger.info("index");
		result = new ReviewResult();
		if(op.equals("selectReviewsByBookId")){
			logger.info("op:"+op);
			if((reviews = this.reviewBiz.findAllByBookId(bookid)).size() == 0){
				result.setCode(4004);
				result.setMsg("此书尚无书评");
				result.setReviews(reviews);
			}else{
				result.setCode(4000);
				result.setMsg("此书存在书评");
				result.setReviews(reviews);
			}
		}else if(op.equals("selectReviewsByUserId")){
			logger.info("op:"+op);
			reviews = this.reviewBiz.findAllByUserId(userid);
			if(reviews == null){
				result.setCode(4005);
				result.setMsg("此书尚无书评");
				result.setReviews(reviews);
			}else{
				result.setCode(4001);
				result.setMsg("此书存在书评");
				result.setReviews(reviews);
			}
		}
		return new DefaultHttpHeaders("");
	}
	
	public HttpHeaders show(){
		Logger logger = Logger.getGlobal();
		logger.info("index");
		if(op.equals("selectReviewsByBookId")){
			logger.info("op:"+op);
			if((reviews = this.reviewBiz.findAllByBookId(bookid)).size() == 0){
				result.setCode(4004);
				result.setMsg("此书尚无书评");
				result.setReviews(reviews);
			}else{
				result.setCode(4000);
				result.setMsg("此书存在书评");
				result.setReviews(reviews);
			}
		}else if(op.equals("selectReviewsByUserId")){
			logger.info("op:"+op);
			reviews = this.reviewBiz.findAllByUserId(userid);
			if(reviews == null){
				result.setCode(4005);
				result.setMsg("此书尚无书评");
				result.setReviews(reviews);
			}else{
				result.setCode(4001);
				result.setMsg("此书存在书评");
				result.setReviews(reviews);
			}
		}
		return new DefaultHttpHeaders("");
	}
	
	public HttpHeaders create(){
		Logger logger = Logger.getGlobal();
		logger.info(op);
		logger.info(userid+"");
		logger.info(bookid+"");
		logger.info(content);
		if(op.equals("publishReview")){
			review = new Review();
			review.setBookid(bookid);
			
			User user = new User();
			user.setId(userid);
			
			review.setUser(user);
			review.setContent(content);
			
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String reviewDate = format.format(date);
			
			review.setDate(reviewDate);
			boolean flag = reviewBiz.add(review);
			if(flag){
				result = new ReviewResult();
				result.setCode(4002);	//4002 发表书评成功
				result.setMsg("发表书评成功");
				result.setReview(review);
				return new DefaultHttpHeaders("publishReviewSuccess");
			}else{
				result = new ReviewResult();
				result.setCode(4003); 	//4003 发表书评失败
				result.setMsg("发表书评失败");
				result.setReview(review);
				return new DefaultHttpHeaders("publishReviewFailed");
			}
		}else{
			return new DefaultHttpHeaders("");
		}
		
	}
}
