var search = decodeURIComponent(location.search.substr(1));
if(search == ""){
	if(window.location.hash != null){
		var field = window.location.hash.substring(1);
		search = field.split("?");
		search = decodeURIComponent(search[1]);
	}
}
if(search != null){
	var searchArr = search.split("&");
	for(var i=0;i<searchArr.length;i++){
		var key = searchArr[i].split("=")[0];
		var value = searchArr[i].split("=")[1];
		if(key == "code" && value == 1004){
			alert("注册成功");
		}else if(key == "code" && value == 1005){
			alert("注册失败");
		}else if(key == "code" && value == 1018){
			alert("完善信息成功！请您重新登录！！");
		}else if(key == "code" && value == 1020){
			alert("此用户名已经被注册");
		}else if(key == "code" && value == 1021){
			alert("此手机已经被注册");
		}else if(key == "code" && value == 1024){
			alert("此邮箱已经被注册");
		}
	}
}
function validatelogin(){
	$.ajax({
		type:"POST",
		url:"http://localhost/DouBanBook/user.json?op=validateLogin",
		dataType:"json",
		success:function(data){
			if(data['code'] == 1002){
				alert("登录成功");
			}else if(data['code'] == 1003){
				alert("登录失败");
			}
		}
	});
}

function validateusername(){
	var username = $("#usernamesignup").val();
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=validateusername",
		data:"username="+username,
		dataType:"json",
		success:function(data){
			if(data['code'] == 1020){
				alert(data['msg']);
			}
		}
	});
}
function validatetelephone(){
	var telephone = $("#telephonesignup").val();
	if(telephone.length == 0 || telephone == null){
		alert("手机号不能为空！！");
	}
	if(telephone.length != 0 && telephone != null && !(/^1[3|4|5|8][0-9]\d{4,8}$/.test(telephone))){
		alert("手机号格式不正确！！");
	}
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=validatetelephone",
		data:"telephone="+telephone,
		dataType:"json",
		success:function(data){
			if(data['code'] == 1021){
				alert(data['msg']);
			}
		}
	});
}
function validateemail(){
	var email = $("#emailsignup").val();
	var emailExpression = "^([a-zA-Z0-9])+@([a-zA-Z0-9])+(.[a-zA-Z0-9])";
	if(email.length == 0 || email == null){
		alert("邮箱不能为空！！");
	}
	if(email.length != 0 && email != null && !email.match(emailExpression)){
		alert("邮箱格式不正确！！");
	}
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=validateemail",
		data:"email="+email,
		dataType:"json",
		success:function(data){
			if(data['code'] == 1024){
				alert(data['msg']);
			}
		}
	});
}
function checkRegisterForm(){
	var username = $("#usernamesignup").val();
	var telephone = $("#telephonesignup").val();
	var email = $("#emailsignup").val();
	var password = $("#password").val();
	var repassword = $("#repassword").val();
	if(password != repassword){
		alert("两次输入密码不一致！！！");
		return false;
	}
	//验证邮箱
	var email = $("#emailsignup").val();
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
	var telephone = $("#telephonesignup").val();
	if(telephone.length == 0 || telephone == null){
		alert("手机号不能为空！！");
		return false;
	}
	if(!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(telephone))){
		alert("手机号格式不正确！！");
		return false;
	}
}
$(function(){
	validatelogin();
});