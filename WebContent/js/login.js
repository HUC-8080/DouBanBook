	function validate(){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/user.json?op=isLogin",
			dataType:"json",
			success:function(data){
				if(1001 == data['code']){
					content = "<li><a href='http://localhost/DouBanBook/html/login.html'>登陆</a></li><li><a href='http://localhost/DouBanBook/html/login.html#toregister'>注册</a></li>";
					$("#userinfo").html(content);
				}else if(data['code'] == 1000){
					content = "<li><a href='http://localhost/DouBanBook/user/"+data['user']['id']+"'>"+data['user']['username']+"的账号</a><ul><li><a href='http://localhost/DouBanBook/user/"+data['id']+"?op=center'>个人中心</a></li><li><a href='http://localhost/DouBanBook/html/mycollect.html'>我的收藏</a></li><li><a>我的笔记</a></li><li><a>我的相册</a></li><li><a>我的广播</a></li><li><a href='http://localhost/DouBanBook/user?op=logout'>退出</a></li></ul>";
					$("#userinfo").html(content);
				}
			}
		});
	}
	
	$(function(){
		validate();
	});