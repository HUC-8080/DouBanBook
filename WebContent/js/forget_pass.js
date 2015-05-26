var search = decodeURIComponent(location.search.substring(1));
var searchArr = search.split("&");
for(var i=0;i<searchArr.length;i++){
	var key = searchArr[i].split("=")[0];
	var value = searchArr[i].split("=")[1];
	if(key == "code" && value == 7012){
		alert("手机验证码错误！！");
	}
	if(key == "code" && value == 7014){
		alert("安全手机号不正确！！");
	}
	if(key == "code" && value == 7015){
		alert("用户名不正确！！");
	}
	if(key == "code" && value == 7016){
		alert("安全邮箱不正确！！");
	}
}
$(function(){
	$(".selectTelephone").hide();
	$(".selectEmail").hide();
	$(":radio").click(function(){
		if($(this).val() == 0){
			$(".selectTelephone").show();
			$(".selectEmail").hide();
		}else if($(this).val() == 1){
			$(".selectTelephone").hide();
			$(".selectEmail").show();
		}
	});	
	$().submit(function(){
		var username = $("input[name='username']").val();
		if(username == ""){
			alert("用户名不能为空！！！");
			return false;
		}
		if($("input[name='mode']").val() == 0){
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
		}else if($("input[name='mode']").val() == 1){
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
		}
		return true;
	});
});
