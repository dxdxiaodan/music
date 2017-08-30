<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>新用户注册</title>


    <link href="<%=basePath %>css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link href="<%=basePath %>css/login.css" rel="stylesheet">
    <script src="<%=basePath %>js/jquery-3.2.1.min.js"></script>
    <script src="<%=basePath %>js/bootstrap.min.js"></script>

    <style>
        button#registByEmailId{
            border-width:0px;border-top-width: 3px;border-top-color: rgba(68,210,193,0.77);background-color: #f5f5f5;font-size:18px;font-weight: 700;
        }
        button#registByPhoneId{
            border-width:0px;background-color: #f5f5f5;font-size:18px;font-weight: 100;
        }
    </style>

    <script src="<%=basePath %>js/register.js"></script>

</head>

<body>
<div class="container-fluid">
    <div class="logo">
        <a href="/" title="音乐网站"><img src="<%=basePath %>images/logo_.png" width="132" height="52" alt="音乐网站"></a>
    </div>
    <div id="center">
        <div class="row myCenter">
            <div class="form col-xs-6 col-md-4 col-center-block">
                <form id="updateform" action="<%=basePath %>registerByEmail.do" method="post">
                    <!-- 一条横线 -->
                    <div style="width:auto;height:1px;padding:0px;background-color:#D5D5D5;overflow:hidden;"></div>

                    <div formhead style="white-space:nowrap;margin-bottom: 40px">
                        <ul class="nav navbar-nav ">
                            <div class="login col-md-2  col-md-offset-0">
                                <button type="button" class="btn btn-default" id="registByEmailId" onclick="registByEmail()">邮箱注册</button>
                                <button type="button" class="btn btn-default " id="registByPhoneId" onclick="registByPhone()">手机注册</button>
                            </div>
                        </ul>
                    </div>
                    <br/>
                    <div class="form-group">
                        <input type="text" class="form-control" onblur="return checkphone()" style="display: none" id="phone" placeholder="手机号码" name="phone" value="13719511111" required autofocus>
                        <span id="phonets"></span>
                        <input type="text" class="form-control" onblur="return checkemail()" id="email" placeholder="邮箱号码" name="email" required autofocus>
                        <span id="emailts"></span>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" onblur="return checkpassword()"  id="password" placeholder="密码" name="password">
                        <span id="passwordts"></span>
                    </div>
                    <div class="form-group" style="margin-bottom: 50px">
                        <input type="password" class="form-control" onblur="return rcheckpassword()"  id="rpassword" placeholder="确认密码" name="rpassword">
                        <span id="passwordrts"></span>
                    </div>
                    <div class="login col-md-1  col-md-offset-0" >
                        <button type="submit" class="btn btn-info" id="registId">注&nbsp;&nbsp;册</button>
                    </div>
                    <div class="register col-md-1 col-md-offset-5" style="margin-bottom: 20px;white-space:nowrap;padding-top: 10px;">
                        <!--<button class="btn btn-link" href="login.html">已有账号?点我登录</button>-->
                        <span style="display: inline">已有账号?<a href="<%=basePath %>toLogin.do">立即登录</a></span>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="lo_bt">
    <p>
        <a class="lo_bt" href="/">返回首页</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a class="lo_bt" href="/help/index.html">帮助中心</a>&nbsp;&nbsp;|&nbsp;&nbsp;客服Q号:8888888
    </p>
</div>

</body>
</html>

