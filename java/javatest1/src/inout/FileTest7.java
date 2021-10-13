/*
1.
저장할 파일명 : a.txt
이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) y
저장되었습니다.

2.
저장할 파일명 : a.txt
이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) n
저장할 파일명 : b.txt
저장되었습니다.

3.
저장할 파일명 : c.txt
저장되었습니다.
 */

package inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File filename = null;
		String s = null;
		String yn = null;
		FileWriter fw = null;
		
		a:
		while (true) {
			System.out.print("저장할 파일명 : ");
			s = input.nextLine();
			filename = new File(s);
			
			if (filename.isFile()) {
				while (true) {
					System.out.print("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) ");
					yn = input.nextLine();
					if (yn.equals("y")) {
						try {
							try {
								fw = new FileWriter(s);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							fw.write("생성되었습니다");
							fw.close();
							System.out.println("저장되었습니다.");
							continue a;
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					else if (yn.equals("n")) {
						continue a;
					}
					else {
						System.out.println("다시 입력하세요.");
					}
				}
			}
			else {
				try {
					try {
						fw = new FileWriter(s);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					fw.write("생성되었습니다");
					fw.close();
					System.out.println("저장되었습니다.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}

		
		
		//선생님 코드
		//변수 선언, Scanner 객체 생성
//		Scanner keyin = new Scanner(System.in);
//		File file = null;
//		String filename = null;
//		String yn = null;
//		BufferedReader in = null;
//		FileWriter out = null;
//		
//		//파일명 입력받고 존재하는지 확인. 없으면 다시 입력받음
//		while (true) {
//			System.out.println("저장할 파일명 입력 : ");
//			filename = keyin.nextLine();
//			file = new File(filename);
//			if (file.isFile()) {
//				System.out.println("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) ");
//				yn = keyin.nextLine();
//				if (yn.equalsIgnoreCase("y")) {
//					break;
//				}
//				else {
//					continue;
//				}
//			}
//			else {
//				break;
//			}
//		}
//		
//		try {
//			out = new FileWriter("a.txt");  // .\\a.txt 현재 디렉토리  / 한단계위는 ..\
////			out = new FileWriter("C:\\scit\\a.txt");	//text 파일 내보냄
//		} 
//		catch (IOException e) {
//			System.out.println("파일 생성 실패");
//		}
//		
//		try {
//			out.write("가\n");	//문자열만 나갈 수 있음
//			out.write("a\n");
//		} 
//		catch (IOException e) {
//			System.out.println("저장 중 오류");
//		}
//		
//		
//		try {
//			out.close();			//안쓰면 데이터의 일부가 사라질 수 있음/안전하게 스트림 닫아줌.
//		} 
//		catch (IOException e) {
//			System.out.println("파일 닫는 중 오류");
//		}	
//		
	}

}
