package cn.music.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.music.po.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext-*.xml")
public class MybatisTest {
	@Autowired
	private Admin admin;
	@Test
	public void userTest(){
		/*ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/applicationContext-service.xml");
		Admin admin = (Admin) context.getBean("admin");*/
		System.out.println(admin);

		admin.setPassword("454");
		System.out.println("+++"+admin);
		
	}

}
