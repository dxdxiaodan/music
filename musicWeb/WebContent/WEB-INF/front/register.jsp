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
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>新用户注册</title>

    <link href="<%=basePath %>css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath %>css/register.css" rel="stylesheet">
	
	<script type="text/javascript" src="<%=basePath %>js/jquery-3.2.1.min.js" ></script>
	<script type="text/javascript" src="<%=basePath %>js/bootstrap.min.js" ></script>
	<script type="text/javascript" src="<%=basePath %>js/register.js" ></script>

    <!--引入JQueryValidate-->
    <script type="text/javascript" src="<%=basePath %>js/jquery.validate.min.js" ></script>
    <!--引入国际化中文-->
	<script type="text/javascript" src="<%=basePath %>js/messages_zh.js" ></script>

</head>

<body>
<div class="container-fluid">
<div class="logo">
    <a href="/" title="音乐网站"><img src="<%=basePath %>images/logo_.png" width="132" height="52" alt="音乐网站"></a>
</div>
<div id="center">
    <div class="row myCenter">
        <div class="form col-xs-6 col-md-4 col-center-block">
            <!-- 一条横线 -->
            <div style="width:auto;height:1px;padding:0px;background-color:#D5D5D5;overflow:hidden;"></div>

            <div formhead style="white-space:nowrap;margin-bottom: 40px;">
                <ul class="nav navbar-nav">
                    <div class="col-md-2  col-md-offset-2">
                        <button type="button" class="btn" id="registByEmailId" onclick="registByEmail()">邮箱注册</button>
                        <button type="button" class="btn" id="registByPhoneId" onclick="registByPhone()">手机注册</button>
                    </div>
                </ul>
            </div>
            <br/>
			<!--邮箱注册表单-->
            <form id="emailForm" action="<%=basePath %>registerByEmail.do" method="post">
             	<div class="form-group">
		            <input type="text" class="form-control" id="email" placeholder="邮箱号码" name="email" required autofocus>
		            <label for="email" class="error"></label>
	            </div>
	            <div class="form-group">
	                <input type="password" class="form-control" id="password" placeholder="密码" name="password">
	                <label for="password" class="error"></label>
	            </div>
                <div class="form-group">
	                <input type="password" class="form-control"  id="rpassword" placeholder="确认密码" name="rpassword">
	                <label for="rpassword" class="error"></label>
                </div>
				<div style="margin-top: 10px;">
					<div class="col-md-1  col-md-offset-0" >
	                    <button type="submit" class="btn btn-info" id="registId">注&nbsp;&nbsp;册</button>
	                </div>
	                <div class="col-md-1 col-md-offset-5" style="white-space:nowrap;padding-top: 10px;">
	                <!--<div class="col-md-1 col-md-offset-5" style="margin-bottom: 20px;white-space:nowrap;padding-top: 10px;">-->
	                    <span style="display: inline">已有账号?<a href="#">立即登录</a></span>
	                </div>
				</div>
            </form>
            <!--手机注册表单-->
            <form id="phoneForm" action="<%=basePath %>registerByPhone.do" method="post" style="display: none;">
             	<div class="form-group">
		            <input type="text" class="form-control" id="phone" placeholder="手机号码" name="phone" required autofocus>
		            <label for="phone" class="error"></label>
	            </div>
	            <div class="form-group">
	                <input type="password" class="form-control" id="password" placeholder="密码" name="password">
	                <label for="password" class="error"></label>
	            </div>
                <div class="form-group">
	                <input type="password" class="form-control"  id="rpassword" placeholder="确认密码" name="rpassword">
	                <label for="rpassword" class="error"></label>
                </div>
				<div style="margin-top: 10px;">
					<div class="col-md-1  col-md-offset-0" >
	                    <button type="submit" class="btn btn-info" id="registId">注&nbsp;&nbsp;册</button>
	                </div>
	                <div class="col-md-1 col-md-offset-5" style="white-space:nowrap;padding-top: 10px;">
	                <!--<div class="col-md-1 col-md-offset-5" style="margin-bottom: 20px;white-space:nowrap;padding-top: 10px;">-->
	                    <span style="display: inline">已有账号?<a href="#">立即登录</a></span>
	                </div>
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


