var search = decodeURIComponent(location.search.substring(1));
var searchArr = search.split("&");
var url = decodeURIComponent(location.href);
var urlArr = url.split("/");
if(searchArr == "" && urlArr[urlArr.length-1] != "forget_pass.html"){
//	alert("非法操作！！！！！！现在跳转至首页！！！！！！！！！！！！！！！");
//	location.href = "http://localhost/DouBanBook/html/index.html";
}
for(var i=0;i<searchArr.length;i++){
	var key = searchArr[i].split("=")[0];
	var value = searchArr[i].split("=")[1];
	if(key == "telephone" && value != ""){
		$("input[name='telephone']").val(value);
	}else if(key == "code" && value == 7009){
		alert("手机验证码错误！！！");
	}
}
// JavaScript Document
var wait=60;
function time(o) {
        if (wait == 0) {
            o.removeAttribute("disabled");            
            o.value="免费获取验证码";
            wait = 60;
        } else { // www.jbxue.com
            o.setAttribute("disabled", true);
            o.value="重新发送(" + wait + ")";
            wait--;
            setTimeout(function() {
                time(o);
            },
            1000);
        }
}
function send_validate_code(o){
	time(o);
	var telephone = $("input[name='telephone']").val();
	alert("验证码已经发送！！请您注意查收！！");
	$(".validatecode").removeAttr("style");
	$.ajax({
		type:"POST",
		url:"http://localhost/DouBanBook/binding?op=phone_validate_code",
		data:"telephone="+telephone,
		success:function(data){
		}
	});
}
$(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=isLogin",
		dataType:"json",
		success:function(data){
			if(data['code'] == 1000){
				if($("input[name='username']") != null){
					$("input[name='username']").val(data['user']['username']);
				}
			}
		}
	});
});
document.getElementById("phone_activation").onclick = function(){
	send_validate_code(this);
};