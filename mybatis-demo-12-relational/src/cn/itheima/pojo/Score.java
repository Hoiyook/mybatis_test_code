package cn.itheima.pojo;

public class Score {
	//ѧ���ɼ�����
	private Long scoreId;//bigint(20) not null auto_increment,
	//����
	private Float scoreNum;//float null default null,
	//ѧ�����
	private Long sid;//bigint(20) not null,
	//��Ŀ
	private String subject;//varchar(50) null default null,
	//ѧ��������
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
