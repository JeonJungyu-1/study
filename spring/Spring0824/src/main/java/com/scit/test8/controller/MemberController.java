package com.scit.test8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test8.service.MemberService;
import com.scit.test8.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping(value="/member/loginForm" , method = RequestMethod.GET)
	public String loginForm() {
		//로그인 페이지로 이동
		return "member/loginForm";
	}
	
	@RequestMapping(value="/member/login" , method = RequestMethod.POST)
	public String login(MemberVO member) {
		//전달받은 데이터와 DB에 저장되어있는(회원가입 되어있는) 데이터와 동일한지 비교한다.
		//1. 전달받은 데이터 중에서 ID값을 가지고 DB에 가서 해당 ID와 동일한 ID가 있을 경우
		//	 데이터를 조회한다.
		//2. 동일한 ID가 DB에 없다면 사용자는 ID를 잘못입력한 것입니다.
		//3. 동일한 ID가 DB에 있다면 비밀번호도 동일한지 검사합니다.
		//4. 비밀번호가 동일하지 않다면 비밀번호를 잘못입력한 것입니다.
		String path = service.login(member);
		return path;
	}
	
	@RequestMapping(value="/member/logout" , method = RequestMethod.GET)
	public String logout() {
		service.logout();
		return "redirect:/";
	}
	
	
	@RequestMapping(value="/member/listForm" , method = RequestMethod.GET)
	public String listForm() {
		return "member/listForm";
	}
}
