package cn.itheima.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itheima.entity.Student;

@Repository
public interface StudentMapper {
	
	int insert(Student entity);
	/**
	 * ��ѯ���е�ѧ����Ϣ
	 * @return
	 */
	List<Student> findAll();

}
