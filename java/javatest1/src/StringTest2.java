import java.util.Scanner;
//java.lang은 자동 import됨. String, Sytem, Integer 등이 있음.
public class StringTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String filename;
		
		System.out.print("파일명 입력:"); // abc.xlsx의 글자수
		filename = input.next();
		
		int len = filename.length();
		System.out.println("글자수:" + len);
		
		String s = filename.substring(filename.lastIndexOf('.') + 1);
		System.out.println("확장자:" + s);
		
		// test.c / test.java / test.class / a.xlsx / b.mpg / c.jpg
		// 홍길동.나의.소개.docx

		String num = "123";
		System.out.println(Integer.parseInt(num) + 1);
		
		
	}

}
