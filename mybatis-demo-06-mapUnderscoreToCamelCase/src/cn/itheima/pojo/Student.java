package cn.itheima.pojo;

import java.util.Date;

/**
 * pojo,简单对象,其实就是entity
 * @author ranger
 * 快捷键:大小写切换 ctrl+shitf+y
 * 
 * 需求:让数据库里面的规范 XXX_XXX 符合实体类 xxxXxx 如: STUDENT_NAME --> studentName
 *
 */
public class Student {
	
	private Long sid;//bigint(20) not null auto_increment,
	private String studentName;//varchar(50) null default null,
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	private Integer age;//int(11) null default null,
	private Date birthday;//date null default null,
	private String sex;//char(3) null default null,
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
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
