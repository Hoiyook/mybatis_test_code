package cn.itheima.mapper;

import java.util.List;

import cn.itheima.pojo.Score;

public interface ScoreMapper {
	/**
	 * ͨ��ID��ѯָ���ĳɼ�
	 * @param scoreId
	 * @return
	 */
	Score selectById(Long scoreId);
	/**
	 * ��ѯ�����ܷ����Ķ�Ӧѧ��
	 * @return
	 */
	List<Score> selectScoreAndStudent();

}
