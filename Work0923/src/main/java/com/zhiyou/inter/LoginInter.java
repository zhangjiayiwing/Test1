package com.zhiyou.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou.model.Score;


public class LoginInter implements HandlerInterceptor {
	//执行controller 之前执行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Score user = (Score)request.getSession().getAttribute("score");
		if (user==null) {
			response.sendRedirect("index.jsp");  //重定向
			return false; //不让访问controller
		}
		return true;   //  可以访问controller
	}
	//controller代码执行完,但是还没有返回视图的时候
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("代码执行完了 ,没返回视图");
		
	}
	//结合视图之后调用
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("返回视图之后");
	}

}
