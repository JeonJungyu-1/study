package com.scit.test7.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test7.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession session;
	
	//회원가입
	public int join(MemberVO member) {
		int cnt = 0;
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.join(member);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	//회원목록
	public ArrayList<MemberVO> list() {
		ArrayList<MemberVO> result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.list();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//회원 1명 조회
	public MemberVO search(int member_no) {
		MemberVO result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.search(member_no);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	//회원 1명 삭제
	public int delete(int member_no) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.delete(member_no);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	//회원 1명 수정
	public int update(MemberVO member) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.update(member);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
