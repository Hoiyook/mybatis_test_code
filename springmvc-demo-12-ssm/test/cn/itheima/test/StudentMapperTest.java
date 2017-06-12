package cn.itheima.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.itheima.entity.Student;
import cn.itheima.mapper.StudentMapper;

public class StudentMapperTest {
	
	private SqlSession session;
	
	@Before
	public void before(){
		//读取Mybatis的总配置文件
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			SqlSessionFactory sessionFactory = builder.build(inputStream);
			session=sessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Test
	public void insert() {
		try {
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			Student entity=new Student();
			entity.setSname("zhangsan");
			entity.setSex("男");
			studentMapper.insert(entity);
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
