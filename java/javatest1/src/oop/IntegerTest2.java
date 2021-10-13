package oop;
/*
 [ ���� �� ]
 ���� �Է� : 127
 ��ȯ�� ���� : 16
 
 127(10) -> 7F(16)

 [ ���� �� 2 ]
 ���� �Է� : 10
 ��ȯ�� ���� : 2
 
 10(10) -> 1010(2)
 */

import java.util.Scanner;

public class IntegerTest2 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("[ ���� �� ]");
		System.out.print("���� �Է� : ");
		a = input.nextInt();
		System.out.print("��ȯ�� ���� : ");
		b = input.nextInt();
		String s = Integer.toString(a, b);
		System.out.println(a + "(10) -> " + s + "(" + b + ")");
		System.out.println();
		
		System.out.println("[ ���� �� 2 ]");
		System.out.print("���� �Է� : ");
		a = input.nextInt();
		System.out.print("��ȯ�� ���� : ");
		b = input.nextInt();
		s = Integer.toString(a, b);
		System.out.println(a + "(10) -> " + s + "(" + b + ")");
		
		
		//������ �ڵ�
		Scanner scan = new Scanner(System.in);
		int num, radix;
		
		System.out.print("�����Է�:");
		num = scan.nextInt();
		
		System.out.print("��ȯ�� ����:");
		radix = scan.nextInt();
		
		System.out.print(num + "(10) -> ");
		System.out.println(Integer.toString(num, radix).toUpperCase() + "(" + radix + ")");
		
		
	}

}
