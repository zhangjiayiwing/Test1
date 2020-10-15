package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Score;



public interface ScoreMapper {
	
	void add(Score score);
	void delete(int id);
	void update(Score score);
	List<Score> selectAll();
	Score byName(String name,Integer grade);
	Score byId(Integer id);
}
