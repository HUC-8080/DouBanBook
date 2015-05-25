var search = decodeURIComponent(location.search.substring(1));
var searchArr = search.split("&");
for(var i=0;i<searchArr.length;i++){
	var key = searchArr[i].split("=")[0];
	var value = searchArr[i].split("=")[1];
	if(key == "code" && value == 7010){
		alert("手机绑定成功");
	}
	if(key == "code" && value == 7012){
		alert("邮箱绑定成功");
	}
}
/**
 * 绑定信息
 */
function isBind(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/binding.json?op=isBinding",
		dataType:"json",
		success:function(data){
			if(data['code'] == 7001){
				$("#telephone").val(data['binding']['telephone']);
				$("#email").val(data['binding']['email']);
				$("#telephone").attr("disabled",true);
				$("#email").attr("disabled",true);
				if(data['binding']['telephone'] != null && data['binding']['telephone'] != ""){
					$(".BindingTelephone").hide();
					$(".modifyTelephone").show();
					$(".BindingedTelephone").show();
					$(".notBindingTelephone").hide();
				}else{
					$(".BindingTelephone").show();
					$(".modifyTelephone").hide();
					$(".BindingedTelephone").hide();
					$(".notBindingTelephone").show();
				}
				if(data['binding']['email'] != null && data['binding']['email'] != ""){
					$(".BindingEmail").hide();
					$(".modifyEmail").show();
					$(".BindingedEmail").show();
					$(".notBindingEmail").hide();
				}else{
					$(".modifyEmail").hide();
					$(".BindingEmail").show();
					$(".BindingedEmail").hide();
					$(".notBindingEmail").show();
				}
			}else if(data['code'] == 7006){
				$(".BindingedTelephone").hide();
				$(".BindingedEmail").hide();
				$(".modifyEmail").hide();
				$(".modifyTelephone").hide();
			}
		}
	});
}
/**
 * 用户没有绑定邮箱或手机
 */
function telAndEmail(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/user.json?op=selectTelAndEmail",
		dataType:"json",
		success:function(data){
			if($("input[name='telephone']").val() == null || $("input[name='telephone']").val() == ""){
				$("input[name='telephone']").val(data['user']['telephone']);
				$(".modifyTelephone").hide();
				$(".BindingTelephone").show();
			}
			if($("input[name='email']").val() == null || $("input[name='email']").val() == ""){
				$("input[name='email']").val(data['user']['email']);
				$(".modifyEmail").hide();
				$(".BindingEmail").show();
			}
		}
	});
}
$(function(){
	isBind();
	telAndEmail();
	$(".BindingTelephone").click(function(){
		var telephone = $("input[name='telephone']").val();
		location.href = "http://localhost/DouBanBook/html/phone_activation.html?telephone="+telephone;
	});
	$(".BindingEmail").click(function(){
		var email = $("input[name='email']").val();
		location.href = "http://localhost/DouBanBook/html/mail_activation.html?email="+email;
	});
});