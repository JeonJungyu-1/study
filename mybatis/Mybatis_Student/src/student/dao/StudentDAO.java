package student.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student.vo.StudentVO;

public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//�� �л����� ���
	public int insert(StudentVO vo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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

	//��ü ����
	public ArrayList<StudentVO> selectAll() {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
	
	
	
	//����
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
	
	//����
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
	
	//�̸����� �˻�
	public ArrayList<StudentVO> searchName(String name) {
		SqlSession ss = null;
		ArrayList<StudentVO> list = null;
		try {
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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

	//�й����� �˻�
	public StudentVO searchId(String id) {
		SqlSession ss = null;
		StudentVO vo = null;
		try {
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
			ss = factory.openSession(); //����ȵǸ� ����Ŭ�� ���� �ȵ�/����Ŭ������ �����ְų� ����Ŭ ������ �߸� �����ִ°�
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
