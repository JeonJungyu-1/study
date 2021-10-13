package com.scit.test11.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test11.vo.MemberVO;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession session;
	
	public int join(MemberVO member) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.join(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public MemberVO login(String member_id) {
		MemberVO result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.login(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<MemberVO> list() {
		ArrayList<MemberVO> result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
