package cn.itheima.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.itheima.utils.DbUtils;

public class StudentTest {

	@Test
	public void insert() {
		try {
			//1.��ò�������
			SqlSession session = DbUtils.getSession();
			//����
			int count=session.insert("studentDAO.insert");
			System.out.println(count);
			//������Ҫ�ύ
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
