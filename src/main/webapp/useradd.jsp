<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>易购——category_manage</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <link type="text/css" href="css/user_add.css" rel="stylesheet">
</head>
<body>
<main>
        <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>添加用户</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
            <form action="/insert" method="post">
                <table>
                  <tr>
                        <td class="Ntext"></td>
                        <td style="color:red">${insertOk}${insertErr}</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td class="Ntext">用户名（*）：</td>
                        <td><input type="text" class="In" name="userName"></td>
                        <td id="resultUserName"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">真实姓名（*）：</td>
                        <td><input type="text" class="In" name="realName"></td>
                        <td id="resultRealName"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">登录密码（*）：</td>
                        <td><input type="password" class="In" name="password"></td>
                        <td id="resultPwd"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">确认密码（*）：</td>
                        <td><input type="password" class="In" name="repwd"></td>
                        <td id="resultRePwd"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">性别（*）：</td>
                        <td ><input type="radio" value="1" name="sex" checked="checked"><img src="images/Male.gif" >
                            <input type="radio" value="0" name="sex"><img src="images/Female.gif"></td>
                            <td id="resultSex"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">出生日期：</td>
                        <td><input type="date" class="In" name="birth"></td>
                        <td id="resulBirthday"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">身份证：</td>
                        <td><input type="text" class="In" name="cardId"></td>
                        <td id="resultUser_id"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">电子邮件：</td>
                        <td><input type="text" class="In" name="email"></td>
                        <td id="resultEmail"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">手机号：</td>
                        <td><input type="text" class="In" name="phone"></td>
                        <td id="resultPhone"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">地址（*）：</td>
                        <td><input type="text" class="In" name="address"></td>
                        <td id="resultAddress"></td>
                    </tr>
                    <tr><td colspan="2" class="right_bottom"><input type="image" src="images/submit.gif"></td></tr>
                </table>
               </form> 
            </section>
        </section>
</main>
</body>

</html>