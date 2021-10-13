package oop;

public class StudentTest {

	public static void main(String[] args) {
		//객체 생성
		Student s = new Student();
		//setter를 이용하여 값 저장
		s.setName("홍길동");
		s.setKor(100);
		s.setEng(90);
		s.setMat(80);
		//getter를 이용하여 값 계산
		int t = s.getKor() + s.getEng() + s.getMat();
		System.out.println("총점:" + t);
		
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		//90점 이상 "수", 80점 이상 "우"...
		System.out.println("등급:" + s.getGrade());
		
		Student s2 = new Student("김철수", 90, 80, 90);
		Student s3 = new Student("이영희");
		Student s4 = new Student(100, 100, 100);
//		Math m = new Math(); //생성자를 사용하지 못하게 설계/생성자를 만든후에 private 붙이기
	}

}
