function getCollectList(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/collect.json?op=collectList",
		data:"userid="+1,
		dataType:"json",
		success:function(data){
			var bookids = "";
			var collectids = "";
			if(data['code'] == 3006){
				for(var i=0;i<data['collects'].length;i++){
					collectids += data['collects'][i]['id'] + ",";
					bookids += data['collects'][i]['bookid'] + ","; 
				}
				collectids = collectids.substring(0, collectids.length-1);
				bookids = bookids.substring(0, bookids.length-1);
				getCollectBook(bookids,collectids);
			}else{
				$("#collects").html("您还未收藏任何图书！！");
			}
			
		}
	});
}

function getCollectBook(bookids,collectids){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/books/search.json?op=collectBooks",
		data:"bookids="+bookids,
		dataType:"json",
		success:function(data){
			var collects = collectids.split(",");
			var content = "<tr><th width='45'>选择</th><th width='120'>书名</th><th width='*'>作者</th><th width='100'>出版时间</th><th width='100'>操作</th></tr>";
			for(var i=0;i<data['books'].length;i++){
				content += "<tr><td><input type='checkbox' name='id' value='"+collects[i]+"' /></td><td>"+data['books'][i]['title']+"</td><td>"+data['books'][i]['author']+"</td><td>"+data['books'][i]['pubdate']+"</td><td><a class='button border-yellow button-little' href='#' onclick='javascript:cancelCollect("+data['books'][i]['id']+")'>删除</a></td></tr>";
			}
			$("#collects").html(content);
		}
	});
}

function cancelCollect(bookid){
	if(confirm("您确定要取消收藏这本图书吗？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/collect.json?op=cancelcollect",
			data:"bookid="+bookid+"&userid="+1,
			dataType:"json",
			success:function(data){
				if(data['code'] == 3004){
					alert(data['msg']);
					location.reload();
				}
			}
		});
	}
}
function batch_delete(ids){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/collect.json?op=batch_delete",
		data:"ids="+ids+"&userid="+6,
		dataType:"json",
		success:function(data){
			alert(data['msg']);
			location.reload();
		}
	});
}
$(function(){
	getCollectList();
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
		if(confirm("您确定删除这些收藏？")){
			batch_delete(id);
		}
	});
});