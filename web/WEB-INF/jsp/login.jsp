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
  <title>登陆丨信息管理平台</title>
  <link rel="stylesheet" href="resources/css/login_and_register/style.css">
  <link rel="icon" href="resources/images/login_and_register/favicon.ico">
  <style>
    footer {
      position: absolute;
      bottom: 12px;
      width: 100%;
    }

  </style>
</head>
<body>

<div class="login-container">
  <h1>信息管理平台</h1>

  <div class="connect">
    <p style="color:red;">${exception.message}</p>
    <p style="color:green;">${registerInfo.message}</p>
  </div>

  <form action="login" method="post" id="loginForm">
    <div>
      <input type="text" name="username" class="username" placeholder="用户名" autocomplete="off"/>
    </div>
    <div>
      <input type="password" name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
    </div>
    <button id="submit" type="submit">登 陆</button>
  </form>

  <a href="register">
    <button type="button" class="register-tis">还没有账号？</button>
  </a>

</div>

<footer>
  Copyright&copy;2015BUPT 物联网技术中心
</footer>

</body>
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script src="resources/js/login_and_register/common.js"></script>
<!--背景图片自动更换-->
<script src="resources/js/login_and_register/supersized.3.2.7.min.js"></script>
<script src="resources/js/login_and_register/supersized-init.js"></script>
<!--表单验证-->
<script src="resources/js/login_and_register/jquery.validate.min.js?var1.14.0"></script>
</html>
