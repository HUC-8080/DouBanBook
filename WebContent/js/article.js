var search = decodeURIComponent(location.search.substring(1));
var searchArr = search.split("&");
for(var i=0;i<searchArr.length;i++){
	var key = searchArr[i].split("=")[0];
	var value = searchArr[i].split("=")[1];
	if(key == "articleid" && value != ""){
		selectArticleContent(value);
		selectArticleComment(value);
	}
	if(key == "code" && value == 10002){
		alert("发表评论成功");
	}
}

function selectArticleContent(articleid){
	$.ajax({
		type:"GET",
		url:"/DouBanBook/article.json?op=selectArticleContent",
		data:"articleid="+articleid,
		dataType:"json",
		success:function(data){
			var content = "";
			content += "<li class='comment-item'><h4><span>作者:<a href='javascript:void(0);'>"+data['article']['user']['username']+"</a></span>&nbsp;&nbsp;&nbsp;<span>日期:"+data['article']['date']+"</span>&nbsp;&nbsp;<a href='#selectcomment'>评论(<span id='commentCount'>0</span>)</a></h4><br/><p>"+data['article']['content']+"</p></li>";
			$("#content").html(content);
			$("#articleid").val(data['article']['id']);
			$("#articleName").html(data['article']['name']);
		}
	});
}

function selectArticleComment(articleid){
	$.ajax({
		type:"GET",
		url:"/DouBanBook/comment.json?op=selectArticleComment",
		data:"articleid="+articleid,
		dataType:"json",
		success:function(data){
			var content = "";
			if(data['code'] == 10001){
				for(var i=0;i<data['comments'].length;i++){
					content += "<li class='comment-item'><h5><span><a href='javascript:void(0);'>"+data['comments'][i]['user']['username']+"</a></span>&nbsp;&nbsp;&nbsp;<span>发表日期:"+data['comments'][i]['date']+"</span></h4><br/><p>"+data['comments'][i]['content']+"</p></li>";
				}
				$("#review_list").html(content);
				$("#commentCount").html(data['comments'].length);	
			}else{
				$("#commentCount").html(0);
				$("#review_list").html(data['msg']);
			}
		}
	});
}
$(document).ready(function(){
	$.ajax({
		type:"GET",
		url:"/DouBanBook/user.json?op=isLogin",
		dataType:"json",
		success:function(data){
			if(data['code'] == 1001){
				$(".publish-comment").hide();
				$(".prompt-info").show();
			}else{
				$(".publish-comment").show();
				$(".prompt-info").hide();
			}
		}
	});
	$(".publish-comment form").submit(function(){
		if($("textarea[name='content']").val() == ""){
			alert("评论内容不能为空！！！");
			return false;
		}
		return true;
	});
});
