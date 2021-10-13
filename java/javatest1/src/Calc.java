//계산기
/*
정수입력: 10
정수입력: 5
연산자 선택 (+, -, *, /): /

10 / 5 = 2

** 연산자가 저 4가지 중의 하나가 아니면 오류 메시지 출력
** 0으로 나눌 수 없음
*
* - 문자열 비교는 a=="+"로 못함. 문자열 비교는 a.equals("+") a는 만든 변수명
* - 프로그램 종료 : return
 */
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		int num1=0, num2=0, res=0;
		
		//Scanner생성
		Scanner input = new Scanner(System.in);
		//정수 2개를 입력
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		num1 = input.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		num2 = input.nextInt();
//		//계산
//		res = num1 + num2;
//		//결과출력
//		System.out.println("결과 : " + res);
//		
//		//선생님 코드
//		System.out.print("정수입력:");
//		num1 = input.nextInt();
//		System.out.print("정수입력:");
//		num2 = input.nextInt();
//		res = num1 + num2;
//		System.out.println(res);
		
		String ma;
		
		System.out.print("정수입력 : ");
		num1 = input.nextInt();
		System.out.print("정수입력 : ");
		num2 = input.nextInt();
		System.out.print("연산자 선택 (+,-,*,/): ");
		ma = input.next();
		
		//계산
		switch(ma) {
			case "+" :
				res = num1 + num2;
				break;
			case "-" :
				res = num1 - num2;
				break;
			case "*" :
				res = num1 * num2;
				break;
			case "/" :
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				}
				res = num1 / num2;
				break;
			default :
			System.out.println("연산자를 잘못 입력했습니다.");
			return;
		}
		
		//결과 출력
		System.out.println(num1 + " " + ma + " " + num2 + " = " + res);
		
		//선생님 코드
		
		
		
		
	}
	
	
	

}
