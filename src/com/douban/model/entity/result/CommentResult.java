/**
 * <p>Title: CommentResult.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Jun 7, 2015
 * @version 
 */
package com.douban.model.entity.result;

import java.util.List;

import com.douban.model.entity.po.Comment;

/**
 * @author 马金健
 *
 */
public class CommentResult {
	
	private String msg;
	private int code;
	private Comment comment;
	private List<Comment> comments;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.result</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jun 7, 2015 7:35:56 AM
	 * @version 
	 */
	public CommentResult() {
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
	 * @date Jun 7, 2015 7:36:45 AM
	 * @version 
	 */
	public CommentResult(String msg, int code, Comment comment,
			List<Comment> comments) {
		super();
		this.msg = msg;
		this.code = code;
		this.comment = comment;
		this.comments = comments;
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
	 * @return the comment
	 */
	public Comment getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(Comment comment) {
		this.comment = comment;
	}

	/**
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommentResult [msg=" + msg + ", code=" + code + ", comment="
				+ comment + ", comments=" + comments + "]";
	}

}
