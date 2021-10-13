package com.scit.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.resume.service.UserService;
import com.scit.resume.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/user/joinForm" , method=RequestMethod.GET)
	public String joinForm() {
		return "user/joinForm";
	}

	@RequestMapping(value="/user/loginForm" , method=RequestMethod.GET)
	public String loginForm() {
		return "user/loginForm";
	}
	
	@RequestMapping(value="/user/join" , method=RequestMethod.POST)
	public String join(UserVO user) {
		return service.join(user);
	}
	
	@RequestMapping(value="/user/login" , method=RequestMethod.POST)
	public String login(UserVO user) {
		return service.login(user);
	}
	
	@RequestMapping(value="/user/logout" , method=RequestMethod.GET)
	public String logout() {
		service.logout();
		return "redirect:/";
	}
	
}
