package cn.itheima.mapper;

import cn.itheima.pojo.Score;

public interface ScoreMapper {

	int deleteByPrimaryKey(Long scoreId);

	int insert(Score record);

	int insertSelective(Score record);

	Score selectByPrimaryKey(Long scoreId);

	int updateByPrimaryKeySelective(Score record);

	int updateByPrimaryKey(Score record);
}