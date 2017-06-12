package cn.itheima.pojo;

import java.util.Date;

/**
 * pojo,简单对象,其实就是entity
 * @author ranger
 * 快捷键:大小写切换 ctrl+shitf+y
 * 需求:如果查询学生的时候,也可以查询学生对应的成绩,这个时候需要关联查询
 *
 */
public class Student {
	
	private Long sid;//bigint(20) not null auto_increment,
	private String sname;//varchar(50) null default null,
	private Integer age;//int(11) null default null,
	private Date birthday;//date null default null,
	private String sex;//char(3) null default null,

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
		System.out.println("-set方法-"+sname);
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
