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
	 * ��������
	 * @param entity
	 * @return
	 */
	public int batchInsert(List<Student> entity);
	
	/**
	 * ͨ��idɾ��ѧ��
	 * @param sid
	 * @return
	 */
	public int deleteById(Long sid);
	
	/**
	 * ͨ��idsɾ��ѧ��
	 * ʹ��������,���ֻ��һ��ֵ,�������ô�������,����ֵ���ϲ���Ҫ��������
	 * @param sid
	 * @return
	 */
	public int deleteByIds(Long... sid);
	
	/**
	 * ����
	 * @param entity
	 * @return
	 */
	public int updateAllById(Student entity);
	
	/**
	 * ����,�����Ϊ�ղŸ���
	 * @param entity
	 * @return
	 */
	public int updateNotNullById(Student entity);
	
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
	/**
	 * ������̬SQL��ѯ
	 * @param entity
	 * @return
	 */
	public List<Student> selectByCondition(Student entity);
	/**
	 * ������̬SQL��ѯ-choose
	 * @param entity
	 * @return
	 */
	public List<Student>  selectByConditionChoose(Student entity);

}
