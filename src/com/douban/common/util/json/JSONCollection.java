/**
 * <p>Title: JSONCollection.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 25, 2015
 * @version 
 */
package com.douban.common.util.json;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.douban.model.entity.vo.Book;
import com.douban.model.entity.vo.Collection;
import com.douban.model.entity.vo.Images;
import com.douban.model.entity.vo.Rating;
import com.douban.model.entity.vo.Tag;

/**
 * @author 马金健
 *
 */
public class JSONCollection {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 25, 2015 9:58:37 PM
	 * @version 
	 */
	public JSONCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Collection> getCollections(String result){
		JSONObject object = JSONObject.fromObject(result);
		JSONArray jsoncollections = object.getJSONArray("collections");
		JSONObject jsoncollection = null;
		List<Collection> collections = new ArrayList<Collection>();
		for (int i = 0; i < jsoncollections.size(); i++) {
			jsoncollection = (JSONObject) jsoncollections.get(i);
			Collection collection = new Collection();
			
			//status
			String status = jsoncollection.getString("status");
			collection.setStatus(status);
			
			//rating
			JSONObject jsonrating = jsoncollection.getJSONObject("rating");
			Rating rating = new Rating();
			int max = jsonrating.getInt("max");
			rating.setMax(max);
			String value = jsonrating.getString("value");
			rating.setValue(value);
			int min = jsonrating.getInt("min");
			rating.setMin(min);
			collection.setRating(rating);
			
			//updated
			String updated = jsoncollection.getString("updated");
			collection.setUpdated(updated);
			
			//user_id
			String user_id = jsoncollection.getString("user_id");
			collection.setUser_id(user_id);
			
			//tags
			JSONArray jsontags = jsoncollection.getJSONArray("tags");
			Object[] objTags = jsontags.toArray();
			String[] tags = new String[objTags.length];
			for (int j = 0; j < objTags.length; j++) {
				tags[j] = (String) objTags[j];
			}
			
			JSONObject jsonbook = jsoncollection.getJSONObject("book");
			Book book = new Book();
			
			//rating
			JSONObject jsonrating1 = jsonbook.getJSONObject("rating");
			int max1 = jsonrating1.getInt("max");
			int numRaters = jsonrating1.getInt("numRaters");
			String average = jsonrating1.getString("average");
			int min1 = jsonrating1.getInt("min");
			Rating rating1 = new Rating(max1, numRaters, average, min1);
			book.setRating(rating1);
			
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
			JSONArray jsontags1 = jsonbook.getJSONArray("tags");
			Tag[] tags1 = new Tag[jsontags1.size()];
			for(int i2=0;i2<jsontags1.size();i2++){
				Tag tag1 = null;
				JSONObject jsontag = (JSONObject) jsontags1.get(i2);
				tag1 = (Tag) JSONObject.toBean(jsontag, Tag.class);
				tags1[i2] = tag1;
			}
			book.setTags(tags1);
			
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
			collection.setBook(book);

			//book_id
			String book_id = jsoncollection.getString("book_id");
			collection.setBook_id(book_id);
			
			//id
			int id1 = jsoncollection.getInt("id");
			collection.setId(id1);
			
			collections.add(collection);
		}
		return collections;
	} 
	
	public static Collection getCollection(String result){
		JSONObject jsoncollection = JSONObject.fromObject(result);
		Collection collection = (Collection) JSONObject.toBean(jsoncollection, Collection.class);
		return collection;
	}
}
