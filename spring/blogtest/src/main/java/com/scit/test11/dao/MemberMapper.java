package com.scit.test11.dao;

import java.util.ArrayList;

import com.scit.test11.vo.MemberVO;

public interface MemberMapper {
	//회원가입
	public int join(MemberVO member);
	//로그인
	public MemberVO login(String member_id);
	//회원목록
	public ArrayList<MemberVO> list();
}
