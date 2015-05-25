function validateIsLogin(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=isLogin",
		dataType:"json",
		success:function(data){
			if(data['code'] == 1000){
				return true;
			}else if(data['code'] == 1001){
				alert("你还未登陆！请先登录在进行操作！！");
				location.href = "http://localhost/DouBanBook/html/login.html";
			}
		}
	});
}
$(function(){
	validateIsLogin();
});