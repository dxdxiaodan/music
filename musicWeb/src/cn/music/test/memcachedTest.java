package cn.music.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.whalin.MemCached.MemCachedClient;

import common.SpringJunitTest;
/*
 * @author dxd
 * 测试memcached是否配置成功
 */
public class memcachedTest extends SpringJunitTest{
	@Autowired
	private MemCachedClient memCachedClient;
	@Test
	public void test(){
		//memCachedClient.set("dxd", "12345戴晓丹");
		Object object = memCachedClient.get("dxd");
		System.out.println(object);
	}
}
