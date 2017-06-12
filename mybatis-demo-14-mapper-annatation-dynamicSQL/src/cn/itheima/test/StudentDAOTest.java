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
	public void insert() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity = new Student();
		entity.setSname("����");
		entity.setAge(18);
		entity.setBirthday(new Date());
		entity.setSex("Ů");
		studentMapper.insert(entity);
		session.commit();
		session.close();
	}

	@Test
	public void delete() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		studentMapper.deleteById(8L);
		session.commit();
		session.close();
	}

	@Test
	public void update() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity = new Student();
		entity.setSname("����1");
		entity.setAge(18);
		entity.setBirthday(new Date());
		entity.setSex("Ů");
		entity.setSid(6L);
		studentMapper.updateAllById(entity);
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
			System.out.println("ѧ����:" + s.getSname() + "--����:" + s.getAge());
		}
	}
	
	@Test
	public void selectByCondition() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity=new Student();
		entity.setSname("��");
		List<Student> list = studentMapper.selectByCondition(entity);
		for (Student s : list) {
			System.out.println("ѧ����:" + s.getSname() + "--����:" + s.getAge());
		}
	}

}
