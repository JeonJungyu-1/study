package inout;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileTest8 /* implements Serializable ���̸� ��ü ����ȭ ��������(��ü �����ؼ� ���Ͽ� ���� ��������) */{

	public static void main(String[] args) {
		//��ü����ȭ
		
		//��ü�� ���Ͽ� ����
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("aaaaa");
//		list.add("bbbb");
//		list.add("�����ٶ�");
//		
//		ObjectOutputStream out = null;
//		
//		try {
//			out = new ObjectOutputStream(new FileOutputStream("test.obj"));	
//			out.writeObject(list);
//			out.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//���Ϸκ��� ��ü �б�
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("test.obj"));
			try {
				while (true) {
					ArrayList<String> li = (ArrayList<String>) in.readObject();
					System.out.println(li);
				} 
			} catch (EOFException e) /* ���̴�, ������ ����ó�� */{
				
			}
			in.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
