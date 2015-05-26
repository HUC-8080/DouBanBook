var search = decodeURIComponent(location.search.substring(1));
if(search != null){
	var searchArr = search.split("&");
	for(var i=0;i<searchArr.length;i++){
		var key = searchArr[i].split("=")[0];
		var value = searchArr[i].split("=")[1];
		if(key == "code" && value == 7011){
		
		}else if(key == "code" && value == 1026){
			alert("密码有误！！请重新输入");
		}else if(key == "code" && value == 1027){
			alert("密码修改成功！！");
		}
	}
}
/**
 * 搜索图书
 */
function searchBooks(){
	var search = $("#inp-query").val();
	location.href = "http://localhost/DouBanBook/html/book_list.html?q="+search;
}

/**
 * 上方的标签
 */
function getLabels(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/label.json",
		dataType:"json",
		success:function(data){
			var content = "";
			for ( var i = 0; i < data.length; i++) {
				content += "<li><a href='http://localhost/DouBanBook/html/book_list.html?q="+data[i]['name']+"'>"+data[i]['name']+"</a><ul>";
				for(var j=0;j<5;j++){
					content += "<li><a href='http://localhost/DouBanBook/html/book_list.html?q="+data[i]['labels'][j]['name']+"'>"+data[i]['labels'][j]['name']+"</a></li>";
				}
				content += "<li><a href='http://localhost/DouBanBook/html/label_list.html'>更多››</a></li>";
				content += "</ul></li>";
			}
			content += "<li><a href='http://localhost/DouBanBook/html/communities.html'>圈子</a></li>";
			$(".nav").html(content);
		}
	});
}

/**
 * 右边的标签
 */
function getRightLabels(){
	if($(".hot-tags-col5").length != 0){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/label.json",
			dataType:"json",
			success:function(data){
				var content = "";
				for ( var i = 0; i < data.length; i++) {
					content += "<li><span>"+data[i]['name']+"</span><ul>";
					for(var j=0;j<10;j++){
						content += "<li><a href='http://localhost/DouBanBook/html/book_list.html?q="+data[i]['labels'][j]['name']+"'>"+data[i]['labels'][j]['name']+"</a></li>";
					}
					content += "<li><a href='http://localhost/DouBanBook/html/label_list.html'>更多››</a></li>";
					content += "</ul></li>";
				}
				$(".hot-tags-col5").html(content);
			}
		});
	}
}

/**
 * 收藏排行榜
 */
function rank_list(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/collect.json?op=rank_list",
		dataType:"json",
		success:function(data){
			
		}
	});
}
function getUserName(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=isLogin",
		dataType:"json",
		success:function(data){
			$("input[name='username']").val(data['user']['username']);
		}
	});
}

$(function(){
	getLabels();
	getRightLabels();
	if($("input[name='username']") != null){
		getUserName();
	}
	if($("#modify_pass") != null){
		$("#modify_pass").submit(function(){
			var username = $("input[name='username']").val();
			var repassword = $("input[name='repassword']").val();
			var newpassword = $("input[name='newpassword']").val();
			var cnewpassword = $("input[name='cnewpassword']").val();
			if($("input[name='repassword']").val() == ""){
				alert("旧密码不能为空！！");
				return false;
			}
			if(newpassword.length > 25 || newpassword.length < 8){
				alert("密码长度不足！！");
				return false;
			}
			if(newpassword != cnewpassword){
				alert("两次输入密码不一致！！");
				return false;
			}
			return true;
		});
		$("input[name='repassword']").blur(function(){
			if($("input[name='repassword']").val() == ""){
				alert("旧密码不能为空！！");
			}
		});
		$("input[name='newpassword']").blur(function(){
			if($("input[name='newpassword']").val() == ""){
				alert("新密码不能为空！！");
			}
			if($("input[name='newpassword']").val() != "" && ($("input[name='newpassword']").val().length > 25 || $("input[name='newpassword']").val().length < 8)){
				alert("新密码长度不符合规定！！");
			}
		});
		$("input[name='cnewpassword']").blur(function(){
			if($("input[name='newpassword']").val() == ""){
				alert("确认密码不能为空！！");
			}
			if($("input[name='newpassword']").val() != $("input[name='cnewpassword']").val()){
				alert("两次输入密码不一致！！");
			}
		});
	}
});