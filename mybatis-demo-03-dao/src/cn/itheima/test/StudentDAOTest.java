package cn.itheima.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.itheima.dao.StudentDAO;
import cn.itheima.pojo.Student;

public class StudentDAOTest {

	@Test
	public void insert() {
	   StudentDAO sDAO=new StudentDAO();
	   Student entity=new Student();
	   entity.setSname("王八");
	   entity.setAge(18);
	   entity.setBirthday(new Date());
	   entity.setSex("女");
	  sDAO.insert(entity);
	}
	
	@Test
	public void delete() {
	   StudentDAO sDAO=new StudentDAO();
	   sDAO.deleteById(7L);
	}
	
	@Test
	public void update() {
	   StudentDAO sDAO=new StudentDAO();
	   Student entity=new Student();
	   entity.setSname("王八");
	   entity.setAge(18);
	   entity.setBirthday(new Date());
	   entity.setSex("女");
	   entity.setSid(6L);
	  sDAO.updateAllById(entity);
	}
	
	@Test
	public void select(){
		 StudentDAO sDAO=new StudentDAO();
		 List<Student> list = sDAO.selectAll();
		 for(Student s:list){
			 System.out.println("学生名:"+s.getSname()+"--年龄:"+s.getAge());
		 }
	}

}
