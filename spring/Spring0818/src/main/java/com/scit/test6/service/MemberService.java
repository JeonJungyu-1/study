package com.scit.test6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test6.dao.MemberDAO;
import com.scit.test6.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	public String join(MemberVO member) {
		int cnt = dao.join(member);
		String path = ""; //응답페이지 경로
		
		if(cnt > 0) {
			//회원가입 성공
			//메인페이지로 이동
			path = "home";
		}else {
			//회원가입 실패
			//회원가입페이지로 이동
			path = "member/joinForm";
		}
		
		return path;
	}
}
