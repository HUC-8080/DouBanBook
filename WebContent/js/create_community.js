$(function(){
	isLogin();
	$(".content form").submit(function(){
		
	});
	$("input[name='name']").blur(function(){
		communityNameIsUsed($("input[name='name']").val());
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