package inout;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("a.txt");  // .\\a.txt 현재 디렉토리  / 한단계위는 ..\
//			fw = new FileWriter("C:\\scit\\a.txt");	//text 파일 내보냄
		} 
		catch (IOException e) {
			System.out.println("파일 생성 실패");
		}
		
		try {
			fw.write("가  \n");	//문자열만 나갈 수 있음
			fw.write("a  \n");
		} 
		catch (IOException e) {
			System.out.println("저장 중 오류");
		}
		
		
		try {
			fw.close();			//안쓰면 데이터의 일부가 사라질 수 있음/안전하게 스트림 닫아줌.
		} 
		catch (IOException e) {
			System.out.println("파일 닫는 중 오류");
		}	
	}

}
