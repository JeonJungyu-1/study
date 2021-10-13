package com.scit.test9.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.scit.test9.dao.MemberDao;
import com.scit.test9.util.FileService;
import com.scit.test9.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	@Autowired
	private HttpSession session;
	
	private static final String UPLOAD_PATH = "/uploadFiles/profiles";
	
	public String join(MemberVO member, MultipartFile upload) {
		
		if(!upload.isEmpty()) {
			String original = upload.getOriginalFilename();
			String saved = FileService.saveFile(upload, UPLOAD_PATH);
			
			member.setMember_original(original);
			member.setMember_saved(saved);
		}
		
		int cnt = dao.join(member);
		String path = "";
		if(cnt > 0) {
			path = "redirect:/";
		}
		else {
			path = "redirect:/member/joinForm";
		}
		return path;
	}
	
	public ArrayList<MemberVO> listForm(String searchText, int startRecord, int countPerPage) {
		return dao.listForm(searchText, startRecord, countPerPage);
	}
	
	public String login(MemberVO member) {
		MemberVO result = dao.login(member.getMember_id());
		String path = "";
		
		if (result == null) {
			path = "redirect:/member/loginForm";
		}
		else {
			if (result.getMember_pw().equals(member.getMember_pw())) {
				session.setAttribute("loginId", result.getMember_id());
				session.setAttribute("loginNm", result.getMember_nm());
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
	
	public String delete(MemberVO member) {
		MemberVO result = dao.login(member.getMember_id());
		String path = "";
		
		if (result == null) {
			path = "redirect:/";
		}
		else {
			if (result.getMember_pw().equals(member.getMember_pw())) {
				int cnt = dao.delete(member.getMember_id());
				if(cnt > 0) {
					session.removeAttribute("loginId");
					session.removeAttribute("loginNm");
					path = "redirect:/";
				}
				else {
					path = "redirect:/member/infoForm?member_id="+member.getMember_id();
				}
				
			}
			else {
				path = "redirect:/member/infoForm?member_id="+member.getMember_id();
			}
		}
		return path;
	}
	
	public MemberVO info(String member_id) {
		return dao.login(member_id);
	}
	
	public int totalRecord(String searchText) {
		return dao.totalRecord(searchText);
	}
	
}
