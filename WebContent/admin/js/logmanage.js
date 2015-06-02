$(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/adminlog.json?op=selectAdminLog",
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='45'>选择</th><th width='120'>管理员ID</th><th width='200'>管理员账号</th><th width='200'>操作时间</th><th width='250'>具体操作</th><th width='100'>网络地址</th><th width='100'>操作</th></tr>";
			if(data['code'] == 9008){
				for(var i=0;i<data['adminLogs'].length;i++){
					content += "<tr><td><input type='checkbox' name='id' value='"+data['adminLogs'][i]['id']+"' /></td><td>"+data['adminLogs'][i]['id']+"</td><td>"+data['adminLogs'][i]['admin']['username']+"</td><td>"+data['adminLogs'][i]['date']+"</td><td>"+data['adminLogs'][i]['msg']+"</td><td>"+data['adminLogs'][i]['ip']+"</td><td><a class='button border-yellow button-little' href='#' onclick='javascript:deleteLog("+data['adminLogs'][i]['id']+")'>删除</a></td></tr>";
				}
			}
			$("#log_list").html(content);
		}
	});
});

function deleteLog(id){
	if(confirm("您确定删除此条操作记录？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/adminlog.json?op=deleteLog",
			data:"adminlogid="+id,
			dataType:"json",
			success:function(data){
				if(data['code'] == 9009){
					alert("删除管理员日志成功");
					location.reload();
				}
			}
		});
	}
}