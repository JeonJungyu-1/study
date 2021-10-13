package com.scit.resume.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.resume.dao.UserDao;
import com.scit.resume.vo.UserVO;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	@Autowired
	private HttpSession session;
	
	public String join(UserVO user) {
		int cnt = dao.join(user);
		String path = "";
		if(cnt > 0) {
			path = "redirect:/";
		}
		else {
			path = "redirect:/user/joinForm";
		}
		return path;
	}
	
	public String login(UserVO user) {
		UserVO result = dao.login(user.getUser_id());
		String path = "";
		
		if(result == null) {
			path = "redirect:/user/loginForm";
		}
		else {
			if(user.getUser_pw().equals(result.getUser_pw()) ) {
				session.setAttribute("loginId", result.getUser_id());
				session.setAttribute("loginNm", result.getUser_nm());
				path = "redirect:/";
			}
			else {
				path = "redirect:/user/loginForm";
			}
		}
		return path;
	}
	
	public void logout() {
		session.removeAttribute("loginId");
		session.removeAttribute("loginNm");
	}
}
