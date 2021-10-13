//키보드 입력 예제
import java.util.Scanner;     //1.Scanner 클래스를 불러온다

public class InputTest {

	public static void main(String[] args) {
		String name;	//String은 기본자료형은 아니지만 문자열을 다루는 자료형
		int age;
		double height;
		
		Scanner input = new Scanner(System.in);  //2.Scanner객체를 생성한다
		
		System.out.print("이름 입력:");
		name = input.next();     //3.Scanner의 메소드를 이용해서 입력받는다
		
		System.out.print("나이 입력:");
		age = input.nextInt(); 
		
		System.out.print("키 입력:");
		height = input.nextDouble(); 
		
		System.out.println(name + ", " + age + ", " + height);
	}

}
