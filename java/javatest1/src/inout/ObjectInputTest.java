//��ü�� ���Ͽ��� �б�
package inout;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputTest {

	public static void main(String[] args) {
		ObjectInputStream in = null;
		Student s = null;
		
		try {
			in = new ObjectInputStream(new FileInputStream("student.st"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			while (true) {
				s = (Student) in.readObject();
				System.out.println(s);
			}
		} catch (EOFException e) /*EOFException : �� �о����� ������ ����ó�� */{
			try {
				in.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

}
