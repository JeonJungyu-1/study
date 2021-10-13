package inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
읽을 파일명 입력: abc.txt
파일이 없습니다. 다시 입력하세요.
읽을 파일명 입력: a.txt(또는 c:/Java/test.java)
--이하 파일 내용 한줄씩 출력--

 */
public class FileTest6 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		BufferedReader in = null;
//		String s;
//		
//		while (true) {
//			System.out.print("읽을 파일명 입력 : ");
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
//				System.out.println("파일이 없습니다. 다시 입력하세요.");
//			}
//		}
		
		
		//선생님 코드
		//변수 선언, Scanner 객체 생성
		Scanner keyin = new Scanner(System.in);
		File file = null;
		String filename = null;
		BufferedReader in = null;
		
		//파일명 입력받고 존재하는지 확인. 없으면 다시 입력받음
		while (true) {
			System.out.println("읽을 파일명 입력 : ");
			filename = keyin.nextLine();
			file = new File(filename);
			if (file.isFile()) break;
			System.out.println("파일이 없습니다. 다시 입력하세요.");
		}
		
		//해당 파일을 열어서 한줄씩 읽어 화면에 출력
		try {
			in = new BufferedReader(new FileReader(filename));	
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
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
