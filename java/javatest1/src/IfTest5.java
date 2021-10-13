import java.util.Scanner;
public class IfTest5 {

	public static void main(String[] args) {
		//태어난 해를 입력받는다
		//띠를 출력합니다.
		int year;
		Scanner input = new Scanner(System.in);
		
		System.out.print("태어난 해:");
		year = input.nextInt();
		
		//if문 사용
//		if (year % 12 == 4) {
//			System.out.println("쥐띠");
//		}
//		else if (year % 12 == 5) {
//			System.out.println("소띠");
//		}
//		else if (year % 12 == 6) {
//			System.out.println("범띠");
//		}
//		else if (year % 12 == 7) {
//			System.out.println("토끼띠");
//		}
//		else if (year % 12 == 8) {
//			System.out.println("용띠");
//		}
//		else if (year % 12 == 9) {
//			System.out.println("뱀띠");
//		}
//		else if (year % 12 == 10) {
//			System.out.println("말띠");
//		}
//		else if (year % 12 == 11) {
//			System.out.println("양띠");
//		}
//		else if (year % 12 == 0) {
//			System.out.println("원숭이띠");
//		}
//		else if (year % 12 == 1) {
//			System.out.println("닭띠");
//		}
//		else if (year % 12 == 2) {
//			System.out.println("개띠");
//		}
//		else if (year % 12 == 3) {
//			System.out.println("돼지띠");
//		}
		
		//switch문 사용 /몇가지 경우 중의 하나 나타낼 때는 if문보다 좋음.
		switch (year % 12) {
			case 0: 
				System.out.println("원숭이띠");
				break;
			case 1:
				System.out.println("닭띠");
				break;
			case 2:
				System.out.println("개");
				break;
			default:
				System.out.println("그 밖의 띠");
		}
		
		//문자열을 사용한 switch문
		String s = "C";
		
		switch (s) {
			case "A": System.out.println("A를 입력했습니다."); break;
			case "B": System.out.println("B를 입력했습니다."); break;
			default: System.out.println("기타 문자"); break; //마지막줄은 break 생략가능
		}
		

	}

}
