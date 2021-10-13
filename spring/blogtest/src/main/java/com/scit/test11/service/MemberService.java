package com.scit.test11.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test11.dao.MemberDao;
import com.scit.test11.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	@Autowired
	private HttpSession session;
	
	public String join(MemberVO member) {
		int cnt = dao.join(member);
		String path = "";
		
		if (cnt > 0) {
			path = "redirect:/";
		}
		else {
			path = "redirect:/joinForm";
		}
		return path;
	}
	
	public String login(MemberVO member) {
		MemberVO result = dao.login(member.getMember_id());
		String path = "";
		
		if(result == null) {
			path = "redirect:/member/loginForm";
		}
		else {
			if(member.getMember_password().equals(result.getMember_password())) {
				session.setAttribute("loginId", result.getMember_id());
				session.setAttribute("loginNm", result.getMember_name());
				path = "redirect:/";
			}
			else {
				path = "redirect:/member/loginForm";
			}
		}
		
		return path;
	}
	
	public void logout() {
		session.removeAttribute("loginId");
		session.removeAttribute("loginNm");
	}
	
	public ArrayList<MemberVO> list() {
		return dao.list();
	}
	

	
}
