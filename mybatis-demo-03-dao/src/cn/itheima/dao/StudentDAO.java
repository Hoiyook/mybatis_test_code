package cn.itheima.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.itheima.pojo.Student;
import cn.itheima.utils.DbUtils;

public class StudentDAO {
	/**
	 *插入学生信息
	 * @param entity
	 * @return
	 */
	public int insert(Student entity){
		//1.获得操作对象
		SqlSession session = DbUtils.getSession();
		//2.操作
		int count =session.insert("studentDAO.insert", entity);
		//mybatis一定要提交才操作数据库,所以增删改一定要提交
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * 通过id删除学生
	 * @param sid
	 * @return
	 */
	public int deleteById(Long sid){
		//1.获得操作对象
		SqlSession session = DbUtils.getSession();
		//2.操作
		int count=session.delete("studentDAO.deleteById", sid);
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * 更新
	 * @param entity
	 * @return
	 */
	public int updateAllById(Student entity){
		//1.获得操作对象
		SqlSession session = DbUtils.getSession();
		//2.操作
		//studentDAO:文件的空间名
		//updateAllById:操作的id
		int count=session.update("studentDAO.updateAllById", entity);
		session.commit();
		session.close();
		return count;
	}
	
	public List<Student> selectAll(){
		//1.获得操作对象
		SqlSession session = DbUtils.getSession();
		List<Student> all = session.selectList("studentDAO.selectAll");
		session.close();
		return all;
	}

}
