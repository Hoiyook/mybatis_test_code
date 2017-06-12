package cn.itheima.pojo;

public class Score {

	private Long scoreId;
	private Float scoreNum;
	private Long sid;
	private String subject;

	public Long getScoreId() {
		return scoreId;
	}

	public void setScoreId(Long scoreId) {
		this.scoreId = scoreId;
	}

	public Float getScoreNum() {
		return scoreNum;
	}

	public void setScoreNum(Float scoreNum) {
		this.scoreNum = scoreNum;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}