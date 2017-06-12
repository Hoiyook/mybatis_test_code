package cn.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.itheima.pojo.Student;

public interface StudentMapper {
	/**
	 *����ѧ����Ϣ
	 * @param entity
	 * @return
	 */
	public int insert(Student entity);
	
	/**
	 * ͨ��idɾ��ѧ��
	 * @param sid
	 * @return
	 */
	public int deleteById(Long sid);
	
	/**
	 * ����
	 * @param entity
	 * @return
	 */
	public int updateAllById(Student entity);
	
	/**
	 * ��ѯȫ��
	 * @return
	 */
	public List<Student> selectAll();
	
	/**
	 * ģ����ѯ
	 * @return
	 */
	public List<Student> selectBySName(String sname);
	

}
