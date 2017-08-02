package cn.music.controller.front;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sun.jersey.api.client.WebResource;

import cn.music.mapper.MusiclibraryMapper;
import common.AccessData;

import com.sun.jersey.api.client.Client;
/**
 * 上传音乐
 * @author dxd
 */



@Controller
public class UploadMusicController {
	@Autowired
	private MusiclibraryMapper musicLibraryMapper;
	@RequestMapping(value="/uploadMusic.do")
	public String uploadMusic(Integer categoryid,Integer styleid,Integer languageid,
			@RequestParam("music_file") MultipartFile music_files) throws Exception{//@RequestParam(required = false) 不上传不报错
		System.out.println(music_files.getOriginalFilename());
		
		
		//将音乐临时存储到临时文件区
		Client client = new Client();
		//需要存储的上半路径
		String url = AccessData.UPLOAD_URL+"aaa.mp3";
		//需要存储的下半路径，实际文件保存名字
		String path = "I:\\tool\\History Maker.mp3";
				
		WebResource resource = client.resource(url);
		//byte[] readFileToByteArray =FileUtils.readFileToByteArray((File) music_files);
		resource.put(String.class,music_files.getBytes());
		System.out.println("success");
		return "";
	}
}
