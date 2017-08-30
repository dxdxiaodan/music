/**负责添加音乐页面的动态响应
 * 
 */
$(document).ready(
	function(){
		$.get("../date/language.do",function(data,status){
			$("#language ul").empty();
			var li="";
			var x;
			for(x in data){
				li += "<li>"+data[x]+"</li>";
			}
			$("#language ul").append(li);
		  });
		$.get("../date/style.do",function(data,status){
			$("#style ul").empty();
			var li="";
			var x;
			for(x in data){
				li += "<li>"+data[x]+"</li>";
			}
			$("#style ul").append(li);
		  });
	}
	);