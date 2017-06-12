package cn.itheima.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.itheima.mapper.StudentMapper;
import cn.itheima.pojo.Student;
import cn.itheima.utils.DbUtils;

public class StudentDAOTest {



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
