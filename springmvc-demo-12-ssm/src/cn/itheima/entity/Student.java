package cn.itheima.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//ctrl+shift+y ��дתСд
public class Student {
	
	private Integer sid;//int(11) not null auto_increment comment '���',
	private Integer aid;//int(11) null default '0',
	private String sname;//varchar(50) null default null comment '����',
	private String sex;//char(3) null default null comment '�Ա�',
	//ȷ��ʱ������ڵĸ�ʽ
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;//date null default null comment '����',
	private Integer age;//int(11) null default null comment '����',
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("-�������-"+sname);
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
