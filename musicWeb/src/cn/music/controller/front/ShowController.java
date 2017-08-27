package cn.music.controller.front;
/**
 * @author:dxd
 * annotation:后台获取数据显示到前端页面上
 */
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import common.CommonData;
import common.ResponseUtils;

@Controller
@RequestMapping("/date")
public class ShowController {
	@RequestMapping("/language.do")
	public void getLanguage(HttpServletResponse response){
		String[] language = CommonData.LANGUAGE;
		Gson gson = new Gson();
		String toJson = gson.toJson(language);
		ResponseUtils.renderJson(response, toJson);
	}
	@RequestMapping("/style.do")
	public void getStyle(HttpServletResponse response){
		String[] style = CommonData.STYLE;
		Gson gson = new Gson();
		String toJson = gson.toJson(style);
		ResponseUtils.renderJson(response, toJson);
	}
}
