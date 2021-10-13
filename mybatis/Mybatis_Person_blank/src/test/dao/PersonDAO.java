package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

/**
 * DB관련 처리 클래스
 */
public class PersonDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	//회원정보 저장
	public void insertPerson(Person p) {
		SqlSession ss = null;
		
		try {
			ss = factory.openSession(); //실행안되면 오라클과 연결 안됨/오라클접속이 꺼져있거나 오라클 설정이 잘못 적혀있는것
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			mapper.insertPerson(p);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
	}
	
	//회원정보 삭제
	public int deletePerson(int n) {
		SqlSession ss = null;
		int cnt = 0;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			cnt = mapper.deletePerson(n);
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
	
	//회원정보 수정
	public int updatePerson(Person p) {
		SqlSession ss = null;
		int cnt = 0;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			cnt = mapper.updatePerson(p);
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
	
	//회원정보 전체 검색
	public ArrayList<Person> selectAll() {
		SqlSession ss = null;
		ArrayList<Person> list = null;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
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

	//회원정보 1명 검색
		public Person selectOne(int num) {
			SqlSession ss = null;
			Person p = null;
			
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class);
				p = mapper.selectOne(num);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				if (ss != null) ss.close();
			}
			return p;
		}
		
	//회원정보 이름으로 검색
	public ArrayList<Person> selectName(String s) {
		SqlSession ss = null;
		ArrayList<Person> list = null;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			list = mapper.selectName(s);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return list;
	}
	
	//회원정보 이름부분으로 검색
		public ArrayList<Person> selectName2(String s) {
			SqlSession ss = null;
			ArrayList<Person> list = null;
			
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class);
				list = mapper.selectName2(s);
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
