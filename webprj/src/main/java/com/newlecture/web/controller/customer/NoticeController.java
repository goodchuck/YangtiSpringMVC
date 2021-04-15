package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;


@Controller
@RequestMapping("/customer/notice/") //아래 맵핑이랑 결합이된다 공통부분은 여기다 만들자
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(@RequestParam(name = "p", defaultValue="1") String page) throws ClassNotFoundException, SQLException {  //String page 말고 int page도 가능하다
		//String p = request.getParameter("p"); // String list() ()안에 String p를 넣어도 똑같이 활용이가능 여기 줄은 주석처리하고
		//@RequestParam(value 와 name은 같은거임 별칭일뿐)
		
		System.out.println("page: " + page);
		
		//List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
}
