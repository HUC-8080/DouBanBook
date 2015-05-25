var search = decodeURIComponent(location.search.substring(1));
if(search != null){
	var searchArr = search.split("&");
	for(var i=0;i<searchArr.length;i++){
		var key = searchArr[i].split("=")[0];
		var value = searchArr[i].split("=")[1];
		if(key == "code" && value == 7011){
		
		}
	}
}
function searchBooks(){
	var search = $("#inp-query").val();
	location.href = "http://localhost/DouBanBook/html/book_list.html?q="+search;
}

function getLabels(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/label.json",
		dataType:"json",
		success:function(data){
			var content = "";
			for ( var i = 0; i < data.length; i++) {
				content += "<li><a href='http://localhost/DouBanBook/html/book_list.html?q="+data[i]['name']+"'>"+data[i]['name']+"</a><ul>";
				for(var j=0;j<5;j++){
					content += "<li><a href='http://localhost/DouBanBook/html/book_list.html?q="+data[i]['labels'][j]['name']+"'>"+data[i]['labels'][j]['name']+"</a></li>";
				}
				content += "<li><a href='http://localhost/DouBanBook/html/label_list.html'>更多››</a></li>";
				content += "</ul></li>";
			}
			content += "<li><a href='http://localhost/DouBanBook/html/communities.html'>圈子</a></li>";
			$(".nav").html(content);
		}
	});
}

function getRightLabels(){
	if($(".hot-tags-col5").length != 0){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/label.json",
			dataType:"json",
			success:function(data){
				var content = "";
				for ( var i = 0; i < data.length; i++) {
					content += "<li><span>"+data[i]['name']+"</span><ul>";
					for(var j=0;j<10;j++){
						content += "<li><a href='http://localhost/DouBanBook/html/book_list.html?q="+data[i]['labels'][j]['name']+"'>"+data[i]['labels'][j]['name']+"</a></li>";
					}
					content += "<li><a href='http://localhost/DouBanBook/html/label_list.html'>更多››</a></li>";
					content += "</ul></li>";
				}
				$(".hot-tags-col5").html(content);
			}
		});
	}
}

function rank_list(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/collect.json?op=rank_list",
		dataType:"json",
		success:function(data){
			
		}
	});
}

$(function(){
	getLabels();
	getRightLabels();
});