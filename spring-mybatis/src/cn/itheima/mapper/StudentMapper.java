package cn.itheima.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itheima.pojo.Student;

@Repository
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

}
