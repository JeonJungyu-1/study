package com.scit.test10.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test10.service.BoardService;
import com.scit.test10.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@RequestMapping(value="/board/list" , method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<HashMap<String, Object>> result = service.list();
		
		model.addAttribute("result", result);
		
		return "board/list";
	}
}
