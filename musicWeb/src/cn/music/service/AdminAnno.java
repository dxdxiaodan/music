package cn.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.music.po.Admin;

@Component("a")
public class AdminAnno {
	@Autowired
	private Admin admin;
	public void add(){
		admin.setPassword("1111");
		
		System.out.println(admin.getPassword());
	}
}
