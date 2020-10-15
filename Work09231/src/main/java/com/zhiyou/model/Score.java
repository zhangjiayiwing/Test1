package com.zhiyou.model;

public class Score {
	
	private Integer id;
	private String name;
	private Integer grade;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Score(Integer id, String name, Integer grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public Score() {
		super();
	}
	@Override
	public String toString() {
		return "Score [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
