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
		url:"/DouBanBook/article.json?op=articleListByCommunityId",
		data:"communityid="+communityid,
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='200'>文章标题</th><th width='100'>所属圈子</th><th width='50'>作者</th><th width='50'>日期</th></tr>";
			if(data['code'] == 8081){
				for(var i=0;i<data['articles'].length;i++){
					content += "<tr><td><a href='http://localhost/DouBanBook/html/article.html?articleid="+data['articles'][i]['id']+"'>"+data['articles'][i]['name']+"</a></td><td>"+data['articles'][i]['community']['name']+"</td><td>"+data['articles'][i]['user']['username']+"</td><td>"+data['articles'][i]['date']+"</td></tr>";	
				}
				
			}
			if(data['code'] == 8082){
				content += "<tr><td style='font-size:20px;'>此圈子尚无任何文章！！</td></tr>";
			}
			$("#articles").html(content);
		}
	});
}
$(function(){
	$("#joinThisCommunity").click(function(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/user.json?op=isLogin",
			dataType:"json",
			success:function(data){
				if(data['code'] == 1000){
					alert(data['user']['id']);
					alert(value);
					joinThisCommunity(data['user']['id'],value);
				}else{
					alert("您还未登录！！请先登录！！！");
				}
			}
		});
	});
	$("#writeArticle").click(function(){
		location.href = "/DouBanBook/html/article.html?articleid="+value;
	});
});

/**
 * 加入这个圈子
 * @param community
 */
function joinThisCommunity(userid, communityid){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=joinCommunity",
		data:"userid="+userid+"&communityid="+communityid,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8001){
				alert("加入圈子成功！！");
				location.reload();
			}
		}
	});
}
$(document).ready(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=userIsJoinThisCommunity",
		data:"communityid="+value,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8002){
				$("#joinThisCommunity").hide();
			}else{
				$("#writeArticle").hide();
			}
		}
	});
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=queryCommunityName",
		data:"communityid="+value,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8061){
				$("#communityName").html(data['community']['name']);
			}
		}
	});
});
