package com.scit.resume.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.resume.dao.ResumeDao;
import com.scit.resume.vo.ResumeVO;
import com.scit.resume.vo.UserVO;

@Service
public class ResumeService {

	@Autowired
	private ResumeDao dao;

	@Autowired
	private HttpSession session;
	
	public ArrayList<ResumeVO> list(ResumeVO resume) {
		
		return dao.list(resume);
	}
	
	public String write(ResumeVO resume) {
		String loginId = (String)session.getAttribute("loginId");
		resume.setUser_id(loginId);
		
		int cnt = dao.write(resume);
		String path = "";
		
		if (cnt > 0) {
			path = "redirect:/resume/listForm";
		}
		else {
			path = "redirect:/resume/writeForm";
		}
		return path;
	}
	
	public ResumeVO detail(int resume_no) {
		return dao.detail(resume_no);
	}
	
	public String delete(ResumeVO resume) {
		String path = "";
		String loginId = (String)session.getAttribute("loginId");
		resume.setUser_id(loginId);
		
		int cnt = dao.delete(resume);
		
		if (cnt > 0) {
			path = "redirect:/resume/listForm";
		}
		else {
			path = "redirect:/resume/detail?resume_no="+resume.getResume_no();
		}
		return path;
	}
	
	public String update(ResumeVO resume) {
		String path = "";
		String loginId = (String)session.getAttribute("loginId");
		resume.setUser_id(loginId);
		
		int cnt = dao.update(resume);
		
		if (cnt > 0) {
			path = "redirect:/resume/listForm";
		}
		else {
			path = "redirect:/resume/updatForm?resume_no"+resume.getResume_no();
		}
		return path;
	}
}
