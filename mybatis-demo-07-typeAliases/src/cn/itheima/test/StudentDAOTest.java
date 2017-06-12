package cn.itheima.test;

import java.util.Date;
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
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity = new Student();
		entity.setSname("王八");
		entity.setAge(18);
		entity.setBirthday(new Date());
		entity.setSex("女");
		studentMapper.insert(entity);
		session.commit();
		session.close();
	}

	@Test
	public void delete() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		studentMapper.deleteById(8L);
		session.commit();
		session.close();
	}

	@Test
	public void update() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity = new Student();
		entity.setSname("王八1");
		entity.setAge(18);
		entity.setBirthday(new Date());
		entity.setSex("女");
		entity.setSid(6L);
		studentMapper.updateAllById(entity);
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
			System.out.println("学生名:" + s.getSname() + "--年龄:" + s.getAge());
		}
	}
	
	@Test
	public void selectToMap() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Map<String,Object>> list = studentMapper.selectAllToMap();
		for (Map<String,Object> map : list) {
			System.out.println("学生名:" + map.get("SNAME") + "--年龄:" +map.get("AGE"));
		}
	}

}
