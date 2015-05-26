$(function(){
	selectCommunityList();
});

function selectCommunityList(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=communityList",
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='120'>圈子名称</th><th width='*'>描述</th><th width='100'>创建时间</th><th width='100'>操作</th></tr>";
			if(data['code'] == 8000){
				for(var i=0;i<data["communities"].length;i++){
					content += "<tr><td><a href='http://localhost/DouBanBook/html/community.html?communityid="+data['communities'][i]['id']+"'>"+data['communities'][i]['name']+"</a></td><td>"+data['communities'][i]['description']+"</td><td>"+data['communities'][i]['date']+"</td><td><a class='button border-yellow button-little' href='#' onclick='javascript:cancelCollect("+data['communities'][i]['id']+")'>加入</a></td></tr>";
				}
				$("#communities").html(content);
			}else{
				$("#communities").html("尚未创建任何圈子");
			}
		}
	});
}