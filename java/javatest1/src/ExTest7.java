import java.io.IOException;

public class ExTest7 {

	public static void main(String[] args) {
		try {
			ExTest7.sub();	//같은 클래스라 클래스명 생략해도 됨.
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//throws 사용하면 예외처리는 호출한 곳에서 해야함.
	public static void sub() throws IOException {
		char ch;
		
//		try {
//			ch = (char) System.in.read();
//			System.out.println("입력한 문자는 " + ch);
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		ch = (char) System.in.read();
		System.out.println("입력한 문자는 " + ch);

	}

}
