import java.util.Scanner;
//java.lang�� �ڵ� import��. String, Sytem, Integer ���� ����.
public class StringTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String filename;
		
		System.out.print("���ϸ� �Է�:"); // abc.xlsx�� ���ڼ�
		filename = input.next();
		
		int len = filename.length();
		System.out.println("���ڼ�:" + len);
		
		String s = filename.substring(filename.lastIndexOf('.') + 1);
		System.out.println("Ȯ����:" + s);
		
		// test.c / test.java / test.class / a.xlsx / b.mpg / c.jpg
		// ȫ�浿.����.�Ұ�.docx

		String num = "123";
		System.out.println(Integer.parseInt(num) + 1);
		
		
	}

}
