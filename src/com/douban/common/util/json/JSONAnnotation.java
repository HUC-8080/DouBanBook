/**
 * <p>Title: JSONAnnotation.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Apr 27, 2015
 * @version 
 */
package com.douban.common.util.json;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.douban.model.entity.vo.Annotation;
import com.douban.model.entity.vo.Book;
import com.douban.model.entity.vo.Images;
import com.douban.model.entity.vo.Rating;
import com.douban.model.entity.vo.Tag;
import com.douban.model.entity.vo.User;

/**
 * @author 马金健
 *
 */
public class JSONAnnotation {

	/**
	 * <p>Project: DouBanBook</p>
	 * <p>Package: com.douban.common.util.json</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Apr 27, 2015 5:17:11 PM
	 * @version 
	 */
	public JSONAnnotation() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Annotation> getAnnotations(String result){
		JSONObject jsonobject = JSONObject.fromObject(result);
		JSONArray jsonannotations = jsonobject.getJSONArray("annotations");
		List<Annotation> annotations = new ArrayList<Annotation>();
		for(int i=0;i<jsonannotations.size();i++){
			Annotation annotation = new Annotation();
			JSONObject jsonannotation = jsonannotations.getJSONObject(i);
			
			//chapter
			String chapter = jsonannotation.getString("chapter");
			annotation.setChapter(chapter);
			
			//book
			JSONObject jsonbook = jsonannotation.getJSONObject("book");
			Book book = new Book();
			
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
			annotation.setBook(book);
			
			//author_user
			JSONObject jsonauthor_user = jsonannotation.getJSONObject("author_user");
			User author_user = new User();
			
			//name
			String name = jsonauthor_user.getString("name");
			author_user.setName(name);
			
			//is_banned
			boolean is_banned = jsonauthor_user.getBoolean("is_banned");
			author_user.setIs_banned(is_banned);
			
			//is_suicide
			boolean is_suicide = jsonauthor_user.getBoolean("is_suicide");
			author_user.setIs_suicide(is_suicide);
			
			//url
			String url1 = jsonauthor_user.getString("url");
			author_user.setUrl(url1);
			
			//avatar
			String avatar = jsonauthor_user.getString("avatar");
			author_user.setAvatar(avatar);
			
			//uid
			String uid = jsonauthor_user.getString("uid");
			author_user.setUid(uid);
			
			//alt
			String alt1 = jsonauthor_user.getString("alt");
			author_user.setAlt(alt1);
			
			//type
			String type = jsonauthor_user.getString("type");
			author_user.setType(type);
			
			//id
			String id1 = jsonauthor_user.getString("id");
			author_user.setId(id1);
			
			String large_avatar = jsonauthor_user.getString("large_avatar");
			author_user.setLarge_avatar(large_avatar);
			annotation.setAuthor_user(author_user);
			
			//privacy
			int privacy = jsonannotation.getInt("privacy");
			annotation.setPrivacy(privacy);
			
			//abstract_photo
			String abstract_photo = jsonannotation.getString("abstract_photo");
			annotation.setAbstract_photo(abstract_photo);
			
			//summary
			String summary1 = jsonannotation.getString("summary");
			annotation.setSummary(summary1);
			
			//content
			String content = jsonannotation.getString("content");
			annotation.setContent(content);
			
			//photos
//			JSONObject jsonphotos = jsonannotation.getJSONObject("photos");
//			Iterator<Integer> iterator = jsonphotos.keys();
//			Map<Integer, String> photos = new HashMap<Integer, String>();
//			while (iterator.hasNext()) {
//				int key = Integer.valueOf(iterator.next());
//				String value = (String) jsonphotos.get(key);
//				photos.put(key, value);
//			}
//			annotation.setPhotos(photos);
			
			//last_photo
			int last_photo = jsonannotation.getInt("last_photo");
			annotation.setLast_photo(last_photo);
			
			//comments_count
			int comments_count = jsonannotation.getInt("comments_count");
			annotation.setComments_count(comments_count);
			
			//hasmath
			boolean hasmath = jsonannotation.getBoolean("hasmath");
			annotation.setHasmath(hasmath);
			
			//book_id
			String book_id = jsonannotation.getString("book_id");
			annotation.setBook_id(book_id);
			
			//time
			String time = jsonannotation.getString("time");
			annotation.setTime(time);
			
			//author_id
			String author_id = jsonannotation.getString("author_id");
			annotation.setAuthor_id(author_id);
			
			//id
			String id2 = jsonannotation.getString("id");
			annotation.setId(id2);
			
			//page_no
			int page_no = jsonannotation.getInt("page_no");
			annotation.setPage_no(page_no);
			annotations.add(annotation);
		}
		return annotations;
	}
}
