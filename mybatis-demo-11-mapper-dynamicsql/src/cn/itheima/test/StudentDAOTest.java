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
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity1 = new Student();
		entity1.setSname("王八3");
		entity1.setAge(18);
		entity1.setBirthday(new Date());
		entity1.setSex("女");
		
		Student entity2 = new Student();
		entity2.setSname("王八4");
		entity2.setAge(18);
		entity2.setBirthday(new Date());
		entity2.setSex("女");
		List<Student> entitys =new ArrayList<>();
		entitys.add(entity1);
		entitys.add(entity2);
		studentMapper.batchInsert(entitys );
		session.commit();
		session.close();
	}
	
	/**
	 * 批量删除
	 */
	@Test
	public void deleteByIds() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Long[] arr={12L,20L};
		studentMapper.deleteByIds(arr);
		session.commit();
		session.close();
	}
	
	
	/**
	 * 更新,如果不为空才更新
	 */
	@Test
	public void updateNotNullById() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity = new Student();
		entity.setSname("王八");
		entity.setSid(6L);
		studentMapper.updateNotNullById(entity);
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
	public void selectBySName() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.selectBySName("赵");
		for (Student s : list) {
			System.out.println("学生名:" + s.getSname() + "--年龄:" + s.getAge());
		}
	}
	
	@Test
	public void selectByCondition() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity=new Student();
		//entity.setSname("赵");
		//entity.setAge(20);
		List<Student> list = studentMapper.selectByCondition(entity);
		for (Student s : list) {
			System.out.println("学生名:" + s.getSname() + "--年龄:" + s.getAge());
		}
	}
	
	
	
	@Test
	public void selectByConditionChoose() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student entity=new Student();
		//entity.setSid(1L);
		//entity.setSname("张");
		//entity.setAge(20);
		List<Student> list = studentMapper.selectByConditionChoose(entity);
		for (Student s : list) {
			System.out.println("学生名:" + s.getSname() + "--年龄:" + s.getAge());
		}
	}


}
