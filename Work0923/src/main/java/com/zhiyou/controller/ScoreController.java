package com.zhiyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Score;

import com.zhiyou.service.ScoreService;

@Controller
public class ScoreController {
	
	@Autowired
	ScoreService scoreService;
	@RequestMapping("show")
	public String show(HttpServletRequest request,HttpServletResponse response){
		List<Score> list = scoreService.selectAll();
		request.setAttribute("list", list);
		return "show";
	}
	@RequestMapping("add")
	public String add(Score score, HttpServletRequest request,HttpServletResponse response){
		scoreService.add(score);
		return "forward:show";
	}
	@RequestMapping("update")
	public String update(Score score, HttpServletRequest request,HttpServletResponse response){
		scoreService.update(score);
		return "forward:show";
	}
	@RequestMapping("byId")
	public String byId(Integer id,  HttpServletRequest request,HttpServletResponse response){
		Score score = scoreService.byId(id);
		request.setAttribute("score", score);
		return "update";
	}
	@RequestMapping("login")
	public String login(String name,Integer grade,HttpServletRequest request,HttpServletResponse response){
		System.out.println(name);
		System.out.println(grade);
		Score score = scoreService.byName(name, grade);
		System.out.println(score);
		request.getSession().setAttribute("score", score);
		return score==null?"index":"forward:show";
	}
	@RequestMapping("delete")
	public String delete(Integer id,HttpServletRequest request,HttpServletResponse response){
		scoreService.delete(id);
		return "forward:show";
	}
}
