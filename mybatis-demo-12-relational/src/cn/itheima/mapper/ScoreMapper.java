package cn.itheima.mapper;

import java.util.List;

import cn.itheima.pojo.Score;

public interface ScoreMapper {
	/**
	 * 通过ID查询指定的成绩
	 * @param scoreId
	 * @return
	 */
	Score selectById(Long scoreId);
	/**
	 * 查询分数很分数的对应学生
	 * @return
	 */
	List<Score> selectScoreAndStudent();

}
