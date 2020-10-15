package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.dao.ScoreDAO;
import com.zhiyou.model.Score;
import com.zhiyou.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {
	@Autowired
	ScoreDAO scoreDAO;

	public void add(Score score) {
		// TODO Auto-generated method stub
		scoreDAO.add(score);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		scoreDAO.delete(id);
	}

	public void update(Score score) {
		// TODO Auto-generated method stub
		scoreDAO.update(score);
	}

	public List<Score> selectAll() {
		// TODO Auto-generated method stub
		return scoreDAO.selectAll();
	}

	public Score byName(String name, Integer grade) {
		// TODO Auto-generated method stub
		return scoreDAO.byName(name, grade);
	}

	public Score byId(Integer id) {
		// TODO Auto-generated method stub
		return scoreDAO.byId(id);
	}

}
