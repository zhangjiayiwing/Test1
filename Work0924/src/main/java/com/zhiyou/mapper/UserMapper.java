package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.User;

public interface UserMapper {
	void add(User user);
	void update(User user);
	void delete(Integer id);
	List<User>all();
	List<User>findAll(User user);
	List<User>likeAll(User user);
	void deleteAll(int [] arr);
}
