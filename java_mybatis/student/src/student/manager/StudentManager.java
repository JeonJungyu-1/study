package student.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import student.vo.StudentVO;


public class StudentManager {
	//전달되는 학생정보를 저장할 리스트
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		
		//저장할 학생정보를 전달받아 리스트에 추가. 성공하면 true리턴
		public boolean add(StudentVO vo) {
			//전달받은 vo의 학번이 기존 리스트에 있으면 저장하지 않고 false 리턴
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNum() == vo.getNum()) {
					return false;
				}
			}
			//기존에 없던 학번이면 리스트에 추가하고 true리턴
			list.add(vo);
			return true;
		}
		
		
		//저장된 모든 학생정보를 리턴
		public ArrayList<StudentVO> getList() {
			return list;
		}
		
		//저장된 모든 학생정보를 정렬해서 리턴
		public ArrayList<StudentVO> getSortList() {
			Collections.sort(list, Comparator.reverseOrder());
			return list;
			
		}
		
		//전달된 학번의 학생정보 삭제
		public boolean remove(int num) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getNum() == num) {
					list.remove(i);
					return true;
				}
			}
			return false;
		}
		
		//전달된 회원정보를 수정
		public boolean update(StudentVO vo) {
			StudentVO temp = null;
			for (int i = 0; i < list.size(); i++) {
				temp = list.get(i);
				if (temp.getNum() == vo.getNum()) {
					temp.setName(vo.getName());
					temp.setKor(vo.getKor());
					temp.setEng(vo.getEng());
					temp.setMat(vo.getMat());
					return true;
				}
			}
			return false;
		}
		
		
		//전달된 문자열이 이름에 포함된 회원목록 리턴
		public ArrayList<StudentVO> search(int avg) {
			ArrayList<StudentVO> newList = new ArrayList<StudentVO>();
			StudentVO newvo = null;
			for (int i = 0; i < list.size(); i++) {
				newvo = list.get(i);
				if (((newvo.getKor() + newvo.getEng() + newvo.getMat())/3.0) > avg) {
					newList.add(list.get(i));
				}
			}
			Collections.sort(newList, Comparator.reverseOrder());
			return newList;
		}
		
		//예외 처리
		public static int inputScore() throws MinusException, OverException {
			Scanner input = new Scanner(System.in);
			int n = 0;
			n = input.nextInt();
			if (n < 0) {
				input.nextLine();
				throw new MinusException();
			}
			if (n > 100) { 
				input.nextLine();
				throw new OverException();
			}
			
			return n;
		}
}
