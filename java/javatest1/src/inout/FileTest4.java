package inout;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FileWriter out = null;
		String s;
		
		try {
			out = new FileWriter("b.txt", true);	//������ ������ �����ϰ���(true), ����� ���� �������(false)
			
			
		
//			System.out.print("������ ���ڿ�:");
//			s = input.nextLine();
//			out.write(s);
//			out.write("\r\n");
			
			while(true) {
				System.out.print("������ ���ڿ�:");
				s = input.nextLine();
//				if (s.isEmpty()) {
//					break;
//				}
				if (s.equals("")) {
					break;
				}
				out.write(s);
				out.write("\r\n");
			}
			out.close();	
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
