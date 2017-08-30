/**
 * Created by lhj on 2017/7/28.
 */
window.onload=function(){
	checkemail();
	checkpassword();
	rcheckpassword();
}

/*切换到邮箱注册*/
function registByEmail(){
	var pathName = window.location.pathname.substring(1);  
    var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));  
    var basePath = window.location.protocol + '//' + window.location.host + '/' + webName + '/';
	$("#updateform").attr("action",basePath+"registerByEmail.do");
    document.getElementById("phone").style.display="none";
    document.getElementById("phonets").style.display="none";
    document.getElementById("email").style.display="";
    document.getElementById("emailts").style.display="";
    /*切换时清除密码*/
    document.getElementById("password").value = "";
    document.getElementById("rpassword").value = "";
    /*切换时填入手机号码，避免return false*/
    var phone = document.getElementById("phone").value = "13426923030";
    checkphone("");
    /*切换时清除邮箱号码*/
    var email = document.getElementById("email").value = "";
    checkemail("");
    /*设置切换按钮的样式*/
    $("button#registByEmailId").css({"border-top-width":"3px","border-top-color":"rgba(68,210,193,0.77)","font-weight":"700"});
    $("button#registByPhoneId").css({"border-top-width":"1px","border-top-color":"#f5f5f5","font-weight":"100"});
}
/*切换到手机注册*/
function registByPhone(){
	var pathName = window.location.pathname.substring(1);  
    var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));  
    var basePath = window.location.protocol + '//' + window.location.host + '/' + webName + '/';
	$("#updateform").attr("action",basePath+"registerByPhone.do");
    document.getElementById("phone").style.display="";
    /* document.getElementById("loginByEmailId").style.display="";*/
    document.getElementById("phonets").style.display="";
    document.getElementById("email").style.display="none";
    /* document.getElementById("loginByPhoneId").style.display="none";*/
    document.getElementById("emailts").style.display="none";
    /*切换时清除密码*/
    document.getElementById("password").value = "";
    document.getElementById("rpassword").value = "";
    /*切换时清除手机号码*/
    document.getElementById("phone").value = "";
    checkphone("");
    /*切换时填入邮箱号码，避免return false*/
    document.getElementById("email").value = "aaa@qq.com";
    checkemail("");
    /*设置切换按钮的样式*/
    $("button#registByEmailId").css({"border-top-width":"1px","border-top-color":"#f5f5f5","font-weight":"100"});
    $("button#registByPhoneId").css({"border-top-width":"3px","border-top-color":"rgba(68,210,193,0.77)","font-weight":"700"});
}
function checkphone() {
    var phone = document.getElementById("phone").value;
    var ts = document.getElementById("phonets");
    if(!(/^1[34578]\d{9}$/.test(phone))){
        ts.innerHTML="请输入正确的手机号码!";
        ts.style.color="red";
        return false;
    }
    ts.innerHTML ='手机号码可以使用!';
    ts.style.color='green';
    return true;
}
function checkemail() {
    var email = document.getElementById("email").value;
    var ets = document.getElementById("emailts");
    if(!isEmail(email)){
        ets.innerHTML ="请填入正确的邮箱!";
        ets.style.color="red";
        return false;
    }
    ets.innerHTML ="邮箱可以使用!";
    ets.style.color="green";
    return true;
}
function isEmail(str){
    var reg = /[a-z0-9-]{1,30}@[a-z0-9-]{1,65}.[a-z]{3}/;
    return reg.test(str);
}
function checkpassword(){
    var password = $("#password").val();

    var pts = document.getElementById("passwordts");

    if(password.length<5 || password.length>10)
    {
        pts.innerHTML ="密码长度须在5-10之间!";
        pts.style.color="red";
        return false;
    }
    pts.innerHTML ="密码长度在范围内!";
    pts.style.color="green";
    return true;
}

function rcheckpassword(){
    var password = $("#password").val();
    var rpassword = $("#rpassword").val();
    var prts =  document.getElementById("passwordrts");
    if (password != rpassword) {
        prts.innerHTML="两次密码输入不一致!";
        prts.style.color="red";
        return false;
    }
    if(rpassword.length == 0){
        prts.innerHTML="请输入密码!";
        prts.style.color="red";
        return false;
    }
    prts.innerHTML ="输入一致!";
    prts.style.color="green";
    return true;
}
