package cn.itheima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itheima.entity.Student;
import cn.itheima.mapper.StudentMapper;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	/**
	 * 插入学生记录
	 * @param entity
	 * @return
	 */
	@Transactional
	public int register(Student entity){
		return studentMapper.insert(entity);
	}
	
	public List<Student> findAll(){
		return studentMapper.findAll();
	}

}
