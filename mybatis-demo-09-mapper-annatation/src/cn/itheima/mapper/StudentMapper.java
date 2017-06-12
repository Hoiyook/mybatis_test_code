package cn.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import cn.itheima.pojo.Student;

public interface StudentMapper {
	/**
	 *����ѧ����Ϣ
	 * @param entity
	 * @return
	 */
	@Insert(value="INSERT INTO student	(SNAME, AGE, BIRTHDAY, SEX)	VALUES (#{sname}, #{age}, #{birthday}, #{sex})")
	public int insert(Student entity);
	
	/**
	 * ͨ��idɾ��ѧ��
	 * @param sid
	 * @return
	 */
	@Delete(value=" DELETE FROM student WHERE SID=#{sid}")
	public int deleteById(Long sid);
	
	/**
	 * ����
	 * @param entity
	 * @return
	 */
	@Update(value=" UPDATE student	SET	SNAME=#{sname},	AGE=#{age},	BIRTHDAY=#{birthday},SEX=#{sex}	WHERE  SID=#{sid}")
	public int updateAllById(Student entity);
	
	/**
	 * ��ѯȫ��
	 * @return
	 */
	@Select(value="SELECT *	FROM student")
	public List<Student> selectAll();
	



}
