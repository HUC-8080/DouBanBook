$(function(){
	var search = decodeURIComponent(location.search.substring(1));
	if(search != null){
		var searchArr = search.split("&");
		for(var i=0;i<searchArr.length;i++){
			var key = searchArr[i].split("=")[0];
			var value = searchArr[i].split("=")[1];
			if(key == "email" && value != null){
				if($("#email") != null){
					$("#email").text(value);
				}
				if($("input[name='email']") != null){
					$.ajax({
						type:"GET",
						url:"http://localhost/DouBanBook/user.json?op=isLogin",
						dataType:"json",
						success:function(data){
							$("input[name='username']").val(data['user']['username']);
							$("input[name='email']").val(value);
						}
					});
				}
			}
			if(key == "email_host" && value != null){
				alert(value);
//				$("modify-pass a").removeAttr("href");
				$(".enterEmail").attr("href","http://"+value);
			}
		}
	}
});
