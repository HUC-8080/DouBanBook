$(function(){
	isLogin();
	$(".content form").submit(function(){
		if($("input[name='name']").val() == ""){
			return false;
		}
		if($("input[name='description']").val() == ""){
			return false;
		}
		return true;
	});
	$("input[name='name']").blur(function(){
		if($("input[name='name']").val() != ""){
			communityNameIsUsed($("input[name='name']").val());
		}else{
			$(".nameMsg").html("<span style='color:red;'>圈子名不能为空！！</span>");
		}
	});
	$("input[name='description']").blur(function(){
		if($("input[name='description']").val() == ""){
			$(".descriptionMsg").html("<span style='color:red;'>圈子描述不能为空！！</span>");
		}
		if($("input[name='description']").val() != ""){
			$(".descriptionMsg").html("");
		}
	});
});

function isLogin(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=isLogin",
		dataType:"json",
		success:function(data){
			if(1001 == data['code']){
				alert("非法操作！！请您先登录！！");
				location.href = "http://localhost/DouBanBook/html/login.html";
			}
		}
	});
}
function communityNameIsUsed(name){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/community.json?op=communityNameIsUsed",
		data:"name="+name,
		dataType:"json",
		success:function(data){
			if(data['code'] == 8004){
				$(".nameMsg").html("<span style='color:black;'>"+data['msg']+"</span>");
			}else if(data['code'] == 8005){
				$(".nameMsg").html("<span style='color:red;'>"+data['msg']+"</span>");
				
			}
		}
	});
}