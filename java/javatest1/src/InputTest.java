//Ű���� �Է� ����
import java.util.Scanner;     //1.Scanner Ŭ������ �ҷ��´�

public class InputTest {

	public static void main(String[] args) {
		String name;	//String�� �⺻�ڷ����� �ƴ����� ���ڿ��� �ٷ�� �ڷ���
		int age;
		double height;
		
		Scanner input = new Scanner(System.in);  //2.Scanner��ü�� �����Ѵ�
		
		System.out.print("�̸� �Է�:");
		name = input.next();     //3.Scanner�� �޼ҵ带 �̿��ؼ� �Է¹޴´�
		
		System.out.print("���� �Է�:");
		age = input.nextInt(); 
		
		System.out.print("Ű �Է�:");
		height = input.nextDouble(); 
		
		System.out.println(name + ", " + age + ", " + height);
	}

}
