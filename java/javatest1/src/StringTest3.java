import java.util.Calendar;
import java.util.Scanner;
public class StringTest3 {

	public static void main(String[] args) {
		String id;
		Scanner input = new Scanner(System.in);
		System.out.print("주민등록번호 입력 (000000-0000000 형식):"); //991101-1234567
		id = input.next();
		
		
		//14글자가 아니면 에러메시지 출력 후 프로그램 종료
		if (id.length() != 14) {
			System.out.println("입력 오류");
			return;
		}
		//6번 글자가 '-'가 아니면 오류
		if (id.charAt(6) != '-') {
			System.out.println("입력 오류");
			return;
		}
		//월이 1~12가 아니면 오류
		if (Integer.parseInt(id.substring(2,4)) < 1 || Integer.parseInt(id.substring(2,4)) > 12) {
			System.out.println("월 입력 오류");
			return;
		}
		//일이 1~31이 아니면 오류
		if (Integer.parseInt(id.substring(4,6)) < 1 || Integer.parseInt(id.substring(4,6)) > 31) {
			System.out.println("일 입력 오류");
			return;
		}
		//성별이 1,2,3,4가 아니면 오류
		if (Integer.parseInt(id.substring(7,8)) < 1 || Integer.parseInt(id.substring(7,8)) > 4) {
			System.out.println("성별 입력 오류");
			return;	
		}
		else {
			if (Integer.parseInt(id.substring(7,8)) >= 3 && Integer.parseInt(id.substring(7,8)) <= 4) {
				if (Integer.parseInt(id.substring(0,2)) > 21 && Integer.parseInt(id.substring(0,2)) <= 99) {
					System.out.println("연 입력 오류");
					return;
				}
			}
		}
			
		//정상입력한 경우
		// 99년 11월 1일생 22세 남자
		int age = 0;
		if (Integer.parseInt(id.substring(7,8)) >= 1 && Integer.parseInt(id.substring(7,8)) <= 2) {
			age = 121 - Integer.parseInt(id.substring(0,2));
		}
		else if (Integer.parseInt(id.substring(7,8)) >= 3 && Integer.parseInt(id.substring(7,8)) <= 4) {
			age = 21 - Integer.parseInt(id.substring(0,2));
		}
		
		if (Integer.parseInt(id.substring(7,8))==1 || Integer.parseInt(id.substring(7,8))==3) {
		System.out.println(id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + age + "세 남자");
		}
		else if (Integer.parseInt(id.substring(7,8))==2 || Integer.parseInt(id.substring(7,8))==4) {
			System.out.println(id.substring(0,2) + "년 " + id.substring(2,4) + "월 " + id.substring(4,6) + "일생 " + age + "세 여자");	
		}
		
		//선생님 코드
		//6번 글자가  '-'가 아니면 오류 
//		if (id.indexOf('-') != 6)
//		if (!id.substring(6,7).equals("-")) //앞에 !붙이면 같지않냐 묻는거임.
		if (id.charAt(6) != '-') {
			System.out.println("입력 오류");
			return;
		}
		
		int year = Integer.parseInt(id.substring(0,2));
		int month = Integer.parseInt(id.substring(2,4));
		int day = Integer.parseInt(id.substring(4,6));
		char ch = id.charAt(7);			// '1', '2', '3', '4'
		
		//월이 1~12가 아니면 오류
		if (month < 1 || month > 12) {
			System.out.println("입력 오류");
			return;
		}
		
		//일이 1~31이 아니면 오류
		if (day < 1 || day > 31) {
			System.out.println("입력 오류");
			return;
		}
		
		//성별이 1,2,3,4가 아니면 오류
		//if (ch != '1' && ch != '2' && ch != '3' && ch!= '4')
		//if (ch == '1' || ch == '2' || ch == '3' || ch == '4')
		if (ch < '1' || ch > '4') {
			System.out.println("입력 오류");
			return;
		}
		
		//정상입력한 경우
		// 99년 11월 1일생 22세 남자
		age = 2021 - year;
//		age = c.get(Calendar.YEAR) - year;
		if (ch == '1' || ch == '2') {
			age -= 1900;
		}
		else {
			age -= 2000;
		}
		
		String s = "남자";
		//if (ch % 2 == 0)  //짝수 이면 여자
		if (ch == '2' || ch == '4') {
			s = "여자";
		}
		
		System.out.println(year + "년 " + month + "월 " + day + "일생 " + age + "세 " + s);
		
		
	
	}

}
