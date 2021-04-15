package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

@Controller
@RequestMapping("/")
public class HomeController{

//	@RequestMapping("/index")
//	public String index() {
//		
//		return "root.index"; //타일즈에서 리절빙이 가능해짐
//	}
	
//	@RequestMapping("index")
//	public void index(HttpServletResponse response) {
//		PrintWriter out;
//		try {
//			out = response.getWriter();
//			out.println("Hello Index");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//return "root.index"; //타일즈에서 리절빙이 가능해짐
//	}
	
	@RequestMapping("index")
	@ResponseBody 	// return하는 녀석은 자체 String이다
	public String index() {
		
		return "Hello Index 1"; 
	}	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		//System.out.println("index controller");
//		//ModelAndView mv = new ModelAndView();
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC~");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		return mv;
//	}
	
}
