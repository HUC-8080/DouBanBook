function getFriends(userid){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=friendsList",
		dataType:"json",
		success:function(data){
			if(data['code'] == 1015 && data['user']['friends'] != ""){
				var content = "<tr><th width='45'>选择</th><th width='120'>好友名称</th><th width='*'>好友生日</th><th width='100'>兴趣爱好</th><th width='100'>操作</th></tr>";
				for(var i=0;i<data['user']['friends'].length;i++){
					content += "<tr><td><input type='checkbox' name='id' value='"+data['user']['friends'][i]['id']+"' /></td><td>"+data['user']['friends'][i]['username']+"</td><td>"+data['user']['friends'][i]['birth']+"</td><td>"+data['user']['friends'][i]['hobby']+"</td><td><a class='button border-yellow button-little' href='#' onclick='javascript:removeFriend("+data['user']['friends'][i]['id']+")'>删除</a></td></tr>";
				}
				$("#friends").html(content);
			}else if(data['code'] == 1015 && data['user']['friends'] == ""){
				$(".border-bottom").hide();
				$("#friends").html("<span style='font-size:14px;'>您还未添加好友！！赶快去寻找志同道合的小伙伴吧！！！</span>");
			}
		}
	});
}

function batch_delete(ids){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/friend.json?op=removeFriends",
		data:"ids="+ids,
		dataType:"json",
		success:function(data){
			alert(data['msg']);
			location.reload();
		}
	});
}

function removeFriend(id){
	if(confirm("您确认删除此好友？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/friend.json?op=removeFriend",
			data:"id="+id,
			dataType:"json",
			success:function(data){
				alert(data['msg']);
				location.reload();
			}
		});
	}
}
$(function(){
	getFriends(6);
	$('.checkall').click(function(){
		var e=$(this);
		var name=e.attr("name");
		var checkfor=e.attr("checkfor");
		var type;
		if (checkfor!='' && checkfor!=null && checkfor!=undefined){
			type=e.closest('form').find("input[name='"+checkfor+"']");
		}else{
			type=e.closest('form').find("input[type='checkbox']");
		};
		if (name=="checkall"){
			$(type).each(function(index, element){
				element.checked=true;
			});
			e.attr("name","ok");
		}else{
			$(type).each(function(index, element){
				element.checked=false;
			});
			e.attr("name","checkall");
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
		if(confirm("您确定删除这些好友？")){
			batch_delete(id);
		}
	});
});