	var search = decodeURIComponent(location.search.substr(1));
	var searchArr = search.split("&");
	for(var i=0;i<searchArr.length;i++){
		var key   = searchArr[i].split("=")[0];
		var value = searchArr[i].split("=")[1];
		if(key == "code" && value == "1008"){
			alert("登录成功");
		}
	}
	function selectLiterature(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/books/search.json?tag=文学&start=0&count=10",
			dataType:"json",
			success:function(data){
				content = "";
				for(var i=0;i<data['books'].length;i++){
					content +="<li><div class='cover'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'><img src='"+data['books'][i]['images']['large']+"' width='106px' height='158px' /></a></div><div class='info'><div class='title'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'>"+data['books'][i]['title']+"</a></div><div class='author'>"+data['books'][i]['author'].join("/")+"</div></div></li>";
				}
				$("#literature").html(content);
			}
		});
	}
	function selectPopular(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/books/search.json?tag=流行&start=0&count=10",
			dataType:"json",
			success:function(data){
				content = "";
				for(var i=0;i<data['books'].length;i++){
					content +="<li><div class='cover'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'><img src='"+data['books'][i]['images']['large']+"' width='106px' height='158px' /></a></div><div class='info'><div class='title'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'>"+data['books'][i]['title']+"</a></div><div class='author'>"+data['books'][i]['author'].join("/")+"</div></div></li>";
				}
				$("#popular").html(content);
			}
		});
	}
	function selectCulture(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/books/search.json?tag=文化&start=0&count=10",
			dataType:"json",
			success:function(data){
				content = "";
				for(var i=0;i<data['books'].length;i++){
					content +="<li><div class='cover'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'><img src='"+data['books'][i]['images']['large']+"' width='106px' height='158px' /></a></div><div class='info'><div class='title'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'>"+data['books'][i]['title']+"</a></div><div class='author'>"+data['books'][i]['author'].join("/")+"</div></div></li>";
				}
				$("#culture").html(content);
			}
		});
	}
	function selectLife(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/books/search.json?tag=生活&start=0&count=10",
			dataType:"json",
			success:function(data){
				content = "";
				for(var i=0;i<data['books'].length;i++){
					content +="<li><div class='cover'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'><img src='"+data['books'][i]['images']['large']+"' width='106px' height='158px' /></a></div><div class='info'><div class='title'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'>"+data['books'][i]['title']+"</a></div><div class='author'>"+data['books'][i]['author'].join("/")+"</div></div></li>";
				}
				$("#life").html(content);
			}
		});
	}
	function selectEconomy(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/books/search.json?tag=经管&start=0&count=10",
			dataType:"json",
			success:function(data){
				content = "";
				for(var i=0;i<data['books'].length;i++){
					content +="<li><div class='cover'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'><img src='"+data['books'][i]['images']['large']+"' width='106px' height='158px' /></a></div><div class='info'><div class='title'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'>"+data['books'][i]['title']+"</a></div><div class='author'>"+data['books'][i]['author'].join("/")+"</div></div></li>";
				}
				$("#economy").html(content);
			}
		});
	}
	function selectScience(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/books/search.json?tag=科技&start=0&count=10",
			dataType:"json",
			success:function(data){
				content = "";
				for(var i=0;i<data['books'].length;i++){
					content +="<li><div class='cover'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'><img src='"+data['books'][i]['images']['large']+"' width='106px' height='158px' /></a></div><div class='info'><div class='title'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"' title='"+data['books'][i]['title']+"'>"+data['books'][i]['title']+"</a></div><div class='author'>"+data['books'][i]['author'].join("/")+"</div></div></li>";
				}
				$("#science").html(content);
			}
		});
	}
	function selectEbook(){
		$.ajax({
			type:"GET",
			url:"/DouBanBook/books/search.json?tag=电子图书&start=0&count=9",
			dataType:"json",
			success:function(data){
				content = "";
				for(var i=0;i<data['books'].length;i++){
					content += "<dl><dt><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"'><img src='"+data['books'][i]['images']['small']+"' alt='"+data['books'][i]['alt']+"'/></a></dt><dd><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"'>'"+data['books'][i]['title']+"'</a></dd></dl>";
				}
				$("#e-book").html(content);
			}
		});
	}

	$(function(){
		selectLiterature();
		selectPopular();
		selectCulture();
		selectLife();
		selectEconomy();
		selectScience();
		selectEbook();
	});