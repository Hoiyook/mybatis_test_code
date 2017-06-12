package cn.itheima.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itheima.service.TestService;

public class TestSpring {
	
	public static void main(String[] args) {
		//1.º”‘ÿ≈‰÷√Œƒº˛
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		 DataSource dataSource = context.getBean("dataSource", DataSource.class);
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.close();
	}

}
