<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<html>
<head>
   <meta charset="utf-8">
    <title>易购-头部</title>
 	<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <link type="text/css" href="css/index.css" rel="stylesheet">
</head>
<body>
<header>
    <div class="pic">
        <div>
            <ul>
                <li class="index"><a href="center.jsp" target="center">首页</a></li>
                <li class="index"><a href="userList?page=1" target="center">用户</a></li>
                <li class="index"><a href="categoryList?page=1" target="center">商品分类</a></li>
                <li class="index"><a href="Order_manage" target="center">订单</a></li>
                <li class="index"><a href="goodsList?page=1" target="center">商品详细</a></li>
                <li class="index"><a href="Announcement_manage" target="center">公告</a></li>
            </ul>
        </div>
    </div>
    
    <div class="TiShi">管理员${sessionScope.name}您好，今天是<span><%=new Date().toLocaleString()%></span>，欢迎来到贝壳•易购商城后台管理系统。[<a href="/yigoumanage/userExit" target="_top">注销</a>]</div>
    <div class="address">您现在的位置：<a href="../../yigoumanage" target="_parent" > 贝壳易购•商城</a> &gt; <span id="positio">后台管理</span></div>
</header>
</body>
</html>