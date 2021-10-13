//°´Ã¼ ÀúÀå
package inout;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		Student s = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("student.st"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			s = new Student("±è", 100, 100, 100);
			out.writeObject(s);
			s = new Student("ÀÌ", 90, 90, 90);
			out.writeObject(s);
			s = new Student("¹Ú", 80, 80, 80);
			out.writeObject(s);

			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
