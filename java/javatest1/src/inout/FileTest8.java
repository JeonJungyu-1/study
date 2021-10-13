package inout;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileTest8 /* implements Serializable 붙이면 객체 직렬화 가능해짐(객체 생성해서 파일에 저장 가능해짐) */{

	public static void main(String[] args) {
		//객체직렬화
		
		//객체를 파일에 저장
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("aaaaa");
//		list.add("bbbb");
//		list.add("가나다라");
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
		
		
		//파일로부터 객체 읽기
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("test.obj"));
			try {
				while (true) {
					ArrayList<String> li = (ArrayList<String>) in.readObject();
					System.out.println(li);
				} 
			} catch (EOFException e) /* 끝이다, 없다의 예외처리 */{
				
			}
			in.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
