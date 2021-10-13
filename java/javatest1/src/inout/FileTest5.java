package inout;

import java.io.File;
import java.io.IOException;

//File클래스 사용
public class FileTest5 {

	public static void main(String[] args) {
		//File은 실제로 없는 파일로도 객체 생성가능.
		
		File a = new File("a.txt");	//있는 파일. 상대경로.
		File b = new File("src");	//있는 디렉토리. 상대경로.
		File c = new File("C:\\scit\\java\\workspace\\javatest1\\a.txt");	//있는 파일. 절대경로.
		File d = new File("C:\\Windows");	//있는 디렉토리. 절대경로.
		File e= new File("y.dat");	//없는 파일
		File f = new File("sub");	//없는 디렉토리
		
		System.out.println(a.isFile());			//파일로 존재하는지
		System.out.println(a.isDirectory());	//디렉토리로 존재하는지
		System.out.println(a.exists());			//존재하는지
		System.out.println(a.canRead());		//읽기 가능?
		System.out.println(a.canWrite());		//쓰기 가능?
		
		System.out.println(a.length());			//파일의 크기
		System.out.println(a.getName());		//이름
		System.out.println(c.getParent());		//상위경로
		
		try {
			System.out.println(a.getCanonicalPath());				//절대 경로 구하기
			System.out.println(new File(".").getCanonicalPath());	//현재위치
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			//파일 생성
			e.createNewFile();
			//디렉토리 생성
			f.mkdirs();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
//		a.renameTo();
		
	}

}
