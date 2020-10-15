package com.zhiyou.model;

public class User {
	private String name;
	private String sex;
	private Integer age;
	private Integer id;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User(String name, String sex, Integer age, Integer id) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.id = id;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", age=" + age + ", id=" + id + "]";
	}
	
}
