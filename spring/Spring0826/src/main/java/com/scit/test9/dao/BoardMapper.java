package com.scit.test9.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.scit.test9.vo.BoardVO;

public interface BoardMapper {
	
	//글 작성
	public int write(BoardVO board);
	//글 목록
	public ArrayList<BoardVO> list(String searchText, RowBounds rb);
	//글 상세정보
	public BoardVO detail(int board_no);
	//글 조회수 증가
	public void updateHits(BoardVO board);
	//글 삭제
	public int delete(BoardVO board);
	//글 수정
	public int update(BoardVO board);
	//전체 글 수
	public int totalRecord(String searchText);
	//글 
}
