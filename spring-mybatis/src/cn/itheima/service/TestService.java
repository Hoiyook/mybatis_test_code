package cn.itheima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.itheima.mapper.StudentMapper;
import cn.itheima.pojo.Student;

public class TestService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Transactional
	public void insert(Student entity){
		System.out.println("-≤Â»Î”√ªß");
		studentMapper.insert(entity);
	}

}
