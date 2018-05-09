<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
  <head>
    <title>易购——login</title>
	<meta charset='utf-8'>
    <link type="text/css" href="css/login.css" rel="stylesheet">
</head>
<body>
<header>
    <div class="pic">
    <div>
        <ul>
            <li class="index"><a href="">首页</a></li>
            <li class="yonghu"><a href="">用户</a></li>
            <li class="shopping"><a href="">商品分类</a></li>
            <li class="dingdan"><a href="">订单</a></li>
            <li class="shopX"><a href="">商品详细</a></li>
            <li class="gonggao"><a href="">公告</a></li>
        </ul>
    </div>
    </div>
    <div class="TiShi">管理员您好，今天是<span id="timeSpan">2015-12-28 下午</span>，欢迎来到贝壳•易购商城后台管理系统。</div>
    <div class="address">您现在的位置：<a href="#" target="_parent" > 贝壳易购•商城</a> &gt; 后台管理</div>
</header>
<center>
<div>
	
    <article>
        <section class="top">
        <ul>
            <li></li>
            <li><span>&nbsp;&nbsp;管理首页</span></li>
        </ul></section>
        <div class="line"></div>
        <section class="bottom">
            <section class="top">欢迎登录易购•商城系统</section>
</center>            
            <form action="login" method="post" name="login">
            <section class="middle">
                    <table>
                    
                    	<tr>
                    		<td></td>
                            <td style="color:red">${requestScope.loginerr}</td>
                        	 <td></td>
                    	</tr>
                        <tr>
                            <td>用户名：</td>
                            <td><input type="text" name="managerName" value="" ></td>
                        	 <td id="resuName"></td>
                        </tr>
                        <tr>
                            <td>登录密码：</td>
                            <td><input type="password" name="managerPass" value="" ></td>
                        	 <td id="resuPwd"></td>
                        </tr>
<!--                        <tr>
                            <td>验证码：</td>
                            <td><input type="text" id="idenfitying" name="idenfitying"></td>
                            <td><img id="kaptchaImge" src="kaptcha.jpg"><span id="resuImg"></span></td>
                        </tr>
-->
                       <tr> <td></td> 
                       <td><input type="image" src="images/login.gif"  ></td>   <td><a href="forget_pwd.jsp">忘记密码？</a> <a href="reset_pwd.jsp">修改密码</a></td></tr>      
                    </table>

            </section>
            </form>
        </section>
    </article>
</div>
<footer>
    <div>
        <div class="footer_top">
            <ul>
                <li>友情链接：</li>
                <li><a href="">百度</a>|</li>
                <li><a href="">Google</a>|</li>
                <li><a href="">雅虎</a>|</li>
                <li><a href="">淘宝</a>|</li>
                <li><a href="">拍拍</a>|</li>
                <li><a href="">易趣</a>|</li>
                <li><a href="">当当</a>|</li>
                <li><a href="">京东商城</a>|</li>
                <li><a href="">迅雷</a>|</li>
                <li><a href="">新浪</a>|</li>
                <li><a href="">网易</a>|</li>
                <li><a href="">搜&nbsp;狐</a>|</li>
                <li><a href="">猫扑</a>|</li>
                <li><a href="">开心网</a>|</li>
                <li><a href="">新华网</a>|</li>
                <li><a href="">凤凰网</a></li>
            </ul>
        </div>
        <div class="middle">
            <div class="line2"></div>
            <ul>
                <li>CORYRIGHT•2014-2015北京市贝壳•易购商城有限公司（北京分部） ALL RIGHT RESERVED</li>
                <li>华宇互联（北京分部）研发部</li>
                <li>热线：400-88-1388 Email:service@ibochy.com.cn</li>
                <li>ICP:京ICP备02121211</li>
            </ul>
        </div>
        <div class="footer_bottom">
          <img src="images/img1.gif"><img src="images/img2.gif">
            <img src="images/img3.gif">
            <img src="images/img4.gif">
        </div>
    </div>
</footer>
</body>
</html>