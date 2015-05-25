$(function(){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/label.json",
			dataType:"json",
			success:function(data){
				var content = "";
				for(var i=0;i<data.length;i++){
					content += "<li><span>"+data[i]['name']+"</span><ul>";
					for(var j=0;j<data[i]['labels'].length;j++){
						content += "<li><a href='http://localhost/DouBanBook/html/book_list.html?q="+data[i]['labels'][j]['name']+"'>"+data[i]['labels'][j]['name']+"</a></li>";
					}
					content += "</ul></li>";
				}
                $("#label").html(content);
			}
		});
	});