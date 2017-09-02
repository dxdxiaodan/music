package cn.music.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.music.mapper.UserMapper;
import cn.music.po.User;

@Controller
public class webController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private User user;
	@RequestMapping(value = "check.do")
	public String check(Date date){
		user.setPassword("111++111");
		System.out.println("user:"+user.getPassword());
		return "a";
	}
	
	
	/**
	 * 跳转到 index.html
	 */
	@RequestMapping(value="toindex.do")
	public String toIndex(){
		
		return "index";
	}
	@RequestMapping(value="addMusic.do")
	public String toAddMusic(){
		
		return "addMusic.html";
	}
}
