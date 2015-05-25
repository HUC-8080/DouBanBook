<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="shortcut icon" href="/DouBanBook/images/favicon.ico" />
<link rel="stylesheet" href="/DouBanBook/css/index.css" />
<script src="/DouBanBook/js/jquery.min.js"></script>
<script src="/DouBanBook/js/index.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type:"GET",
			url:"http://localhost/DouBanBook/book/search?tag=文学",
			dataType:"jsonp",
			jsonpCallback:"literaturecallback"
		});
	});
	function literaturecallback(data){
		content = "";
		for(var i=0;i<data['books'].length;i++){
			alert(i);
			content +="<li><div class='cover'><a href='#' title=''><img src='"+data['books']['images']['large']+"' width='106px' height='158px' /></a></div><div class='info'><div class='title'><a href='#' title='京都山居生活'>京都山居生活</a></div><div class='autho'>[英]维尼夏·斯坦利-史密斯 著绘 / [日]梶山正 摄</div></div></li>";
		}
		$("#literature").html(content);
	}
</script>
<title>DouBan图书推荐</title>
</head>

<body>
	<c:if test="${requestScope.literatures eq null}">
		<script type="text/javascript">
			location="localhost/DouBanBook/Indexindex";
		</script>
	</c:if>
	<div class="container">
    	<div class="navigation">
        	<ul class="nav">
            	<li><a>文学</a>
                	<ul>
                    	<li><a href="/DouBanBook/BooksearchByTag?tag=小说">小说</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=随笔">随笔</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=散文">散文</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=日本文学">日本文学</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=童话">童话</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=诗歌">诗歌</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=名著">名著</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=港台">港台</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=小说">更多››</a></li>
                    </ul>
                </li>
                <li><a>流行</a>
                	<ul>
                    	<li><a href="/DouBanBook/BooksearchByTag?tag=漫画">漫画</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=绘本">绘本</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=推理">推理</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=青春">青春</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=言情">言情</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=科幻">科幻</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=武侠">武侠</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=奇幻">奇幻</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=小说">更多››</a></li>
                    </ul>
                </li>
                <li><a>文化</a>
                	<ul>
                    	<li><a href="/DouBanBook/BooksearchByTag?tag=历史">历史</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=哲学">哲学</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=传记">传记</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=设计">设计</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=建筑">建筑</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=电影">电影</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=回忆录">回忆录</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=音乐">音乐</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=小说">更多››</a></li>
                    </ul>
                </li>
                <li><a>生活</a>
                	<ul>
                    	<li><a href="/DouBanBook/BooksearchByTag?tag=旅行">旅行</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=励志">励志</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=职场">职场</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=美食">美食</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=教育">教育</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=灵修">灵修</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=健康">健康</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=家居">家居</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=小说">更多››</a></li>
                    </ul>	
                </li>
                <li><a>经营</a>
                	<ul>
                    	<li><a href="/DouBanBook/BooksearchByTag?tag=经济学">经济学</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=管理">管理</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=金融">金融</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=商业">商业</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=营销">营销</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=理财">理财</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=股票">股票</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=企业史">企业史</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=小说">更多››</a></li>
                    </ul>
                </li>
                <li><a>科技</a>
                	<ul>
                    	<li><a href="/DouBanBook/BooksearchByTag?tag=科普">科普</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=互联网">互联网</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=编程">编程</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=交互设计">交互设计</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=算法">算法</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=通信">通信</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=神经网络">神经网络</a></li>
                        <li><a href="/DouBanBook/BooksearchByTag?tag=小说">更多››</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav-right">
            	<c:if test="${sessionScope.user eq null }">
	            	<li><a>登陆</a></li>
	                <li><a>注册</a></li>
                </c:if>
                <c:if test="${sessionScope.user != null }">
                <li><a>用户名</a>
                	<ul>
                    	<li><a>个人中心</a></li>
                        <li><a>我的收藏</a></li>
                        <li><a>我的笔记</a></li>
                        <li><a>我的相册</a></li>
                        <li><a>我的广播</a></li>
                        <li><a>退出</a></li>
                    </ul>
                </li>
                </c:if>
            </ul>
        </div>
        <div class="navigation-content">
        	<div class="nav-wrap">
            	<div class="nav-primary">
                	<a href="http://book.douban.com">
                        <div class="nav-logo"> 
                        </div>
                    </a>
                    <div class="nav-search">
                    	<form action="" method="get">
                        	<fieldset>
                            	<label for="inp-query" style="display:none;">书名、作者、ISBN</label>
                                <div class="inp">
                                	<input id="inp-query" name="search_text" size="22" maxlength="60" placeholder="书名、作者、ISBN" autocomplete="off" dir="ltr" />
                                </div>
                                <div class="inp-btn">
                                	<input type="submit" value="搜索" />
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="content">
        	<div class="article">
            	<div class="literature">
                	<div class="hd">
                    	<h2>
                    		<span>文学</span>
                            <span class="link-more">
                            	<a href="#">更多››</a>
                            </span>
                        </h2>
                        <!--<div class="slide-controls">
                        	<ol class="slide-dots">
                            	<li>
                                	<a data-index="1" href="#" class="active"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                            </ol>
                            <div class="slide-btns">
                            	<a href="#" class="prev">‹</a>
                                <a href="#" class="next">›</a>
                            </div>
                        </div>-->
                    </div>
                    <div class="bd">
                    	<div class="carousel">
                        	<div class="slide-list">
                            	<ul class="list-col list-col5 list-express slide-item clone">
                                   <c:forEach items="${requestScope.literatures }" var="literature">
	                                   <li>
	                                   		<div class="cover">
	                                        	<a href="#" title="${literature.title}">
	                                            	<img src="${literature.images.large}" width="106px" height="158px" alt="${literature.alt }" />
	                                            </a>
	                                        </div>
	                                        <div class="info">
	                                        	<div class="title">
	                                            	<a href="#" title="${literature.title}">${literature.title}</a>
	                                            </div>
												<div class="author">
													<c:forEach items="${literature.author }" var="auth">
													 	${auth }
													</c:forEach>
	                                            </div>	
	                                        </div>
	                                   </li>
                                   </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="popular">
                	<div class="hd">
                    	<h2>
                    		<span>流行</span>
                            <span class="link-more">
                            	<a href="#">更多››</a>
                            </span>
                        </h2>
                        <!--<div class="slide-controls">
                        	<ol class="slide-dots">
                            	<li>
                                	<a data-index="1" href="#" class="active"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                            </ol>
                            <div class="slide-btns">
                            	<a href="#" class="prev">‹</a>
                                <a href="#" class="next">›</a>
                            </div>
                        </div>-->
                    </div>
                    <div class="bd">
                    	<div class="carousel">
                        	<div class="slide-list">
                            	<ul class="list-col list-col5 list-express slide-item clone">
                                   <c:forEach items="${requestScope.populars }" var="popular">
	                                   <li>
	                                   		<div class="cover">
	                                        	<a href="#" title="${popular.title }">
	                                            	<img src="${popular.images.large }" width="106px" height="158px" alt="${popular.alt }" />
	                                            </a>
	                                        </div>
	                                        <div class="info">
	                                        	<div class="title">
	                                            	<a href="#" title="${popular.title }">${popular.title }</a>
	                                            </div>
												<div class="author">
													<c:forEach items="${popular.author }" var="auth">
														${auth }
													</c:forEach>
	                                            </div>	
	                                        </div>
	                                   </li>
                                   </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="culture">
                	<div class="hd">
                    	<h2>
                    		<span>文化</span>
                            <span class="link-more">
                            	<a href="#">更多››</a>
                            </span>
                        </h2>
                        <!--<div class="slide-controls">
                        	<ol class="slide-dots">
                            	<li>
                                	<a data-index="1" href="#" class="active"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                            </ol>
                            <div class="slide-btns">
                            	<a href="#" class="prev">‹</a>
                                <a href="#" class="next">›</a>
                            </div>
                        </div>-->
                    </div>
                    <div class="bd">
                    	<div class="carousel">
                        	<div class="slide-list">
                            	<ul class="list-col list-col5 list-express slide-item clone">
                                   <c:forEach items="${requestScope.cultures }" var="culture">
	                                   <li>
	                                   		<div class="cover">
	                                        	<a href="#" title="${culture.title }">
	                                            	<img src="${culture.images.large }" width="106px" height="158px" alt="${culture.alt }" />
	                                            </a>
	                                        </div>
	                                        <div class="info">
	                                        	<div class="title">
	                                            	<a href="#" title="${culture.title }">${culture.title }</a>
	                                            </div>
												<div class="author">
	                                         		<c:forEach items="${culture.author }" var="auth">
	                                         			${auth }
	                                         		</c:forEach>
	                                            </div>	
	                                        </div>
	                                   </li>
                                   </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="life">
                	<div class="hd">
                    	<h2>
                    		<span>生活</span>
                            <span class="link-more">
                            	<a href="#">更多››</a>
                            </span>
                        </h2>
                        <!--<div class="slide-controls">
                        	<ol class="slide-dots">
                            	<li>
                                	<a data-index="1" href="#" class="active"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                            </ol>
                            <div class="slide-btns">
                            	<a href="#" class="prev">‹</a>
                                <a href="#" class="next">›</a>
                            </div>
                        </div>-->
                    </div>
                    <div class="bd">
                    	<div class="carousel">
                        	<div class="slide-list">
                            	<ul class="list-col list-col5 list-express slide-item clone">
								   <c:forEach items="${requestScope.lifes }" var="life">
                                   <li>
                                   		<div class="cover">
                                        	<a href="#" title="${life.title }">
                                            	<img src="${life.images.large }" width="106px" height="158px" alt="${life.alt }" />
                                            </a>
                                        </div>
                                        <div class="info">
                                        	<div class="title">
                                            	<a href="#" title="${life.title }">${life.title }</a>
                                            </div>
											<div class="author">
                                         		<c:forEach items="${life.author }" var="auth">
                                         			${auth }
                                         		</c:forEach>
                                            </div>	
                                        </div>
                                   </li>
                                   </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="economy ">
                	<div class="hd">
                    	<h2>
                    		<span>经管</span>
                            <span class="link-more">
                            	<a href="#">更多››</a>
                            </span>
                        </h2>
                        <!--<div class="slide-controls">
                        	<ol class="slide-dots">
                            	<li>
                                	<a data-index="1" href="#" class="active"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                            </ol>
                            <div class="slide-btns">
                            	<a href="#" class="prev">‹</a>
                                <a href="#" class="next">›</a>
                            </div>
                        </div>-->
                    </div>
                    <div class="bd">
                    	<div class="carousel">
                        	<div class="slide-list">
                            	<ul class="list-col list-col5 list-express slide-item clone">
                            		<c:forEach items="${requestScope.economys }" var="economy">
                                   <li>
                                   		<div class="cover">
                                        	<a href="#" title="${economy.title }">
                                            	<img src="${economy.images.large }" width="106px" height="158px" alt="${economy.alt }" />
                                            </a>
                                        </div>
                                        <div class="info">
                                        	<div class="title">
                                            	<a href="#" title="${economy.title }">${economy.title }</a>
                                            </div>
											<div class="author">
												<c:forEach items="${economy.author }" var="auth">
													${auth }
												</c:forEach>
                                            </div>	
                                        </div>
                                   </li>
                                   </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="science ">
                	<div class="hd">
                    	<h2>
                    		<span>科技</span>
                            <span class="link-more">
                            	<a href="#">更多››</a>
                            </span>
                        </h2>
                        <!--<div class="slide-controls">
                        	<ol class="slide-dots">
                            	<li>
                                	<a data-index="1" href="#" class="active"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                                <li>
                                	<a data-index="1" href="#"></a>
                                </li>
                            </ol>
                            <div class="slide-btns">
                            	<a href="#" class="prev">‹</a>
                                <a href="#" class="next">›</a>
                            </div>
                        </div>-->
                    </div>
                    <div class="bd">
                    	<div class="carousel">
                        	<div class="slide-list">
                            	<ul class="list-col list-col5 list-express slide-item clone">
                                   <c:forEach items="${requestScope.sciences }" var="science">
                                   <li>
                                   		<div class="cover">
                                        	<a href="#" title="${science.title }">
                                            	<img src="${science.images.large }" width="106px" height="158px" alt="${science.alt }" />
                                            </a>
                                        </div>
                                        <div class="info">
                                        	<div class="title">
                                            	<a href="#" title="${science.title }">${science.title }</a>
                                            </div>
											<div class="author">
												<c:forEach items="${science.author }" var="auth">
													${auth }
												</c:forEach>
                                            </div>	
                                        </div>
                                   </li>
                                   </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="aside">
            	<div class="ad-placeholder">
                	<a href="#" title="">
                    	<img src="/DouBanBook/images/ad/82a5c5b6e716cfa.jpg" />
                    </a>
                </div>
                <h2>
                	<span>热门标签</span>
                    <span class="link-more">
                    	<a href="#">所有热门标签››</a>
                    </span>
                </h2>
                <ul class="hot-tags-col5">
                	<li>
                    	<span>文学</span>
                        <ul>
                        	<li><a href="#">小说</a></li>
                            <li><a href="#">随笔</a></li>
                            <li><a href="#">散文</a></li>
                            <li><a href="#">日本文学</a></li>
                            <li><a href="#">童话</a></li>
                            <li><a href="#">诗歌</a></li>
                            <li><a href="#">名著</a></li>
                            <li><a href="#">港台</a></li>
                            <li><a href="#">更多››</a></li>
                        </ul>
                    </li>
                    <li>
                    	<span>流行</span>
                        <ul>
                        	<li><a href="#">漫画</a></li>
                            <li><a href="#">绘本</a></li>
                            <li><a href="#">推理</a></li>
                            <li><a href="#">青春</a></li>
                            <li><a href="#">言情</a></li>
                            <li><a href="#">科幻</a></li>
                            <li><a href="#">武侠</a></li>
                            <li><a href="#">奇幻</a></li>
                            <li><a href="#">更多››</a></li>
                        </ul>
                    </li>
                    <li>
                    	<span>文化</span>
                        <ul>
                        	<li><a href="#">历史</a></li>
                            <li><a href="#">哲学</a></li>
                            <li><a href="#">传记</a></li>
                            <li><a href="#">设计</a></li>
                            <li><a href="#">建筑</a></li>
                            <li><a href="#">电影</a></li>
                            <li><a href="#">回忆录</a></li>
                            <li><a href="#">音乐</a></li>
                            <li><a href="#">更多››</a></li>
                        </ul>
                    </li>
                    <li>
                    	<span>生活</span>
                        <ul>
                        	<li><a href="#">旅行</a></li>
                            <li><a href="#">励志</a></li>
                            <li><a href="#">职场</a></li>
                            <li><a href="#">美食</a></li>
                            <li><a href="#">教育</a></li>
                            <li><a href="#">灵修</a></li>
                            <li><a href="#">健康</a></li>
                            <li><a href="#">家居</a></li>
                            <li><a href="#">更多››</a></li>
                        </ul>
                    </li>
                    <li>
                    	<span>经管</span>
                        <ul>
                        	<li><a href="#">经济学</a></li>
                            <li><a href="#">管理</a></li>
                            <li><a href="#">金融</a></li>
                            <li><a href="#">商业</a></li>
                            <li><a href="#">营销</a></li>
                            <li><a href="#">理财</a></li>
                            <li><a href="#">股票</a></li>
                            <li><a href="#">企业史</a></li>
                            <li><a href="#">更多››</a></li>
                        </ul>
                    </li>
                    <li>
                    	<span>科技</span>
                        <ul>
                        	<li><a href="#">科普</a></li>
                            <li><a href="#">互联网</a></li>
                            <li><a href="#">编程</a></li>
                            <li><a href="#">交互设计</a></li>
                            <li><a href="#">算法</a></li>
                            <li><a href="#">通信</a></li>
                            <li><a href="#">神经网络</a></li>
                            <li><a href="#">更多››</a></li>
                        </ul>
                    </li>
                </ul>
                <div class="e-book">
                	<h2>
                		<span>电子图书</span>
                		<span class="link-more">
                			<a href="#">更多››</a>
                		</span>
                	</h2>
                	<div class="e-book-content">
                		<c:forEach items="${requestScope.ebooks }" var="ebook">
                		<dl>
                			<dt>
                				<a href="#">
                					<img src="${ebook.images.small }" alt="${ebook.alt }"/>
                				</a>
                			</dt>
                			<dd>
                				<a href="#">${ebook.title }</a>
                			</dd>
                		</dl>
                		</c:forEach>
                	</div>
                </div>
                <div class="ad-placeholder">
                	<a href="#" title="">
                    	<img src="/DouBanBook/images/ad/f7740f1071c7a7c.jpg" />
                    </a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
