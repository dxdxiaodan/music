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
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>会员登录</title>
    <link rel="stylesheet" href="<%=basePath %>css/bootstrap.min.css">
    <%-- <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css"> --%>
    <link rel="stylesheet" href="<%=basePath %>css/login.css">
    <script src="<%=basePath %>js/jquery-3.2.1.min.js"></script>
    <script src="<%=basePath %>js/bootstrap.min.js"></script>
    <script src="<%=basePath %>js/login.js"></script>
    
    <script type="text/javascript">
  		 /*$(function(){
     		alert("QAQ");
	    	//$("#errormsg").val("ss");
	    	var errmsg = document.getElementById("errormsg");
	    	errmsg.innerHTML = "${request.getAttribute('')}";
	    	alert(errmsg); 
    	});*/
    </script>
</head>

<body>
<div class="container-fluid">
    <div class="logo">
        <a href="toIndex.do" title="音乐网站">
        <img src="<%=basePath %>/images/logo_.png" width="132" height="52" alt="音乐网站">
        </a>
    </div>
    <div id="center">
        <div class="row myCenter">
            <div class="form col-xs-6 col-md-4 col-center-block">
                <form id="updateform" action="<%=basePath %>loginByEmail.do" method="post">
                    <!-- 一条横线 -->
                    <div style="width:auto;height:1px;padding:0px;background-color:#D5D5D5;overflow:hidden;"></div>

                    <div class="formhead" style="white-space:nowrap;margin-bottom: 40px">
                        <div class="login col-md-2  col-md-offset-0">
                            <button type="button" class="btn btn-default" id="loginByEmailId" onclick="loginByEmail()">邮箱登录</button>
                            <button type="button" class="btn btn-default " id="loginByPhoneId" onclick="loginByPhone()">手机登录</button>
                        </div>
                    </div>
                    <br/>

                    <div class="form-group">
                   		<!--  显示错误信息  -->
                   		<span id="msg_span" style="color: red;">${msg }</span>
                        <!--想在input里实现这个结果出问题了-->
                        <!--onfocus="$('span#phonets').hide()" onBlur="$('span#phonets').show()"-->
                        <input type="text" class="form-control" onblur="return checkphone()" id="phone" name="phone" style="display: none" placeholder="手机号码" value="13426923333" required autofocus>
                        <span id="phonets"></span>
                        <input type="text" class="form-control" onblur="return checkemail()" id="email" name="email" placeholder="邮箱号码" required autofocus>
                        <span id="emailts"></span>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" onblur="return checkpassword()"  id="password" placeholder="密码" name="password">
                        <span id="passwordts"></span>
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox" value="remember-me">记住我 </label>
                    </div >
                    <div class="login col-md-2  col-md-offset-0">
                        <button type="submit" class="btn btn-info" id="loginId">登&nbsp;&nbsp;录</button>
                    </div>
                    <div class="register col-md-2 col-md-offset-7" style="white-space:nowrap;padding-top: 10px;margin-bottom: 40px">
                        <a style="width: auto" href="<%=basePath %>toRegister.do">注&nbsp;&nbsp;册</a>
                    </div>
                </form>

                <!-- 一条横线 -->
        		<!-- <div style="width:auto;height:1px;margin-top:20px; margin-bottom:20px; padding:0px;background-color:#D5D5D5;overflow:hidden;"></div>-->
     
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

