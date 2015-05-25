/**
 * <p>Title: JSONParse.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 24, 2015
 * @version 
 */
package com.douban.common.util.json;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.douban.model.entity.vo.Book;
import com.douban.model.entity.vo.Images;
import com.douban.model.entity.vo.Rating;
import com.douban.model.entity.vo.Tag;

/**
 * @author 马金健
 *
 */
public class JSONBook {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 24, 2015 10:45:59 PM
	 * @version 
	 */
	public JSONBook() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getTotal(String result){
		JSONObject object = JSONObject.fromObject(result);
		int total = object.getInt("total");
		return total;
	}
	
	public static List<Book> getBooks(String result){
		JSONObject object = JSONObject.fromObject(result);
		JSONArray jsonbooks = object.getJSONArray("books");
		JSONObject jsonbook = null;
		List<Book> books = new ArrayList<Book>();
		for(int i=0;i<jsonbooks.size();i++){
			Book book = new Book();
			
			jsonbook = jsonbooks.getJSONObject(i);
			
			//rating
			JSONObject jsonrating = jsonbook.getJSONObject("rating");
			int max = jsonrating.getInt("max");
			int numRaters = jsonrating.getInt("numRaters");
			String average = jsonrating.getString("average");
			int min = jsonrating.getInt("min");
			Rating rating = new Rating(max, numRaters, average, min);
			book.setRating(rating);
			
			//subtitle
			String subtitle = jsonbook.getString("subtitle");
			book.setSubtitle(subtitle);
			
			//author
			JSONArray jsonauthor = jsonbook.getJSONArray("author");
			Object[] obAuthor = (Object[]) jsonauthor.toArray();
			String[] author = new String[obAuthor.length];
			for(int i2=0;i2<obAuthor.length;i2++){
				author[i2] = obAuthor[i2].toString();
			}
			book.setAuthor(author);
			
			//pubdate
			String pubdate = jsonbook.getString("pubdate");
			book.setPubdate(pubdate);
			
			//Tags
			JSONArray jsontags = jsonbook.getJSONArray("tags");
			Tag[] tags = new Tag[jsontags.size()];
			for(int i2=0;i2<jsontags.size();i2++){
				Tag tag = null;
				JSONObject jsontag = (JSONObject) jsontags.get(i2);
				tag = (Tag) JSONObject.toBean(jsontag, Tag.class);
				tags[i2] = tag;
			}
			book.setTags(tags);
			
			//origin_title
			String origin_title = jsonbook.getString("origin_title");
			book.setOrigin_title(origin_title);
			
			//image
			String image = jsonbook.getString("image");
			book.setImage(image);
			
			//binding
			String binding = jsonbook.getString("binding");
			book.setBinding(binding);
			
			//translator
			String translator = jsonbook.getString("translator");
			book.setTranslator(translator);
			
			//catalog
			String catalog = jsonbook.getString("catalog");
			book.setCatalog(catalog);
			
			//pages
			String pages = jsonbook.getString("pages");
			book.setPages(pages);
			
			//Images
			JSONObject jsonimages = jsonbook.getJSONObject("images");
			String small = jsonimages.getString("small");
			String medium = jsonimages.getString("medium");
			String large = jsonimages.getString("large");
			Images images = new Images(small, large, medium);
			book.setImages(images);
			
			//alt
			String alt = jsonbook.getString("alt");
			book.setAlt(alt);
			
			//id
			String id = jsonbook.getString("id");
			book.setId(id);
			
			//publisher
			String publisher = jsonbook.getString("publisher");
			book.setPublisher(publisher);
			
			//isbn10
			String isbn10 = jsonbook.getString("isbn10");
			book.setIsbn10(isbn10);
			
			//isbn13
			if(jsonbook.containsValue("isbn13")){
				String isbn13 = jsonbook.getString("isbn13");
				book.setIsbn13(isbn13);
			}
			
			//title
			String title = jsonbook.getString("title");
			book.setTitle(title);
			
			//url
			String url = jsonbook.getString("url");
			book.setUrl(url);
			
			//alt_title
			String alt_title = jsonbook.getString("alt_title");
			book.setAlt_title(alt_title);
			
			//author_intro
			String author_intro = jsonbook.getString("author_intro");
			book.setAuthor_intro(author_intro);
			
			//summary
			String summary = jsonbook.getString("summary");
			book.setSummary(summary);
			
			//price
			String price = jsonbook.getString("price");
			book.setPrice(price);
			
			books.add(book);
		}
		return books;
	}
	
	public static Book getBook(String result){
		Book book = new Book();
		
		JSONObject jsonbook = JSONObject.fromObject(result);
		//rating
		JSONObject jsonrating = jsonbook.getJSONObject("rating");
		int max = jsonrating.getInt("max");
		int numRaters = jsonrating.getInt("numRaters");
		String average = jsonrating.getString("average");
		int min = jsonrating.getInt("min");
		Rating rating = new Rating(max, numRaters, average, min);
		book.setRating(rating);
		
		//subtitle
		String subtitle = jsonbook.getString("subtitle");
		book.setSubtitle(subtitle);
		
		//author
		JSONArray jsonauthor = jsonbook.getJSONArray("author");
		Object[] obAuthor = (Object[]) jsonauthor.toArray();
		String[] author = new String[obAuthor.length];
		for(int i2=0;i2<obAuthor.length;i2++){
			author[i2] = obAuthor[i2].toString();
		}
		book.setAuthor(author);
		
		//pubdate
		String pubdate = jsonbook.getString("pubdate");
		book.setPubdate(pubdate);
		
		//Tags
		JSONArray jsontags = jsonbook.getJSONArray("tags");
		Tag[] tags = new Tag[jsontags.size()];
		for(int i2=0;i2<jsontags.size();i2++){
			Tag tag = null;
			JSONObject jsontag = (JSONObject) jsontags.get(i2);
			tag = (Tag) JSONObject.toBean(jsontag, Tag.class);
			tags[i2] = tag;
		}
		book.setTags(tags);
		
		//origin_title
		String origin_title = jsonbook.getString("origin_title");
		book.setOrigin_title(origin_title);
		
		//image
		String image = jsonbook.getString("image");
		book.setImage(image);
		
		//binding
		String binding = jsonbook.getString("binding");
		book.setBinding(binding);
		
		//translator
		String translator = jsonbook.getString("translator");
		book.setTranslator(translator);
		
		//catalog
		String catalog = jsonbook.getString("catalog");
		book.setCatalog(catalog);
		
		//pages
		String pages = jsonbook.getString("pages");
		book.setPages(pages);
		
		//Images
		JSONObject jsonimages = jsonbook.getJSONObject("images");
		String small = jsonimages.getString("small");
		String medium = jsonimages.getString("medium");
		String large = jsonimages.getString("large");
		Images images = new Images(small, large, medium);
		book.setImages(images);
		
		//alt
		String alt = jsonbook.getString("alt");
		book.setAlt(alt);
		
		//id
		String id = jsonbook.getString("id");
		book.setId(id);
		
		//publisher
		String publisher = jsonbook.getString("publisher");
		book.setPublisher(publisher);
		
		//isbn10
		String isbn10 = jsonbook.getString("isbn10");
		book.setIsbn10(isbn10);
		
		//isbn13
		if(jsonbook.containsValue("isbn13")){
			String isbn13 = jsonbook.getString("isbn13");
			book.setIsbn13(isbn13);
		}
		
		//title
		String title = jsonbook.getString("title");
		book.setTitle(title);
		
		//url
		String url = jsonbook.getString("url");
		book.setUrl(url);
		
		//alt_title
		String alt_title = jsonbook.getString("alt_title");
		book.setAlt_title(alt_title);
		
		//author_intro
		String author_intro = jsonbook.getString("author_intro");
		book.setAuthor_intro(author_intro);
		
		//summary
		String summary = jsonbook.getString("summary");
		book.setSummary(summary);
		
		//price
		String price = jsonbook.getString("price");
		book.setPrice(price);
		
		return book;
	}

}
