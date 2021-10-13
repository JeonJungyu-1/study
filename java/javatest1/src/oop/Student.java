//�л� 1���� ������ ��Ÿ���� Ŭ����
package oop;

public class Student extends Object/*Object�� �ƹ����׵� ��ӹ��������� �ڵ����� ��ӵ�*/ implements Comparable<Student> {
	private String name;	//�л��� �̸�
	private int kor;		//��������
	private int eng;		//��������
	private int mat;		//��������
	
	//������ /return Ÿ�� ����/ �����ڸ� �ϳ��� ������ ������ �ڵ� ������./�μ��� ���°� �⺻ ������/���� �������� ������ ���ڴ� 0����,���ڿ��� null���� �ʱ�ȭ����
	public Student() {
		this.name = "";
	}
	public Student(String name, int kor, int eng, int mat) {
		//���� Ŭ������ ������ ȣ�� ǥ��. ù�ٿ��� ����.
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
		
		//null�� �ʱ�ȭ�� ������ �ƹ��͵� ����Ű�� ���� ���� ����
		//���ڿ�""�� �ʱ�ȭ�� ������ ������ ���ڿ��� �ִ� �����̰� null�� ���ڿ��� �ϳ��� ���� ������
		String g = null; 

		if (a >= 90) {
			g = "��";
		}
		else if (a >= 80) {
			g = "��";
		}
		else if (a >= 70) {
			g = "��";
		}
		else if (a >= 60) {
			g = "��";
		}
		else {
			g = "��";
		}
		
		return g;
	}
	
	//�������̵�
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
