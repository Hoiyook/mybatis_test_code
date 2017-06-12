package cn.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.itheima.pojo.Student;

public interface StudentMapper {
	/**
	 *插入学生信息
	 * @param entity
	 * @return
	 */
	public int insert(Student entity);
	
	/**
	 * 批量插入
	 * @param entity
	 * @return
	 */
	public int batchInsert(List<Student> entity);
	
	/**
	 * 通过id删除学生
	 * @param sid
	 * @return
	 */
	public int deleteById(Long sid);
	
	/**
	 * 通过ids删除学生
	 * 使用三个点,如果只有一个值,参数不用传递数组,两个值以上才需要传递数组
	 * @param sid
	 * @return
	 */
	public int deleteByIds(Long... sid);
	
	/**
	 * 更新
	 * @param entity
	 * @return
	 */
	public int updateAllById(Student entity);
	
	/**
	 * 更新,如果不为空才更新
	 * @param entity
	 * @return
	 */
	public int updateNotNullById(Student entity);
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<Student> selectAll();
	
	/**
	 * 模糊查询
	 * @return
	 */
	public List<Student> selectBySName(String sname);
	/**
	 * 条件动态SQL查询
	 * @param entity
	 * @return
	 */
	public List<Student> selectByCondition(Student entity);
	/**
	 * 条件动态SQL查询-choose
	 * @param entity
	 * @return
	 */
	public List<Student>  selectByConditionChoose(Student entity);

}
