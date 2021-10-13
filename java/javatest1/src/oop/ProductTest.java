package oop;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Product p1 = new Product();
		Product p2 = new Product("A01", "마우스", 1000);
		Product p3 = new Product("A02", "키보드", 2000);
		
		p1.setCode("B01");
		p1.setName("노트북");
		p1.setPrice(10000);
		System.out.println(p1); //코드:B01 상품명:노트북 가격:10000
		System.out.println(p2);
		System.out.println(p3);

		//사용자로부터 코드, 상품명, 가격 입력받아 Product 객체 생성
		
		//1
//		Product p4;
//		System.out.print("코드 입력:");
//		String code = input.next();
//		System.out.print("상품명 입력:");
//		String name = input.next(); li
//		System.out.print("가격 입력:");
//		int price = input.nextInt();
//		p4 = new Product(code, name, price);
//		System.out.println(p4);
		
		//2
		Product p4 = new Product();
		System.out.print("코드 입력:");
		p4.setCode(input.next());
		System.out.print("상품명 입력:");
		p4.setName(input.next());
		System.out.print("가격 입력:");
		p4.setPrice(input.nextInt());
		System.out.println(p4);
		
		System.out.println(p2 == p4);
		System.out.println(p2.equals(p4));
		
		System.out.println(Math.PI);		//static 변수(클래스 변수)/모든 객체 공유
		System.out.println(Math.random());	//static 메소드(클래스 메소드)/객체와 상관없는 기능
	}

}
