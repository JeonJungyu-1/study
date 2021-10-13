package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

/**
 * DB���� ó�� Ŭ����
 */
public class PersonDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//ȸ������ ����
	public void insertPerson(Person p) {
		SqlSession ss = null;
		
		try {
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
	
	//ȸ������ ����
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
	
	//ȸ������ ����
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
	
	//ȸ������ ��ü �˻�
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

	//ȸ������ 1�� �˻�
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
		
	//ȸ������ �̸����� �˻�
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
	
	//ȸ������ �̸��κ����� �˻�
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
