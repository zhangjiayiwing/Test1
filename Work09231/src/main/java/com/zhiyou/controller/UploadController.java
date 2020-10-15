package com.zhiyou.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UploadController {
	
	@RequestMapping("upload")
	public ModelAndView upload(MultipartFile file, HttpServletRequest req, HttpServletResponse res) throws IOException {
		// 文件的类型
		System.out.println(file.getContentType());
		// 文件大小
		System.out.println(file.getSize());
		// 文件名字
		System.out.println(file.getOriginalFilename());
		// 准备输入流
		InputStream in = file.getInputStream();
		// 准备输出流
		FileOutputStream out = new FileOutputStream("D:/" + file.getOriginalFilename());
		// 实现文件拷贝
		IOUtils.copy(in, out);
		in.close();
		out.close();
		
		//req.getSession().setAttribute("FILE", file);
		return null;
	}
	
	
	
	
	
	
	@RequestMapping("do")
	public ModelAndView hello2(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		File file = new File("D:/day5.jpg");
		response.setHeader("content-disposition", "attachment;filename=day5.jpg");
		FileInputStream in = new FileInputStream(file);
		
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		in.close();
		out.close();
		return null;
	}
}
