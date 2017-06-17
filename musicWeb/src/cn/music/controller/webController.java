package cn.music.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController {
	@RequestMapping("/check.do")
	public String check(Date date){
		System.out.println();
		return "";
	}
}
