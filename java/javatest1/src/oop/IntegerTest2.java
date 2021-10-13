package oop;
/*
 [ 실행 예 ]
 정수 입력 : 127
 변환할 진법 : 16
 
 127(10) -> 7F(16)

 [ 실행 예 2 ]
 정수 입력 : 10
 변환할 진법 : 2
 
 10(10) -> 1010(2)
 */

import java.util.Scanner;

public class IntegerTest2 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("[ 실행 예 ]");
		System.out.print("정수 입력 : ");
		a = input.nextInt();
		System.out.print("변환할 진법 : ");
		b = input.nextInt();
		String s = Integer.toString(a, b);
		System.out.println(a + "(10) -> " + s + "(" + b + ")");
		System.out.println();
		
		System.out.println("[ 실행 예 2 ]");
		System.out.print("정수 입력 : ");
		a = input.nextInt();
		System.out.print("변환할 진법 : ");
		b = input.nextInt();
		s = Integer.toString(a, b);
		System.out.println(a + "(10) -> " + s + "(" + b + ")");
		
		
		//선생님 코드
		Scanner scan = new Scanner(System.in);
		int num, radix;
		
		System.out.print("정수입력:");
		num = scan.nextInt();
		
		System.out.print("변환할 진법:");
		radix = scan.nextInt();
		
		System.out.print(num + "(10) -> ");
		System.out.println(Integer.toString(num, radix).toUpperCase() + "(" + radix + ")");
		
		
	}

}
