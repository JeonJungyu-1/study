package oop;

public class StudentTest {

	public static void main(String[] args) {
		//��ü ����
		Student s = new Student();
		//setter�� �̿��Ͽ� �� ����
		s.setName("ȫ�浿");
		s.setKor(100);
		s.setEng(90);
		s.setMat(80);
		//getter�� �̿��Ͽ� �� ���
		int t = s.getKor() + s.getEng() + s.getMat();
		System.out.println("����:" + t);
		
		System.out.println("����:" + s.getTotal());
		System.out.println("���:" + s.getAverage());
		//90�� �̻� "��", 80�� �̻� "��"...
		System.out.println("���:" + s.getGrade());
		
		Student s2 = new Student("��ö��", 90, 80, 90);
		Student s3 = new Student("�̿���");
		Student s4 = new Student(100, 100, 100);
//		Math m = new Math(); //�����ڸ� ������� ���ϰ� ����/�����ڸ� �����Ŀ� private ���̱�
	}

}
