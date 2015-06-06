var search = decodeURIComponent(location.search.substring(1));
var searchArr = search.split("&");
for(var i=0;i<searchArr.length;i++){
	var key = searchArr[i].split("=")[0];
	var value = searchArr[i].split("=")[1];
	if(key == "articleid" && value != ""){
		selectArticleContent(value);
	}
}

function selectArticleContent(articleid){
	$.ajax({
		type:"GET",
		url:"/DouBanBook/article.json?op=selectArticleContent",
		data:"articleid="+articleid,
	});
}