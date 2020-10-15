package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Teacher;

public interface TeacherMapper {
	
	void add(Teacher teacher);
	void update(Teacher teacher);
	void delete(Integer id);
	List<Teacher>all();
}
