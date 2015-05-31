$(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=mycommunities",
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='120'>圈子名称</th><th width='*'>描述</th><th width='100'>创建人</th><th width='100'>创建时间</th><th width='100'>操作</th></tr>";
			if(data['code'] == 8007){
				for(var i=0;i<data["communities"].length;i++){
					content += "<tr><td><a href='http://localhost/DouBanBook/html/community.html?communityid="+data['communities'][i]['id']+"'>"+data['communities'][i]['name']+"</a></td><td>"+data['communities'][i]['description']+"</td><td>"+data['communities'][i]['user']['username']+"</td><td>"+data['communities'][i]['date']+"</td><td><a id='quitCommunity"+data['communities'][i]['id']+"' class='button border-yellow button-little' href='#' onclick='javascript:quitCommunity("+data['communities'][i]['id']+")'>退出</a></td></tr>";	
				}
				$("#mycommunity").html(content);
			}else if(data['code'] == 8008){
				$("#mycommunity").html(data['msg']);
			}
		}
	});
});
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