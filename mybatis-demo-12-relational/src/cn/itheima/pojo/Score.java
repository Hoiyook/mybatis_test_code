package cn.itheima.pojo;

public class Score {
	//学生成绩表编号
	private Long scoreId;//bigint(20) not null auto_increment,
	//分数
	private Float scoreNum;//float null default null,
	//学生编号
	private Long sid;//bigint(20) not null,
	//科目
	private String subject;//varchar(50) null default null,
	//学生的引用
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

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
