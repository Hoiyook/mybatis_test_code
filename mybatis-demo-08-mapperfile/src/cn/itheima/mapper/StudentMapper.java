package cn.itheima.mapper;

import java.util.Date;
import java.util.List;

import javax.jws.soap.InitParam;

import org.apache.ibatis.annotations.Param;

import cn.itheima.pojo.Student;

public interface StudentMapper {
	/**
	 *插入学生信息
	 * @param entity
	 * @return
	 */
	//public int insert(Student entity);
	public int insert(@Param("sname") String sname,@Param("age") Integer age ,@Param("sex") String sex ,@Param("birthday") Date birthday );
	
	/**
	 * 通过id删除学生
	 * @param sid
	 * @return
	 */
	public int deleteById(@Param("sid") Long sid);
	
	/**
	 * 更新
	 * @param entity
	 * @return
	 */
	public int updateAllById(Student entity);
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<Student> selectAll();

}
