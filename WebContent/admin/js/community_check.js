$(function(){
	community_list();
});

/**
 * 圈子列表
 */
function community_list(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=communityList",
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='45'>选择</th><th width='200'>圈子名</th><th width='200'>创建人</th><th width='250'>圈子描述</th><th width='100'>创建时间</th><th width='100'>操作</th></tr>";
			if(data['code'] == 8000){
				for(var i=0;i<data['communities'].length;i++){
					if(data['communities'][i]['verify'] != 0){
						content += "<tr><td><input type='checkbox' name='id' value='"+data['communities'][i]['id']+"' /></td><td>"+data['communities'][i]['name']+"</td><td>"+data['communities'][i]['user']['username']+"</td><td>"+data['communities'][i]['description']+"</td><td>"+data['communities'][i]['date']+"</td><td><a class='button button-little' href='javascript:void(0)'>已审核</a> <a class='button border-yellow button-little' href='#' onclick='javascript:deleteCommunity("+data['communities'][i]['id']+")'>删除</a></td></tr>";
					}else{
						content += "<tr><td><input type='checkbox' name='id' value='"+data['communities'][i]['id']+"' /></td><td>"+data['communities'][i]['name']+"</td><td>"+data['communities'][i]['user']['username']+"</td><td>"+data['communities'][i]['description']+"</td><td>"+data['communities'][i]['date']+"</td><td><a class='button border-blue button-little' href='#' onclick='javascript:check("+data['communities'][i]['id']+")'>未审核</a> <a class='button border-yellow button-little' href='#' onclick='javascript:deleteCommunity("+data['communities'][i]['id']+")'>删除</a></td></tr>";
					}
				}
			}
			$("#community_list").html(content);
		}
	});
}
/**
 * 审核圈子
 * @param community_id
 */
function check(community_id){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=check",
		data:"communityid="+community_id,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8090){
				alert("圈子审核成功！！");
			}
			location.reload();
		}
	});
}

/**
 * 删除圈子
 * @param community_id
 */
function deleteCommunity(community_id){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=deleteCommunity",
		data:"communityid="+community_id,
		dataType:"json",
		success:function(data){
			alert(data['code']);
			if(data['code'] == 8009){
				alert("圈子删除成功");
				location.reload();
			}
		}
	});
}
