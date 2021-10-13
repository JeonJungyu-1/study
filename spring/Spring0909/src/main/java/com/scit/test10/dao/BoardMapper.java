package com.scit.test10.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.test10.vo.BoardVO;

public interface BoardMapper {
	
	public ArrayList<HashMap<String, Object>> list();
}
