package com.scit.test5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test5.dao.PersonDAO;
import com.scit.test5.vo.PersonVO;

@Controller
public class PersonController {
	
	@Autowired
	private PersonDAO dao;
	
	@RequestMapping(value="/joinForm", method=RequestMethod.GET)
	public String joinForm() {
		return "person/joinForm";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(PersonVO person) {
		//사용자로부터 전달받은 데이터를 DB에 등록한다.
		int cnt = dao.join(person);
		
		if(cnt > 0) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
		
		return "home";
	}
}
