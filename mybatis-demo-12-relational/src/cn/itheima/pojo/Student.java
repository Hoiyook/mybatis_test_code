package cn.itheima.pojo;

import java.util.Date;
import java.util.List;

/**
 * pojo,�򵥶���,��ʵ����entity
 * @author ranger
 * ��ݼ�:��Сд�л� ctrl+shitf+y
 * ����:�����ѯѧ����ʱ��,Ҳ���Բ�ѯѧ����Ӧ�ĳɼ�,���ʱ����Ҫ������ѯ
 *
 */
public class Student {
	
	private Long sid;//bigint(20) not null auto_increment,
	private String sname;//varchar(50) null default null,
	private Integer age;//int(11) null default null,
	private Date birthday;//date null default null,
	private String sex;//char(3) null default null,
	//����
	private List<Score> scores;
	
	public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("-set����-"+sname);
		this.sname = sname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}