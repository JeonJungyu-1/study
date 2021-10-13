package inout;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//텍스트 파일 읽기
public class FileTest3 {
	public static void main(String[] args) {
		BufferedReader in = null;
		String ch;
		
		try {
			in = new BufferedReader(new FileReader("a.txt"));	
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		
		try {
			while((ch = in.readLine()) != null) {
				System.out.println(ch);	
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
