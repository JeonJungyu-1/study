//3과목의 총점과 평균 구하기
public class OpTest2 {

	public static void main(String[] args) {
		int k, e, m;
		k = 100;		//국어점수
		e = 90;			//영어점수
		m = 88;			//수학점수
		
		//필요한 변수들 선언
		int sum;
		double aver;
		
		//계산하여 결과를 변수에 저장
		sum = k + e + m;
		aver = sum / 3.0;
		
		//결과 출력(평균은 소수점 아래도 출력)
		System.out.println("총점은 " + sum + "이고, 평균은 " + aver + "입니다.");
		
		//선생님 코드
		int total;
		double avg;
		
		total = k + e + m;
		avg = total / 3.0;
		
		System.out.print("총점은 " + total);      //println은 출력후 줄바꾸고, print는 출력후 줄바꾸지 않음, printf는 서식 지정가능함
		System.out.println(", 평균은 " + avg + "입니다.");
		
	}

}
