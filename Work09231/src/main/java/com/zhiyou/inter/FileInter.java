package com.zhiyou.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class FileInter implements HandlerInterceptor{

	/**
	 * 在执行controller方法之前,如果返回true代表放行,反之不放行.
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		MultipartHttpServletRequest request2 = (MultipartHttpServletRequest) request;
		MultipartFile file = (MultipartFile) request2.getFile("file");
		if (file.getOriginalFilename().endsWith(".png")) {
			if ( file.getSize() < (1024*1024*100)) {
				System.out.println("上传成功");
				return true;
			}
		}
		System.out.println("上传失败");
		return false;
	}
	//controller 代码执行完 	 但是还没有返回视图的时候
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}
	//结合视图之后调用的
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
