package com.scit.test9.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test9.vo.BoardVO;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSession session;
	
	//글 쓰기
	public int write(BoardVO board) {
		int cnt = 0;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.write(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	public ArrayList<BoardVO> list(String searchText, int startRecord, int countPerPage) {
		ArrayList<BoardVO> result = null;
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			RowBounds rb = new RowBounds(startRecord, countPerPage);
			
			result = mapper.list(searchText, rb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public BoardVO detail(BoardVO board) {
		BoardVO result = null;
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			//전달받은 PK와 같은 글의 조회수를 증가
			mapper.updateHits(board);
			//전달받은 PK와 같은 글번호를 조회한 정보
			result = mapper.detail(board.getBoard_no());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(BoardVO board) {
		int cnt = 0;
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.delete(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public BoardVO selectOne(int board_no) {
		 BoardVO board = null;
		 
		 try {
			 BoardMapper mapper = session.getMapper(BoardMapper.class);
			 board = mapper.detail(board_no);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 return board;
	}
	
	public int update(BoardVO board) {
		int cnt = 0;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.update(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int totalRecord(String searchText) {
		int totalRecordsCount = 0;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			totalRecordsCount = mapper.totalRecord(searchText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalRecordsCount;
	}
	
}
