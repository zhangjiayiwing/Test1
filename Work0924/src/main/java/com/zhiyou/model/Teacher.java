package com.zhiyou.model;

public class Teacher {
	
	private Integer id;
	private Integer age;
	private String name;
	private String sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Teacher(Integer id, Integer age, String name, String sex) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
}
