$(document).ready(function(){
	var search = decodeURIComponent(location.search.substr(1));
	var searchArr = search.split("&");
	var bookid = 0;
	for(var i=0;i<searchArr.length;i++){
		var key   = searchArr[i].split("=")[0];
		var value = searchArr[i].split("=")[1];
		if(key == "communityid" && value != ""){
			$("input[name='communityid']").val(value);
		}
	} 
});

$(".article form").submit(function(){
	alert("eeee");
	return false;
});
