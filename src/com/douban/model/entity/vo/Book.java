/**
 * <p>Title: Book.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 22, 2015
 * @version 
 */
package com.douban.model.entity.vo;

import java.util.Arrays;

/**
 * @author 马金健
 *
 */
public class Book {
	
	private Rating rating;
	private String subtitle;
	private String[] author;
	private String pubdate;
	private Tag[] tags;
	private String origin_title;
	private String image;
	private String binding;
	private String translator;
	private String catalog;
	private String pages;
	private Images images;
	private String alt;
	private String id;
	private String publisher;
	private String isbn10;
	private String isbn13;
	private String title;
	private String url;
	private String alt_title;
	private String author_intro;
	private String summary;
	private String price;
	
	
	
	

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.model.entity.vo</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 22, 2015 4:04:20 PM
	 * @version 
	 */
	public Book() {
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
	 * @date Apr 22, 2015 4:20:29 PM
	 * @version 
	 */
	public Book(Rating rating, String subtitle, String[] author, String pubdate,
			Tag[] tags, String origin_title, String image, String binding,
			String translator, String catalog, String pages, Images images,
			String alt, String id, String publisher, String isbn10, String isbn13,
			String title, String url, String alt_title, String author_intro,
			String summary, String price) {
		super();
		this.rating = rating;
		this.subtitle = subtitle;
		this.author = author;
		this.pubdate = pubdate;
		this.tags = tags;
		this.origin_title = origin_title;
		this.image = image;
		this.binding = binding;
		this.translator = translator;
		this.catalog = catalog;
		this.pages = pages;
		this.images = images;
		this.alt = alt;
		this.id = id;
		this.publisher = publisher;
		this.isbn10 = isbn10;
		this.isbn13 = isbn13;
		this.title = title;
		this.url = url;
		this.alt_title = alt_title;
		this.author_intro = author_intro;
		this.summary = summary;
		this.price = price;
	}





	/**
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}





	/**
	 * @param rating the rating to set
	 */
	public void setRating(Rating rating) {
		this.rating = rating;
	}





	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}





	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}





	/**
	 * @return the author
	 */
	public String[] getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String[] author) {
		this.author = author;
	}





	/**
	 * @return the pubdate
	 */
	public String getPubdate() {
		return pubdate;
	}





	/**
	 * @param pubdate the pubdate to set
	 */
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}





	/**
	 * @return the tags
	 */
	public Tag[] getTags() {
		return tags;
	}





	/**
	 * @param tags the tags to set
	 */
	public void setTags(Tag[] tags) {
		this.tags = tags;
	}





	/**
	 * @return the origin_title
	 */
	public String getOrigin_title() {
		return origin_title;
	}





	/**
	 * @param origin_title the origin_title to set
	 */
	public void setOrigin_title(String origin_title) {
		this.origin_title = origin_title;
	}





	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}





	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}





	/**
	 * @return the binding
	 */
	public String getBinding() {
		return binding;
	}





	/**
	 * @param binding the binding to set
	 */
	public void setBinding(String binding) {
		this.binding = binding;
	}





	/**
	 * @return the translator
	 */
	public String getTranslator() {
		return translator;
	}





	/**
	 * @param translator the translator to set
	 */
	public void setTranslator(String translator) {
		this.translator = translator;
	}





	/**
	 * @return the catalog
	 */
	public String getCatalog() {
		return catalog;
	}





	/**
	 * @param catalog the catalog to set
	 */
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}





	/**
	 * @return the pages
	 */
	public String getPages() {
		return pages;
	}





	/**
	 * @param pages the pages to set
	 */
	public void setPages(String pages) {
		this.pages = pages;
	}





	/**
	 * @return the images
	 */
	public Images getImages() {
		return images;
	}





	/**
	 * @param images the images to set
	 */
	public void setImages(Images images) {
		this.images = images;
	}





	/**
	 * @return the alt
	 */
	public String getAlt() {
		return alt;
	}





	/**
	 * @param alt the alt to set
	 */
	public void setAlt(String alt) {
		this.alt = alt;
	}





	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}





	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}





	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}





	/**
	 * @return the isbn10
	 */
	public String getIsbn10() {
		return isbn10;
	}





	/**
	 * @param isbn10 the isbn10 to set
	 */
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}





	/**
	 * @return the isbn13
	 */
	public String getIsbn13() {
		return isbn13;
	}





	/**
	 * @param isbn13 the isbn13 to set
	 */
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}





	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}





	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}





	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}





	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}





	/**
	 * @return the alt_title
	 */
	public String getAlt_title() {
		return alt_title;
	}





	/**
	 * @param alt_title the alt_title to set
	 */
	public void setAlt_title(String alt_title) {
		this.alt_title = alt_title;
	}





	/**
	 * @return the author_intro
	 */
	public String getAuthor_intro() {
		return author_intro;
	}





	/**
	 * @param author_intro the author_intro to set
	 */
	public void setAuthor_intro(String author_intro) {
		this.author_intro = author_intro;
	}





	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}





	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}





	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}





	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [rating=" + rating + ", subtitle=" + subtitle
				+ ", author=" + Arrays.toString(author) + ", pubdate=" + pubdate + ", tags="
				+ Arrays.toString(tags) + ", origin_title=" + origin_title
				+ ", image=" + image + ", binding=" + binding + ", translator="
				+ translator + ", catalog=" + catalog + ", pages=" + pages
				+ ", images=" + images + ", alt=" + alt + ", id=" + id
				+ ", publisher=" + publisher + ", isbn10=" + isbn10
				+ ", isbn13=" + isbn13 + ", title=" + title + ", url=" + url
				+ ", alt_title=" + alt_title + ", author_intro=" + author_intro
				+ ", summary=" + summary + ", price=" + price + "]";
	}

}
