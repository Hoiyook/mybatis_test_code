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
		// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
		ScoreMapper scoreMapper = session.getMapper(ScoreMapper.class);
		Score score = scoreMapper.selectById(1L);
		System.out.println("学生编号:"+score.getStudent().getSid()+",学生名:"+score.getStudent().getSname()+"科目:"+score.getSubject()+"分数:"+score.getScoreNum());
		session.close();
	}
	
	@Test
	public void selectScoreAndStudent() {
		try {
			SqlSession session = DbUtils.getSession();
			// 通过session的getMapper方法将映射文件动态生成的对象赋予接口
			ScoreMapper scoreMapper = session.getMapper(ScoreMapper.class);
			List<Score> scores = scoreMapper.selectScoreAndStudent();
			for(Score score: scores){
			System.out.println("学生编号:"+score.getStudent().getSid()+",学生名:"+score.getStudent().getSname()+"科目:"+score.getSubject()+"分数:"+score.getScoreNum());
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
