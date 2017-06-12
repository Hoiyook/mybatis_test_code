package cn.itheima.mapper;

import java.util.List;

import cn.itheima.pojo.Student;

public interface StudentMapper {

	/**
	 * 查询全部的学生,包括他的成绩
	 * @return
	 */
	List<Student> selectAll();

}
