<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="shortcut icon" href="/DouBanBook/images/favicon.ico" />
<link rel="stylesheet" href="/DouBanBook/css/index.css" />
<script src="/DouBanBook/js/jquery.min.js"></script>
<script src="/DouBanBook/js/index.js"></script>
<title>DouBan图书推荐</title>
</head>

<body>
	<div class="container">
    	<div class="navigation">
        	<ul class="nav">
            	<li><a>文学</a>
                	<ul>
                    	<li><a>小说</a></li>
                        <li><a>随笔</a></li>
                        <li><a>散文</a></li>
                        <li><a>日本文学</a></li>
                        <li><a>童话</a></li>
                        <li><a>诗歌</a></li>
                        <li><a>名著</a></li>
                        <li><a>港台</a></li>
                        <li><a>更多››</a></li>
                    </ul>
                </li>
                <li><a>流行</a>
                	<ul>
                    	<li><a>漫画</a></li>
                        <li><a>绘本</a></li>
                        <li><a>推理</a></li>
                        <li><a>青春</a></li>
                        <li><a>言情</a></li>
                        <li><a>科幻</a></li>
                        <li><a>武侠</a></li>
                        <li><a>奇幻</a></li>
                        <li><a>更多››</a></li>
                    </ul>
                </li>
                <li><a>文化</a>
                	<ul>
                    	<li><a>历史</a></li>
                        <li><a>哲学</a></li>
                        <li><a>传记</a></li>
                        <li><a>设计</a></li>
                        <li><a>建筑</a></li>
                        <li><a>电影</a></li>
                        <li><a>回忆录</a></li>
                        <li><a>音乐</a></li>
                        <li><a>更多››</a></li>
                    </ul>
                </li>
                <li><a>生活</a>
                	<ul>
                    	<li><a>旅行</a></li>
                        <li><a>励志</a></li>
                        <li><a>职场</a></li>
                        <li><a>美食</a></li>
                        <li><a>教育</a></li>
                        <li><a>灵修</a></li>
                        <li><a>健康</a></li>
                        <li><a>家居</a></li>
                        <li><a>更多››</a></li>
                    </ul>	
                </li>
                <li><a>经营</a>
                	<ul>
                    	<li><a>经济学</a></li>
                        <li><a>管理</a></li>
                        <li><a>金融</a></li>
                        <li><a>商业</a></li>
                        <li><a>营销</a></li>
                        <li><a>理财</a></li>
                        <li><a>股票</a></li>
                        <li><a>企业史</a></li>
                        <li><a>更多››</a></li>
                    </ul>
                </li>
                <li><a>科技</a>
                	<ul>
                    	<li><a>科普</a></li>
                        <li><a>互联网</a></li>
                        <li><a>编程</a></li>
                        <li><a>交互设计</a></li>
                        <li><a>算法</a></li>
                        <li><a>通信</a></li>
                        <li><a>神经网络</a></li>
                        <li><a>更多››</a></li>
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
            </div>
        </div>
    </div>
</body>
</html>
