import java.util.Scanner;
public class IfTest2 {

	public static void main(String[] args) {
		int time, money;
		Scanner input = new Scanner(System.in);
		//근무 시간을 입력받아 time변수에 저장
		System.out.print("근무 시간 : ");
		time = input.nextInt();
		//근무시간이 30시간 미만이면 시급 7000원, 30이상 50미만이면 8000원, 50이상 근무 시 10000원
//		if (time >= 0 && time < 30) {
//			money = time * 7000;
//		}
//		else if (time >=30 && time < 50) {
//			money = time * 8000;
//		}
//		else if (time >= 50) {
//			money = time * 10000;
//		}
//		else {
//			System.out.println("다시 입력하세요.");
//		}
		if (time < 30) {
		money = time * 7000;
		}
		else if (time < 50) {
			money = time * 8000;
		}
		else {
			money = time * 10000;
		}
		//총 급여를 계산해서 출력
		System.out.println("총 급여 : " + money);
		
		//선생님 코드
		int pay = 0;
		
		System.out.print("근무시간?");
		time  = input.nextInt();
		
		if (time < 30) {
			pay = time * 7000;
		}
		else if (time < 50) {
			pay = time * 8000;
		}
		else {
			pay = time * 10000;
		}
		
		System.out.println("급여:" + pay);
	}

}
