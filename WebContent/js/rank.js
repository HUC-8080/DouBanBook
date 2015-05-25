function rank_list(){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/rank.json",
		dataType:"json",
		success:function(data){
			var arr = [];
			for(var i=0;i<data['ranks'].length;i++){
				arr[i] = data['ranks'][i]['bookid'];
			}
			var rankStr = arr.join(",");
			select_ranks(rankStr);
		}
	});
}
function select_ranks(rankStr){
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/books/search.json?op=getRanks",
		data:"ranks="+rankStr,
		dataType:"json",
		success:function(data){
			var content = "";
			for(var i=0;i<data['books'].length;i++){
				content += "<li class='item'><span>"+(i+1)+".</span><div class='book-info'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"'>"+data['books'][i]['title']+"</a><div class='author'>"+data['books'][i]['author']+"</div></div></li>";
			}
			$("#ranking").html(content);
		}
	});
}
$(function(){
	rank_list();
});