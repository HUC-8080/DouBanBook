$(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/systeminfo.json?op=sysinfo",
		dataType:"json",
		success:function(data){
			if(data['code'] == 9000){
				$("#userCount").html(data['info']['userCount']);
				$("#communityCount").html(data['info']['communityCount']);
				$("#articleCount").html(data['info']['articleCount']);
				$("#commentCount").html(data['info']['commentCount']);
			}
		}
	});
});