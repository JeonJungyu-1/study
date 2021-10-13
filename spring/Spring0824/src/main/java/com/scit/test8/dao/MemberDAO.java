package com.scit.test8.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test8.vo.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession session;
	
	public MemberVO search(String member_id) {
		MemberVO member = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			member = mapper.search(member_id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return member;
	}
}
