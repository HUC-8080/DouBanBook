$(function(){
	var search = decodeURIComponent(location.search.substr(1));
	if(search == ""){
		alert("非法操作，现在跳转至登录页面");
		location.href = "http://localhost/DouBanBook/html/login.html";
	}else{
		var searchArr = search.split("&");
		for(var i=0;i<searchArr.length;i++){
			var key = searchArr[i].split("=")[0];
			var value = searchArr[i].split("=")[1];
			if(key == "username" && value != null){
				$("input[name='username']").val(value);
				$("title").html("完善个人信息-"+value);
			}else if(key == "code" && value == 1019){
				alert("完善个人信息失败，请您重新输入！！");
			}
		}
	}
});

function checkUserInfo(){
	//验证密码
	var password = $("input[name='password']").val();
	var repassword = $("input[name='repassword']").val();
	if(password.length == 0 || password == null){
		alert("密码不能为空！！");
		return false;
	}
	if(repassword.length == 0 || repassword == null){
		alert("确认密码不能为空！！");
		return false;
	}
	if(password != repassword){
		alert("两次输入的密码不一致！！");
		return false;
	}
	if(password.length > 25 || password.length < 8 ){
		alert("密码长度不足！密码长度应在8-25个字符");
		return false;
	}
	//验证邮箱
	var email = $("input[name='email']").val();
	var emailExpression = "^([a-zA-Z0-9])+@([a-zA-Z0-9])+(.[a-zA-Z0-9])";
	if(email.length == 0 || email == null){
		alert("邮箱不能为空！！");
		return false;
	}
	if(!email.match(emailExpression)){
		alert("邮箱格式不正确！！");
		return false;
	}
	//验证手机号
	var telephone = $("input[name='telephone']").val();
	if(telephone.length == 0 || telephone == null){
		alert("手机号不能为空！！");
		return false;
	}
	if(!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(telephone))){
		alert("手机号格式不正确！！");
		return false;
	}
	//验证出生年月
	var birth = $("input[name='birth']").val();
	if(birth.length == 0 || birth == null){
		alert("出生年月不能为空 ！！");
		return false;
	}
	return true;
}