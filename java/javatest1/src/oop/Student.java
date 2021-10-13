//학생 1명의 정보를 나타내는 클래스
package oop;

public class Student extends Object/*Object는 아무한테도 상속받지않으면 자동으로 상속됨*/ implements Comparable<Student> {
	private String name;	//학생의 이름
	private int kor;		//국어점수
	private int eng;		//영어점수
	private int mat;		//수학점수
	
	//생성자 /return 타입 없음/ 생성자를 하나도 만들지 않으면 자동 생성됨./인수가 없는게 기본 생성자/따로 설정하지 않으면 숫자는 0으로,문자열은 null으로 초기화해줌
	public Student() {
		this.name = "";
	}
	public Student(String name, int kor, int eng, int mat) {
		//같은 클래스의 생성자 호출 표현. 첫줄에만 가능.
		this(kor, eng, mat); 
		this.name = name;
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	public int getTotal() {
//		int t = kor + eng + mat;
//		return t;
		return kor + eng + mat;
	}
	
	public double getAverage() {
		return getTotal()/3.0;
	}
	
	public String getGrade() {
		double a = getAverage();
		
		//null은 초기화는 됐지만 아무것도 가리키고 있지 않은 상태
		//빈문자열""도 초기화는 되지만 조금은 문자열이 있는 상태이고 null은 문자열이 하나도 없는 상태임
		String g = null; 

		if (a >= 90) {
			g = "수";
		}
		else if (a >= 80) {
			g = "우";
		}
		else if (a >= 70) {
			g = "미";
		}
		else if (a >= 60) {
			g = "양";
		}
		else {
			g = "가";
		}
		
		return g;
	}
	
	//오버라이딩
	public String toString() {
		return name + " " + kor + " " + eng + " " + mat;
	}
	
	@Override
	public int compareTo(Student o) {
		if (this.kor + this.mat + this.eng > o.kor + o.mat + o.eng) {
			return 1;
		}
		else if (this.kor + this.mat + this.eng < o.kor + o.mat + o.eng) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
