package com.scit.test7.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test7.service.MemberService;
import com.scit.test7.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping(value="/member/joinForm", method=RequestMethod.GET)
	public String joinForm() {
		return "member/joinForm";
	}
	
	@RequestMapping(value="/member/join", method=RequestMethod.POST)
	public String join(MemberVO member) {
		String path = service.join(member);
		return path;
	}
	
	@RequestMapping(value="/member/listForm", method=RequestMethod.GET)
	public String listForm(Model model) {
		//DB에 가서 회원목록을 조회한다.
		ArrayList<MemberVO> result = service.list();
		
		model.addAttribute("result", result);
		
		return "member/listForm";
	}
	
	@RequestMapping(value="/member/search", method = RequestMethod.GET)
	public String search(int member_no, Model model) {
		//전달받은 회원번호로 DB에서 조회를 하고
		MemberVO result = service.search(member_no);
		
		//조회한 결과를 화면으로 응답한다.
		model.addAttribute("result", result);
		
		return "member/search";
	}
	
	@RequestMapping(value="/member/delete" , method = RequestMethod.GET)
	public String delete(int member_no) {
		//전달받은 회원번호를 가진 회원의 정보를 DB에서 삭제한다.
		String path = service.delete(member_no);
		//삭제에 성공했다면 목록으로 이동
		//삭제에 실패했다면 회원 정보 화면으로 이동
		return path;
	}
	
	@RequestMapping(value="/member/updateForm" , method = RequestMethod.GET)
	public String updateForm(int member_no, Model model) {
		//전달받은 회원번호를 가진 회원 정보를 조회하여
		MemberVO result = service.search(member_no);
		//수정폼으로 이동한다.
		model.addAttribute("result", result);
		return "member/updateForm";
	}
	
	@RequestMapping(value="/member/update" , method = RequestMethod.POST)
	public String update(MemberVO member) {
		//전달받은 회원 정보로 DB에 가서 수정한다.
		//SQL - update를 하는데 pk를 활용한다.
		String path = service.update(member);
		//수정이 성공하면 목록으로 이동
		//수정이 실패하면 회원 정보 화면으로 이동
		return path;
	}
}
