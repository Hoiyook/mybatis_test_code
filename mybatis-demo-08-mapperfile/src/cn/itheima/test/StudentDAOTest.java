package cn.itheima.test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.itheima.mapper.StudentMapper;
import cn.itheima.pojo.Student;
import cn.itheima.utils.DbUtils;

public class StudentDAOTest {

	@Test
	public void insert() {
		try {
			SqlSession session = DbUtils.getSession();
			// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			Student entity = new Student();
			//entity.setSname("王八");
			entity.setAge(18);
			entity.setBirthday(new Date());
			entity.setSex("女");
			studentMapper.insert("1234",20,"男",new Date());
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void insertByMap() {
//		SqlSession session = DbUtils.getSession();
//		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
//		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//		
//		Map<String, Object> entity=new HashMap<>();
//		entity.put("sname", "test1");
//		entity.put("age", 20);
//		studentMapper.insert(entity);
//		session.commit();
//		session.close();
//	}

	@Test
	public void delete() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		studentMapper.deleteById(13L);
		session.commit();
		session.close();
	}



	@Test
	public void select() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.selectAll();
		for (Student s : list) {
			System.out.println("学生名:" + s.getStudentName() + "--年龄:" + s.getAge());
		}
	}

}
