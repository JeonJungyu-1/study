package student.dao;

import java.util.ArrayList;
import java.util.HashMap;

import student.vo.StudentVO;

public interface StudentMapper {
	public int insert(StudentVO vo);

	public ArrayList<StudentVO> selectAll();

	public int delete(String id);

	public int update(StudentVO vo);

	public ArrayList<StudentVO> searchName(String name);

	public StudentVO searchId(String id);

	public ArrayList<StudentVO> searchScore(double avg);

	public ArrayList<StudentVO> searchScore2(HashMap<String, Double> avg);

	public ArrayList<StudentVO> listName();

	public ArrayList<StudentVO> listId();

	public ArrayList<StudentVO> listScore(int i);

	public ArrayList<StudentVO> searchScore3(HashMap<String, Integer> map);

}
