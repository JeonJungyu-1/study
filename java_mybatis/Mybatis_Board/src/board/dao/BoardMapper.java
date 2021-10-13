package board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import board.vo.BoardVO;
import board.vo.MemberVO;
import board.vo.ReplyVO;

public interface BoardMapper {
	//회원가입
	public int join(MemberVO vo);
	//id로 회원정보 검색
	public MemberVO getId(String id);
	//비밀번호 확인
	public MemberVO getPassword(HashMap<String, String> map);
	//글쓰기
	public int write(BoardVO bvo);
	//글목록
	public ArrayList<BoardVO> list();
	//글읽기할때 조회수 1 증가
	public void readupdate(int num);
	//글읽기
	public BoardVO read(int num);
	//검색
	public ArrayList<BoardVO> search(HashMap<String, Object> map);
	//수정
	public int update(BoardVO vo);
	//삭제
	public int delete(BoardVO vo);
	//댓글 읽기
	public ArrayList<ReplyVO> replyRead(int num);

}
