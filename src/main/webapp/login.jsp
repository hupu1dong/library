<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2021/2/12
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link rel="icon" href="images/search.gif" type="img/x-ico" />
    <link href="css/login.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
</head>

<body>
    <div id="top"></div>
    <div id="main">
        <img src="images/login.jpg" id="main_bg"/>
        <div id="login_block">
            <form action="/login" method="post" id="loginForm">
                <table border="0">
                    <tr>
                        <td class="title">用户名：</td>
                        <td class="input">
                            <input type="text" name="username" id="usrname" class="login_input"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="title">密码：</td>
                        <td class="input">
                            <input type="password" name="password" id="password" class="login_input"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="title">用户类型：</td>
                        <td class="input">
                            <input type="radio" name="type" value="reader" checked="checked"/>&nbsp;&nbsp;读者&nbsp;&nbsp;
                            <input type="radio" name="type" value="admin"/>&nbsp;&nbsp;管理员
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input class="btn" type="submit" value="登录"/>
                            <div class="btn" id="reset">重&nbsp;&nbsp;置</div>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
        <div id="footer">
            <div class="foot_content">
                CopyRight &copy; 2021 www.**********.com 三体市*****有限公司
            </div>
            <div class="foot_content">
                版权所有 Library V1.0
            </div>
        </div>
</body>
</html>
