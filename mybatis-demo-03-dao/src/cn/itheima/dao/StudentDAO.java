package cn.itheima.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.itheima.pojo.Student;
import cn.itheima.utils.DbUtils;

public class StudentDAO {
	/**
	 *����ѧ����Ϣ
	 * @param entity
	 * @return
	 */
	public int insert(Student entity){
		//1.��ò�������
		SqlSession session = DbUtils.getSession();
		//2.����
		int count =session.insert("studentDAO.insert", entity);
		//mybatisһ��Ҫ�ύ�Ų������ݿ�,������ɾ��һ��Ҫ�ύ
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * ͨ��idɾ��ѧ��
	 * @param sid
	 * @return
	 */
	public int deleteById(Long sid){
		//1.��ò�������
		SqlSession session = DbUtils.getSession();
		//2.����
		int count=session.delete("studentDAO.deleteById", sid);
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * ����
	 * @param entity
	 * @return
	 */
	public int updateAllById(Student entity){
		//1.��ò�������
		SqlSession session = DbUtils.getSession();
		//2.����
		//studentDAO:�ļ��Ŀռ���
		//updateAllById:������id
		int count=session.update("studentDAO.updateAllById", entity);
		session.commit();
		session.close();
		return count;
	}
	
	public List<Student> selectAll(){
		//1.��ò�������
		SqlSession session = DbUtils.getSession();
		List<Student> all = session.selectList("studentDAO.selectAll");
		session.close();
		return all;
	}

}
