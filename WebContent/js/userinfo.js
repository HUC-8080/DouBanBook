function getUserInfo(userid){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=userinfo",
		dataType:"json",
		success:function(data){
			if(data['code'] == 1014){
				$("input[name='username']").val(data['user']['username']);
				$("input[name='realname']").val(data['user']['realname']);
				$("input[name='telephone']").val(data['user']['telephone']);
				$("input[name='email']").val(data['user']['email']);
				if(data['user']['sex'] == 0){
					$("input[name='sex']:eq(0)").attr("checked",'checked');
				}else{
					$("input[name='sex']:eq(1)").attr("checked",'checked');
				}
				$("input[name='birth']").val(data['user']['birth']);
				$("input[name='hobby']").val(data['user']['hobby']);
			}
			
		}
	});
}

function getCode(){
	var parameterStr = decodeURIComponent(location.search.substr(1));
	var parameterArr = parameterStr.split("&");
	for(var i=0;i<parameterArr.length;i++){
		if(parameterArr[i].split("=")[0] == "code"){
			if(parameterArr[i].split("=")[1] == 1016){
				alert("修改成功");
			}else{
				alert("修改失败");
			}
		}
	}
}

$(function(){
	getCode();
	getUserInfo(1);
});