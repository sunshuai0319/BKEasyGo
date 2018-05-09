<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%@include file="web-inf/tag.jsp" %>
<html>
  <head>
    <title>易购——user_manage</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/changeBGC.js"></script>
    <script type="text/javascript" src="js/check1.js" charset="utf-8"></script>
    <link type="text/css" href="css/user_manage.css" rel="stylesheet">
    
</head>
<body>
<main>
       <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>用户管理</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
                <table>
                    <tr class="title">
                        <th>用户编号</th>
                        <th>用户名</th>
                        <th>真实姓名</th>
                        <th>性别</th>
                        <th>Email</th>
                        <th>手机</th>
                        <th>冻结/解冻</th>
                        <th class="right_border">操作</th>
                    </tr>
                    
                    <tr class="neirong">
                        <td>16</td>
                        <td>aa1234567</td>
                        <td>赵宇</td>
                        <td>男</td>
                        <td>zz_zgc11g@163.com</td>
                        <td>13111111111</td>
                        <td><img src="images/jiedong.png"><a href="User_Unfreeze?id=16">解冻</a><img src="images/dongjie.png"><a href="User_Freeze?id=16">冻结</a></td>
                        <td class="right_border"><img src="images/update1.png"><a href="userModify?id=16&page=1" target="center">修改</a><img src="images/delete.png"><a href="userDelete?id=16&page=1" >删除</a></td>
                    </tr>
                </table>
                
                <div class="fanye">[1 / 2]<a href="userList?page=1">首页</a>&nbsp;
                
               
               <a href="userList?page=2">下一页</a>&nbsp;
               
                
                <a href="userList?page=2">尾页</a></div>
            </section>
        </section>
</main>
</body>
</html>