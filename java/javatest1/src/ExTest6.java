import java.io.IOException;

public class ExTest6 {

	//throws Exception 
	
	public static void main(String[] args) throws IOException {
		char ch;
		
//		try {
//			ch = (char) System.in.read();	//의무적으로 예외처리 해줘야하는 메소드임.
//			System.out.println("입력한 문자는 " + ch);
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		ch = (char) System.in.read();
		System.out.println("입력한 문자는 " + ch);
		
		
	}

}
