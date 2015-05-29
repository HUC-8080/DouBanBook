var search = decodeURIComponent(location.search.substr(1));
var searchArr = search.split("&");
var bookid = 0;
for(var i=0;i<searchArr.length;i++){
	var key   = searchArr[i].split("=")[0];
	var value = searchArr[i].split("=")[1];
	if(key == "id"){
		bookid = value;
	}
} 
/**
 * 获取书籍信息
 */
function selectBookInfo(){
	 $("input[name='bookid']").val(bookid);
	 $.ajax({
		 type:"GET",
		 url:"http://localhost/DouBanBook/book/search.json?bookid="+bookid,
		 dataType:"json",
		 success:function(data){
			 $("#title").val(data['title']);
			 $("#bookpic").html("<a href='"+data['id']+"'><img src='"+data['images']['large']+"' width='150' height='240' title='' alt=''/></a>");
			 $("#author").html("<a href='http://localhost/DouBanBook/html/book_list.html?q="+data['author']+"'>"+data['author']+"</a></span>");
			 $("#pub").html(data['publisher']);
			 $("#pubdate").html(data['pubdate']);
			 $("#pages").html(data['pages']);
			 $("#price").html(data['price']);
			 $("#isbn").html(data['isbn10']);
			 $("#binding").html(data['binding']);
			 $("#summary").html(data['summary']);
			 $("#author_intro").html(data['author_intro']);
			 $("title").val(data['title']);
			 $("#inp-query").val(data['title']);
			 $("title").html(data['title']);
			 var catalog = data['catalog'].replace(/\n/,"<br/>");
			 if(catalog == ""){
				 $("#catalog").html("无");
			 }else{
				 $("#catalog").html(catalog);
			 }
		 }
	 });
 }
 /**
 * 判断用户是否已经登录
 */
function collectIsLogin(){
	 $.ajax({
		 type:"GET",
		 url:"http://localhost/DouBanBook/user.json?op=isLogin",
		 dataType:"json",
		 success:function(data){
			 if(1001 == data['code']){
				 $("#collect").show();
				 $("#collected").hide();
			 }else if(data['code'] == 1000){
				 $("input[name='userid']").val(data['user']['id']);
				 collectIsCollected();
			 }
		 }
	 });
 }
 /**
 * 判断用户是否已经收藏了这本书 
 * @param userid
 */
function collectIsCollected(){
	 $.ajax({
		 type:"GET",
		 url:"http://localhost/DouBanBook/collect.json?op=isCollect&bookid="+bookid,
		 dataType:"json",
		 success:function(data){
			 if(data['code'] == 3000){
				 $("#collected").show();
				 $("#collect").hide();
			 }else if(data['code'] == 3001){
				 $("#collected").hide();
				 $("#collect").show();
			 }
		 }
	 });
 }
 /**
 *　查询这本书的书评信息　
 */
function selectReview(){
	 $.ajax({
		 type:"GET",
		 url:"http://localhost/DouBanBook/review.json?op=selectReviewsByBookId&bookid="+bookid,
		 dataType:"json",
		 success:function(data){
			var content = "";
			if(data['code'] == 4000){
				for(var i=0;i<data['reviews'].length;i++){
					content += "<li class='comment-item'><h3><span><a href='http://localhost/DouBanBook/html/book_list.html?"+data['reviews'][i]['user']['username']+"'>"+data['reviews'][i]['user']['username']+"</a></span><span>"+data['reviews'][i]['date']+"</span></h3><br/><p>"+data['reviews'][i]['content']+"</p></li>";
				}
				$("#review_list").html(content);
			}else if(data['code'] == 4004){
				$("#review_list").html("<span>此书暂无书评</span>");
			}
		 }
	 });
 }
 /**
 * 收藏这本书
 */
function collect(){
	$.ajax({
		 type:"GET",
		 url:"http://localhost/DouBanBook/user.json?op=isLogin",
		 dataType:"json",
		 success:function(data){
			 if(1001 == data['code']){		//用户未登录
				 if(confirm("您尚未登录！是否现在登录？")){
					 location.href = "http://localhost/DouBanBook/html/login.html";
				 }
			 }else if(data['code'] == 1000){	//用户已登录
				 collectBook();
			 }
		 }
	 });
 }
/**
 * 用户收藏制定的图书
 * @param userid
 */
function collectBook(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/collect.json?op=collect",
		data:"bookid="+bookid,
		dataType:"json",
		success:function(data){
			if(data['code'] == 3002){
				location.reload();
				alert("收藏成功");
			}else if(data['code'] == 3003){
				alert("收藏失败");
			}
		}
	});
}
 /**
 * 取消收藏这本书
 */
function cancelcollect(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/collect.json?op=cancelcollect",
		data:"bookid="+bookid,
		dataType:"json",
		success:function(data){
			if(data['code'] == 3004){
				alert("取消收藏成功");
				location.reload();
			}else if(data['code'] == 3005){
				alert("取消收藏失败");
			}
		}
	});
 }
 /**
 * 发布书评
 */
function publishreview(){
	 var bookid = $("#bookid").val();
	 var userid = $("#userid").val();
	 var content = $("#content").val();
	 if(userid == "" || userid == null){
		 if(confirm("您还未登录!是否现在登录？")){
			 location.href = "http://localhost/DouBanBook/html/login.html";
			 return false;
		 }
		 return false;
	 }
	 return true;
 }
 /*
  * 页面加载
  */
 $(function(){
	 //图书信息
	 selectBookInfo();
	 //查看此用户是否已经收藏了这本图书
	 collectIsLogin();
	 //查看书评信息
	 selectReview();
 });