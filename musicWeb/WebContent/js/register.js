/**
 * Created by lhj on 2017/7/28.
 */
//路径
var pathName = window.location.pathname.substring(1);  
var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));  
var basePath = window.location.protocol + '//' + window.location.host + '/' + webName + '/';
/*切换到邮箱注册*/
function registByEmail(){
	$("#updateform").attr("action",basePath+"registerByEmail.do");
    /*设置切换按钮的样式*/
    $("button#registByEmailId").css({"border-top-width":"3px","border-top-color":"rgba(68,210,193,0.77)","font-weight":"700"});
    $("button#registByPhoneId").css({"border-top-width":"1px","border-top-color":"#f5f5f5","font-weight":"100"});
    $("#emailForm").css("display","");
    $("#phoneForm").css("display","none");
}
/*切换到手机注册*/
function registByPhone(){
	$("#updateform").attr("action",basePath+"registerByPhone.do");
    /*设置切换按钮的样式*/
    $("button#registByEmailId").css({"border-top-width":"1px","border-top-color":"#f5f5f5","font-weight":"100"});
    $("button#registByPhoneId").css({"border-top-width":"3px","border-top-color":"rgba(68,210,193,0.77)","font-weight":"700"});
	$("#emailForm").css("display","none");
   	$("#phoneForm").css("display","");
}

$(function(){
    // 手机号码验证  
    jQuery.validator.addMethod("isMobile", function(value, element) {  
        var length = value.length;  
        var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;  
        return this.optional(element) || (length == 11 && mobile.test(value));  
    }, "请正确填写您的手机号码");  
  	
  	//alert("QAQ");
  	//邮箱注册验证
    $("#emailForm").validate({
       	rules:{
       		email:{
       			required:true,
       			email:true,
       			//ajax验证邮箱是否已经注册过
       			remote : {
				    url : basePath+"emailCheck.do",
				    type : "POST",
				    cache:false,
				    dataType : "json",
				    data : {
				    	email: function() {
			        		return $("#email").val();
					    }
					}
				}
       		},
       		password:{
       			required:true,
       			rangelength:[5,10]
       		},
       		rpassword:{
       			required:true,
       			rangelength:[5,10],
       			equalTo:"#password"
       		}
       	},
     	messages:{
       		email:{
       			required:"邮箱不能为空",
       			email:"请输入正确的邮箱",
       			remote: "该邮箱已经注册过"
       		},
       		password:{
       			required:"密码不能为空",
       			rangelength:"密码长度为5-10"
       		},
       		rpassword:{
       			required:"请再次输入密码",
       			rangelength:"密码长度为5-10",
       			equalTo:"两次输入的密码不一致"
       		}
       	},
//     	errorElement: "label", //用来创建错误提示信息标签
//		success: function(label) { //验证成功后的执行的回调函数
//			//label指向上面那个错误提示信息标签label
//			label.text(" ") //清空错误提示消息
//			.addClass("success"); //加上自定义的success类
//		}

    });
    
    /*
    rules : {
	    "stu.name": {
		    required : true,
		    stringCheck : true,
		    byteRangeLength : [ 3, 15 ],
			remote : {
			    url : "student_isExistName.action",
			    type : "get",
			    cache:false,
			    dataType : "json",
			    data : {
			    	name: function() {
		        		return $("#name").val();
				    }
				}
			}
	    },
    },
      //设置错误信息
  	messages : {
	    "stu.name" : {
		    	required : "请填写用户名",
		    	stringCheck : "用户名只能包括中文字、英文字母、数字和下划线",
		    	byteRangeLength : "用户名必须在3-15个字符之间(一个中文字算2个字符)",
		    	remote: "该姓名已经存在"
		    },
	  	},
	  	errorPlacement : function(error, element) {
	   		var a = element.attr("Name").split('.');
	  		$('#'+a[1]+'span').html(error)
	 	},
	    success : function(label) {
	    	label.html("&nbsp;").addClass("ok");
	    }
    });
    
    */
  	//手机注册验证
    $("#phoneForm").validate({
       rules:{
       		phone:{
       			required:true,
				isMobile : true 
       		},
       		password:{
       			required:true,
       			rangelength:[5,10]
       		},
       		rpassword:{
       			required:true,
       			rangelength:[5,10],
       			equalTo:"#password"
       		}
       },
       messages:{
       		phone:{
       			required:"手机号码不能为空",
				isMobile : "请输入正确的手机号码"
       		},
       		password:{
       			required:"密码不能为空",
       			rangelength:"密码长度为5-10"
       		},
       		rpassword:{
       			required:"请再次输入密码",
       			rangelength:"密码长度为5-10",
       			equalTo:"两次输入的密码不一致"
       		}
       }
    });
});

