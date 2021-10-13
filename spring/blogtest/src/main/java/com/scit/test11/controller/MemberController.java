package com.scit.test11.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test11.service.MemberService;
import com.scit.test11.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping(value="/member/joinForm" , method=RequestMethod.GET)
	public String joinForm() {
		return "member/joinForm";
	}
	
	@RequestMapping(value="/member/join" , method=RequestMethod.POST)
	public String join(MemberVO member) {
		return service.join(member);
	}
	
	@RequestMapping(value="/member/loginForm" , method=RequestMethod.GET)
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping(value="/member/login" , method=RequestMethod.POST)
	public String login(MemberVO member) {
		return service.login(member);
	}
	
	@RequestMapping(value="/member/logout" , method=RequestMethod.GET)
	public String logout() {
		service.logout();
		return "redirect:/";
	}
	
	@RequestMapping(value="/member/listForm" , method=RequestMethod.GET)
	public String listForm(Model model) {
		ArrayList<MemberVO> result = service.list();
		
		model.addAttribute("result", result);
		
		return "member/listForm";
	}
}
