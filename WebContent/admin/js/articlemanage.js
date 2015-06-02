$(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/article.json?op=articleList",
		dataType:"json",
		success:function(data){
			var content = "<tr><th width='45'>选择</th><th width='120'>文章ID</th><th width='200'>文章标题</th><th width='200'>所属圈子</th><th width='250'>文章作者</th><th width='100'>发表时间</th><th width='100'>操作</th></tr>";
			if(data['code'] == 8080){
				for(var i=0;i<data['articles'].length;i++){
					if(data['articles'][i]['shield'] == 0){
						content += "<tr><td><input type='checkbox' name='id' value='"+data['articles'][i]['id']+"' /></td><td>"+data['articles'][i]['id']+"</td><td>"+data['articles'][i]['name']+"</td><td>"+data['articles'][i]['community']['name']+"</td><td>"+data['articles'][i]['user']['username']+"</td><td>"+data['articles'][i]['date']+"</td><td><a class='button border-blue button-little' href='#' onclick='javascript:shield("+data['articles'][i]['id']+")'>屏蔽</a> <a class='button border-yellow button-little' href='#' onclick='javascript:deleteArticle("+data['articles'][i]['id']+")'>删除</a></td></tr>";
					}else{
						content += "<tr><td><input type='checkbox' name='id' value='"+data['articles'][i]['id']+"' /></td><td>"+data['articles'][i]['id']+"</td><td>"+data['articles'][i]['name']+"</td><td>"+data['articles'][i]['community']['name']+"</td><td>"+data['articles'][i]['user']['username']+"</td><td>"+data['articles'][i]['date']+"</td><td><a class='button button-little' href='#' onclick='javascript:releaseshield("+data['articles'][i]['id']+")'>屏蔽</a> <a class='button border-yellow button-little' href='#' onclick='javascript:deleteArticle("+data['articles'][i]['id']+")'>删除</a></td></tr>";	
					}
				}
			}else{
				content += "<tr><td>"+data['msg']+"</td></tr>";
			}
			$("#article_list").html(content);
		}
	});
});

function shield(articleid){
	if(confirm("您确定屏蔽此文章？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/article.json?op=shield",
			data:"articleid="+articleid,
			dataType:"json",
			success:function(data){
				if(data['code'] == 8061){
					alert("屏蔽此文章成功！！");
					location.reload();
				}
			}
		});
	}
}
function releaseshield(articleid){
	if(confirm("您确定解除屏蔽此文章？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/article.json?op=releaseshield",
			data:"articleid="+articleid,
			dataType:"json",
			success:function(data){
				if(data['code'] == 8063){
					alert("解除屏蔽此文章！！");
					location.reload();
				}
			}
		});
	}
}
function deleteArticle(articleid){
	if(confirm("您确定删除此文章？")){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/article.json?op=delete",
			data:"articleid="+articleid,
			dataType:"json",
			success:function(data){
				if(data['code'] == 8062){
					alert("删除此文章成功！！");
					location.reload();
				}
			}
		});
	}
}