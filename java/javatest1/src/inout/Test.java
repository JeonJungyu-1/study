package inout;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		//파일 이름바꾸기
//		File a = new File("a.txt");				//현재 있는 파일
//		File b = new File("새로운파일명.txt");		//현재 없는 파일/바꿀 파일 이름
//		
//		a.renameTo(b);
		
		//파일 삭제
		File c = new File("e.txt");
		c.delete();

	}

}
