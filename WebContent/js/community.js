var search = decodeURIComponent(location.search.substring(1));
var searchArr = search.split("&");
for(var i=0;i<searchArr.length;i++){
	var key = searchArr[i].split("=")[0];
	var value = searchArr[i].split("=")[1];
	if(key == "communityid" && value != ""){
		selectArticle(value);
	}
}

function selectArticle(communityid){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=selectArticle",
		data:"communityid="+communityid,
		dataType:"json",
		success:function(data){
			
		}
	});
}