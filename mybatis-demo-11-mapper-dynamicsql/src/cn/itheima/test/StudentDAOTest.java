package cn.itheima.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.itheima.mapper.StudentMapper;
import cn.itheima.pojo.Student;
import cn.itheima.utils.DbUtils;

public class StudentDAOTest {
	
	@Test
	public void batchInsert() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity1 = new Student();
		entity1.setSname("����3");
		entity1.setAge(18);
		entity1.setBirthday(new Date());
		entity1.setSex("Ů");
		
		Student entity2 = new Student();
		entity2.setSname("����4");
		entity2.setAge(18);
		entity2.setBirthday(new Date());
		entity2.setSex("Ů");
		List<Student> entitys =new ArrayList<>();
		entitys.add(entity1);
		entitys.add(entity2);
		studentMapper.batchInsert(entitys );
		session.commit();
		session.close();
	}
	
	/**
	 * ����ɾ��
	 */
	@Test
	public void deleteByIds() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Long[] arr={12L,20L};
		studentMapper.deleteByIds(arr);
		session.commit();
		session.close();
	}
	
	
	/**
	 * ����,�����Ϊ�ղŸ���
	 */
	@Test
	public void updateNotNullById() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity = new Student();
		entity.setSname("����");
		entity.setSid(6L);
		studentMapper.updateNotNullById(entity);
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
	public void selectBySName() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.selectBySName("��");
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
		//entity.setSname("��");
		//entity.setAge(20);
		List<Student> list = studentMapper.selectByCondition(entity);
		for (Student s : list) {
			System.out.println("ѧ����:" + s.getSname() + "--����:" + s.getAge());
		}
	}
	
	
	
	@Test
	public void selectByConditionChoose() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity=new Student();
		//entity.setSid(1L);
		//entity.setSname("��");
		//entity.setAge(20);
		List<Student> list = studentMapper.selectByConditionChoose(entity);
		for (Student s : list) {
			System.out.println("ѧ����:" + s.getSname() + "--����:" + s.getAge());
		}
	}


}
