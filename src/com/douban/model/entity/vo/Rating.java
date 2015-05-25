/**
 * <p>Title: Rating.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 22, 2015
 * @version 
 */
package com.douban.model.entity.vo;

/**
 * @author 马金健
 *
 */
public class Rating {
	
	private int max;
	private int numRaters;
	private String average;
	private int min;
	private String value;

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 22, 2015 4:06:20 PM
	 * @version 
	 */
	public Rating() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:52:16 PM
	 * @version 
	 */
	public Rating(int max, int numRaters, String average, int min, String value) {
		super();
		this.max = max;
		this.numRaters = numRaters;
		this.average = average;
		this.min = min;
		this.value = value;
	}

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:52:16 PM
	 * @version 
	 */
	public Rating(int max, int numRaters, String average, int min) {
		super();
		this.max = max;
		this.numRaters = numRaters;
		this.average = average;
		this.min = min;
	}


	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * @return the numRaters
	 */
	public int getNumRaters() {
		return numRaters;
	}

	/**
	 * @param numRaters the numRaters to set
	 */
	public void setNumRaters(int numRaters) {
		this.numRaters = numRaters;
	}

	/**
	 * @return the average
	 */
	public String getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(String average) {
		this.average = average;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rating [max=" + max + ", numRaters=" + numRaters + ", average="
				+ average + ", min=" + min + ", value=" + value + "]";
	}

}
