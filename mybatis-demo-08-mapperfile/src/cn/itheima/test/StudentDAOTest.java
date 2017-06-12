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
			// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			Student entity = new Student();
			//entity.setSname("����");
			entity.setAge(18);
			entity.setBirthday(new Date());
			entity.setSex("Ů");
			studentMapper.insert("1234",20,"��",new Date());
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
//		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
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
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		studentMapper.deleteById(13L);
		session.commit();
		session.close();
	}



	@Test
	public void select() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.selectAll();
		for (Student s : list) {
			System.out.println("ѧ����:" + s.getStudentName() + "--����:" + s.getAge());
		}
	}

}
