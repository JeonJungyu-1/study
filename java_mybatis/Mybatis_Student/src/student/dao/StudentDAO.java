package student.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student.vo.StudentVO;

public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//새 학생정보 등록
	public int insert(StudentVO vo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			result = mapper.insert(vo);
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

	//전체 보기
	public ArrayList<StudentVO> selectAll() {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.selectAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
	public ArrayList<StudentVO> listScore(int i) {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.listScore(i);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
	public ArrayList<StudentVO> listName() {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.listName();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
	public ArrayList<StudentVO> listId() {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.listId();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
	
	
	//삭제
	public int delete(String id) {
		SqlSession ss = null;
		int cnt = 0;
		try {
			ss = factory.openSession();
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			cnt = mapper.delete(id);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return cnt;
	}
	
	//수정
	public int update(StudentVO vo) {
		SqlSession ss = null;
		int cnt = 0;
		try {
			ss = factory.openSession();
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			cnt = mapper.update(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return cnt;
	}
	
	//이름으로 검색
	public ArrayList<StudentVO> searchName(String name) {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.searchName(name);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}

	//학번으로 검색
	public StudentVO searchId(String id) {
		SqlSession ss = null;
		StudentVO vo = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			vo = mapper.searchId(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return vo;
	}

	public ArrayList<StudentVO> searchScore(double avg) {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.searchScore(avg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}

	public ArrayList<StudentVO> searchScore2(HashMap<String, Double> avg) {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.searchScore2(avg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
	
	public ArrayList<StudentVO> searchScore3(int min, int max) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("min", min);
		map.put("max", max);
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			list = mapper.searchScore3(map);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
}
