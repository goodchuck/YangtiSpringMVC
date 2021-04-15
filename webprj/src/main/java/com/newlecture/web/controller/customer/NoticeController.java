package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;


@Controller
@RequestMapping("/customer/notice/") //아래 맵핑이랑 결합이된다 공통부분은 여기다 만들자
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request) throws ClassNotFoundException, SQLException { 
		String p = request.getParameter("p"); // String list() ()안에 String p를 넣어도 똑같이 활용이가능 여기 줄은 주석처리하고
		System.out.println(p);
		
		//List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
}
