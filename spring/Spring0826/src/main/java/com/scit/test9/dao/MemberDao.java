package com.scit.test9.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test9.vo.MemberVO;

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
	
	public ArrayList<MemberVO> listForm(String searchText, int startRecord, int countPerPage) {
		ArrayList<MemberVO> result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			
			RowBounds rb = new RowBounds(startRecord, countPerPage);
			
			result = mapper.listForm(searchText, rb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
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
	
	public int delete(String member_id) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.delete(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int totalRecord(String searchText) {
		int totalRecordsCount = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			totalRecordsCount = mapper.totalRecord(searchText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return totalRecordsCount;
	}
}
