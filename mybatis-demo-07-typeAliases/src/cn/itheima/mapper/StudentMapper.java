package cn.itheima.mapper;

import java.util.List;
import java.util.Map;

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
	 * ��ѯ���ص�����ʹ��map�洢
	 * @return
	 */
	public List<Map<String,Object>>  selectAllToMap();

}
