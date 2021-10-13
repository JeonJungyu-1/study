package com.scit.test8.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test8.dao.MemberDAO;
import com.scit.test8.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private HttpSession session;

	//매개변수 member는 사용자가 입력한 ID와 비밀번호가 들어있다.
	//지역변수 result는 사용자가 입력한 ID로 DB에서 조회한 데이터가 들어있다.
	
	public String login(MemberVO member) {
		
		MemberVO result = dao.search(member.getMember_id());
		
		//로그인을 성공했을 경우 - home.jsp
		//로그인을 실패했을 경우 - loginForm.jsp
		String path = "";
		
		if(result == null) {
			//ID를 잘못 입력했을 경우
			path = "redirect:/member/loginForm";
		} else {
			//ID는 올바르게 입력한 경우
			if(member.getMember_pw().equals(result.getMember_pw())) {
				//ID와 비밀번호가 올바르게 입력된 경우
				//로그인은 해주어야 하는 상황
				//로그인을 해준다는 것은 세션 스코프에 로그인 정보를 저장하는 것
				session.setAttribute("loginId", result.getMember_id());
				session.setAttribute("loginNm", result.getMember_nm());
				path = "redirect:/";
			} else {
				//비밀번호를 잘못 입력했을 경우
				path = "redirect:/member/loginForm";
			}
		}
		return path;
	}
	
	
	/*
	 * 세션스코프 자체를 삭제함/로그인정보뿐아니라 다른 정보도 다 삭제됨/그래서 잘 사용안함 
	 * session.invalidate();
	 */
	public void logout() {
		//로그아웃은 세션스코프에 저장되어 있는 로그인 정보를 삭제하는 것
		session.removeAttribute("loginId");
		session.removeAttribute("loginNm");
	}
}
