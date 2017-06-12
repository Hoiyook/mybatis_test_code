package cn.itheima.mapper;

import java.util.Date;
import java.util.List;

import javax.jws.soap.InitParam;

import org.apache.ibatis.annotations.Param;

import cn.itheima.pojo.Student;

public interface StudentMapper {
	/**
	 *����ѧ����Ϣ
	 * @param entity
	 * @return
	 */
	//public int insert(Student entity);
	public int insert(@Param("sname") String sname,@Param("age") Integer age ,@Param("sex") String sex ,@Param("birthday") Date birthday );
	
	/**
	 * ͨ��idɾ��ѧ��
	 * @param sid
	 * @return
	 */
	public int deleteById(@Param("sid") Long sid);
	
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
