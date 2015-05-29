var totalPages = 1;
var currentPage = 1;
var outstr = "";
var query = decodeURIComponent(location.search.substr(1));
var searchArr = query.split("&");
if(searchArr.length == 1 && searchArr[0].split("=")[0] == "q"){
	var search = searchArr[0].split("=")[1];
}else if(searchArr.length > 1){
	for(var i=0;i<searchArr.length;i++){
		var books = searchArr[i];
		if(books.split("=")[0] == "q"){
			var search = books.split("=")[1];
		}
		if(books.split("=")[0] == "pageNum"){
			var pageNum = books.split("=")[1];
		}
	}
}

//var search = searchArr[0].split("=")[1];
//if(searchArr.length > 1){
//	var pageArr = searchArr[1].split("=");
//	var pageNum = pageArr[1];	
//}
if(pageNum == null){
	pageNum = 1;
}
var start = (pageNum - 1) * 10;
selectBookList(search);

function selectBookList(search){
	alert(search);
	$.ajax({
		type:"GET",
		url:"http://localhost/DouBanBook/books/search.json",
		data:"q="+search+"&start="+start,
		dataType:"json",
		success:function(data){
			var content = "";
			if(data['books'].length == 0){
				content = "<li class='book-item'>无数据</li>";
			}
			for(var i=0;i<data['books'].length;i++){
				content += "<li class='book-item'><div class='bookpic'><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"'><img src='"+data['books'][i]['images']['medium']+"' width='100' height='160' /></a></div><div class='book-info'><h2><a href='http://localhost/DouBanBook/html/book.html?id="+data['books'][i]['id']+"'>"+data['books'][i]['title']+"</a></h2><div class='pub'><span>作者："+data['books'][i]['author'] +"</span></div><div class='pub'><span>出版社："+ data['books'][i]['publisher'] + "</span></div><div class='pub'><span>出版日期" + data['books'][i]['pubdate'] + "</span></div><div class='pub'><span>价格：" + data['books'][i]['price']+"</span></div></div></li>";
			}
			$("title").html(search);
			$("#booklist").html(content);
			$("#inp-query").val(search);
			totalPages = parseInt(data['total'] / 10);
			currentPage = parseInt(data['start'] / 10 + 1);
			outstr = "";
			setpage(search); 
		}
	});
}
function gotopage(target) 
{     
    currentPage = target;        //把页面计数定位到第几页 
    setpage(); 
    //reloadpage(target);    //调用显示页面函数显示第几页,这个功能是用在页面内容用ajax载入的情况 
} 
function setpage(search) 
{ 
    if(totalPages<=10){        //总页数小于十页 
        for (count=1;count<=totalPages;count++) 
        {    if(count!=currentPage) 
            { 
                outstr = outstr + "<a href='http://localhost/DouBanBook/html/book_list.html?q="+search+"&pageNum="+count+"' >"+count+"</a>"; 
            }else{ 
                outstr = outstr + "<span class='current' >"+count+"</span>"; 
            } 
        } 
    } 
    if(totalPages>10){        //总页数大于十页 
        if(parseInt((currentPage-1)/10) == 0) 
        {             
            for (var count=1;count<=10;count++) 
            {   
            	if(count!=currentPage) 
                { 
                    outstr = outstr + "<a href='http://localhost/DouBanBook/html/book_list.html?q="+search+"&pageNum="+count+"' >"+count+"</a>"; 
                }else{ 
                    outstr = outstr + "<span class='current'>"+count+"</span>"; 
                } 
            } 
            outstr = outstr + "<a href='http://localhost/DouBanBook/html/book_list.html?q="+search+"&pageNum="+count+"' > ▷ </a>"; 
        } 
        else if(parseInt((currentPage-1)/10) == parseInt(totalPages/10)) 
        {     
            outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+(parseInt((currentPage-1)/10)*10)+")'>◁</a>"; 
            for (count=parseInt(totalPages/10)*10+1;count<=totalPages;count++) 
            {    if(count!=currentPage) 
                { 
                    outstr = outstr + "<a href='http://localhost/DouBanBook/html/book_list.html?q="+search+"&pageNum="+count+"' >"+count+"</a>"; 
                }else{ 
                    outstr = outstr + "<span class='current'>"+count+"</span>"; 
                } 
            } 
        }
        else 
        {     
            outstr = outstr + "<a href='http://localhost/DouBanBook/html/book_list.html?q="+search+"&pageNum="+(parseInt((currentPage-1)/10)*10)+"'>◁</a>"; 
            for (count=parseInt((currentPage-1)/10)*10+1;count<=parseInt((currentPage-1)/10)*10+10;count++) 
            {   
                if(count!=currentPage) 
                { 
                    outstr = outstr + "<a href='http://localhost/DouBanBook/html/book_list.html?q="+search+"&pageNum="+count+"' >"+count+"</a>"; 
                }else{ 
                    outstr = outstr + "<span class='current'>"+count+"</span>"; 
                } 
            } 
            outstr = outstr + "<a href='http://localhost/DouBanBook/html/book_list.html?q="+search+"&pageNum="+count+"' > ▷ </a>"; 
        } 
    }
    $("#setpage").html("<div id='setpage'><span id='info'>共"+totalPages+"页|第"+currentPage+"页<\/span>" + outstr + "<\/div>");
    outstr = ""; 
} 
