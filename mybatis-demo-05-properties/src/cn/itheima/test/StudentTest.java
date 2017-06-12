package cn.itheima.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.itheima.utils.DbUtils;

public class StudentTest {

	@Test
	public void insert() {
		try {
			//1.获得操作对象
			SqlSession session = DbUtils.getSession();
			//操作
			int count=session.insert("studentDAO.insert");
			System.out.println(count);
			//操作完要提交
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
