package com.scit.resume.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scit.resume.service.ResumeService;
import com.scit.resume.vo.ResumeVO;
import com.scit.resume.vo.UserVO;

@Controller
public class ResumeController {
	
	@Autowired
	private ResumeService service;
	
	@RequestMapping(value="/resume/listForm" , method=RequestMethod.GET)
	public String listForm(Model model
			, @RequestParam(name = "searchText", defaultValue = "") String searchText
			, @RequestParam(name = "resume_location", defaultValue = "on") String resume_location
			, @RequestParam(name = "resume_position", defaultValue = "on") String resume_position) {
		ResumeVO vo = new ResumeVO();
		vo.setSearchText(searchText);
		vo.setResume_position(resume_position);
		vo.setResume_location(resume_location);
		ArrayList<ResumeVO> resume = service.list(vo);
		model.addAttribute("resume", resume);
		model.addAttribute("searchText", searchText);
		return "resume/listForm";
	}
	
	@RequestMapping(value="/resume/writeForm" , method=RequestMethod.GET)
	public String writeForm() {
		return "resume/writeForm";
	}
	
	@RequestMapping(value="/resume/write" , method=RequestMethod.POST)
	public String write(ResumeVO resume) {
		return service.write(resume);
	}
	
	@RequestMapping(value="/resume/detail" , method=RequestMethod.GET)
	public String detail(Model model, int resume_no) {
		ResumeVO resume = service.detail(resume_no);
		model.addAttribute("resume", resume);
		
		return "resume/detail";
	}
	
	@RequestMapping(value="/resume/delete" , method=RequestMethod.GET)
	public String delete(ResumeVO resume) {
		return service.delete(resume);
	}

	@RequestMapping(value="/resume/updateForm" , method=RequestMethod.GET)
	public String updateForm(Model model, int resume_no) {
		ResumeVO resume = service.detail(resume_no);
		
		model.addAttribute("resume", resume);
		return "resume/updateForm";
	}
	
	@RequestMapping(value="/resume/update" , method=RequestMethod.POST)
	public String update(ResumeVO resume) {
		return service.update(resume);
	}
	
}
