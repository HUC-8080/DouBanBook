	function validate(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/user.json?op=isLogin",
			dataType:"json",
			success:function(data){
				if(1001 == data['code']){
					content = "<li><a href='http://localhost/DouBanBook/html/login.html'>登陆</a></li><li><a href='http://localhost/DouBanBook/html/login.html#toregister'>注册</a></li>";
					$("#userinfo").html(content);
				}else if(data['code'] == 1000){
					content = "<li><a href='javascript:(void);'>"+data['user']['username']+"的账号</a><ul><li><a href='http://localhost/DouBanBook/html/mycollect.html'>我的收藏</a></li><li><a href='http://localhost/DouBanBook/html/mycommunity.html'>我的圈子</a></li><li><a href='http://localhost/DouBanBook/html/setting.html'>安全设置</a></li><li><a href='http://localhost/DouBanBook/html/modify_pass.html'>修改密码</a></li><li><a href='http://localhost/DouBanBook/user?op=logout'>退出</a></li></ul>";
					$("#userinfo").html(content);
				}
			}
		});
	}
	$(function(){
		validate();
	});