package cn.itheima.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbUtils {
	
	//1.����һ���Ự����
	public static SqlSessionFactory createSessionFactory(){
		//1.��ȡ�����ļ�
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			//2.�����Ự����
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			return builder.build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	//2.����һ���Ự
	public static SqlSession getSession(){
		return DbUtils.createSessionFactory().openSession();
	}
	
	public static void main(String[] args) {
		System.out.println(DbUtils.getSession().getConnection());
	}

}
