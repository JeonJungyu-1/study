import java.io.IOException;

public class ExTest7 {

	public static void main(String[] args) {
		try {
			ExTest7.sub();	//���� Ŭ������ Ŭ������ �����ص� ��.
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//throws ����ϸ� ����ó���� ȣ���� ������ �ؾ���.
	public static void sub() throws IOException {
		char ch;
		
//		try {
//			ch = (char) System.in.read();
//			System.out.println("�Է��� ���ڴ� " + ch);
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		ch = (char) System.in.read();
		System.out.println("�Է��� ���ڴ� " + ch);

	}

}
