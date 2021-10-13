package inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
���� ���ϸ� �Է�: abc.txt
������ �����ϴ�. �ٽ� �Է��ϼ���.
���� ���ϸ� �Է�: a.txt(�Ǵ� c:/Java/test.java)
--���� ���� ���� ���پ� ���--

 */
public class FileTest6 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		BufferedReader in = null;
//		String s;
//		
//		while (true) {
//			System.out.print("���� ���ϸ� �Է� : ");
//			s = input.nextLine();
//			File a = new File(s);
//			
//			if(a.exists()) {
//				try {
//					in = new BufferedReader(new FileReader(s));
//				} catch (FileNotFoundException e) {
//					e.printStackTrace();
//				}
//				try {
//					while((s = in.readLine()) != null) {
//						System.out.println(s);	
//					}
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				try {
//					in.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			else {
//				System.out.println("������ �����ϴ�. �ٽ� �Է��ϼ���.");
//			}
//		}
		
		
		//������ �ڵ�
		//���� ����, Scanner ��ü ����
		Scanner keyin = new Scanner(System.in);
		File file = null;
		String filename = null;
		BufferedReader in = null;
		
		//���ϸ� �Է¹ް� �����ϴ��� Ȯ��. ������ �ٽ� �Է¹���
		while (true) {
			System.out.println("���� ���ϸ� �Է� : ");
			filename = keyin.nextLine();
			file = new File(filename);
			if (file.isFile()) break;
			System.out.println("������ �����ϴ�. �ٽ� �Է��ϼ���.");
		}
		
		//�ش� ������ ��� ���پ� �о� ȭ�鿡 ���
		try {
			in = new BufferedReader(new FileReader(filename));	
		}
		catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		}
		
		try {
			while((filename = in.readLine()) != null) {
				System.out.println(filename);	
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			in.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
