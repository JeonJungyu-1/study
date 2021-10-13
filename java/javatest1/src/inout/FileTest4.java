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
			out = new FileWriter("b.txt", true);	//파일이 있으면 덧붙일건지(true), 지우고 새로 만들건지(false)
			
			
		
//			System.out.print("저장할 문자열:");
//			s = input.nextLine();
//			out.write(s);
//			out.write("\r\n");
			
			while(true) {
				System.out.print("저장할 문자열:");
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
