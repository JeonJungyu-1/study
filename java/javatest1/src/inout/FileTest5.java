package inout;

import java.io.File;
import java.io.IOException;

//FileŬ���� ���
public class FileTest5 {

	public static void main(String[] args) {
		//File�� ������ ���� ���Ϸε� ��ü ��������.
		
		File a = new File("a.txt");	//�ִ� ����. �����.
		File b = new File("src");	//�ִ� ���丮. �����.
		File c = new File("C:\\scit\\java\\workspace\\javatest1\\a.txt");	//�ִ� ����. ������.
		File d = new File("C:\\Windows");	//�ִ� ���丮. ������.
		File e= new File("y.dat");	//���� ����
		File f = new File("sub");	//���� ���丮
		
		System.out.println(a.isFile());			//���Ϸ� �����ϴ���
		System.out.println(a.isDirectory());	//���丮�� �����ϴ���
		System.out.println(a.exists());			//�����ϴ���
		System.out.println(a.canRead());		//�б� ����?
		System.out.println(a.canWrite());		//���� ����?
		
		System.out.println(a.length());			//������ ũ��
		System.out.println(a.getName());		//�̸�
		System.out.println(c.getParent());		//�������
		
		try {
			System.out.println(a.getCanonicalPath());				//���� ��� ���ϱ�
			System.out.println(new File(".").getCanonicalPath());	//������ġ
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			//���� ����
			e.createNewFile();
			//���丮 ����
			f.mkdirs();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
//		a.renameTo();
		
	}

}
