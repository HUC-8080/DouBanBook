var url = decodeURIComponent(location.href);
var urlArr = url.split("/");
var pageStr = urlArr[urlArr.length - 1];
var page = pageStr.split("?")[0];
var search = pageStr.split("?")[1];
if(search != null){
	var searchArr = search.split("&");
	for(var i=0;i<searchArr.length;i++){
		var key = searchArr[i].split("=")[0];
		var value = searchArr[i].split("=")[1];
		if(key == "code" && value == 6001){
			alert("账号/密码错误！！！");
		}
		if(key == "code" && value == 6000){
			alert("登陆成功!!");
		}
	}
}

$(function(){
	if(page != "login.html"){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/administrator.json?op=isLogin",
			dataType:"json",
			success:function(data){
				if(data['code'] != 6002){
					alert("您还未登陆！！现在跳转至登陆页面！！");
					location.href = "http://localhost/DouBanBook/admin/login.html";
				}
			}
		});
	}
});