package student.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import student.vo.StudentVO;


public class StudentManager {
	//���޵Ǵ� �л������� ������ ����Ʈ
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		
		//������ �л������� ���޹޾� ����Ʈ�� �߰�. �����ϸ� true����
		public boolean add(StudentVO vo) {
			//���޹��� vo�� �й��� ���� ����Ʈ�� ������ �������� �ʰ� false ����
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNum() == vo.getNum()) {
					return false;
				}
			}
			//������ ���� �й��̸� ����Ʈ�� �߰��ϰ� true����
			list.add(vo);
			return true;
		}
		
		
		//����� ��� �л������� ����
		public ArrayList<StudentVO> getList() {
			return list;
		}
		
		//����� ��� �л������� �����ؼ� ����
		public ArrayList<StudentVO> getSortList() {
			Collections.sort(list, Comparator.reverseOrder());
			return list;
			
		}
		
		//���޵� �й��� �л����� ����
		public boolean remove(int num) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getNum() == num) {
					list.remove(i);
					return true;
				}
			}
			return false;
		}
		
		//���޵� ȸ�������� ����
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
		
		
		//���޵� ���ڿ��� �̸��� ���Ե� ȸ����� ����
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
		
		//���� ó��
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
