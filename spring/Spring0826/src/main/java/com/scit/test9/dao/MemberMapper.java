package com.scit.test9.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.scit.test9.vo.MemberVO;

public interface MemberMapper {

	//회원가입
	public int join(MemberVO member);
	//회원목록 조회
	public ArrayList<MemberVO> listForm(String searchText, RowBounds rb);
	//로그인
	public MemberVO login(String member_id);
	//회원탈퇴
	public int delete(String member_id);
	//회원 수 조회
	public int totalRecord(String searchText);
}
