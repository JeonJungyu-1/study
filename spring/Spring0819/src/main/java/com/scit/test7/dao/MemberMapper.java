package com.scit.test7.dao;

import java.util.ArrayList;

import com.scit.test7.vo.MemberVO;

public interface MemberMapper {
	//회원가입
	public int join(MemberVO member);
	//회원목록
	public ArrayList<MemberVO> list();
	//회원 1명 조회
	public MemberVO search(int member_no);
	//회원 1명 삭제
	public int delete(int member_no);
	//회원 1명 수정
	public int update(MemberVO member);
}
