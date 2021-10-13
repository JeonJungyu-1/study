package com.scit.test9.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.scit.test9.service.MemberService;
import com.scit.test9.util.PageNavigator;
import com.scit.test9.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	private final int countPerPage = 2;
	private final int pagePerGroup = 3;
	
	@RequestMapping(value="/member/joinForm" , method = RequestMethod.GET)
	public String joinForm() {
		return "member/joinForm";
	}
	
	@RequestMapping(value="/member/join" , method = RequestMethod.POST)
	public String join(MemberVO member, MultipartFile upload) {
		String path = service.join(member, upload);
		return path;
	}
	
	@RequestMapping(value="/member/listForm" , method = RequestMethod.GET)
	public String listForm(Model model
			, @RequestParam(name = "searchText", defaultValue="")  String searchText
			, @RequestParam(name = "currentPage", defaultValue="1") int currentPage) {
		
		int totalRecordsCount = service.totalRecord(searchText);
		
		PageNavigator navi = new PageNavigator(countPerPage, pagePerGroup, currentPage, totalRecordsCount);
		
		ArrayList<MemberVO> result = service.listForm(searchText, navi.getStartRecord(), navi.getCountPerPage());
		
		model.addAttribute("result", result);
		model.addAttribute("searchText", searchText);
		model.addAttribute("navi", navi);
		
		return "member/listForm";
	}
	
	@RequestMapping(value="/member/loginForm" , method = RequestMethod.GET)
	public String loginForm() {
		return "member/loginForm";
	}

	@RequestMapping(value="/member/loginForm2" , method = RequestMethod.GET)
	public String loginForm2() {
		return "member/loginForm2";
	}
	
	@RequestMapping(value="/member/login" , method = RequestMethod.POST)
	public String login(MemberVO member) {
		String path = service.login(member);
		return path;
	}
	
	@RequestMapping(value="/member/logout" , method = RequestMethod.GET)
	public String logout() {
		service.logout();
		return "redirect:/";
	}
	
	@RequestMapping(value="/member/delete" , method = RequestMethod.GET)
	public String delete(MemberVO member) {
		String path = service.delete(member);
		return path;
	}
	
	
	
	@RequestMapping(value="/member/infoForm" , method = RequestMethod.GET)
	public String infoForm(String member_id, Model model) {
		MemberVO result = service.info(member_id);
		model.addAttribute("result", result);
		return "member/infoForm";
	}
}
