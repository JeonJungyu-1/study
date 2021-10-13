package board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.BoardVO;
import board.vo.MemberVO;
import board.vo.ReplyVO;



public class BoardDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	
	public int join(MemberVO vo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			result = mapper.join(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}


	public MemberVO getId(String id) {
		SqlSession ss = null;
		MemberVO vo = null;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			vo = mapper.getId(id);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return vo;
	}

	//비밀번호 확인
	public MemberVO getPassword(String id, String password) {
		SqlSession ss = null;
		MemberVO vo = null;
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("password", password);
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			vo = mapper.getPassword(map);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return vo;
	}

	//글쓰기
	public int write(BoardVO bvo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			result = mapper.write(bvo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}


	public ArrayList<BoardVO> list() {
		SqlSession ss = null;
		ArrayList<BoardVO> list = null;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			list = mapper.list();
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}


	public BoardVO read(int num) {
		SqlSession ss = null;
		BoardVO vo = null;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			mapper.readupdate(num);
			ss.commit();
			vo = mapper.read(num);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return vo;
	}


	public ArrayList<BoardVO> search(int type, String word) {
		SqlSession ss = null;
		ArrayList<BoardVO> list = null;
		HashMap<String, Object> map = new HashMap<>();
		map.put("type", type);
		map.put("word", word);
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			list = mapper.search(map);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}


	public int update(BoardVO vo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			result = mapper.update(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}


	public int delete(int num, String loginId) {
		SqlSession ss = null;
		BoardVO vo = new BoardVO();
		vo.setNum(num);
		vo.setId(loginId);
		int result = 0;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			result = mapper.delete(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}

	//댓글 읽기
	public ArrayList<ReplyVO> replyRead(int num) {
		SqlSession ss = null;
		ArrayList<ReplyVO> result = null;
		try {
			ss = factory.openSession(); 
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			result = mapper.replyRead(num);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}



}
