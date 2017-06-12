package cn.itheima.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.itheima.mapper.ScoreMapper;
import cn.itheima.pojo.Score;
import cn.itheima.utils.DbUtils;

public class ScoreDAOTest {

	@Test
	public void selectById() {
		SqlSession session = DbUtils.getSession();
		// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
		ScoreMapper scoreMapper = session.getMapper(ScoreMapper.class);
		Score score = scoreMapper.selectById(1L);
		System.out.println("ѧ�����:"+score.getStudent().getSid()+",ѧ����:"+score.getStudent().getSname()+"��Ŀ:"+score.getSubject()+"����:"+score.getScoreNum());
		session.close();
	}
	
	@Test
	public void selectScoreAndStudent() {
		try {
			SqlSession session = DbUtils.getSession();
			// ͨ��session��getMapper������ӳ���ļ���̬���ɵĶ�����ӿ�
			ScoreMapper scoreMapper = session.getMapper(ScoreMapper.class);
			List<Score> scores = scoreMapper.selectScoreAndStudent();
			for(Score score: scores){
			System.out.println("ѧ�����:"+score.getStudent().getSid()+",ѧ����:"+score.getStudent().getSname()+"��Ŀ:"+score.getSubject()+"����:"+score.getScoreNum());
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
