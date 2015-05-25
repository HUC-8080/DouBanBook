$(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=selectAll",
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='45'>选择</th><th width='120'>用户ID</th><th width='200'>用户名</th><th width='200'>邮箱</th><th width='250'>联系方式</th><th width='100'>创建时间</th><th width='100'>操作</th></tr>";
			if(data['code'] == 1008){
				for(var i=0;i<data['users'].length;i++){
					if(data['users'][i]['isgag'] != 0){
						content += "<tr><td><input type='checkbox' name='id' value='"+data['users'][i]['id']+"' /></td><td>"+data['users'][i]['id']+"</td><td>"+data['users'][i]['username']+"</td><td>"+data['users'][i]['email']+"</td><td>"+data['users'][i]['telephone']+"</td><td>"+data['users'][i]['regdate']+"</td><td><a class='button button-little'>禁言</a> <a class='button border-yellow button-little' href='#' onclick='javascript:deleteUser("+data['users'][i]['id']+")'>删除</a></td></tr>";
					}else{
						content += "<tr><td><input type='checkbox' name='id' value='"+data['users'][i]['id']+"' /></td><td>"+data['users'][i]['id']+"</td><td>"+data['users'][i]['username']+"</td><td>"+data['users'][i]['email']+"</td><td>"+data['users'][i]['telephone']+"</td><td>"+data['users'][i]['regdate']+"</td><td><a class='button border-blue button-little' href='#' onclick='javascript:gag("+data['users'][i]['id']+")'>禁言</a> <a class='button border-yellow button-little' href='#' onclick='javascript:deleteUser("+data['users'][i]['id']+")'>删除</a></td></tr>";
					}
				}
			}
			$("#user_list").html(content);
		}
	});
	$("#batch_delete").click(function(){
		var obj = document.getElementsByName("id");
		var id = "";
		for(var i=0;i<obj.length;i++){
			if(obj[i].checked){
				id += obj[i].value + ",";
			}
		}
		id = id.substring(0, id.length-1);
		if(confirm("您确定删除这些用户？")){
			batch_delete(id);
		}
	});
});

function deleteUser(id){
	if(confirm("您确定有删除此用户？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/user.json?op=deleteUser",
			data:"userid="+id,
			dataType:"json",
			success:function(data){
				alert(data['msg']);
				location.reload();
			}
		});
	}
}

function batch_delete(ids){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=batch_delete",
		data:"ids="+ids,
		dataType:"json",
		success:function(data){
			alert(data['msg']);
			location.reload();
		}
	});
}
function gag(id){
	if(confirm("您确定禁言此用户？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/user.json?op=gag",
			data:"userid="+id,
			dataType:"json",
			success:function(data){
				alert(data['msg']);
				location.reload();
			}
		});
	}
}
