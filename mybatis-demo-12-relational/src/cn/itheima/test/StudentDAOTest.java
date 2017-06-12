package cn.itheima.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.itheima.mapper.StudentMapper;
import cn.itheima.pojo.Score;
import cn.itheima.pojo.Student;
import cn.itheima.utils.DbUtils;

public class StudentDAOTest {


	@Test
	public void selectAll() {
		SqlSession session = DbUtils.getSession();
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.selectAll();
		for (Student s : list) {
			System.out.println("学生的编号"+s.getSid()+"学生名:" + s.getSname() + "--年龄:" + s.getAge());
			for(Score score:s.getScores()){
				System.out.println("成绩编号:"+score.getScoreId()+"成绩:"+score.getScoreNum()+"科目"+score.getSubject());
				
			}
		}
	}

}
