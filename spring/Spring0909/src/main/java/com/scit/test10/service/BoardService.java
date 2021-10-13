package com.scit.test10.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test10.dao.BoardDAO;
import com.scit.test10.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	public ArrayList<HashMap<String, Object>> list(){
		return dao.list();
	}
}
