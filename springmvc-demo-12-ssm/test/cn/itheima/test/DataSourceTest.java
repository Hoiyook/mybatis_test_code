package cn.itheima.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-*.xml");
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
