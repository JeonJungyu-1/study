package inout;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("a.txt");  // .\\a.txt ���� ���丮  / �Ѵܰ����� ..\
//			fw = new FileWriter("C:\\scit\\a.txt");	//text ���� ������
		} 
		catch (IOException e) {
			System.out.println("���� ���� ����");
		}
		
		try {
			fw.write("��  \n");	//���ڿ��� ���� �� ����
			fw.write("a  \n");
		} 
		catch (IOException e) {
			System.out.println("���� �� ����");
		}
		
		
		try {
			fw.close();			//�Ⱦ��� �������� �Ϻΰ� ����� �� ����/�����ϰ� ��Ʈ�� �ݾ���.
		} 
		catch (IOException e) {
			System.out.println("���� �ݴ� �� ����");
		}	
	}

}
