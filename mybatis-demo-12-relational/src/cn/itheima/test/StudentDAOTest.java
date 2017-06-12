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
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.selectAll();
		for (Student s : list) {
			System.out.println("ѧ���ı��"+s.getSid()+"ѧ����:" + s.getSname() + "--����:" + s.getAge());
			for(Score score:s.getScores()){
				System.out.println("�ɼ����:"+score.getScoreId()+"�ɼ�:"+score.getScoreNum()+"��Ŀ"+score.getSubject());
				
			}
		}
	}

}
