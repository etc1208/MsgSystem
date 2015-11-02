<%--
  Created by IntelliJ IDEA.
  User: yh
  Date: 2015/11/1
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <base href="<%=basePath%>">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>注册丨信息管理平台</title>
  <link rel="stylesheet" href="resources/css/login_and_register/style.css">
  <link rel="icon" href="resources/images/login_and_register/favicon.ico">
</head>
<body>

<div class="register-container">
  <h1>信息管理平台</h1>

  <div class="connect">
    <p>Information management platform.</p>
  </div>

  <form action="" method="post" id="registerForm">
    <div>
      <input type="text" name="username" class="username" placeholder="您的用户名" />
    </div>
    <div>
      <input type="password" name="password" class="password" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
    </div>
    <div>
      <input type="password" name="confirm_password" class="confirm_password" placeholder="再次输入密码" oncontextmenu="return false" onpaste="return false" />
    </div>
    <div>
      <input type="text" name="phone_number" class="phone_number" placeholder="输入手机号码" autocomplete="off" id="number"/>
    </div>
    <div>
      <input type="email" name="email" class="email" placeholder="输入邮箱地址" oncontextmenu="return false" onpaste="return false" />
    </div>

    <button id="submit" type="submit">注 册</button>
  </form>
  <a href="login">
    <button type="button" class="register-tis">已经有账号？</button>
  </a>

</div>

</body>
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script src="resources/js/login_and_register/common.js"></script>
<!--背景图片自动更换-->
<script src="resources/js/login_and_register/supersized.3.2.7.min.js"></script>
<script src="resources/js/login_and_register/supersized-init.js"></script>
<!--表单验证-->
<script src="resources/js/login_and_register/jquery.validate.min.js?var1.14.0"></script>
</html>
