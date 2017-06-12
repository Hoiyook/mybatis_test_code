package cn.itheima.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//ctrl+shift+y 大写转小写
public class Student {
	
	private Integer sid;//int(11) not null auto_increment comment '编号',
	private Integer aid;//int(11) null default '0',
	private String sname;//varchar(50) null default null comment '姓名',
	private String sex;//char(3) null default null comment '性别',
	//确定时间或日期的格式
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;//date null default null comment '生日',
	private Integer age;//int(11) null default null comment '年龄',
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
		System.out.println("-输出名字-"+sname);
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
