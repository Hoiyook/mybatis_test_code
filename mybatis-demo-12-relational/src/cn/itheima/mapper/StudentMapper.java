package cn.itheima.mapper;

import java.util.List;

import cn.itheima.pojo.Student;

public interface StudentMapper {

	/**
	 * ��ѯȫ����ѧ��,�������ĳɼ�
	 * @return
	 */
	List<Student> selectAll();

}
