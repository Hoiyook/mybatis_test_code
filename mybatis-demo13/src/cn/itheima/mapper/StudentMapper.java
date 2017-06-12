package cn.itheima.mapper;

import cn.itheima.pojo.Student;

public interface StudentMapper {

	int deleteByPrimaryKey(Long sid);

	int insert(Student record);

	int insertSelective(Student record);

	Student selectByPrimaryKey(Long sid);

	int updateByPrimaryKeySelective(Student record);

	int updateByPrimaryKey(Student record);
}