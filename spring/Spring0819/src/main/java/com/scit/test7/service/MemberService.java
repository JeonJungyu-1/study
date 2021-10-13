package com.scit.test7.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test7.dao.MemberDAO;
import com.scit.test7.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	//회원가입
	public String join(MemberVO member) {
		int cnt = dao.join(member);
		String path = ""; //응답페이지 경로
		
		if(cnt > 0) {
			//회원가입 성공
			//메인페이지로 이동
			//path = "home";
			path = "redirect:/";
		}else {
			//회원가입 실패
			//회원가입페이지로 이동
			//path = "member/joinForm";
			path = "redirect:/member/joinForm";
		}
		
		return path;
	}
	
	//회원목록
	public ArrayList<MemberVO> list() {
		return dao.list();
	}
	
	//회원 1명 조회
	public MemberVO search(int member_no) {
		return dao.search(member_no);
	}
	
	//회원 1명 삭제
	public String delete(int member_no) {
		int cnt = dao.delete(member_no);
		String path = "";
		//삭제에 성공했다면 목록으로 이동
		if (cnt > 0) {
			path = "redirect:/member/listForm";
		}
		//삭제에 실패했다면 회원 정보 화면으로 이동
		else {
			path = "redirect:/member/search?member_no="+member_no;
		}
		
		return path;
	}
	
	//회원 1명 수정
	public String update(MemberVO member) {
		int cnt = dao.update(member);
		String path = "";
		
		if(cnt > 0) {
			//수정 성공
			//수정이 성공하면 목록으로 이동
			path = "redirect:/member/listForm";
		} else {
			//수정 실패
			//수정이 실패하면 회원 정보 화면으로 이동
			path = "redirect:/member/search?member_no="+member.getMember_no();
		}
		return path;
	}
}
