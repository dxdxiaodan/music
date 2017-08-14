package common;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtils {
	public static void render(HttpServletResponse response,String contentType,String text){
		response.setContentType(contentType);
		try {
			response.getWriter().write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void renderJson(HttpServletResponse response,String text){
		render(response,"application/json;charset=UTF-8",text);
	}
	public static void renderXml(HttpServletResponse response,String text){
		render(response,"text/xml;charset=UTF-8",text);
	}
	public static void renderText(HttpServletResponse response,String text){
		render(response,"text/plain;charset=UTF-8",text);
	}

}
