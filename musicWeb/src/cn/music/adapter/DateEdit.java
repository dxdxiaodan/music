package cn.music.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 *  这是一个日期转换配置器，全局变量类型的
 *
 * @author dxd
 *
 */
public class DateEdit implements WebBindingInitializer{
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yy:MM:dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

}
