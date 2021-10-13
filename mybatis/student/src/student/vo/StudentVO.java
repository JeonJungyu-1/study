package student.vo;


public class StudentVO implements Comparable<StudentVO> {
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//생성자
	public StudentVO() {
		
	}
	
	public StudentVO(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	//getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

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
	
	//toString
	@Override
	public String toString() {
		return "학번 : " + num + " 이름 : " + name + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + mat;
	}
	
	@Override
	public int compareTo(StudentVO vo) {
		if ((this.kor + this.eng + this.mat)/3.0 > (vo.kor + vo.eng + vo.mat)/3.0) {
			return 1;
		}
		else if ((this.kor + this.eng + this.mat)/3.0 < (vo.kor + vo.eng + vo.mat)/3.0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}
