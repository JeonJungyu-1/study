package inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//텍스트 파일 읽기
public class FileTest2 {
	public static void main(String[] args) {
		FileReader in = null;
		int ch;
		File f = new File("a.txt");
		
		if (!f.isFile()) {
			
		}
		
		
		try {
			in = new FileReader("a.txt");	
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		
		try {
			
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);	
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
