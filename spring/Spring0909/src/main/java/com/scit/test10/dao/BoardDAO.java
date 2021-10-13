package com.scit.test10.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test10.vo.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession session;

	public ArrayList<HashMap<String, Object>> list(){
		ArrayList<HashMap<String, Object>> result = null;
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			result = mapper.list();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
