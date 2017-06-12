package cn.itheima.mapper;

import java.util.List;
import java.util.Map;

import cn.itheima.pojo.Student;

public interface StudentMapper {
	/**
	 *插入学生信息
	 * @param entity
	 * @return
	 */
	public int insert(Student entity);
	
	/**
	 * 通过id删除学生
	 * @param sid
	 * @return
	 */
	public int deleteById(Long sid);
	
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
	/**
	 * 查询返回的数据使用map存储
	 * @return
	 */
	public List<Map<String,Object>>  selectAllToMap();

}
