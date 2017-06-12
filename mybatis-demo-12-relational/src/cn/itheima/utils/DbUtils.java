package cn.itheima.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbUtils {
	
	//1.创建一个会话工厂
	public static SqlSessionFactory createSessionFactory(){
		//1.读取配置文件
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			//2.构建会话工厂
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			return builder.build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	//2.创建一个会话
	public static SqlSession getSession(){
		return DbUtils.createSessionFactory().openSession();
	}
	
	public static void main(String[] args) {
		System.out.println(DbUtils.getSession().getConnection());
	}

}
