var search = decodeURIComponent(location.search.substr(1));
if(search == ""){
	if(window.location.hash != null){
		var field = window.location.hash.substring(1);
		search = field.split("?");
		search = decodeURIComponent(search[1]);
	}
}
if(search != null){
	var searchArr = search.split("&");
	for(var i=0;i<searchArr.length;i++){
		var key = searchArr[i].split("=")[0];
		var value = searchArr[i].split("=")[1];
		if(key == "code" && value == 8080){
			alert("已经提交管理员审核！！");
		}
	}
}
$(function(){
	selectCommunityList();
//	communityIsLogin();
});

function selectCommunityList(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=communityList",
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='120'>圈子名称</th><th width='*'>描述</th><th width='100'>创建人</th><th width='100'>创建时间</th><th width='100'>操作</th></tr>";
			if(data['code'] == 8000){
				for(var i=0;i<data["communities"].length;i++){
					if(data['communities'][i]['verify'] == 1){
						content += "<tr><td><a href='http://localhost/DouBanBook/html/community.html?communityid="+data['communities'][i]['id']+"'>"+data['communities'][i]['name']+"</a></td><td>"+data['communities'][i]['description']+"</td><td>"+data['communities'][i]['user']['username']+"</td><td>"+data['communities'][i]['date']+"</td><td><a id='joinCommunity"+data['communities'][i]['id']+"' class='button border-yellow button-little' href='#' onclick='javascript:addCommunityIsLogin("+data['communities'][i]['id']+")'>加入</a><a id='quitCommunity"+data['communities'][i]['id']+"' class='button border-yellow button-little' href='#' onclick='javascript:quitCommunity("+data['communities'][i]['id']+")'>退出</a></td></tr>";	
					}
				}
				$("#communities").html(content);
				for(var i=0;i<data['communities'].length;i++){
					$("#quitCommunity"+data['communities'][i]['id']).hide();
					if(data['communities'][i]['verify'] == 1){
						userIsJoinedThisCommunity(data['communities'][i]['id']);
					}
				}
			}else{
				$("#communities").html("尚未创建任何圈子");
			}
		}
	});
}

function addCommunityIsLogin(id){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=isLogin",
		dataType:"json",
		success:function(data){
			if(1001 == data['code']){
				alert("您还未登陆！！请先登录！！在加入圈子！！");
			}else{
				addCommunity(data['user']['id'],id);
			}
		}
	});
}

function addCommunity(userid , id){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=joinCommunity",
		data:"userid="+userid+"&communityid="+id,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8001){
				alert("加入圈子成功！！");
				location.reload();
			}
		}
	});
}
function userIsJoinedThisCommunity(communityId){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=userIsJoinThisCommunity",
		data:"communityid="+communityId,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8002){
				$("#joinCommunity"+communityId).attr("href", "javascript:void(0);");
				$("#joinCommunity"+communityId).removeAttr("onclick");
				$("#quitCommunity"+communityId).show();
				$("#joinCommunity"+communityId).hide();
//				alert($(".quitCommunity").html());
//				alert("显示退出");
//				alert("不显示加入");
			}else{
				
				$("#joinCommunity"+communityId).show();
				$("#quitCommunity"+communityId).hide();
//				alert("显示加入");
//				alert("不显示退出");
			}
		}
	});
}
function quitCommunity(communityId){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=quitCommunity",
		data:"communityid="+communityId,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8006){
				alert("退出圈子成功");
				location.reload();
			}
		}
	});
}
function createcommunity(){
	$.ajax({
		type:"GET",
		url:"/DouBanBook/user.json?op=isLogin",
		dataType:"json",
		success:function(data){
			if(data['code'] == 1000){
				location.href = "http://localhost/DouBanBook/html/create_community.html";
			}else{
				alert("您还未登陆！！请先登录！！");
			}
		}
	});
}