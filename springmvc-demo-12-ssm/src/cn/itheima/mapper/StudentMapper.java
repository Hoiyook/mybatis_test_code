package cn.itheima.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itheima.entity.Student;

@Repository
public interface StudentMapper {
	
	int insert(Student entity);
	/**
	 * 查询所有的学生信息
	 * @return
	 */
	List<Student> findAll();

}
