package cn.itheima.pojo;

import java.util.Date;

/**
 * pojo,�򵥶���,��ʵ����entity
 * @author ranger
 * ��ݼ�:��Сд�л� ctrl+shitf+y
 * 
 * ����:�����ݿ�����Ĺ淶 XXX_XXX ����ʵ���� xxxXxx ��: STUDENT_NAME --> studentName
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
