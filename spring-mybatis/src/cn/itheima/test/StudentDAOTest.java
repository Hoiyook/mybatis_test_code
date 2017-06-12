package cn.itheima.test;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itheima.pojo.Student;
import cn.itheima.service.TestService;


public class StudentDAOTest {

	@Test
	public void insert() {
		try {
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-context.xml");
			TestService testService = context.getBean("testService", TestService.class);
			Student entity=new Student();
			entity.setSname("tr11");
			testService.insert(entity);
			context.close();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
